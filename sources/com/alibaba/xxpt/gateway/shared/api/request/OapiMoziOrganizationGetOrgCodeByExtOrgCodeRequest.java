package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziOrganizationGetOrgCodeByExtOrgCodeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziOrganizationGetOrgCodeByExtOrgCodeRequest.class */
public class OapiMoziOrganizationGetOrgCodeByExtOrgCodeRequest extends OapiRequest<OapiMoziOrganizationGetOrgCodeByExtOrgCodeResponse> {
    private String extOrgCode;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/organization/getOrgCodeByExtOrgCode";
    }

    public void setExtOrgCode(String extOrgCode) {
        this.extOrgCode = extOrgCode;
    }

    public String getExtOrgCode() {
        return this.extOrgCode;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziOrganizationGetOrgCodeByExtOrgCodeResponse> getResponseClass() {
        return OapiMoziOrganizationGetOrgCodeByExtOrgCodeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
