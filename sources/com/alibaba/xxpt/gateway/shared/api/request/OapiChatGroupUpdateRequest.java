package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiChatGroupUpdateResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiChatGroupUpdateRequest.class */
public class OapiChatGroupUpdateRequest extends OapiRequest<OapiChatGroupUpdateResponse> {
    private String chatId;
    private Long newOwnerAccountId;
    private String icon;
    private Integer managementType;
    private Long accountId;
    private List<String> addUserIdList;
    private Integer disableRead;
    private Long tenantId;
    private String name;
    private Integer silenceAll;
    private List<String> delUserIdList;

    public final String getApiUrl() {
        return "/chat/group/update";
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setNewOwnerAccountId(Long newOwnerAccountId) {
        this.newOwnerAccountId = newOwnerAccountId;
    }

    public Long getNewOwnerAccountId() {
        return this.newOwnerAccountId;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setManagementType(Integer managementType) {
        this.managementType = managementType;
    }

    public Integer getManagementType() {
        return this.managementType;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public void setAddUserIdList(List<String> addUserIdList) {
        this.addUserIdList = addUserIdList;
    }

    public List<String> getAddUserIdList() {
        return this.addUserIdList;
    }

    public void setDisableRead(Integer disableRead) {
        this.disableRead = disableRead;
    }

    public Integer getDisableRead() {
        return this.disableRead;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSilenceAll(Integer silenceAll) {
        this.silenceAll = silenceAll;
    }

    public Integer getSilenceAll() {
        return this.silenceAll;
    }

    public void setDelUserIdList(List<String> delUserIdList) {
        this.delUserIdList = delUserIdList;
    }

    public List<String> getDelUserIdList() {
        return this.delUserIdList;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiChatGroupUpdateResponse> getResponseClass() {
        return OapiChatGroupUpdateResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
