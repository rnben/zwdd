package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziOrganizationListOrganizationsByCodesResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziOrganizationListOrganizationsByCodesRequest.class */
public class OapiMoziOrganizationListOrganizationsByCodesRequest extends OapiRequest<OapiMoziOrganizationListOrganizationsByCodesResponse> {
    private List<String> organizationCodes;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/organization/listOrganizationsByCodes";
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
    public Class<OapiMoziOrganizationListOrganizationsByCodesResponse> getResponseClass() {
        return OapiMoziOrganizationListOrganizationsByCodesResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
