package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiZzdDeptGetDepMapByTypeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiZzdDeptGetDepMapByTypeRequest.class */
public class OapiZzdDeptGetDepMapByTypeRequest extends OapiRequest<OapiZzdDeptGetDepMapByTypeResponse> {
    private String type;
    private String departmentIds;
    private String proxyTenantId;

    public final String getApiUrl() {
        return "/zzd/dept/getDepMapByType";
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setDepartmentIds(String departmentIds) {
        this.departmentIds = departmentIds;
    }

    public String getDepartmentIds() {
        return this.departmentIds;
    }

    public void setProxyTenantId(String proxyTenantId) {
        this.proxyTenantId = proxyTenantId;
    }

    public String getProxyTenantId() {
        return this.proxyTenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiZzdDeptGetDepMapByTypeResponse> getResponseClass() {
        return OapiZzdDeptGetDepMapByTypeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
