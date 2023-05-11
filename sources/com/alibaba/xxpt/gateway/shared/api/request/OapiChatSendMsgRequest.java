package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiChatSendMsgResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiChatSendMsgRequest.class */
public class OapiChatSendMsgRequest extends OapiRequest<OapiChatSendMsgResponse> {
    private String msg;
    private String senderId;
    private String receiverId;
    private String chatId;
    private Long tenantId;
    private Integer chatType;

    public final String getApiUrl() {
        return "/chat/sendMsg";
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getSenderId() {
        return this.senderId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getReceiverId() {
        return this.receiverId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setChatType(Integer chatType) {
        this.chatType = chatType;
    }

    public Integer getChatType() {
        return this.chatType;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiChatSendMsgResponse> getResponseClass() {
        return OapiChatSendMsgResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
