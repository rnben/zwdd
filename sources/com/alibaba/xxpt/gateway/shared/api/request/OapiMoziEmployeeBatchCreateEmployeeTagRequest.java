package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeeBatchCreateEmployeeTagResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeeBatchCreateEmployeeTagRequest.class */
public class OapiMoziEmployeeBatchCreateEmployeeTagRequest extends OapiRequest<OapiMoziEmployeeBatchCreateEmployeeTagResponse> {
    private List<String> tagCodes;
    private List<String> employeeCodes;
    private Long tenantId;
    private String operator;

    public final String getApiUrl() {
        return "/mozi/employee/batchCreateEmployeeTag";
    }

    public void setTagCodes(List<String> tagCodes) {
        this.tagCodes = tagCodes;
    }

    public List<String> getTagCodes() {
        return this.tagCodes;
    }

    public void setEmployeeCodes(List<String> employeeCodes) {
        this.employeeCodes = employeeCodes;
    }

    public List<String> getEmployeeCodes() {
        return this.employeeCodes;
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
    public Class<OapiMoziEmployeeBatchCreateEmployeeTagResponse> getResponseClass() {
        return OapiMoziEmployeeBatchCreateEmployeeTagResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
