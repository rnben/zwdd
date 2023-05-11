package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiTcOpenapiPackageCloseJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiTcOpenapiPackageCloseJsonRequest.class */
public class OapiTcOpenapiPackageCloseJsonRequest extends OapiRequest<OapiTcOpenapiPackageCloseJsonResponse> {
    private String userId;
    private String packageUuid;

    public final String getApiUrl() {
        return "/tc/openapi/package/close.json";
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setPackageUuid(String packageUuid) {
        this.packageUuid = packageUuid;
    }

    public String getPackageUuid() {
        return this.packageUuid;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiTcOpenapiPackageCloseJsonResponse> getResponseClass() {
        return OapiTcOpenapiPackageCloseJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
