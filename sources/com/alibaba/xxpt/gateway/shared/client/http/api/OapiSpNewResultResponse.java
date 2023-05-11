package com.alibaba.xxpt.gateway.shared.client.http.api;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/api/OapiSpNewResultResponse.class */
public abstract class OapiSpNewResultResponse extends OapiResponse {
    private OapiSpNewResultContent content;

    public OapiSpNewResultContent getContent() {
        return this.content;
    }

    public void setContent(OapiSpNewResultContent content) {
        this.content = content;
    }
}
