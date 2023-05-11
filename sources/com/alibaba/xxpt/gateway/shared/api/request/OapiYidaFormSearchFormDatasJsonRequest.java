package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaFormSearchFormDatasJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaFormSearchFormDatasJsonRequest.class */
public class OapiYidaFormSearchFormDatasJsonRequest extends OapiRequest<OapiYidaFormSearchFormDatasJsonResponse> {
    private String modifiedFrom;
    private String formUuid;
    private String systemToken;
    private Integer pageSize;
    private String dynamicOrder;
    private String searchFieldJson;
    private String useOriginValue;
    private String language;
    private String userId;
    private String createFrom;
    private String targetFieldJson;
    private String createTo;
    private String appType;
    private String originatorId;
    private Integer currentPage;
    private String modifiedTo;

    public final String getApiUrl() {
        return "/yida/form/searchFormDatas.json";
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

    public void setModifiedTo(String modifiedTo) {
        this.modifiedTo = modifiedTo;
    }

    public String getModifiedTo() {
        return this.modifiedTo;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiYidaFormSearchFormDatasJsonResponse> getResponseClass() {
        return OapiYidaFormSearchFormDatasJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
