package com.alibaba.xxpt.gateway.shared.client.http;

import com.alibaba.xxpt.gateway.shared.client.http.adapter.RequestAdapter;
import com.alibaba.xxpt.gateway.shared.client.http.adapter.ResponseAdapter;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiResponse;
import com.alibaba.xxpt.gateway.shared.client.http.impl.PostRequest;
import java.io.File;
import java.net.URI;
import java.util.List;
import org.apache.http.NameValuePair;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/IntelligentPostClient.class */
public class IntelligentPostClient {
    private final PostRequest postRequest;
    private final ExecutableClient executableClient;

    private IntelligentPostClient(ExecutableClient executableClient, String uri, String api, String version, int timeout) {
        URI url = URI.create(String.format("%s%s", uri, api));
        this.postRequest = PostRequest.newInstance(timeout, url, version);
        this.executableClient = executableClient;
    }

    public static IntelligentPostClient newInstance(ExecutableClient executableClient, String uri, String api, String version, int timeout) {
        return new IntelligentPostClient(executableClient, uri, api, version, timeout);
    }

    public <T extends OapiResponse> String postOriginal(OapiRequest<T> oapiRequest) {
        try {
            RequestAdapter.adapter(this.postRequest, oapiRequest);
            return this.executableClient.execute(this.postRequest);
        } catch (GwException e) {
            return e.getErrorResult();
        }
    }

    public <T extends OapiResponse> T post(OapiRequest<T> oapiRequest) {
        try {
            RequestAdapter.adapter(this.postRequest, oapiRequest);
            String result = this.executableClient.execute(this.postRequest);
            return (T) ResponseAdapter.adapter(result, oapiRequest);
        } catch (GwException e) {
            return (T) ResponseAdapter.adapter(e.getErrorResult(), oapiRequest);
        }
    }

    public <T extends OapiResponse> String postOriginalE(OapiRequest<T> oapiRequest) throws Exception {
        RequestAdapter.adapter(this.postRequest, oapiRequest);
        return this.executableClient.execute(this.postRequest);
    }

    public <T extends OapiResponse> T postE(OapiRequest<T> oapiRequest) throws Exception {
        RequestAdapter.adapter(this.postRequest, oapiRequest);
        String result = this.executableClient.execute(this.postRequest);
        return (T) ResponseAdapter.adapter(result, oapiRequest);
    }

    public IntelligentPostClient addParameter(String name, String value) {
        this.postRequest.addParameter(name, value);
        return this;
    }

    public IntelligentPostClient addFile(File file) {
        this.postRequest.addFile(file);
        return this;
    }

    public IntelligentPostClient addChunkFile(File file) {
        this.postRequest.addChunkFile(file);
        return this;
    }

    public IntelligentPostClient addHeader(String name, String value) {
        this.postRequest.addHeader(name, value);
        return this;
    }

    public IntelligentPostClient accessKey(String accessKey) {
        this.postRequest.accessKey(accessKey);
        return this;
    }

    public IntelligentPostClient secretKey(String secretyKey) {
        this.postRequest.secretKey(secretyKey);
        return this;
    }

    public List<NameValuePair> parameterList() {
        return this.postRequest.getNameValues();
    }
}
