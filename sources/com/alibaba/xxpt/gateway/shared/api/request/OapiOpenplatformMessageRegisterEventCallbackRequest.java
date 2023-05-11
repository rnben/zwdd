package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiOpenplatformMessageRegisterEventCallbackResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiOpenplatformMessageRegisterEventCallbackRequest.class */
public class OapiOpenplatformMessageRegisterEventCallbackRequest extends OapiRequest<OapiOpenplatformMessageRegisterEventCallbackResponse> {
    private String eventTag;
    private String callbackUrl;

    public final String getApiUrl() {
        return "/openplatform/message/register_event_callback";
    }

    public void setEventTag(String eventTag) {
        this.eventTag = eventTag;
    }

    public String getEventTag() {
        return this.eventTag;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiOpenplatformMessageRegisterEventCallbackResponse> getResponseClass() {
        return OapiOpenplatformMessageRegisterEventCallbackResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
