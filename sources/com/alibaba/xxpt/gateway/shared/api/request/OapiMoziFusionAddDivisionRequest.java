package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziFusionAddDivisionResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziFusionAddDivisionRequest.class */
public class OapiMoziFusionAddDivisionRequest extends OapiRequest<OapiMoziFusionAddDivisionResponse> {
    private String divisionName;
    private String operator;
    private String divisionCode;
    private String parentDivisionCode;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/fusion/addDivision";
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public String getDivisionName() {
        return this.divisionName;
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

    public void setParentDivisionCode(String parentDivisionCode) {
        this.parentDivisionCode = parentDivisionCode;
    }

    public String getParentDivisionCode() {
        return this.parentDivisionCode;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziFusionAddDivisionResponse> getResponseClass() {
        return OapiMoziFusionAddDivisionResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
