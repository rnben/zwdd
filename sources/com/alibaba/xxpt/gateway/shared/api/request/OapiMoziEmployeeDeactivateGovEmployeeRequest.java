package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeeDeactivateGovEmployeeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeeDeactivateGovEmployeeRequest.class */
public class OapiMoziEmployeeDeactivateGovEmployeeRequest extends OapiRequest<OapiMoziEmployeeDeactivateGovEmployeeResponse> {
    private Long tenantId;
    private String operator;
    private String employeeCode;

    public final String getApiUrl() {
        return "/mozi/employee/deactivateGovEmployee";
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeCode() {
        return this.employeeCode;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziEmployeeDeactivateGovEmployeeResponse> getResponseClass() {
        return OapiMoziEmployeeDeactivateGovEmployeeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
