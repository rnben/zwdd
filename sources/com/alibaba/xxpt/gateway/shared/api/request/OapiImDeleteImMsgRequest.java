package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiImDeleteImMsgResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiImDeleteImMsgRequest.class */
public class OapiImDeleteImMsgRequest extends OapiRequest<OapiImDeleteImMsgResponse> {
    private String caller;
    private String messageId;
    private Integer operatorType;

    public final String getApiUrl() {
        return "/im/deleteImMsg";
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getCaller() {
        return this.caller;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public Integer getOperatorType() {
        return this.operatorType;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiImDeleteImMsgResponse> getResponseClass() {
        return OapiImDeleteImMsgResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
