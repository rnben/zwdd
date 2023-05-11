package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiOpenplatformMessageQueryCallbackDefineResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiOpenplatformMessageQueryCallbackDefineRequest.class */
public class OapiOpenplatformMessageQueryCallbackDefineRequest extends OapiRequest<OapiOpenplatformMessageQueryCallbackDefineResponse> {
    public final String getApiUrl() {
        return "/openplatform/message/query_callback_define";
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiOpenplatformMessageQueryCallbackDefineResponse> getResponseClass() {
        return OapiOpenplatformMessageQueryCallbackDefineResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
