package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMessageChangeMessageInfoResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMessageChangeMessageInfoRequest.class */
public class OapiMessageChangeMessageInfoRequest extends OapiRequest<OapiMessageChangeMessageInfoResponse> {
    private String msgType;
    private String expireTime;
    private List<String> accountIds;
    private Long tenantId;
    private String bizMsgId;
    private String jsonContent;

    public final String getApiUrl() {
        return "/message/changeMessageInfo";
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getMsgType() {
        return this.msgType;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public void setAccountIds(List<String> accountIds) {
        this.accountIds = accountIds;
    }

    public List<String> getAccountIds() {
        return this.accountIds;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setBizMsgId(String bizMsgId) {
        this.bizMsgId = bizMsgId;
    }

    public String getBizMsgId() {
        return this.bizMsgId;
    }

    public void setJsonContent(String jsonContent) {
        this.jsonContent = jsonContent;
    }

    public String getJsonContent() {
        return this.jsonContent;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMessageChangeMessageInfoResponse> getResponseClass() {
        return OapiMessageChangeMessageInfoResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
