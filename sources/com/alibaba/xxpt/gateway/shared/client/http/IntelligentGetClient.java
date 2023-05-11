package com.alibaba.xxpt.gateway.shared.client.http;

import com.alibaba.xxpt.gateway.shared.client.http.adapter.RequestAdapter;
import com.alibaba.xxpt.gateway.shared.client.http.adapter.ResponseAdapter;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiResponse;
import com.alibaba.xxpt.gateway.shared.client.http.impl.GetRequest;
import java.net.URI;
import org.apache.http.client.methods.CloseableHttpResponse;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/IntelligentGetClient.class */
public class IntelligentGetClient {
    private final GetRequest getRequest;
    private final ExecutableClient executableClient;

    private IntelligentGetClient(ExecutableClient executableClient, String uri, String api, String version, int timeout) {
        URI url = URI.create(String.format("%s%s", uri, api));
        this.getRequest = GetRequest.newInstance(timeout, url, version);
        this.executableClient = executableClient;
    }

    public static IntelligentGetClient newInstance(ExecutableClient executableClient, String uri, String api, String version, int timeout) {
        return new IntelligentGetClient(executableClient, uri, api, version, timeout);
    }

    public <T extends OapiResponse> String getOriginal(OapiRequest<T> oapiRequest) {
        try {
            RequestAdapter.adapter(this.getRequest, oapiRequest);
            return this.executableClient.execute(this.getRequest);
        } catch (GwException e) {
            return e.getErrorResult();
        }
    }

    public <T extends OapiResponse> T get(OapiRequest<T> oapiRequest) {
        try {
            RequestAdapter.adapter(this.getRequest, oapiRequest);
            String result = this.executableClient.execute(this.getRequest);
            return (T) ResponseAdapter.adapter(result, oapiRequest);
        } catch (GwException e) {
            return (T) ResponseAdapter.adapter(e.getErrorResult(), oapiRequest);
        }
    }

    public <T extends OapiResponse> T getE(OapiRequest<T> oapiRequest) throws Exception {
        RequestAdapter.adapter(this.getRequest, oapiRequest);
        String result = this.executableClient.execute(this.getRequest);
        return (T) ResponseAdapter.adapter(result, oapiRequest);
    }

    public <T extends OapiResponse> String getOriginalE(OapiRequest<T> oapiRequest) throws Exception {
        RequestAdapter.adapter(this.getRequest, oapiRequest);
        return this.executableClient.execute(this.getRequest);
    }

    public CloseableHttpResponse getB(OapiRequest oapiRequest) throws Exception {
        RequestAdapter.adapter(this.getRequest, oapiRequest);
        return this.executableClient.executeB(this.getRequest);
    }

    public IntelligentGetClient addParameter(String name, String value) {
        this.getRequest.addParameter(name, value);
        return this;
    }

    public IntelligentGetClient addHeader(String name, String value) {
        this.getRequest.addHeader(name, value);
        return this;
    }

    public IntelligentGetClient accessKey(String accessKey) {
        this.getRequest.accessKey(accessKey);
        return this;
    }

    public IntelligentGetClient secretKey(String secretyKey) {
        this.getRequest.secretKey(secretyKey);
        return this;
    }
}
