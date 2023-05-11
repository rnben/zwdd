package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeeListEmployeePositionsByEmployeeCodeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeeListEmployeePositionsByEmployeeCodeRequest.class */
public class OapiMoziEmployeeListEmployeePositionsByEmployeeCodeRequest extends OapiRequest<OapiMoziEmployeeListEmployeePositionsByEmployeeCodeResponse> {
    private String employeePositionStatus;
    private String employeePositionType;
    private String employeeCode;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/employee/listEmployeePositionsByEmployeeCode";
    }

    public void setEmployeePositionStatus(String employeePositionStatus) {
        this.employeePositionStatus = employeePositionStatus;
    }

    public String getEmployeePositionStatus() {
        return this.employeePositionStatus;
    }

    public void setEmployeePositionType(String employeePositionType) {
        this.employeePositionType = employeePositionType;
    }

    public String getEmployeePositionType() {
        return this.employeePositionType;
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
    public Class<OapiMoziEmployeeListEmployeePositionsByEmployeeCodeResponse> getResponseClass() {
        return OapiMoziEmployeeListEmployeePositionsByEmployeeCodeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
