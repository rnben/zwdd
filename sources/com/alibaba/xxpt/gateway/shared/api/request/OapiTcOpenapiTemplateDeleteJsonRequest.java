package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiTcOpenapiTemplateDeleteJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiTcOpenapiTemplateDeleteJsonRequest.class */
public class OapiTcOpenapiTemplateDeleteJsonRequest extends OapiRequest<OapiTcOpenapiTemplateDeleteJsonResponse> {
    private String templateCode;

    public final String getApiUrl() {
        return "/tc/openapi/template/delete.json";
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getTemplateCode() {
        return this.templateCode;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiTcOpenapiTemplateDeleteJsonResponse> getResponseClass() {
        return OapiTcOpenapiTemplateDeleteJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
