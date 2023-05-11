package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaTaskAppendTaskJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaTaskAppendTaskJsonRequest.class */
public class OapiYidaTaskAppendTaskJsonRequest extends OapiRequest<OapiYidaTaskAppendTaskJsonResponse> {
    private String procInsId;
    private List<String> actioners;
    private String appType;
    private String systemToken;
    private String remark;
    private String language;
    private String userId;
    private Long taskId;
    private Boolean isBefore;

    public final String getApiUrl() {
        return "/yida/task/appendTask.json";
    }

    public void setProcInsId(String procInsId) {
        this.procInsId = procInsId;
    }

    public String getProcInsId() {
        return this.procInsId;
    }

    public void setActioners(List<String> actioners) {
        this.actioners = actioners;
    }

    public List<String> getActioners() {
        return this.actioners;
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

    public void setIsBefore(Boolean isBefore) {
        this.isBefore = isBefore;
    }

    public Boolean getIsBefore() {
        return this.isBefore;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiYidaTaskAppendTaskJsonResponse> getResponseClass() {
        return OapiYidaTaskAppendTaskJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
