package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiNotificationMessageClearPortalNotificationResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiNotificationMessageClearPortalNotificationRequest.class */
public class OapiNotificationMessageClearPortalNotificationRequest extends OapiRequest<OapiNotificationMessageClearPortalNotificationResponse> {
    private Long accountId;
    private String bizMsgIds;
    private Long tenantId;

    public final String getApiUrl() {
        return "/notification/message/clearPortalNotification";
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public void setBizMsgIds(String bizMsgIds) {
        this.bizMsgIds = bizMsgIds;
    }

    public String getBizMsgIds() {
        return this.bizMsgIds;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiNotificationMessageClearPortalNotificationResponse> getResponseClass() {
        return OapiNotificationMessageClearPortalNotificationResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
