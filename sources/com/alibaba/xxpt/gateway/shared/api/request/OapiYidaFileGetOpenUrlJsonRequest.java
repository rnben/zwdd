package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaFileGetOpenUrlJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaFileGetOpenUrlJsonRequest.class */
public class OapiYidaFileGetOpenUrlJsonRequest extends OapiRequest<OapiYidaFileGetOpenUrlJsonResponse> {
    private String appType;
    private String systemToken;
    private String fileUrl;
    private String language;
    private String userId;
    private Long timeout;

    public final String getApiUrl() {
        return "/yida/file/getOpenUrl.json";
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getAppType() {
        return this.appType;
    }

    public void setSystemToken(String systemToken) {
        this.systemToken = systemToken;
    }

    public String getSystemToken() {
        return this.systemToken;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    public Long getTimeout() {
        return this.timeout;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiYidaFileGetOpenUrlJsonResponse> getResponseClass() {
        return OapiYidaFileGetOpenUrlJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
