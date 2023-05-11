package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiChatGroupGetUsersResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiChatGroupGetUsersRequest.class */
public class OapiChatGroupGetUsersRequest extends OapiRequest<OapiChatGroupGetUsersResponse> {
    private String chatId;

    public final String getApiUrl() {
        return "/chat/group/getUsers";
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getChatId() {
        return this.chatId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiChatGroupGetUsersResponse> getResponseClass() {
        return OapiChatGroupGetUsersResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
