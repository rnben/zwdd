package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiTcOpenapi3rdUpdateSubTypeJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiTcOpenapi3rdUpdateSubTypeJsonRequest.class */
public class OapiTcOpenapi3rdUpdateSubTypeJsonRequest extends OapiRequest<OapiTcOpenapi3rdUpdateSubTypeJsonResponse> {
    private String subTypeName;
    private String subTypeCode;
    private String acceleratorCode;
    private String tenantId;
    private String description;
    private String templateCode;

    public final String getApiUrl() {
        return "/tc/openapi/3rd/update/subType.json";
    }

    public void setSubTypeName(String subTypeName) {
        this.subTypeName = subTypeName;
    }

    public String getSubTypeName() {
        return this.subTypeName;
    }

    public void setSubTypeCode(String subTypeCode) {
        this.subTypeCode = subTypeCode;
    }

    public String getSubTypeCode() {
        return this.subTypeCode;
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

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getTemplateCode() {
        return this.templateCode;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiTcOpenapi3rdUpdateSubTypeJsonResponse> getResponseClass() {
        return OapiTcOpenapi3rdUpdateSubTypeJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
