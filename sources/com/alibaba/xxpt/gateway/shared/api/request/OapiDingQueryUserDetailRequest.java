package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiDingQueryUserDetailResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiDingQueryUserDetailRequest.class */
public class OapiDingQueryUserDetailRequest extends OapiRequest<OapiDingQueryUserDetailResponse> {
    private String dingId;

    public final String getApiUrl() {
        return "/ding/query/userDetail";
    }

    public void setDingId(String dingId) {
        this.dingId = dingId;
    }

    public String getDingId() {
        return this.dingId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiDingQueryUserDetailResponse> getResponseClass() {
        return OapiDingQueryUserDetailResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
