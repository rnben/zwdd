package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiNotificationMessageSendPortalNotificationResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiNotificationMessageSendPortalNotificationRequest.class */
public class OapiNotificationMessageSendPortalNotificationRequest extends OapiRequest<OapiNotificationMessageSendPortalNotificationResponse> {
    private String bizMsgIds;
    private Long tenantId;
    private Long addNum;
    private Long accountId;

    public final String getApiUrl() {
        return "/notification/message/sendPortalNotification";
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

    public void setAddNum(Long addNum) {
        this.addNum = addNum;
    }

    public Long getAddNum() {
        return this.addNum;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiNotificationMessageSendPortalNotificationResponse> getResponseClass() {
        return OapiNotificationMessageSendPortalNotificationResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
