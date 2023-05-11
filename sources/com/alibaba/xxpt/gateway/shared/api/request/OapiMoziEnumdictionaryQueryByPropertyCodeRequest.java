package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEnumdictionaryQueryByPropertyCodeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEnumdictionaryQueryByPropertyCodeRequest.class */
public class OapiMoziEnumdictionaryQueryByPropertyCodeRequest extends OapiRequest<OapiMoziEnumdictionaryQueryByPropertyCodeResponse> {
    private String propertyCode;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/enumdictionary/queryByPropertyCode";
    }

    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
    }

    public String getPropertyCode() {
        return this.propertyCode;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziEnumdictionaryQueryByPropertyCodeResponse> getResponseClass() {
        return OapiMoziEnumdictionaryQueryByPropertyCodeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
