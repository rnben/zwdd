package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiAttendanceStatisticsGetattcolumnsJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiAttendanceStatisticsGetattcolumnsJsonRequest.class */
public class OapiAttendanceStatisticsGetattcolumnsJsonRequest extends OapiRequest<OapiAttendanceStatisticsGetattcolumnsJsonResponse> {
    private Long tenantId;

    public final String getApiUrl() {
        return "/attendance/statistics/getattcolumns.json";
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiAttendanceStatisticsGetattcolumnsJsonResponse> getResponseClass() {
        return OapiAttendanceStatisticsGetattcolumnsJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
