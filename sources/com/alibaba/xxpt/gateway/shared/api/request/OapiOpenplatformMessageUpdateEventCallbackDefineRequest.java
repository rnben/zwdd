package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiOpenplatformMessageUpdateEventCallbackDefineResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiOpenplatformMessageUpdateEventCallbackDefineRequest.class */
public class OapiOpenplatformMessageUpdateEventCallbackDefineRequest extends OapiRequest<OapiOpenplatformMessageUpdateEventCallbackDefineResponse> {
    private Long eventCallbackId;
    private String callbackUrl;

    public final String getApiUrl() {
        return "/openplatform/message/update_event_callback_define";
    }

    public void setEventCallbackId(Long eventCallbackId) {
        this.eventCallbackId = eventCallbackId;
    }

    public Long getEventCallbackId() {
        return this.eventCallbackId;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiOpenplatformMessageUpdateEventCallbackDefineResponse> getResponseClass() {
        return OapiOpenplatformMessageUpdateEventCallbackDefineResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
