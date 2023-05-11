package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziOrganizationDeleteGovOrganizationResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziOrganizationDeleteGovOrganizationRequest.class */
public class OapiMoziOrganizationDeleteGovOrganizationRequest extends OapiRequest<OapiMoziOrganizationDeleteGovOrganizationResponse> {
    private String organizationCode;
    private String operator;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/organization/deleteGovOrganization";
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziOrganizationDeleteGovOrganizationResponse> getResponseClass() {
        return OapiMoziOrganizationDeleteGovOrganizationResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
