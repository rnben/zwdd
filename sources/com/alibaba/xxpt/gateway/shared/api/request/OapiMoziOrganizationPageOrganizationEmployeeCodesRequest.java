package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziOrganizationPageOrganizationEmployeeCodesResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziOrganizationPageOrganizationEmployeeCodesRequest.class */
public class OapiMoziOrganizationPageOrganizationEmployeeCodesRequest extends OapiRequest<OapiMoziOrganizationPageOrganizationEmployeeCodesResponse> {
    private Boolean returnTotalSize;
    private String employeePositionStatus;
    private Integer pageSize;
    private String organizationCode;
    private Integer pageNo;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/organization/pageOrganizationEmployeeCodes";
    }

    public void setReturnTotalSize(Boolean returnTotalSize) {
        this.returnTotalSize = returnTotalSize;
    }

    public Boolean getReturnTotalSize() {
        return this.returnTotalSize;
    }

    public void setEmployeePositionStatus(String employeePositionStatus) {
        this.employeePositionStatus = employeePositionStatus;
    }

    public String getEmployeePositionStatus() {
        return this.employeePositionStatus;
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
    public Class<OapiMoziOrganizationPageOrganizationEmployeeCodesResponse> getResponseClass() {
        return OapiMoziOrganizationPageOrganizationEmployeeCodesResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
