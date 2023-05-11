package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiApiV1SpaceGrantPermissionResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiApiV1SpaceGrantPermissionRequest.class */
public class OapiApiV1SpaceGrantPermissionRequest extends OapiRequest<OapiApiV1SpaceGrantPermissionResponse> {
    private String appName;
    private Long spaceId;
    private Long accountId;
    private Integer grantType;
    private Long tenantId;
    private String access_token;

    public final String getApiUrl() {
        return "/api/v1/space/grantPermission";
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
    }

    public Long getSpaceId() {
        return this.spaceId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public void setGrantType(Integer grantType) {
        this.grantType = grantType;
    }

    public Integer getGrantType() {
        return this.grantType;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getAccess_token() {
        return this.access_token;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiApiV1SpaceGrantPermissionResponse> getResponseClass() {
        return OapiApiV1SpaceGrantPermissionResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
