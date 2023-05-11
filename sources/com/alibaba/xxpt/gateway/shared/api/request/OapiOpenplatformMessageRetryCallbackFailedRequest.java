package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiOpenplatformMessageRetryCallbackFailedResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiOpenplatformMessageRetryCallbackFailedRequest.class */
public class OapiOpenplatformMessageRetryCallbackFailedRequest extends OapiRequest<OapiOpenplatformMessageRetryCallbackFailedResponse> {
    private Long eventCallbackFailedId;

    public final String getApiUrl() {
        return "/openplatform/message/retry_callback_failed";
    }

    public void setEventCallbackFailedId(Long eventCallbackFailedId) {
        this.eventCallbackFailedId = eventCallbackFailedId;
    }

    public Long getEventCallbackFailedId() {
        return this.eventCallbackFailedId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiOpenplatformMessageRetryCallbackFailedResponse> getResponseClass() {
        return OapiOpenplatformMessageRetryCallbackFailedResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
