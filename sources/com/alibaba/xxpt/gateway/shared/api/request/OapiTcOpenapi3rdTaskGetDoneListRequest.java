package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiTcOpenapi3rdTaskGetDoneListResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiTcOpenapi3rdTaskGetDoneListRequest.class */
public class OapiTcOpenapi3rdTaskGetDoneListRequest extends OapiRequest<OapiTcOpenapi3rdTaskGetDoneListResponse> {
    private Integer pageSize;
    private String finishEndTime;
    private String userId;
    private String createStartTime;
    private String createEndTime;
    private Integer pageNo;
    private String tenantId;
    private String appKey;
    private String finishStartTime;
    private String keyword;

    public final String getApiUrl() {
        return "/tc/openapi/3rd/task/getDoneList";
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setFinishEndTime(String finishEndTime) {
        this.finishEndTime = finishEndTime;
    }

    public String getFinishEndTime() {
        return this.finishEndTime;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
    }

    public String getCreateStartTime() {
        return this.createStartTime;
    }

    public void setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
    }

    public String getCreateEndTime() {
        return this.createEndTime;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public void setFinishStartTime(String finishStartTime) {
        this.finishStartTime = finishStartTime;
    }

    public String getFinishStartTime() {
        return this.finishStartTime;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiTcOpenapi3rdTaskGetDoneListResponse> getResponseClass() {
        return OapiTcOpenapi3rdTaskGetDoneListResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
