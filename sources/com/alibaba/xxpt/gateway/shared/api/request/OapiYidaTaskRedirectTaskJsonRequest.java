package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaTaskRedirectTaskJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaTaskRedirectTaskJsonRequest.class */
public class OapiYidaTaskRedirectTaskJsonRequest extends OapiRequest<OapiYidaTaskRedirectTaskJsonResponse> {
    private String processInstanceId;
    private String formUuid;
    private String byManager;
    private String appType;
    private String systemToken;
    private String nowActionerId;
    private String remark;
    private String language;
    private String userId;
    private Long taskId;

    public final String getApiUrl() {
        return "/yida/task/redirectTask.json";
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

    public void setByManager(String byManager) {
        this.byManager = byManager;
    }

    public String getByManager() {
        return this.byManager;
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

    public void setNowActionerId(String nowActionerId) {
        this.nowActionerId = nowActionerId;
    }

    public String getNowActionerId() {
        return this.nowActionerId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
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

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getTaskId() {
        return this.taskId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiYidaTaskRedirectTaskJsonResponse> getResponseClass() {
        return OapiYidaTaskRedirectTaskJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
