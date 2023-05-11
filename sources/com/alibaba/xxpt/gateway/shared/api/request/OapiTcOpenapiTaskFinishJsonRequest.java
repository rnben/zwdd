package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiTcOpenapiTaskFinishJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiTcOpenapiTaskFinishJsonRequest.class */
public class OapiTcOpenapiTaskFinishJsonRequest extends OapiRequest<OapiTcOpenapiTaskFinishJsonResponse> {
    private Boolean closePackage;
    private String userId;
    private String taskUuid;

    public final String getApiUrl() {
        return "/tc/openapi/task/finish.json";
    }

    public void setClosePackage(Boolean closePackage) {
        this.closePackage = closePackage;
    }

    public Boolean getClosePackage() {
        return this.closePackage;
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
    public Class<OapiTcOpenapiTaskFinishJsonResponse> getResponseClass() {
        return OapiTcOpenapiTaskFinishJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
