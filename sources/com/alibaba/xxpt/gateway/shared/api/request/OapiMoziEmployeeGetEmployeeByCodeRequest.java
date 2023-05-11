package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeeGetEmployeeByCodeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeeGetEmployeeByCodeRequest.class */
public class OapiMoziEmployeeGetEmployeeByCodeRequest extends OapiRequest<OapiMoziEmployeeGetEmployeeByCodeResponse> {
    private String employeeCode;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/employee/getEmployeeByCode";
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeCode() {
        return this.employeeCode;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziEmployeeGetEmployeeByCodeResponse> getResponseClass() {
        return OapiMoziEmployeeGetEmployeeByCodeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
