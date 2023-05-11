package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziFusionGetEmployeePositionPropertiesResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziFusionGetEmployeePositionPropertiesRequest.class */
public class OapiMoziFusionGetEmployeePositionPropertiesRequest extends OapiRequest<OapiMoziFusionGetEmployeePositionPropertiesResponse> {
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/fusion/getEmployeePositionProperties";
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziFusionGetEmployeePositionPropertiesResponse> getResponseClass() {
        return OapiMoziFusionGetEmployeePositionPropertiesResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
