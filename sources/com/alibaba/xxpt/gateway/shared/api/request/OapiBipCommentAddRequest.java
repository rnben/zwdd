package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiBipCommentAddResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiBipCommentAddRequest.class */
public class OapiBipCommentAddRequest extends OapiRequest<OapiBipCommentAddResponse> {
    private String subjectId;
    private String type;
    private String replyCommentId;
    private String content;
    private String subjectAccountId;
    private String subjectAccountTenantId;
    private String extendedField;
    private String access_token;

    public final String getApiUrl() {
        return "/bip/comment/add";
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectId() {
        return this.subjectId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setReplyCommentId(String replyCommentId) {
        this.replyCommentId = replyCommentId;
    }

    public String getReplyCommentId() {
        return this.replyCommentId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setSubjectAccountId(String subjectAccountId) {
        this.subjectAccountId = subjectAccountId;
    }

    public String getSubjectAccountId() {
        return this.subjectAccountId;
    }

    public void setSubjectAccountTenantId(String subjectAccountTenantId) {
        this.subjectAccountTenantId = subjectAccountTenantId;
    }

    public String getSubjectAccountTenantId() {
        return this.subjectAccountTenantId;
    }

    public void setExtendedField(String extendedField) {
        this.extendedField = extendedField;
    }

    public String getExtendedField() {
        return this.extendedField;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getAccess_token() {
        return this.access_token;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiBipCommentAddResponse> getResponseClass() {
        return OapiBipCommentAddResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
