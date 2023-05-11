package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiOpenplatformAppcenterRefreshWidgetInfoResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiOpenplatformAppcenterRefreshWidgetInfoRequest.class */
public class OapiOpenplatformAppcenterRefreshWidgetInfoRequest extends OapiRequest<OapiOpenplatformAppcenterRefreshWidgetInfoResponse> {
    private String accountIds;
    private Long tenantId;

    public final String getApiUrl() {
        return "/openplatform/appcenter/refreshWidgetInfo";
    }

    public void setAccountIds(String accountIds) {
        this.accountIds = accountIds;
    }

    public String getAccountIds() {
        return this.accountIds;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiOpenplatformAppcenterRefreshWidgetInfoResponse> getResponseClass() {
        return OapiOpenplatformAppcenterRefreshWidgetInfoResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
