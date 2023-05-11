package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziTagCreateTagGroupResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziTagCreateTagGroupRequest.class */
public class OapiMoziTagCreateTagGroupRequest extends OapiRequest<OapiMoziTagCreateTagGroupResponse> {
    private String creator;
    private String tagGroupDescription;
    private Long tenantId;
    private String tagGroupName;

    public final String getApiUrl() {
        return "/mozi/tag/createTagGroup";
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setTagGroupDescription(String tagGroupDescription) {
        this.tagGroupDescription = tagGroupDescription;
    }

    public String getTagGroupDescription() {
        return this.tagGroupDescription;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setTagGroupName(String tagGroupName) {
        this.tagGroupName = tagGroupName;
    }

    public String getTagGroupName() {
        return this.tagGroupName;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziTagCreateTagGroupResponse> getResponseClass() {
        return OapiMoziTagCreateTagGroupResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
