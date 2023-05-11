package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaRemarkSaveJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaRemarkSaveJsonRequest.class */
public class OapiYidaRemarkSaveJsonRequest extends OapiRequest<OapiYidaRemarkSaveJsonResponse> {
    private String images;
    private String formUuid;
    private String appType;
    private String formInstId;
    private Long replyId;
    private String systemToken;
    private String files;
    private String language;
    private String atUserId;
    private String userId;
    private String content;

    public final String getApiUrl() {
        return "/yida/remark/save.json";
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getImages() {
        return this.images;
    }

    public void setFormUuid(String formUuid) {
        this.formUuid = formUuid;
    }

    public String getFormUuid() {
        return this.formUuid;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getAppType() {
        return this.appType;
    }

    public void setFormInstId(String formInstId) {
        this.formInstId = formInstId;
    }

    public String getFormInstId() {
        return this.formInstId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public Long getReplyId() {
        return this.replyId;
    }

    public void setSystemToken(String systemToken) {
        this.systemToken = systemToken;
    }

    public String getSystemToken() {
        return this.systemToken;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public String getFiles() {
        return this.files;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setAtUserId(String atUserId) {
        this.atUserId = atUserId;
    }

    public String getAtUserId() {
        return this.atUserId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiYidaRemarkSaveJsonResponse> getResponseClass() {
        return OapiYidaRemarkSaveJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
