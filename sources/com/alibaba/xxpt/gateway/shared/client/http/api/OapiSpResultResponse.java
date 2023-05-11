package com.alibaba.xxpt.gateway.shared.client.http.api;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/api/OapiSpResultResponse.class */
public abstract class OapiSpResultResponse extends OapiResponse {
    private OapiSpResultContent content;

    public OapiSpResultContent getContent() {
        return this.content;
    }

    public void setContent(OapiSpResultContent content) {
        this.content = content;
    }
}
