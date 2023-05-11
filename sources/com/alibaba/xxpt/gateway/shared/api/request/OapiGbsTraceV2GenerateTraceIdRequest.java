package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiGbsTraceV2GenerateTraceIdResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiGbsTraceV2GenerateTraceIdRequest.class */
public class OapiGbsTraceV2GenerateTraceIdRequest extends OapiRequest<OapiGbsTraceV2GenerateTraceIdResponse> {
    private Long tenantId;
    private Long userId;
    private String employeeCode;

    public final String getApiUrl() {
        return "/gbs/trace/v2/generateTraceId";
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeCode() {
        return this.employeeCode;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiGbsTraceV2GenerateTraceIdResponse> getResponseClass() {
        return OapiGbsTraceV2GenerateTraceIdResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
