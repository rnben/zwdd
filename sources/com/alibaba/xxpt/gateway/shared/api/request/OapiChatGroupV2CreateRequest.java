package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiChatGroupV2CreateResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiChatGroupV2CreateRequest.class */
public class OapiChatGroupV2CreateRequest extends OapiRequest<OapiChatGroupV2CreateResponse> {
    private Long accountId;
    private Integer disableRead;
    private Long tenantId;
    private List<String> useridlist;
    private String name;
    private Integer managementType;

    public final String getApiUrl() {
        return "/chat/group/V2/create";
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountId() {
        return this.accountId;
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

    public void setUseridlist(List<String> useridlist) {
        this.useridlist = useridlist;
    }

    public List<String> getUseridlist() {
        return this.useridlist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setManagementType(Integer managementType) {
        this.managementType = managementType;
    }

    public Integer getManagementType() {
        return this.managementType;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiChatGroupV2CreateResponse> getResponseClass() {
        return OapiChatGroupV2CreateResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
