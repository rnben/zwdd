package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiTcOpenapi3rdGetSubTypeListJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiTcOpenapi3rdGetSubTypeListJsonRequest.class */
public class OapiTcOpenapi3rdGetSubTypeListJsonRequest extends OapiRequest<OapiTcOpenapi3rdGetSubTypeListJsonResponse> {
    private String tenantId;
    private String directoryCode;

    public final String getApiUrl() {
        return "/tc/openapi/3rd/get/subTypeList.json";
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public void setDirectoryCode(String directoryCode) {
        this.directoryCode = directoryCode;
    }

    public String getDirectoryCode() {
        return this.directoryCode;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiTcOpenapi3rdGetSubTypeListJsonResponse> getResponseClass() {
        return OapiTcOpenapi3rdGetSubTypeListJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
