package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiAppRobotCreateResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiAppRobotCreateRequest.class */
public class OapiAppRobotCreateRequest extends OapiRequest<OapiAppRobotCreateResponse> {
    private String summary;
    private String accountId;
    private String showName;
    private String outgoingToken;
    private String previewPicUrl;
    private String outgoingUrl;
    private String tenantId;
    private String name;
    private String description;
    private String source;
    private String logoUrl;

    public final String getApiUrl() {
        return "/app/robot/create";
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getShowName() {
        return this.showName;
    }

    public void setOutgoingToken(String outgoingToken) {
        this.outgoingToken = outgoingToken;
    }

    public String getOutgoingToken() {
        return this.outgoingToken;
    }

    public void setPreviewPicUrl(String previewPicUrl) {
        this.previewPicUrl = previewPicUrl;
    }

    public String getPreviewPicUrl() {
        return this.previewPicUrl;
    }

    public void setOutgoingUrl(String outgoingUrl) {
        this.outgoingUrl = outgoingUrl;
    }

    public String getOutgoingUrl() {
        return this.outgoingUrl;
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

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiAppRobotCreateResponse> getResponseClass() {
        return OapiAppRobotCreateResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
