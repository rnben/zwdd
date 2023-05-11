package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiRobotMenuSaveMenuConfigResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiRobotMenuSaveMenuConfigRequest.class */
public class OapiRobotMenuSaveMenuConfigRequest extends OapiRequest<OapiRobotMenuSaveMenuConfigResponse> {
    private Long tenantId;
    private String appKey;
    private Integer showMenuFirst;
    private String menuString;
    private Integer enableInput;
    private Integer status;

    public final String getApiUrl() {
        return "/robot/menu/saveMenuConfig";
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

    public void setShowMenuFirst(Integer showMenuFirst) {
        this.showMenuFirst = showMenuFirst;
    }

    public Integer getShowMenuFirst() {
        return this.showMenuFirst;
    }

    public void setMenuString(String menuString) {
        this.menuString = menuString;
    }

    public String getMenuString() {
        return this.menuString;
    }

    public void setEnableInput(Integer enableInput) {
        this.enableInput = enableInput;
    }

    public Integer getEnableInput() {
        return this.enableInput;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return this.status;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiRobotMenuSaveMenuConfigResponse> getResponseClass() {
        return OapiRobotMenuSaveMenuConfigResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
