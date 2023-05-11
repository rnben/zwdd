package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiChatGroupMessageReadUsersResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiChatGroupMessageReadUsersRequest.class */
public class OapiChatGroupMessageReadUsersRequest extends OapiRequest<OapiChatGroupMessageReadUsersResponse> {
    private Long tenantId;
    private Long accountId;
    private String messageId;
    private Integer pageSize;
    private Long cursor;

    public final String getApiUrl() {
        return "/chat/group/messageReadUsers";
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setCursor(Long cursor) {
        this.cursor = cursor;
    }

    public Long getCursor() {
        return this.cursor;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiChatGroupMessageReadUsersResponse> getResponseClass() {
        return OapiChatGroupMessageReadUsersResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
