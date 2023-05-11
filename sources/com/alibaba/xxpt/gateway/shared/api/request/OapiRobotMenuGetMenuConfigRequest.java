package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiRobotMenuGetMenuConfigResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiRobotMenuGetMenuConfigRequest.class */
public class OapiRobotMenuGetMenuConfigRequest extends OapiRequest<OapiRobotMenuGetMenuConfigResponse> {
    private Long tenantId;
    private String appKey;

    public final String getApiUrl() {
        return "/robot/menu/getMenuConfig";
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppKey() {
        return this.appKey;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiRobotMenuGetMenuConfigResponse> getResponseClass() {
        return OapiRobotMenuGetMenuConfigResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
