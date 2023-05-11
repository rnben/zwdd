package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziStripLineAddressOrgGetDetailResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziStripLineAddressOrgGetDetailRequest.class */
public class OapiMoziStripLineAddressOrgGetDetailRequest extends OapiRequest<OapiMoziStripLineAddressOrgGetDetailResponse> {
    private String domainCode;
    private String organizationCode;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/stripLineAddressOrg/getDetail";
    }

    public void setDomainCode(String domainCode) {
        this.domainCode = domainCode;
    }

    public String getDomainCode() {
        return this.domainCode;
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
    public Class<OapiMoziStripLineAddressOrgGetDetailResponse> getResponseClass() {
        return OapiMoziStripLineAddressOrgGetDetailResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
