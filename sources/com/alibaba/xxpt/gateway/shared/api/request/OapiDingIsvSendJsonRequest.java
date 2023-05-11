package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiDingIsvSendJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiDingIsvSendJsonRequest.class */
public class OapiDingIsvSendJsonRequest extends OapiRequest<OapiDingIsvSendJsonResponse> {
    private String bodyType;
    private String creator;
    private String dingBodyTextType;
    private String dingBody;
    private String textType;
    private String source;
    private String body;
    private String scene;
    private String notifyType;
    private List<String> receivers;
    private String tenantId;
    private String dingBodyContentType;
    private Boolean sendToIm;
    private Long accountId;
    private String accountName;
    private String accountOrgName;
    private String accountOrgId;
    private String sourceId;
    private String extJson;
    private String sourceName;

    public final String getApiUrl() {
        return "/ding/isv/send.json";
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return this.bodyType;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setDingBodyTextType(String dingBodyTextType) {
        this.dingBodyTextType = dingBodyTextType;
    }

    public String getDingBodyTextType() {
        return this.dingBodyTextType;
    }

    public void setDingBody(String dingBody) {
        this.dingBody = dingBody;
    }

    public String getDingBody() {
        return this.dingBody;
    }

    public void setTextType(String textType) {
        this.textType = textType;
    }

    public String getTextType() {
        return this.textType;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return this.body;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getScene() {
        return this.scene;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    public String getNotifyType() {
        return this.notifyType;
    }

    public void setReceivers(List<String> receivers) {
        this.receivers = receivers;
    }

    public List<String> getReceivers() {
        return this.receivers;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public void setDingBodyContentType(String dingBodyContentType) {
        this.dingBodyContentType = dingBodyContentType;
    }

    public String getDingBodyContentType() {
        return this.dingBodyContentType;
    }

    public void setSendToIm(Boolean sendToIm) {
        this.sendToIm = sendToIm;
    }

    public Boolean getSendToIm() {
        return this.sendToIm;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountOrgName(String accountOrgName) {
        this.accountOrgName = accountOrgName;
    }

    public String getAccountOrgName() {
        return this.accountOrgName;
    }

    public void setAccountOrgId(String accountOrgId) {
        this.accountOrgId = accountOrgId;
    }

    public String getAccountOrgId() {
        return this.accountOrgId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public void setExtJson(String extJson) {
        this.extJson = extJson;
    }

    public String getExtJson() {
        return this.extJson;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceName() {
        return this.sourceName;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiDingIsvSendJsonResponse> getResponseClass() {
        return OapiDingIsvSendJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
