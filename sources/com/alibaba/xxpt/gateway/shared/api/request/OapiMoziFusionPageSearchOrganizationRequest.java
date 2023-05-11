package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziFusionPageSearchOrganizationResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziFusionPageSearchOrganizationRequest.class */
public class OapiMoziFusionPageSearchOrganizationRequest extends OapiRequest<OapiMoziFusionPageSearchOrganizationResponse> {
    private Boolean returnTotalSize;
    private String inOrganizationCode;
    private Integer pageSize;
    private Integer pageNo;
    private Long tenantId;
    private String cascadeOrganizationCode;
    private String status;
    private String nameKeywords;

    public final String getApiUrl() {
        return "/mozi/fusion/pageSearchOrganization";
    }

    public void setReturnTotalSize(Boolean returnTotalSize) {
        this.returnTotalSize = returnTotalSize;
    }

    public Boolean getReturnTotalSize() {
        return this.returnTotalSize;
    }

    public void setInOrganizationCode(String inOrganizationCode) {
        this.inOrganizationCode = inOrganizationCode;
    }

    public String getInOrganizationCode() {
        return this.inOrganizationCode;
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

    public void setCascadeOrganizationCode(String cascadeOrganizationCode) {
        this.cascadeOrganizationCode = cascadeOrganizationCode;
    }

    public String getCascadeOrganizationCode() {
        return this.cascadeOrganizationCode;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setNameKeywords(String nameKeywords) {
        this.nameKeywords = nameKeywords;
    }

    public String getNameKeywords() {
        return this.nameKeywords;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziFusionPageSearchOrganizationResponse> getResponseClass() {
        return OapiMoziFusionPageSearchOrganizationResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
