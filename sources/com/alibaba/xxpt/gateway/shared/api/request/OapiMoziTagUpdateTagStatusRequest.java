package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziTagUpdateTagStatusResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziTagUpdateTagStatusRequest.class */
public class OapiMoziTagUpdateTagStatusRequest extends OapiRequest<OapiMoziTagUpdateTagStatusResponse> {
    private String tagCode;
    private Long tenantId;
    private String operator;
    private String status;

    public final String getApiUrl() {
        return "/mozi/tag/updateTagStatus";
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

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziTagUpdateTagStatusResponse> getResponseClass() {
        return OapiMoziTagUpdateTagStatusResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
