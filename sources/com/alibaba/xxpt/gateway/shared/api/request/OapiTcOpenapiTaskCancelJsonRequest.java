package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiTcOpenapiTaskCancelJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiTcOpenapiTaskCancelJsonRequest.class */
public class OapiTcOpenapiTaskCancelJsonRequest extends OapiRequest<OapiTcOpenapiTaskCancelJsonResponse> {
    private Boolean cancelPakcage;
    private String userId;
    private String taskUuid;

    public final String getApiUrl() {
        return "/tc/openapi/task/cancel.json";
    }

    public void setCancelPakcage(Boolean cancelPakcage) {
        this.cancelPakcage = cancelPakcage;
    }

    public Boolean getCancelPakcage() {
        return this.cancelPakcage;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setTaskUuid(String taskUuid) {
        this.taskUuid = taskUuid;
    }

    public String getTaskUuid() {
        return this.taskUuid;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiTcOpenapiTaskCancelJsonResponse> getResponseClass() {
        return OapiTcOpenapiTaskCancelJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
