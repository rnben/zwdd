package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiRpcOauth2GetuserinfoBycodeJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiRpcOauth2GetuserinfoBycodeJsonRequest.class */
public class OapiRpcOauth2GetuserinfoBycodeJsonRequest extends OapiRequest<OapiRpcOauth2GetuserinfoBycodeJsonResponse> {
    private String code;
    private String access_token;

    public final String getApiUrl() {
        return "/rpc/oauth2/getuserinfo_bycode.json";
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getAccess_token() {
        return this.access_token;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiRpcOauth2GetuserinfoBycodeJsonResponse> getResponseClass() {
        return OapiRpcOauth2GetuserinfoBycodeJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
