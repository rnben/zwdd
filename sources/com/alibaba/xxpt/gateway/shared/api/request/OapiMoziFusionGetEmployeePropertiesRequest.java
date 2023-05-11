package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziFusionGetEmployeePropertiesResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziFusionGetEmployeePropertiesRequest.class */
public class OapiMoziFusionGetEmployeePropertiesRequest extends OapiRequest<OapiMoziFusionGetEmployeePropertiesResponse> {
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/fusion/getEmployeeProperties";
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziFusionGetEmployeePropertiesResponse> getResponseClass() {
        return OapiMoziFusionGetEmployeePropertiesResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
