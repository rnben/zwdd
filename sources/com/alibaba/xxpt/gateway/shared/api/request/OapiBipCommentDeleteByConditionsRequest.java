package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiBipCommentDeleteByConditionsResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiBipCommentDeleteByConditionsRequest.class */
public class OapiBipCommentDeleteByConditionsRequest extends OapiRequest<OapiBipCommentDeleteByConditionsResponse> {
    private String subjectId;
    private Long commentAccountId;
    private Long commentAccountTenantId;
    private Long subjectAccountId;
    private Long subjectAccountTenantId;
    private Integer type;
    private String bizCode;
    private Long id;
    private String isRecursion;

    public final String getApiUrl() {
        return "/bip/comment/deleteByConditions";
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectId() {
        return this.subjectId;
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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setIsRecursion(String isRecursion) {
        this.isRecursion = isRecursion;
    }

    public String getIsRecursion() {
        return this.isRecursion;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiBipCommentDeleteByConditionsResponse> getResponseClass() {
        return OapiBipCommentDeleteByConditionsResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
