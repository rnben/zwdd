package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiTcOpenapi3rdAvailableDueNoticeJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiTcOpenapi3rdAvailableDueNoticeJsonRequest.class */
public class OapiTcOpenapi3rdAvailableDueNoticeJsonRequest extends OapiRequest<OapiTcOpenapi3rdAvailableDueNoticeJsonResponse> {
    private String tenantId;

    public final String getApiUrl() {
        return "/tc/openapi/3rd/available/due/notice.json";
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiTcOpenapi3rdAvailableDueNoticeJsonResponse> getResponseClass() {
        return OapiTcOpenapi3rdAvailableDueNoticeJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
