package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiTcOpenapiTemplateSaveJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiTcOpenapiTemplateSaveJsonRequest.class */
public class OapiTcOpenapiTemplateSaveJsonRequest extends OapiRequest<OapiTcOpenapiTemplateSaveJsonResponse> {
    private String tenantId;
    private String name;
    private String description;
    private String componentList;
    private String templateCode;

    public final String getApiUrl() {
        return "/tc/openapi/template/save.json";
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setComponentList(String componentList) {
        this.componentList = componentList;
    }

    public String getComponentList() {
        return this.componentList;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getTemplateCode() {
        return this.templateCode;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiTcOpenapiTemplateSaveJsonResponse> getResponseClass() {
        return OapiTcOpenapiTemplateSaveJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
