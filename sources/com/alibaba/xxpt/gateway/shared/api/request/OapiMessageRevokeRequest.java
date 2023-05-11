package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMessageRevokeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMessageRevokeRequest.class */
public class OapiMessageRevokeRequest extends OapiRequest<OapiMessageRevokeResponse> {
    private String msgType;
    private String msgApp;
    private String tenantId;
    private String bizMsgId;

    public final String getApiUrl() {
        return "/message/revoke";
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getMsgType() {
        return this.msgType;
    }

    public void setMsgApp(String msgApp) {
        this.msgApp = msgApp;
    }

    public String getMsgApp() {
        return this.msgApp;
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

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMessageRevokeResponse> getResponseClass() {
        return OapiMessageRevokeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
