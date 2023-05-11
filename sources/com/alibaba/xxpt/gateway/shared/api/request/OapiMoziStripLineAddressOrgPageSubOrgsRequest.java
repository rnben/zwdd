package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziStripLineAddressOrgPageSubOrgsResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziStripLineAddressOrgPageSubOrgsRequest.class */
public class OapiMoziStripLineAddressOrgPageSubOrgsRequest extends OapiRequest<OapiMoziStripLineAddressOrgPageSubOrgsResponse> {
    private Boolean returnTotalSize;
    private String domainCode;
    private Integer pageSize;
    private String organizationCode;
    private Integer pageNo;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/stripLineAddressOrg/pageSubOrgs";
    }

    public void setReturnTotalSize(Boolean returnTotalSize) {
        this.returnTotalSize = returnTotalSize;
    }

    public Boolean getReturnTotalSize() {
        return this.returnTotalSize;
    }

    public void setDomainCode(String domainCode) {
        this.domainCode = domainCode;
    }

    public String getDomainCode() {
        return this.domainCode;
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

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziStripLineAddressOrgPageSubOrgsResponse> getResponseClass() {
        return OapiMoziStripLineAddressOrgPageSubOrgsResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
