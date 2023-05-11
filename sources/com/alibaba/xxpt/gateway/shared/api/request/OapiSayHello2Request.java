package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiSayHello2Response;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiSayHello2Request.class */
public class OapiSayHello2Request extends OapiRequest<OapiSayHello2Response> {
    private String arg0;
    private String access_token;

    public final String getApiUrl() {
        return "/sayHello2";
    }

    public void setArg0(String arg0) {
        this.arg0 = arg0;
    }

    public String getArg0() {
        return this.arg0;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getAccess_token() {
        return this.access_token;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiSayHello2Response> getResponseClass() {
        return OapiSayHello2Response.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
