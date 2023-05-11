package com.alibaba.xxpt.gateway.shared.client.http;

import com.alibaba.xxpt.gateway.shared.client.http.impl.PostRequest;
import java.io.File;
import java.net.URI;
import java.util.List;
import org.apache.http.NameValuePair;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/PostClient.class */
public class PostClient {
    private final PostRequest postRequest;
    private final ExecutableClient executableClient;

    private PostClient(ExecutableClient executableClient, String uri, String api, String version, int timeout) {
        URI url = URI.create(String.format("%s%s", uri, api));
        this.postRequest = PostRequest.newInstance(timeout, url, version);
        this.executableClient = executableClient;
    }

    public static PostClient newInstance(ExecutableClient executableClient, String uri, String api, String version, int timeout) {
        return new PostClient(executableClient, uri, api, version, timeout);
    }

    public String post() {
        try {
            return this.executableClient.execute(this.postRequest);
        } catch (GwException e) {
            return e.getErrorResult();
        }
    }

    public String postE() throws Exception {
        return this.executableClient.execute(this.postRequest);
    }

    public PostClient addParameter(String name, String value) {
        this.postRequest.addParameter(name, value);
        return this;
    }

    public PostClient addFile(File file) {
        this.postRequest.addFile(file);
        return this;
    }

    public PostClient addChunkFile(File file) {
        this.postRequest.addChunkFile(file);
        return this;
    }

    public PostClient addHeader(String name, String value) {
        this.postRequest.addHeader(name, value);
        return this;
    }

    public PostClient accessKey(String accessKey) {
        this.postRequest.accessKey(accessKey);
        return this;
    }

    public PostClient secretKey(String secretyKey) {
        this.postRequest.secretKey(secretyKey);
        return this;
    }

    public List<NameValuePair> parameterList() {
        return this.postRequest.getNameValues();
    }
}
