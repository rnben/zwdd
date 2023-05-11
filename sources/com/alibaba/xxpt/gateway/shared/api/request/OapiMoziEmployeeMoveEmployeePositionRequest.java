package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeeMoveEmployeePositionResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeeMoveEmployeePositionRequest.class */
public class OapiMoziEmployeeMoveEmployeePositionRequest extends OapiRequest<OapiMoziEmployeeMoveEmployeePositionResponse> {
    private String toOrganizationCode;
    private String fromOrganizationCode;
    private String operator;
    private String employeeCode;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/employee/moveEmployeePosition";
    }

    public void setToOrganizationCode(String toOrganizationCode) {
        this.toOrganizationCode = toOrganizationCode;
    }

    public String getToOrganizationCode() {
        return this.toOrganizationCode;
    }

    public void setFromOrganizationCode(String fromOrganizationCode) {
        this.fromOrganizationCode = fromOrganizationCode;
    }

    public String getFromOrganizationCode() {
        return this.fromOrganizationCode;
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

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziEmployeeMoveEmployeePositionResponse> getResponseClass() {
        return OapiMoziEmployeeMoveEmployeePositionResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
