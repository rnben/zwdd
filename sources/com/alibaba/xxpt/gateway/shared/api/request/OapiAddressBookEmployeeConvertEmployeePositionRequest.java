package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiAddressBookEmployeeConvertEmployeePositionResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiAddressBookEmployeeConvertEmployeePositionRequest.class */
public class OapiAddressBookEmployeeConvertEmployeePositionRequest extends OapiRequest<OapiAddressBookEmployeeConvertEmployeePositionResponse> {
    private String jobAttributeCode;
    private String operator;
    private String employeeCode;
    private String organizationCode;
    private Long tenantId;

    public final String getApiUrl() {
        return "/addressBook/employee/convertEmployeePosition";
    }

    public void setJobAttributeCode(String jobAttributeCode) {
        this.jobAttributeCode = jobAttributeCode;
    }

    public String getJobAttributeCode() {
        return this.jobAttributeCode;
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

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiAddressBookEmployeeConvertEmployeePositionResponse> getResponseClass() {
        return OapiAddressBookEmployeeConvertEmployeePositionResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
