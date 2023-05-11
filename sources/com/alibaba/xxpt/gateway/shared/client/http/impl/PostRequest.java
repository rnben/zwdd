package com.alibaba.xxpt.gateway.shared.client.http.impl;

import com.alibaba.xxpt.gateway.shared.client.http.AbstractRequest;
import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/impl/PostRequest.class */
public class PostRequest extends AbstractRequest {
    private final HttpPost httpPost;
    private final List<NameValuePair> nameValues;
    private File file;
    private boolean isChunk;

    private PostRequest(int timeout, URI uri, String version) {
        super(timeout, version);
        this.httpPost = new HttpPost(uri);
        this.nameValues = new ArrayList();
        this.file = null;
        this.isChunk = false;
    }

    public static PostRequest newInstance(int timeout, URI uri, String version) {
        return new PostRequest(timeout, uri, version);
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.AbstractRequest
    protected HttpUriRequest newHttpRequest() {
        MultipartEntityBuilder builder;
        if (this.file != null) {
            if (this.isChunk) {
                builder = getChunkBuilder();
            } else {
                builder = MultipartEntityBuilder.create().addBinaryBody("media", this.file);
            }
            builder.setCharset(Charset.forName("UTF-8")).setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
            URI uri = this.httpPost.getURI();
            String url = uri.toString();
            for (int i = 0; i < this.nameValues.size(); i++) {
                NameValuePair pair = this.nameValues.get(i);
                builder = builder.addTextBody(pair.getName(), pair.getValue());
                if (i == 0) {
                    url = url + "?";
                }
                url = url + URLEncoder.encode(pair.getName()) + "=" + URLEncoder.encode(pair.getValue());
                if (i != this.nameValues.size() - 1) {
                    url = url + "&";
                }
            }
            this.httpPost.setURI(URI.create(url));
            HttpEntity reqEntity = builder.build();
            this.httpPost.setEntity(reqEntity);
            RequestConfig requestConfig = RequestConfig.copy(RequestConfig.DEFAULT).setSocketTimeout(super.getTimeout()).setConnectTimeout(super.getTimeout()).setConnectionRequestTimeout(super.getTimeout()).build();
            this.httpPost.setConfig(requestConfig);
            return this.httpPost;
        }
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(this.nameValues, Consts.UTF_8);
        this.httpPost.setEntity(entity);
        RequestConfig requestConfig2 = RequestConfig.copy(RequestConfig.DEFAULT).setSocketTimeout(super.getTimeout()).setConnectTimeout(super.getTimeout()).setConnectionRequestTimeout(super.getTimeout()).build();
        this.httpPost.setConfig(requestConfig2);
        return this.httpPost;
    }

    private MultipartEntityBuilder getChunkBuilder() {
        int numRead;
        long chunkNumbers = 0;
        long chunkSequence = 0;
        for (NameValuePair item : this.nameValues) {
            if (StringUtils.equals("chunk_numbers", item.getName())) {
                chunkNumbers = Long.valueOf(item.getValue()).longValue();
            }
            if (StringUtils.equals("chunk_sequence", item.getName())) {
                chunkSequence = Long.valueOf(item.getValue()).longValue();
            }
        }
        if (chunkSequence == 0 || chunkNumbers == 0) {
            throw new RuntimeException("chunk_numbers or chunk_sequence is null");
        }
        long size = (this.file.length() / chunkNumbers) + 1;
        long offset = size * (chunkSequence - 1);
        if (chunkNumbers == chunkSequence) {
            size = this.file.length() - offset;
        }
        FileInputStream fi = null;
        try {
            try {
                fi = new FileInputStream(this.file);
                fi.skip(offset);
                byte[] buffer = new byte[(int) size];
                int numReads = 0;
                while (numReads < buffer.length && (numRead = fi.read(buffer, numReads, buffer.length - numReads)) >= 0) {
                    numReads += numRead;
                }
                MultipartEntityBuilder builder = MultipartEntityBuilder.create().addBinaryBody("media", buffer, ContentType.DEFAULT_BINARY, this.file.getName());
                if (fi != null) {
                    try {
                        fi.close();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                return builder;
            } catch (Throwable th) {
                if (fi != null) {
                    try {
                        fi.close();
                    } catch (Exception e2) {
                        throw new RuntimeException(e2);
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    public PostRequest addParameter(String name, String value) {
        if (isEmpty(value)) {
            return this;
        }
        this.nameValues.add(new BasicNameValuePair(name, value));
        super.addSignParameter(name, value);
        return this;
    }

    public PostRequest addFile(File file) {
        if (file == null) {
            return this;
        }
        this.file = file;
        return this;
    }

    public PostRequest addChunkFile(File chunkFile) {
        if (chunkFile == null) {
            return this;
        }
        this.file = chunkFile;
        this.isChunk = true;
        return this;
    }

    public PostRequest addHeader(String name, String value) {
        if (isEmpty(value)) {
            return this;
        }
        this.httpPost.addHeader(name, value);
        return this;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.AbstractRequest
    public String methodName() {
        return "POST";
    }

    public List<NameValuePair> getNameValues() {
        return this.nameValues;
    }
}
