package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeeListGovEmployeeCodesByAccountIdsResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeeListGovEmployeeCodesByAccountIdsRequest.class */
public class OapiMoziEmployeeListGovEmployeeCodesByAccountIdsRequest extends OapiRequest<OapiMoziEmployeeListGovEmployeeCodesByAccountIdsResponse> {
    private List<Long> accountIds;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/employee/listGovEmployeeCodesByAccountIds";
    }

    public void setAccountIds(List<Long> accountIds) {
        this.accountIds = accountIds;
    }

    public List<Long> getAccountIds() {
        return this.accountIds;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziEmployeeListGovEmployeeCodesByAccountIdsResponse> getResponseClass() {
        return OapiMoziEmployeeListGovEmployeeCodesByAccountIdsResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
