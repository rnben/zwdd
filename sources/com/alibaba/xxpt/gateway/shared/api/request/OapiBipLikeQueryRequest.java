package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiBipLikeQueryResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiBipLikeQueryRequest.class */
public class OapiBipLikeQueryRequest extends OapiRequest<OapiBipLikeQueryResponse> {
    private Integer pageNo;
    private Integer pageSize;
    private String sortBy;
    private String subjectId;
    private String subjectIdStr;
    private Long likeAccountId;
    private Long likeAccountTenantId;
    private Long subjectAccountId;
    private Long subjectAccountTenantId;
    private String bizCode;
    private Integer isPage;
    private String subjectKeyword;

    public final String getApiUrl() {
        return "/bip/like/query";
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getSortBy() {
        return this.sortBy;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectId() {
        return this.subjectId;
    }

    public void setSubjectIdStr(String subjectIdStr) {
        this.subjectIdStr = subjectIdStr;
    }

    public String getSubjectIdStr() {
        return this.subjectIdStr;
    }

    public void setLikeAccountId(Long likeAccountId) {
        this.likeAccountId = likeAccountId;
    }

    public Long getLikeAccountId() {
        return this.likeAccountId;
    }

    public void setLikeAccountTenantId(Long likeAccountTenantId) {
        this.likeAccountTenantId = likeAccountTenantId;
    }

    public Long getLikeAccountTenantId() {
        return this.likeAccountTenantId;
    }

    public void setSubjectAccountId(Long subjectAccountId) {
        this.subjectAccountId = subjectAccountId;
    }

    public Long getSubjectAccountId() {
        return this.subjectAccountId;
    }

    public void setSubjectAccountTenantId(Long subjectAccountTenantId) {
        this.subjectAccountTenantId = subjectAccountTenantId;
    }

    public Long getSubjectAccountTenantId() {
        return this.subjectAccountTenantId;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public void setIsPage(Integer isPage) {
        this.isPage = isPage;
    }

    public Integer getIsPage() {
        return this.isPage;
    }

    public void setSubjectKeyword(String subjectKeyword) {
        this.subjectKeyword = subjectKeyword;
    }

    public String getSubjectKeyword() {
        return this.subjectKeyword;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiBipLikeQueryResponse> getResponseClass() {
        return OapiBipLikeQueryResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
