package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeeGetByMobilesResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeeGetByMobilesRequest.class */
public class OapiMoziEmployeeGetByMobilesRequest extends OapiRequest<OapiMoziEmployeeGetByMobilesResponse> {
    private String areaCode;
    private String mobiles;
    private Long tenantId;
    private String namespace;

    public final String getApiUrl() {
        return "/mozi/employee/get_by_mobiles";
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setMobiles(String mobiles) {
        this.mobiles = mobiles;
    }

    public String getMobiles() {
        return this.mobiles;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getNamespace() {
        return this.namespace;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziEmployeeGetByMobilesResponse> getResponseClass() {
        return OapiMoziEmployeeGetByMobilesResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
