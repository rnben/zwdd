package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiBipCommentLimitQueryGroupBySubjectIdResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiBipCommentLimitQueryGroupBySubjectIdRequest.class */
public class OapiBipCommentLimitQueryGroupBySubjectIdRequest extends OapiRequest<OapiBipCommentLimitQueryGroupBySubjectIdResponse> {
    private Integer pageNo;
    private Integer pageSize;
    private String sortBy;
    private String subjectId;
    private String subjectIdStr;
    private Long commentAccountId;
    private Long commentAccountTenantId;
    private Long subjectAccountId;
    private Long subjectAccountTenantId;
    private Integer type;
    private String bizCode;
    private Integer limitPerSubject;

    public final String getApiUrl() {
        return "/bip/comment/limitQueryGroupBySubjectId";
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

    public void setCommentAccountId(Long commentAccountId) {
        this.commentAccountId = commentAccountId;
    }

    public Long getCommentAccountId() {
        return this.commentAccountId;
    }

    public void setCommentAccountTenantId(Long commentAccountTenantId) {
        this.commentAccountTenantId = commentAccountTenantId;
    }

    public Long getCommentAccountTenantId() {
        return this.commentAccountTenantId;
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

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return this.type;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public void setLimitPerSubject(Integer limitPerSubject) {
        this.limitPerSubject = limitPerSubject;
    }

    public Integer getLimitPerSubject() {
        return this.limitPerSubject;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiBipCommentLimitQueryGroupBySubjectIdResponse> getResponseClass() {
        return OapiBipCommentLimitQueryGroupBySubjectIdResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
