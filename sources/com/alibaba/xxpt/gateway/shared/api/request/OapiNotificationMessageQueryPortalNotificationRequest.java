package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiNotificationMessageQueryPortalNotificationResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiNotificationMessageQueryPortalNotificationRequest.class */
public class OapiNotificationMessageQueryPortalNotificationRequest extends OapiRequest<OapiNotificationMessageQueryPortalNotificationResponse> {
    private Long accountId;
    private Long tenantId;

    public final String getApiUrl() {
        return "/notification/message/queryPortalNotification";
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiNotificationMessageQueryPortalNotificationResponse> getResponseClass() {
        return OapiNotificationMessageQueryPortalNotificationResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
