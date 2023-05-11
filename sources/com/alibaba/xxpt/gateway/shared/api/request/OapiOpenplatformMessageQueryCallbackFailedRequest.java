package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiOpenplatformMessageQueryCallbackFailedResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiOpenplatformMessageQueryCallbackFailedRequest.class */
public class OapiOpenplatformMessageQueryCallbackFailedRequest extends OapiRequest<OapiOpenplatformMessageQueryCallbackFailedResponse> {
    public final String getApiUrl() {
        return "/openplatform/message/query_callback_failed";
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiOpenplatformMessageQueryCallbackFailedResponse> getResponseClass() {
        return OapiOpenplatformMessageQueryCallbackFailedResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
