package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiTcOpenapi3rdCreateSubTypeJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiTcOpenapi3rdCreateSubTypeJsonRequest.class */
public class OapiTcOpenapi3rdCreateSubTypeJsonRequest extends OapiRequest<OapiTcOpenapi3rdCreateSubTypeJsonResponse> {
    private String subTypeName;
    private String acceleratorCode;
    private String tenantId;
    private String description;
    private String directoryCode;
    private String templateCode;

    public final String getApiUrl() {
        return "/tc/openapi/3rd/create/subType.json";
    }

    public void setSubTypeName(String subTypeName) {
        this.subTypeName = subTypeName;
    }

    public String getSubTypeName() {
        return this.subTypeName;
    }

    public void setAcceleratorCode(String acceleratorCode) {
        this.acceleratorCode = acceleratorCode;
    }

    public String getAcceleratorCode() {
        return this.acceleratorCode;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDirectoryCode(String directoryCode) {
        this.directoryCode = directoryCode;
    }

    public String getDirectoryCode() {
        return this.directoryCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getTemplateCode() {
        return this.templateCode;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiTcOpenapi3rdCreateSubTypeJsonResponse> getResponseClass() {
        return OapiTcOpenapi3rdCreateSubTypeJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
