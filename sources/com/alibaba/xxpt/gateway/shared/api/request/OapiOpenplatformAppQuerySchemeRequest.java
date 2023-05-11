package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiOpenplatformAppQuerySchemeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiOpenplatformAppQuerySchemeRequest.class */
public class OapiOpenplatformAppQuerySchemeRequest extends OapiRequest<OapiOpenplatformAppQuerySchemeResponse> {
    private String tenantId;

    public final String getApiUrl() {
        return "/openplatform/app/queryScheme";
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiOpenplatformAppQuerySchemeResponse> getResponseClass() {
        return OapiOpenplatformAppQuerySchemeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
