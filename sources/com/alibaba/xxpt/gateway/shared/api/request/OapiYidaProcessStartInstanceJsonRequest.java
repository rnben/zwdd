package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaProcessStartInstanceJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaProcessStartInstanceJsonRequest.class */
public class OapiYidaProcessStartInstanceJsonRequest extends OapiRequest<OapiYidaProcessStartInstanceJsonResponse> {
    private String instValue;
    private String formUuid;
    private String processCode;
    private String appType;
    private String formDataJson;
    private String deptId;
    private String businessId;
    private String systemToken;
    private String language;
    private String userId;
    private Boolean useOriginInstValue;

    public final String getApiUrl() {
        return "/yida/process/startInstance.json";
    }

    public void setInstValue(String instValue) {
        this.instValue = instValue;
    }

    public String getInstValue() {
        return this.instValue;
    }

    public void setFormUuid(String formUuid) {
        this.formUuid = formUuid;
    }

    public String getFormUuid() {
        return this.formUuid;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public String getProcessCode() {
        return this.processCode;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getAppType() {
        return this.appType;
    }

    public void setFormDataJson(String formDataJson) {
        this.formDataJson = formDataJson;
    }

    public String getFormDataJson() {
        return this.formDataJson;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptId() {
        return this.deptId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getBusinessId() {
        return this.businessId;
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

    public void setUseOriginInstValue(Boolean useOriginInstValue) {
        this.useOriginInstValue = useOriginInstValue;
    }

    public Boolean getUseOriginInstValue() {
        return this.useOriginInstValue;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiYidaProcessStartInstanceJsonResponse> getResponseClass() {
        return OapiYidaProcessStartInstanceJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
