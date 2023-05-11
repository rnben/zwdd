package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiYidaFormDesignGetFormComponentDefinationListJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiYidaFormDesignGetFormComponentDefinationListJsonRequest.class */
public class OapiYidaFormDesignGetFormComponentDefinationListJsonRequest extends OapiRequest<OapiYidaFormDesignGetFormComponentDefinationListJsonResponse> {
    private String formUuid;
    private String appType;
    private String systemToken;
    private String language;
    private Long version;
    private String userId;

    public final String getApiUrl() {
        return "/yida/formDesign/getFormComponentDefinationList.json";
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

    public void setSystemToken(String systemToken) {
        this.systemToken = systemToken;
    }

    public String getSystemToken() {
        return this.systemToken;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return this.userId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiYidaFormDesignGetFormComponentDefinationListJsonResponse> getResponseClass() {
        return OapiYidaFormDesignGetFormComponentDefinationListJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
