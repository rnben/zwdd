package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiBipLikeDeleteByConditionsResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiBipLikeDeleteByConditionsRequest.class */
public class OapiBipLikeDeleteByConditionsRequest extends OapiRequest<OapiBipLikeDeleteByConditionsResponse> {
    private String subjectId;
    private Long likeAccountId;
    private Long likeAccountTenantId;
    private Long subjectAccountId;
    private Long subjectAccountTenantId;
    private String bizCode;
    private Long id;

    public final String getApiUrl() {
        return "/bip/like/deleteByConditions";
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectId() {
        return this.subjectId;
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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiBipLikeDeleteByConditionsResponse> getResponseClass() {
        return OapiBipLikeDeleteByConditionsResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
