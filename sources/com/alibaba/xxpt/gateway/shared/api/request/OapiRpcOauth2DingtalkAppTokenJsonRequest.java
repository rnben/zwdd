package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiRpcOauth2DingtalkAppTokenJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiRpcOauth2DingtalkAppTokenJsonRequest.class */
public class OapiRpcOauth2DingtalkAppTokenJsonRequest extends OapiRequest<OapiRpcOauth2DingtalkAppTokenJsonResponse> {
    private String access_token;
    private String auth_code;

    public final String getApiUrl() {
        return "/rpc/oauth2/dingtalk_app_token.json";
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getAccess_token() {
        return this.access_token;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }

    public String getAuth_code() {
        return this.auth_code;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiRpcOauth2DingtalkAppTokenJsonResponse> getResponseClass() {
        return OapiRpcOauth2DingtalkAppTokenJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
