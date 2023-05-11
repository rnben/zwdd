package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziOrganizationListOrganizationEmployeeCountResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziOrganizationListOrganizationEmployeeCountRequest.class */
public class OapiMoziOrganizationListOrganizationEmployeeCountRequest extends OapiRequest<OapiMoziOrganizationListOrganizationEmployeeCountResponse> {
    private List<String> organizationCodes;
    private Boolean needCascadingQuery;
    private Long tenantId;
    private String employeeStatus;

    public final String getApiUrl() {
        return "/mozi/organization/listOrganizationEmployeeCount";
    }

    public void setOrganizationCodes(List<String> organizationCodes) {
        this.organizationCodes = organizationCodes;
    }

    public List<String> getOrganizationCodes() {
        return this.organizationCodes;
    }

    public void setNeedCascadingQuery(Boolean needCascadingQuery) {
        this.needCascadingQuery = needCascadingQuery;
    }

    public Boolean getNeedCascadingQuery() {
        return this.needCascadingQuery;
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
    public Class<OapiMoziOrganizationListOrganizationEmployeeCountResponse> getResponseClass() {
        return OapiMoziOrganizationListOrganizationEmployeeCountResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
