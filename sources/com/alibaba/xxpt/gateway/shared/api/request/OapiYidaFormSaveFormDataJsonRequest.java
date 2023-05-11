package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaFormSaveFormDataJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaFormSaveFormDataJsonRequest.class */
public class OapiYidaFormSaveFormDataJsonRequest extends OapiRequest<OapiYidaFormSaveFormDataJsonResponse> {
    private String instValue;
    private Boolean noExecExp;
    private String formUuid;
    private String appType;
    private String formInstId;
    private String formDataJson;
    private String systemToken;
    private String language;
    private String userId;

    public final String getApiUrl() {
        return "/yida/form/saveFormData.json";
    }

    public void setInstValue(String instValue) {
        this.instValue = instValue;
    }

    public String getInstValue() {
        return this.instValue;
    }

    public void setNoExecExp(Boolean noExecExp) {
        this.noExecExp = noExecExp;
    }

    public Boolean getNoExecExp() {
        return this.noExecExp;
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

    public void setFormDataJson(String formDataJson) {
        this.formDataJson = formDataJson;
    }

    public String getFormDataJson() {
        return this.formDataJson;
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
    public Class<OapiYidaFormSaveFormDataJsonResponse> getResponseClass() {
        return OapiYidaFormSaveFormDataJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
