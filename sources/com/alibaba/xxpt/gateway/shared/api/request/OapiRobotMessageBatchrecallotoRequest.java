package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiRobotMessageBatchrecallotoResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiRobotMessageBatchrecallotoRequest.class */
public class OapiRobotMessageBatchrecallotoRequest extends OapiRequest<OapiRobotMessageBatchrecallotoResponse> {
    private String appKey;
    private Long tenantId;
    private List<String> msgIds;

    public final String getApiUrl() {
        return "/robot/message/batchrecalloto";
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setMsgIds(List<String> msgIds) {
        this.msgIds = msgIds;
    }

    public List<String> getMsgIds() {
        return this.msgIds;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiRobotMessageBatchrecallotoResponse> getResponseClass() {
        return OapiRobotMessageBatchrecallotoResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
