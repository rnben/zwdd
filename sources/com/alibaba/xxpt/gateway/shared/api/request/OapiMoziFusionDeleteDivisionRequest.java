package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziFusionDeleteDivisionResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziFusionDeleteDivisionRequest.class */
public class OapiMoziFusionDeleteDivisionRequest extends OapiRequest<OapiMoziFusionDeleteDivisionResponse> {
    private String divisionCode;
    private Long tenantId;
    private String operator;

    public final String getApiUrl() {
        return "/mozi/fusion/deleteDivision";
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    public String getDivisionCode() {
        return this.divisionCode;
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
    public Class<OapiMoziFusionDeleteDivisionResponse> getResponseClass() {
        return OapiMoziFusionDeleteDivisionResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
