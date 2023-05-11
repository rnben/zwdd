package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaProcessGetInstanceIdsJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaProcessGetInstanceIdsJsonRequest.class */
public class OapiYidaProcessGetInstanceIdsJsonRequest extends OapiRequest<OapiYidaProcessGetInstanceIdsJsonResponse> {
    private String modifiedFrom;
    private String formUuid;
    private String systemToken;
    private Integer pageSize;
    private String dynamicOrder;
    private String searchFieldJson;
    private String useOriginValue;
    private String language;
    private String instanceStatus;
    private String userId;
    private String createFrom;
    private String targetFieldJson;
    private String approvedResult;
    private String createTo;
    private String appType;
    private String originatorId;
    private Integer currentPage;
    private String taskId;
    private String modifiedTo;

    public final String getApiUrl() {
        return "/yida/process/getInstanceIds.json";
    }

    public void setModifiedFrom(String modifiedFrom) {
        this.modifiedFrom = modifiedFrom;
    }

    public String getModifiedFrom() {
        return this.modifiedFrom;
    }

    public void setFormUuid(String formUuid) {
        this.formUuid = formUuid;
    }

    public String getFormUuid() {
        return this.formUuid;
    }

    public void setSystemToken(String systemToken) {
        this.systemToken = systemToken;
    }

    public String getSystemToken() {
        return this.systemToken;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setDynamicOrder(String dynamicOrder) {
        this.dynamicOrder = dynamicOrder;
    }

    public String getDynamicOrder() {
        return this.dynamicOrder;
    }

    public void setSearchFieldJson(String searchFieldJson) {
        this.searchFieldJson = searchFieldJson;
    }

    public String getSearchFieldJson() {
        return this.searchFieldJson;
    }

    public void setUseOriginValue(String useOriginValue) {
        this.useOriginValue = useOriginValue;
    }

    public String getUseOriginValue() {
        return this.useOriginValue;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setCreateFrom(String createFrom) {
        this.createFrom = createFrom;
    }

    public String getCreateFrom() {
        return this.createFrom;
    }

    public void setTargetFieldJson(String targetFieldJson) {
        this.targetFieldJson = targetFieldJson;
    }

    public String getTargetFieldJson() {
        return this.targetFieldJson;
    }

    public void setApprovedResult(String approvedResult) {
        this.approvedResult = approvedResult;
    }

    public String getApprovedResult() {
        return this.approvedResult;
    }

    public void setCreateTo(String createTo) {
        this.createTo = createTo;
    }

    public String getCreateTo() {
        return this.createTo;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getAppType() {
        return this.appType;
    }

    public void setOriginatorId(String originatorId) {
        this.originatorId = originatorId;
    }

    public String getOriginatorId() {
        return this.originatorId;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setModifiedTo(String modifiedTo) {
        this.modifiedTo = modifiedTo;
    }

    public String getModifiedTo() {
        return this.modifiedTo;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiYidaProcessGetInstanceIdsJsonResponse> getResponseClass() {
        return OapiYidaProcessGetInstanceIdsJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
