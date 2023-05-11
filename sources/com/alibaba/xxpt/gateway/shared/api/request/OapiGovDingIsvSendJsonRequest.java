package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiGovDingIsvSendJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiGovDingIsvSendJsonRequest.class */
public class OapiGovDingIsvSendJsonRequest extends OapiRequest<OapiGovDingIsvSendJsonResponse> {
    private String bodyType;
    private String creator;
    private String notifyType;
    private List<String> receivers;
    private String textType;
    private String body;
    private Long tenantId;

    public final String getApiUrl() {
        return "/gov/ding/isv/send.json";
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

    public void setTextType(String textType) {
        this.textType = textType;
    }

    public String getTextType() {
        return this.textType;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return this.body;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiGovDingIsvSendJsonResponse> getResponseClass() {
        return OapiGovDingIsvSendJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
