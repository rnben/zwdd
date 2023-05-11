package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziOrganizationGetOrganizationByCodeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziOrganizationGetOrganizationByCodeRequest.class */
public class OapiMoziOrganizationGetOrganizationByCodeRequest extends OapiRequest<OapiMoziOrganizationGetOrganizationByCodeResponse> {
    private String organizationCode;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/organization/getOrganizationByCode";
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

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziOrganizationGetOrganizationByCodeResponse> getResponseClass() {
        return OapiMoziOrganizationGetOrganizationByCodeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
