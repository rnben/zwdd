package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeeTagScopeUpdateResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeeTagScopeUpdateRequest.class */
public class OapiMoziEmployeeTagScopeUpdateRequest extends OapiRequest<OapiMoziEmployeeTagScopeUpdateResponse> {
    private String organizationCodes;
    private String tagCode;
    private String operator;
    private String employeeCode;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/employee/tag/scope/update";
    }

    public void setOrganizationCodes(String organizationCodes) {
        this.organizationCodes = organizationCodes;
    }

    public String getOrganizationCodes() {
        return this.organizationCodes;
    }

    public void setTagCode(String tagCode) {
        this.tagCode = tagCode;
    }

    public String getTagCode() {
        return this.tagCode;
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
    public Class<OapiMoziEmployeeTagScopeUpdateResponse> getResponseClass() {
        return OapiMoziEmployeeTagScopeUpdateResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
