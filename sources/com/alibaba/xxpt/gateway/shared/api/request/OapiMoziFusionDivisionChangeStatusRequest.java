package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziFusionDivisionChangeStatusResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziFusionDivisionChangeStatusRequest.class */
public class OapiMoziFusionDivisionChangeStatusRequest extends OapiRequest<OapiMoziFusionDivisionChangeStatusResponse> {
    private String divisionCode;
    private Long tenantId;
    private String operator;
    private String status;

    public final String getApiUrl() {
        return "/mozi/fusion/divisionChangeStatus";
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

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziFusionDivisionChangeStatusResponse> getResponseClass() {
        return OapiMoziFusionDivisionChangeStatusResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
