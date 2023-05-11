package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiAppRobotConfigGetResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiAppRobotConfigGetRequest.class */
public class OapiAppRobotConfigGetRequest extends OapiRequest<OapiAppRobotConfigGetResponse> {
    private String appKey;

    public final String getApiUrl() {
        return "/app/robot/config/get";
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppKey() {
        return this.appKey;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiAppRobotConfigGetResponse> getResponseClass() {
        return OapiAppRobotConfigGetResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
