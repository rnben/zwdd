package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziOrganizationGetDivisionLineResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziOrganizationGetDivisionLineRequest.class */
public class OapiMoziOrganizationGetDivisionLineRequest extends OapiRequest<OapiMoziOrganizationGetDivisionLineResponse> {
    private String divisionCode;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/organization/getDivisionLine";
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    public String getDivisionCode() {
        return this.divisionCode;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziOrganizationGetDivisionLineResponse> getResponseClass() {
        return OapiMoziOrganizationGetDivisionLineResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
