package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeeListEmployeeAccountIdsResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeeListEmployeeAccountIdsRequest.class */
public class OapiMoziEmployeeListEmployeeAccountIdsRequest extends OapiRequest<OapiMoziEmployeeListEmployeeAccountIdsResponse> {
    private List<String> employeeCodes;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/employee/listEmployeeAccountIds";
    }

    public void setEmployeeCodes(List<String> employeeCodes) {
        this.employeeCodes = employeeCodes;
    }

    public List<String> getEmployeeCodes() {
        return this.employeeCodes;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziEmployeeListEmployeeAccountIdsResponse> getResponseClass() {
        return OapiMoziEmployeeListEmployeeAccountIdsResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
