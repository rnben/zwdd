package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaAppListNavigationByFormTypeJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaAppListNavigationByFormTypeJsonRequest.class */
public class OapiYidaAppListNavigationByFormTypeJsonRequest extends OapiRequest<OapiYidaAppListNavigationByFormTypeJsonResponse> {
    private String formType;
    private String appType;
    private String systemToken;
    private String language;
    private String userId;

    public final String getApiUrl() {
        return "/yida/app/listNavigationByFormType.json";
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    public String getFormType() {
        return this.formType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getAppType() {
        return this.appType;
    }

    public void setSystemToken(String systemToken) {
        this.systemToken = systemToken;
    }

    public String getSystemToken() {
        return this.systemToken;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return this.userId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiYidaAppListNavigationByFormTypeJsonResponse> getResponseClass() {
        return OapiYidaAppListNavigationByFormTypeJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
