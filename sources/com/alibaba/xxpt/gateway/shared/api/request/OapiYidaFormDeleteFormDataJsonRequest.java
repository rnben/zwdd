package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaFormDeleteFormDataJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaFormDeleteFormDataJsonRequest.class */
public class OapiYidaFormDeleteFormDataJsonRequest extends OapiRequest<OapiYidaFormDeleteFormDataJsonResponse> {
    private String formUuid;
    private String appType;
    private String formInstId;
    private String systemToken;
    private String language;
    private String userId;

    public final String getApiUrl() {
        return "/yida/form/deleteFormData.json";
    }

    public void setFormUuid(String formUuid) {
        this.formUuid = formUuid;
    }

    public String getFormUuid() {
        return this.formUuid;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getAppType() {
        return this.appType;
    }

    public void setFormInstId(String formInstId) {
        this.formInstId = formInstId;
    }

    public String getFormInstId() {
        return this.formInstId;
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
    public Class<OapiYidaFormDeleteFormDataJsonResponse> getResponseClass() {
        return OapiYidaFormDeleteFormDataJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
