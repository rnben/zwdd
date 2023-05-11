package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiRobotMessageBatchrecallgroupResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiRobotMessageBatchrecallgroupRequest.class */
public class OapiRobotMessageBatchrecallgroupRequest extends OapiRequest<OapiRobotMessageBatchrecallgroupResponse> {
    private String appKey;
    private Long tenantId;
    private String chatId;
    private List<String> msgIdList;

    public final String getApiUrl() {
        return "/robot/message/batchrecallgroup";
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

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setMsgIdList(List<String> msgIdList) {
        this.msgIdList = msgIdList;
    }

    public List<String> getMsgIdList() {
        return this.msgIdList;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiRobotMessageBatchrecallgroupResponse> getResponseClass() {
        return OapiRobotMessageBatchrecallgroupResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
