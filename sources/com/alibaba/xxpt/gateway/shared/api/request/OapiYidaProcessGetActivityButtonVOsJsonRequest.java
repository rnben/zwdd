package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaProcessGetActivityButtonVOsJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaProcessGetActivityButtonVOsJsonRequest.class */
public class OapiYidaProcessGetActivityButtonVOsJsonRequest extends OapiRequest<OapiYidaProcessGetActivityButtonVOsJsonResponse> {
    private String activityId;
    private String processCode;
    private String appType;
    private String systemToken;
    private String language;
    private String userId;

    public final String getApiUrl() {
        return "/yida/process/getActivityButtonVOs.json";
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityId() {
        return this.activityId;
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
    public Class<OapiYidaProcessGetActivityButtonVOsJsonResponse> getResponseClass() {
        return OapiYidaProcessGetActivityButtonVOsJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
