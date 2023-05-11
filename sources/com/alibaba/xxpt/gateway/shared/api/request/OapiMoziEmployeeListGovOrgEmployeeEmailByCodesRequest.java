package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeeListGovOrgEmployeeEmailByCodesResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeeListGovOrgEmployeeEmailByCodesRequest.class */
public class OapiMoziEmployeeListGovOrgEmployeeEmailByCodesRequest extends OapiRequest<OapiMoziEmployeeListGovOrgEmployeeEmailByCodesResponse> {
    private List<String> employeeCodes;
    private String organizationCode;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/employee/listGovOrgEmployeeEmailByCodes";
    }

    public void setEmployeeCodes(List<String> employeeCodes) {
        this.employeeCodes = employeeCodes;
    }

    public List<String> getEmployeeCodes() {
        return this.employeeCodes;
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
    public Class<OapiMoziEmployeeListGovOrgEmployeeEmailByCodesResponse> getResponseClass() {
        return OapiMoziEmployeeListGovOrgEmployeeEmailByCodesResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
