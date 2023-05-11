package com.alibaba.xxpt.gateway.shared.client.http;

import com.alibaba.xxpt.gateway.shared.client.http.impl.GetRequest;
import java.net.URI;
import org.apache.http.client.methods.CloseableHttpResponse;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/GetClient.class */
public class GetClient {
    private final GetRequest getRequest;
    private final ExecutableClient executableClient;

    private GetClient(ExecutableClient executableClient, String uri, String api, String version, int timeout) {
        URI url = URI.create(String.format("%s%s", uri, api));
        this.getRequest = GetRequest.newInstance(timeout, url, version);
        this.executableClient = executableClient;
    }

    public static GetClient newInstance(ExecutableClient executableClient, String uri, String api, String version, int timeout) {
        return new GetClient(executableClient, uri, api, version, timeout);
    }

    public String get() {
        try {
            return this.executableClient.execute(this.getRequest);
        } catch (GwException e) {
            return e.getErrorResult();
        }
    }

    public CloseableHttpResponse getB() throws Exception {
        return this.executableClient.executeB(this.getRequest);
    }

    public String getE() throws Exception {
        return this.executableClient.execute(this.getRequest);
    }

    public GetClient addParameter(String name, String value) {
        this.getRequest.addParameter(name, value);
        return this;
    }

    public GetClient addHeader(String name, String value) {
        this.getRequest.addHeader(name, value);
        return this;
    }

    public GetClient accessKey(String accessKey) {
        this.getRequest.accessKey(accessKey);
        return this;
    }

    public GetClient secretKey(String secretyKey) {
        this.getRequest.secretKey(secretyKey);
        return this;
    }
}
