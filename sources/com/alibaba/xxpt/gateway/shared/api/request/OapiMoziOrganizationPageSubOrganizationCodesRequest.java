package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziOrganizationPageSubOrganizationCodesResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziOrganizationPageSubOrganizationCodesRequest.class */
public class OapiMoziOrganizationPageSubOrganizationCodesRequest extends OapiRequest<OapiMoziOrganizationPageSubOrganizationCodesResponse> {
    private Boolean returnTotalSize;
    private Integer pageSize;
    private String organizationCode;
    private Integer pageNo;
    private String status;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/organization/pageSubOrganizationCodes";
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

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziOrganizationPageSubOrganizationCodesResponse> getResponseClass() {
        return OapiMoziOrganizationPageSubOrganizationCodesResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
