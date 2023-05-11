package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaProcessGetInstanceByIdJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaProcessGetInstanceByIdJsonRequest.class */
public class OapiYidaProcessGetInstanceByIdJsonRequest extends OapiRequest<OapiYidaProcessGetInstanceByIdJsonResponse> {
    private String processInstanceId;
    private String formUuid;
    private String appType;
    private String systemToken;
    private Boolean useOriginValue;
    private String language;
    private String userId;

    public final String getApiUrl() {
        return "/yida/process/getInstanceById.json";
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getProcessInstanceId() {
        return this.processInstanceId;
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

    public void setSystemToken(String systemToken) {
        this.systemToken = systemToken;
    }

    public String getSystemToken() {
        return this.systemToken;
    }

    public void setUseOriginValue(Boolean useOriginValue) {
        this.useOriginValue = useOriginValue;
    }

    public Boolean getUseOriginValue() {
        return this.useOriginValue;
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
    public Class<OapiYidaProcessGetInstanceByIdJsonResponse> getResponseClass() {
        return OapiYidaProcessGetInstanceByIdJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
