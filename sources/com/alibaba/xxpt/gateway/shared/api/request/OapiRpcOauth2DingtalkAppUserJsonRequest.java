package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiRpcOauth2DingtalkAppUserJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiRpcOauth2DingtalkAppUserJsonRequest.class */
public class OapiRpcOauth2DingtalkAppUserJsonRequest extends OapiRequest<OapiRpcOauth2DingtalkAppUserJsonResponse> {
    private String access_token;
    private String auth_code;

    public final String getApiUrl() {
        return "/rpc/oauth2/dingtalk_app_user.json";
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
    public Class<OapiRpcOauth2DingtalkAppUserJsonResponse> getResponseClass() {
        return OapiRpcOauth2DingtalkAppUserJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
