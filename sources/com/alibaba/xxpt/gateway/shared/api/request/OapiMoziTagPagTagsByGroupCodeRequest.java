package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziTagPagTagsByGroupCodeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziTagPagTagsByGroupCodeRequest.class */
public class OapiMoziTagPagTagsByGroupCodeRequest extends OapiRequest<OapiMoziTagPagTagsByGroupCodeResponse> {
    private Integer pageSize;
    private String tagGroupCode;
    private Integer pageNo;
    private Long tenantId;
    private String status;

    public final String getApiUrl() {
        return "/mozi/tag/pagTagsByGroupCode";
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

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziTagPagTagsByGroupCodeResponse> getResponseClass() {
        return OapiMoziTagPagTagsByGroupCodeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
