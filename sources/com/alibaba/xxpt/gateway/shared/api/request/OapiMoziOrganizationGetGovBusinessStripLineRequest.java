package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziOrganizationGetGovBusinessStripLineResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziOrganizationGetGovBusinessStripLineRequest.class */
public class OapiMoziOrganizationGetGovBusinessStripLineRequest extends OapiRequest<OapiMoziOrganizationGetGovBusinessStripLineResponse> {
    private Long tenantId;
    private String businessStripCode;

    public final String getApiUrl() {
        return "/mozi/organization/getGovBusinessStripLine";
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setBusinessStripCode(String businessStripCode) {
        this.businessStripCode = businessStripCode;
    }

    public String getBusinessStripCode() {
        return this.businessStripCode;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziOrganizationGetGovBusinessStripLineResponse> getResponseClass() {
        return OapiMoziOrganizationGetGovBusinessStripLineResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
