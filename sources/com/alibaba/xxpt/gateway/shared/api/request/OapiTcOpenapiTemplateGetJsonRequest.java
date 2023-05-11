package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiTcOpenapiTemplateGetJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiTcOpenapiTemplateGetJsonRequest.class */
public class OapiTcOpenapiTemplateGetJsonRequest extends OapiRequest<OapiTcOpenapiTemplateGetJsonResponse> {
    private List<String> templateCodeList;
    private Integer pageNo;
    private String tenantId;
    private String name;
    private Integer pageSize;
    private String templateCode;

    public final String getApiUrl() {
        return "/tc/openapi/template/get.json";
    }

    public void setTemplateCodeList(List<String> templateCodeList) {
        this.templateCodeList = templateCodeList;
    }

    public List<String> getTemplateCodeList() {
        return this.templateCodeList;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageNo() {
        return this.pageNo;
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

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getTemplateCode() {
        return this.templateCode;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiTcOpenapiTemplateGetJsonResponse> getResponseClass() {
        return OapiTcOpenapiTemplateGetJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
