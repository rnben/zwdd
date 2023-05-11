package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiOpenplatformMessageDeleteEventCallbackDefineResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiOpenplatformMessageDeleteEventCallbackDefineRequest.class */
public class OapiOpenplatformMessageDeleteEventCallbackDefineRequest extends OapiRequest<OapiOpenplatformMessageDeleteEventCallbackDefineResponse> {
    private Long eventCallbackId;

    public final String getApiUrl() {
        return "/openplatform/message/delete_event_callback_define";
    }

    public void setEventCallbackId(Long eventCallbackId) {
        this.eventCallbackId = eventCallbackId;
    }

    public Long getEventCallbackId() {
        return this.eventCallbackId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiOpenplatformMessageDeleteEventCallbackDefineResponse> getResponseClass() {
        return OapiOpenplatformMessageDeleteEventCallbackDefineResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
