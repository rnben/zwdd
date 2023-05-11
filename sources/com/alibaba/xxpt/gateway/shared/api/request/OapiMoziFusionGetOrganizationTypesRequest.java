package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziFusionGetOrganizationTypesResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziFusionGetOrganizationTypesRequest.class */
public class OapiMoziFusionGetOrganizationTypesRequest extends OapiRequest<OapiMoziFusionGetOrganizationTypesResponse> {
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/fusion/getOrganizationTypes";
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziFusionGetOrganizationTypesResponse> getResponseClass() {
        return OapiMoziFusionGetOrganizationTypesResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
