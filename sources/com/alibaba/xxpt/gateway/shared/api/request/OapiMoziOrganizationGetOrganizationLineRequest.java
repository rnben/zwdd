package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziOrganizationGetOrganizationLineResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziOrganizationGetOrganizationLineRequest.class */
public class OapiMoziOrganizationGetOrganizationLineRequest extends OapiRequest<OapiMoziOrganizationGetOrganizationLineResponse> {
    private String organizationCode;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/organization/getOrganizationLine";
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
    public Class<OapiMoziOrganizationGetOrganizationLineResponse> getResponseClass() {
        return OapiMoziOrganizationGetOrganizationLineResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
