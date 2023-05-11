package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaRemarkListJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaRemarkListJsonRequest.class */
public class OapiYidaRemarkListJsonRequest extends OapiRequest<OapiYidaRemarkListJsonResponse> {
    private String formUuid;
    private String appType;
    private String formInstId;
    private String systemToken;
    private String language;
    private String userId;
    private Boolean needInstValue;

    public final String getApiUrl() {
        return "/yida/remark/list.json";
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

    public void setNeedInstValue(Boolean needInstValue) {
        this.needInstValue = needInstValue;
    }

    public Boolean getNeedInstValue() {
        return this.needInstValue;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiYidaRemarkListJsonResponse> getResponseClass() {
        return OapiYidaRemarkListJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
