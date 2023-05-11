package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiGbsTraceGenerateTraceIdByIsvResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiGbsTraceGenerateTraceIdByIsvRequest.class */
public class OapiGbsTraceGenerateTraceIdByIsvRequest extends OapiRequest<OapiGbsTraceGenerateTraceIdByIsvResponse> {
    private Long tenantId;
    private Long userId;
    private String employeeCode;

    public final String getApiUrl() {
        return "/gbs/trace/generateTraceIdByIsv";
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
    public Class<OapiGbsTraceGenerateTraceIdByIsvResponse> getResponseClass() {
        return OapiGbsTraceGenerateTraceIdByIsvResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
