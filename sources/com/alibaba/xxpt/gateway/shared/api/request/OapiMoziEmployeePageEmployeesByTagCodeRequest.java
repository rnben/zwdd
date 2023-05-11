package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeePageEmployeesByTagCodeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeePageEmployeesByTagCodeRequest.class */
public class OapiMoziEmployeePageEmployeesByTagCodeRequest extends OapiRequest<OapiMoziEmployeePageEmployeesByTagCodeResponse> {
    private String tagCode;
    private Integer pageSize;
    private Integer pageNo;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/employee/pageEmployeesByTagCode";
    }

    public void setTagCode(String tagCode) {
        this.tagCode = tagCode;
    }

    public String getTagCode() {
        return this.tagCode;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziEmployeePageEmployeesByTagCodeResponse> getResponseClass() {
        return OapiMoziEmployeePageEmployeesByTagCodeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
