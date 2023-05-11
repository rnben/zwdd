package com.alibaba.xxpt.gateway.shared.client.http.impl;

import com.alibaba.xxpt.gateway.shared.client.http.AbstractRequest;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/impl/GetRequest.class */
public class GetRequest extends AbstractRequest {
    private final URIBuilder uriBuilder;
    private final Map<String, String> headers;

    private GetRequest(int timeout, URI uri, String version) {
        super(timeout, version);
        this.uriBuilder = new URIBuilder();
        this.uriBuilder.setScheme(uri.getScheme()).setHost(uri.getHost()).setPath(uri.getPath()).setPort(uri.getPort());
        this.headers = new HashMap();
    }

    public static GetRequest newInstance(int timeout, URI uri, String version) {
        return new GetRequest(timeout, uri, version);
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.AbstractRequest
    protected HttpUriRequest newHttpRequest() {
        try {
            URI getUri = this.uriBuilder.build();
            HttpGet httpGet = new HttpGet(getUri);
            RequestConfig requestConfig = RequestConfig.copy(RequestConfig.DEFAULT).setSocketTimeout(super.getTimeout()).setConnectTimeout(super.getTimeout()).setConnectionRequestTimeout(super.getTimeout()).build();
            httpGet.setConfig(requestConfig);
            for (Map.Entry<String, String> entry : this.headers.entrySet()) {
                httpGet.addHeader(entry.getKey(), entry.getValue());
            }
            return httpGet;
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public GetRequest addParameter(String name, String value) {
        if (isEmpty(value)) {
            return this;
        }
        this.uriBuilder.addParameter(name, value);
        super.addSignParameter(name, value);
        return this;
    }

    public GetRequest addHeader(String name, String value) {
        if (isEmpty(value)) {
            return this;
        }
        this.headers.put(name, value);
        return this;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.AbstractRequest
    public String methodName() {
        return "GET";
    }
}
