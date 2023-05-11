package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiGetJsapiTokenJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiGetJsapiTokenJsonRequest.class */
public class OapiGetJsapiTokenJsonRequest extends OapiRequest<OapiGetJsapiTokenJsonResponse> {
    private String accessToken;

    public final String getApiUrl() {
        return "/get_jsapi_token.json";
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiGetJsapiTokenJsonResponse> getResponseClass() {
        return OapiGetJsapiTokenJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
