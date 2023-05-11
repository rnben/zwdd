package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziTagGetTagDetailResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziTagGetTagDetailRequest.class */
public class OapiMoziTagGetTagDetailRequest extends OapiRequest<OapiMoziTagGetTagDetailResponse> {
    private String tagCode;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/tag/getTagDetail";
    }

    public void setTagCode(String tagCode) {
        this.tagCode = tagCode;
    }

    public String getTagCode() {
        return this.tagCode;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziTagGetTagDetailResponse> getResponseClass() {
        return OapiMoziTagGetTagDetailResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
