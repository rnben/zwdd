package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeePageEmployeesByTagGroupCodeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeePageEmployeesByTagGroupCodeRequest.class */
public class OapiMoziEmployeePageEmployeesByTagGroupCodeRequest extends OapiRequest<OapiMoziEmployeePageEmployeesByTagGroupCodeResponse> {
    private Integer pageSize;
    private String tagGroupCode;
    private Integer pageNo;
    private Long tenantId;

    public final String getApiUrl() {
        return "/mozi/employee/pageEmployeesByTagGroupCode";
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setTagGroupCode(String tagGroupCode) {
        this.tagGroupCode = tagGroupCode;
    }

    public String getTagGroupCode() {
        return this.tagGroupCode;
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
    public Class<OapiMoziEmployeePageEmployeesByTagGroupCodeResponse> getResponseClass() {
        return OapiMoziEmployeePageEmployeesByTagGroupCodeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
