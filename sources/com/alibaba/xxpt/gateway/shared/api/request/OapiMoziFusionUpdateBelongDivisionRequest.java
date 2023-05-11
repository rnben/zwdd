package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziFusionUpdateBelongDivisionResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziFusionUpdateBelongDivisionRequest.class */
public class OapiMoziFusionUpdateBelongDivisionRequest extends OapiRequest<OapiMoziFusionUpdateBelongDivisionResponse> {
    private String divisionCode;
    private String newParentDivisionCode;
    private Long tenantId;
    private String operator;

    public final String getApiUrl() {
        return "/mozi/fusion/updateBelongDivision";
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    public String getDivisionCode() {
        return this.divisionCode;
    }

    public void setNewParentDivisionCode(String newParentDivisionCode) {
        this.newParentDivisionCode = newParentDivisionCode;
    }

    public String getNewParentDivisionCode() {
        return this.newParentDivisionCode;
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
    public Class<OapiMoziFusionUpdateBelongDivisionResponse> getResponseClass() {
        return OapiMoziFusionUpdateBelongDivisionResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
