package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiBipLikeUpdateResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiBipLikeUpdateRequest.class */
public class OapiBipLikeUpdateRequest extends OapiRequest<OapiBipLikeUpdateResponse> {
    private Long id;
    private String extendedField;
    private String subjectKeyword;

    public final String getApiUrl() {
        return "/bip/like/update";
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setExtendedField(String extendedField) {
        this.extendedField = extendedField;
    }

    public String getExtendedField() {
        return this.extendedField;
    }

    public void setSubjectKeyword(String subjectKeyword) {
        this.subjectKeyword = subjectKeyword;
    }

    public String getSubjectKeyword() {
        return this.subjectKeyword;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiBipLikeUpdateResponse> getResponseClass() {
        return OapiBipLikeUpdateResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
