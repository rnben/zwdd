package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeeListEmployeeTagsResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeeListEmployeeTagsRequest.class */
public class OapiMoziEmployeeListEmployeeTagsRequest extends OapiRequest<OapiMoziEmployeeListEmployeeTagsResponse> {
    private Long tenantId;
    private String employeeCode;

    public final String getApiUrl() {
        return "/mozi/employee/listEmployeeTags";
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeCode() {
        return this.employeeCode;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziEmployeeListEmployeeTagsResponse> getResponseClass() {
        return OapiMoziEmployeeListEmployeeTagsResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
