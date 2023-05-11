package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziOrganizationPageSubGovDivisionsResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziOrganizationPageSubGovDivisionsRequest.class */
public class OapiMoziOrganizationPageSubGovDivisionsRequest extends OapiRequest<OapiMoziOrganizationPageSubGovDivisionsResponse> {
    private Boolean returnTotalSize;
    private Integer pageSize;
    private String divisionCode;
    private Integer pageNo;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/organization/pageSubGovDivisions";
    }

    public void setReturnTotalSize(Boolean returnTotalSize) {
        this.returnTotalSize = returnTotalSize;
    }

    public Boolean getReturnTotalSize() {
        return this.returnTotalSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    public String getDivisionCode() {
        return this.divisionCode;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziOrganizationPageSubGovDivisionsResponse> getResponseClass() {
        return OapiMoziOrganizationPageSubGovDivisionsResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
