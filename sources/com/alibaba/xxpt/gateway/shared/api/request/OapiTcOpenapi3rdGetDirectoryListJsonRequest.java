package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiTcOpenapi3rdGetDirectoryListJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiTcOpenapi3rdGetDirectoryListJsonRequest.class */
public class OapiTcOpenapi3rdGetDirectoryListJsonRequest extends OapiRequest<OapiTcOpenapi3rdGetDirectoryListJsonResponse> {
    private String tenantId;

    public final String getApiUrl() {
        return "/tc/openapi/3rd/get/directoryList.json";
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiTcOpenapi3rdGetDirectoryListJsonResponse> getResponseClass() {
        return OapiTcOpenapi3rdGetDirectoryListJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
