package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziFusionGetPropertiesByOrgTypeCodeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziFusionGetPropertiesByOrgTypeCodeRequest.class */
public class OapiMoziFusionGetPropertiesByOrgTypeCodeRequest extends OapiRequest<OapiMoziFusionGetPropertiesByOrgTypeCodeResponse> {
    private String orgTypeCode;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/fusion/getPropertiesByOrgTypeCode";
    }

    public void setOrgTypeCode(String orgTypeCode) {
        this.orgTypeCode = orgTypeCode;
    }

    public String getOrgTypeCode() {
        return this.orgTypeCode;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziFusionGetPropertiesByOrgTypeCodeResponse> getResponseClass() {
        return OapiMoziFusionGetPropertiesByOrgTypeCodeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
