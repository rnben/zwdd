package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeeListAccountOrgByIdAndCodesResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeeListAccountOrgByIdAndCodesRequest.class */
public class OapiMoziEmployeeListAccountOrgByIdAndCodesRequest extends OapiRequest<OapiMoziEmployeeListAccountOrgByIdAndCodesResponse> {
    private Long accountId;
    private List<String> organizationCodes;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/employee/listAccountOrgByIdAndCodes";
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public void setOrganizationCodes(List<String> organizationCodes) {
        this.organizationCodes = organizationCodes;
    }

    public List<String> getOrganizationCodes() {
        return this.organizationCodes;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziEmployeeListAccountOrgByIdAndCodesResponse> getResponseClass() {
        return OapiMoziEmployeeListAccountOrgByIdAndCodesResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
