package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziTagDeleteTagGroupResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziTagDeleteTagGroupRequest.class */
public class OapiMoziTagDeleteTagGroupRequest extends OapiRequest<OapiMoziTagDeleteTagGroupResponse> {
    private Long tenantId;
    private String tagGroupCode;
    private String operator;

    public final String getApiUrl() {
        return "/mozi/tag/deleteTagGroup";
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setTagGroupCode(String tagGroupCode) {
        this.tagGroupCode = tagGroupCode;
    }

    public String getTagGroupCode() {
        return this.tagGroupCode;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziTagDeleteTagGroupResponse> getResponseClass() {
        return OapiMoziTagDeleteTagGroupResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
