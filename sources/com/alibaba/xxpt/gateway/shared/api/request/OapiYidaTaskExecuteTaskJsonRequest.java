package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaTaskExecuteTaskJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaTaskExecuteTaskJsonRequest.class */
public class OapiYidaTaskExecuteTaskJsonRequest extends OapiRequest<OapiYidaTaskExecuteTaskJsonResponse> {
    private String outResult;
    private String noExecuteExpressions;
    private String appType;
    private String formDataJson;
    private String systemToken;
    private String remark;
    private String language;
    private String procInstId;
    private String userId;
    private Long taskId;

    public final String getApiUrl() {
        return "/yida/task/executeTask.json";
    }

    public void setOutResult(String outResult) {
        this.outResult = outResult;
    }

    public String getOutResult() {
        return this.outResult;
    }

    public void setNoExecuteExpressions(String noExecuteExpressions) {
        this.noExecuteExpressions = noExecuteExpressions;
    }

    public String getNoExecuteExpressions() {
        return this.noExecuteExpressions;
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

    public void setSystemToken(String systemToken) {
        this.systemToken = systemToken;
    }

    public String getSystemToken() {
        return this.systemToken;
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

    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId;
    }

    public String getProcInstId() {
        return this.procInstId;
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
    public Class<OapiYidaTaskExecuteTaskJsonResponse> getResponseClass() {
        return OapiYidaTaskExecuteTaskJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
