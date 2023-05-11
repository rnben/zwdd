package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaProcessUpdateInstanceJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaProcessUpdateInstanceJsonRequest.class */
public class OapiYidaProcessUpdateInstanceJsonRequest extends OapiRequest<OapiYidaProcessUpdateInstanceJsonResponse> {
    private String processInstanceId;
    private String updateFormDataJson;
    private String appType;
    private Boolean ignoreEmpty;
    private String systemToken;
    private String language;
    private String userId;

    public final String getApiUrl() {
        return "/yida/process/updateInstance.json";
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    public void setUpdateFormDataJson(String updateFormDataJson) {
        this.updateFormDataJson = updateFormDataJson;
    }

    public String getUpdateFormDataJson() {
        return this.updateFormDataJson;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getAppType() {
        return this.appType;
    }

    public void setIgnoreEmpty(Boolean ignoreEmpty) {
        this.ignoreEmpty = ignoreEmpty;
    }

    public Boolean getIgnoreEmpty() {
        return this.ignoreEmpty;
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
    public Class<OapiYidaProcessUpdateInstanceJsonResponse> getResponseClass() {
        return OapiYidaProcessUpdateInstanceJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
