package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaProcessGetDoneTasksInCorpJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaProcessGetDoneTasksInCorpJsonRequest.class */
public class OapiYidaProcessGetDoneTasksInCorpJsonRequest extends OapiRequest<OapiYidaProcessGetDoneTasksInCorpJsonResponse> {
    private Long taskFinishTo;
    private String corpId;
    private Long instanceCreateFrom;
    private String language;
    private String userId;
    private String token;
    private Long createFrom;
    private String processCodes;
    private Long taskFinishFrom;
    private Long createTo;
    private Integer limit;
    private Integer page;
    private String appTypes;
    private String keyword;
    private Long instanceCreateTo;
    private String status;

    public final String getApiUrl() {
        return "/yida/process/getDoneTasksInCorp.json";
    }

    public void setTaskFinishTo(Long taskFinishTo) {
        this.taskFinishTo = taskFinishTo;
    }

    public Long getTaskFinishTo() {
        return this.taskFinishTo;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public String getCorpId() {
        return this.corpId;
    }

    public void setInstanceCreateFrom(Long instanceCreateFrom) {
        this.instanceCreateFrom = instanceCreateFrom;
    }

    public Long getInstanceCreateFrom() {
        return this.instanceCreateFrom;
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

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }

    public void setCreateFrom(Long createFrom) {
        this.createFrom = createFrom;
    }

    public Long getCreateFrom() {
        return this.createFrom;
    }

    public void setProcessCodes(String processCodes) {
        this.processCodes = processCodes;
    }

    public String getProcessCodes() {
        return this.processCodes;
    }

    public void setTaskFinishFrom(Long taskFinishFrom) {
        this.taskFinishFrom = taskFinishFrom;
    }

    public Long getTaskFinishFrom() {
        return this.taskFinishFrom;
    }

    public void setCreateTo(Long createTo) {
        this.createTo = createTo;
    }

    public Long getCreateTo() {
        return this.createTo;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPage() {
        return this.page;
    }

    public void setAppTypes(String appTypes) {
        this.appTypes = appTypes;
    }

    public String getAppTypes() {
        return this.appTypes;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setInstanceCreateTo(Long instanceCreateTo) {
        this.instanceCreateTo = instanceCreateTo;
    }

    public Long getInstanceCreateTo() {
        return this.instanceCreateTo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiYidaProcessGetDoneTasksInCorpJsonResponse> getResponseClass() {
        return OapiYidaProcessGetDoneTasksInCorpJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
