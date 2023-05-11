package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziOrganizationGetOrganizationEmployeeCountResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziOrganizationGetOrganizationEmployeeCountRequest.class */
public class OapiMoziOrganizationGetOrganizationEmployeeCountRequest extends OapiRequest<OapiMoziOrganizationGetOrganizationEmployeeCountResponse> {
    private String organizationCode;
    private Long tenantId;
    private String employeeStatus;

    public final String getApiUrl() {
        return "/mozi/organization/getOrganizationEmployeeCount";
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public String getEmployeeStatus() {
        return this.employeeStatus;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziOrganizationGetOrganizationEmployeeCountResponse> getResponseClass() {
        return OapiMoziOrganizationGetOrganizationEmployeeCountResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
