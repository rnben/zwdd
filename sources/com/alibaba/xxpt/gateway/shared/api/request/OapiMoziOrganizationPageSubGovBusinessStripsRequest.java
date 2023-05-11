package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziOrganizationPageSubGovBusinessStripsResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziOrganizationPageSubGovBusinessStripsRequest.class */
public class OapiMoziOrganizationPageSubGovBusinessStripsRequest extends OapiRequest<OapiMoziOrganizationPageSubGovBusinessStripsResponse> {
    private Boolean returnTotalSize;
    private String businessStripCode;
    private Integer pageSize;
    private Integer pageNo;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/organization/pageSubGovBusinessStrips";
    }

    public void setReturnTotalSize(Boolean returnTotalSize) {
        this.returnTotalSize = returnTotalSize;
    }

    public Boolean getReturnTotalSize() {
        return this.returnTotalSize;
    }

    public void setBusinessStripCode(String businessStripCode) {
        this.businessStripCode = businessStripCode;
    }

    public String getBusinessStripCode() {
        return this.businessStripCode;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return this.pageSize;
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
    public Class<OapiMoziOrganizationPageSubGovBusinessStripsResponse> getResponseClass() {
        return OapiMoziOrganizationPageSubGovBusinessStripsResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
