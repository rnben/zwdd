package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaTaskRestartInstanceJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaTaskRestartInstanceJsonRequest.class */
public class OapiYidaTaskRestartInstanceJsonRequest extends OapiRequest<OapiYidaTaskRestartInstanceJsonResponse> {
    private String targetActivityId;
    private String processInstanceId;
    private String formUuid;
    private String appType;
    private String systemToken;
    private String files;
    private String currentActivityId;
    private String remark;
    private String language;
    private String userId;
    private String taskId;

    public final String getApiUrl() {
        return "/yida/task/restartInstance.json";
    }

    public void setTargetActivityId(String targetActivityId) {
        this.targetActivityId = targetActivityId;
    }

    public String getTargetActivityId() {
        return this.targetActivityId;
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

    public void setFiles(String files) {
        this.files = files;
    }

    public String getFiles() {
        return this.files;
    }

    public void setCurrentActivityId(String currentActivityId) {
        this.currentActivityId = currentActivityId;
    }

    public String getCurrentActivityId() {
        return this.currentActivityId;
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

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskId() {
        return this.taskId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiYidaTaskRestartInstanceJsonResponse> getResponseClass() {
        return OapiYidaTaskRestartInstanceJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
