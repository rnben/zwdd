package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziOrganizationPageOrganizationEmployeePositionsResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziOrganizationPageOrganizationEmployeePositionsRequest.class */
public class OapiMoziOrganizationPageOrganizationEmployeePositionsRequest extends OapiRequest<OapiMoziOrganizationPageOrganizationEmployeePositionsResponse> {
    private Boolean returnTotalSize;
    private Integer pageSize;
    private String employeeStatus;
    private String organizationCode;
    private Integer pageNo;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/organization/pageOrganizationEmployeePositions";
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

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public String getEmployeeStatus() {
        return this.employeeStatus;
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
    public Class<OapiMoziOrganizationPageOrganizationEmployeePositionsResponse> getResponseClass() {
        return OapiMoziOrganizationPageOrganizationEmployeePositionsResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
