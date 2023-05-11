package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziTagDeleteTagResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziTagDeleteTagRequest.class */
public class OapiMoziTagDeleteTagRequest extends OapiRequest<OapiMoziTagDeleteTagResponse> {
    private String tagCode;
    private Long tenantId;
    private String operator;

    public final String getApiUrl() {
        return "/mozi/tag/deleteTag";
    }

    public void setTagCode(String tagCode) {
        this.tagCode = tagCode;
    }

    public String getTagCode() {
        return this.tagCode;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziTagDeleteTagResponse> getResponseClass() {
        return OapiMoziTagDeleteTagResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
