package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiAttendanceSmartreportStatusJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiAttendanceSmartreportStatusJsonRequest.class */
public class OapiAttendanceSmartreportStatusJsonRequest extends OapiRequest<OapiAttendanceSmartreportStatusJsonResponse> {
    private Long tenantId;

    public final String getApiUrl() {
        return "/attendance/smartreport/status.json";
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiAttendanceSmartreportStatusJsonResponse> getResponseClass() {
        return OapiAttendanceSmartreportStatusJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
