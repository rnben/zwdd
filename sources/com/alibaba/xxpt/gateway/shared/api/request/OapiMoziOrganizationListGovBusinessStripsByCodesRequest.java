package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziOrganizationListGovBusinessStripsByCodesResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziOrganizationListGovBusinessStripsByCodesRequest.class */
public class OapiMoziOrganizationListGovBusinessStripsByCodesRequest extends OapiRequest<OapiMoziOrganizationListGovBusinessStripsByCodesResponse> {
    private Long tenantId;
    private List<String> businessStripCodes;

    public final String getApiUrl() {
        return "/mozi/organization/listGovBusinessStripsByCodes";
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setBusinessStripCodes(List<String> businessStripCodes) {
        this.businessStripCodes = businessStripCodes;
    }

    public List<String> getBusinessStripCodes() {
        return this.businessStripCodes;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziOrganizationListGovBusinessStripsByCodesResponse> getResponseClass() {
        return OapiMoziOrganizationListGovBusinessStripsByCodesResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
