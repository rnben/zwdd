package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiGettokenJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiGettokenJsonRequest.class */
public class OapiGettokenJsonRequest extends OapiRequest<OapiGettokenJsonResponse> {
    private String appkey;
    private String appsecret;

    public final String getApiUrl() {
        return "/gettoken.json";
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getAppkey() {
        return this.appkey;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }

    public String getAppsecret() {
        return this.appsecret;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiGettokenJsonResponse> getResponseClass() {
        return OapiGettokenJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
