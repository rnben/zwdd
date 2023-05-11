package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMessageWorkNotificationResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMessageWorkNotificationRequest.class */
public class OapiMessageWorkNotificationRequest extends OapiRequest<OapiMessageWorkNotificationResponse> {
    private String organizationCodes;
    private String receiverIds;
    private String tenantId;
    private String bizMsgId;
    private String msg;

    public final String getApiUrl() {
        return "/message/workNotification";
    }

    public void setOrganizationCodes(String organizationCodes) {
        this.organizationCodes = organizationCodes;
    }

    public String getOrganizationCodes() {
        return this.organizationCodes;
    }

    public void setReceiverIds(String receiverIds) {
        this.receiverIds = receiverIds;
    }

    public String getReceiverIds() {
        return this.receiverIds;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public void setBizMsgId(String bizMsgId) {
        this.bizMsgId = bizMsgId;
    }

    public String getBizMsgId() {
        return this.bizMsgId;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMessageWorkNotificationResponse> getResponseClass() {
        return OapiMessageWorkNotificationResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
