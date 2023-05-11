package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiBipCommentUpdateResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiBipCommentUpdateRequest.class */
public class OapiBipCommentUpdateRequest extends OapiRequest<OapiBipCommentUpdateResponse> {
    private Long id;
    private String extendedField;

    public final String getApiUrl() {
        return "/bip/comment/update";
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

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiBipCommentUpdateResponse> getResponseClass() {
        return OapiBipCommentUpdateResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
