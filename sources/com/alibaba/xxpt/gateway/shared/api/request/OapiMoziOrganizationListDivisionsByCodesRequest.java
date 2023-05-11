package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziOrganizationListDivisionsByCodesResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziOrganizationListDivisionsByCodesRequest.class */
public class OapiMoziOrganizationListDivisionsByCodesRequest extends OapiRequest<OapiMoziOrganizationListDivisionsByCodesResponse> {
    private List<String> divisionCodes;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/organization/listDivisionsByCodes";
    }

    public void setDivisionCodes(List<String> divisionCodes) {
        this.divisionCodes = divisionCodes;
    }

    public List<String> getDivisionCodes() {
        return this.divisionCodes;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziOrganizationListDivisionsByCodesResponse> getResponseClass() {
        return OapiMoziOrganizationListDivisionsByCodesResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
