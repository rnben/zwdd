package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziFusionUpdateDivisionResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziFusionUpdateDivisionRequest.class */
public class OapiMoziFusionUpdateDivisionRequest extends OapiRequest<OapiMoziFusionUpdateDivisionResponse> {
    private String operator;
    private String divisionCode;
    private String newDivisionName;
    private Long tenantId;
    private String newDivisionCode;

    public final String getApiUrl() {
        return "/mozi/fusion/updateDivision";
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    public String getDivisionCode() {
        return this.divisionCode;
    }

    public void setNewDivisionName(String newDivisionName) {
        this.newDivisionName = newDivisionName;
    }

    public String getNewDivisionName() {
        return this.newDivisionName;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setNewDivisionCode(String newDivisionCode) {
        this.newDivisionCode = newDivisionCode;
    }

    public String getNewDivisionCode() {
        return this.newDivisionCode;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziFusionUpdateDivisionResponse> getResponseClass() {
        return OapiMoziFusionUpdateDivisionResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
