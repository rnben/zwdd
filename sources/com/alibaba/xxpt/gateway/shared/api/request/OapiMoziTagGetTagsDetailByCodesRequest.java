package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziTagGetTagsDetailByCodesResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziTagGetTagsDetailByCodesRequest.class */
public class OapiMoziTagGetTagsDetailByCodesRequest extends OapiRequest<OapiMoziTagGetTagsDetailByCodesResponse> {
    private List<String> tagCodes;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/tag/getTagsDetailByCodes";
    }

    public void setTagCodes(List<String> tagCodes) {
        this.tagCodes = tagCodes;
    }

    public List<String> getTagCodes() {
        return this.tagCodes;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziTagGetTagsDetailByCodesResponse> getResponseClass() {
        return OapiMoziTagGetTagsDetailByCodesResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
