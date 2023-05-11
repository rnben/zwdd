package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziAclGetGrantRoleDataDetailResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziAclGetGrantRoleDataDetailRequest.class */
public class OapiMoziAclGetGrantRoleDataDetailRequest extends OapiRequest<OapiMoziAclGetGrantRoleDataDetailResponse> {
    private String roleCode;
    private Long tenantId;
    private String employeeCode;

    public final String getApiUrl() {
        return "/mozi/acl/getGrantRoleDataDetail";
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleCode() {
        return this.roleCode;
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
    public Class<OapiMoziAclGetGrantRoleDataDetailResponse> getResponseClass() {
        return OapiMoziAclGetGrantRoleDataDetailResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
