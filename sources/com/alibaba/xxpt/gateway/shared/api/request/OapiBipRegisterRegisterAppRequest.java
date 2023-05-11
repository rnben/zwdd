package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiBipRegisterRegisterAppResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiBipRegisterRegisterAppRequest.class */
public class OapiBipRegisterRegisterAppRequest extends OapiRequest<OapiBipRegisterRegisterAppResponse> {
    private String eventTag;
    private String callBackUrl;
    private String realmId;
    private String intervalTime;
    private String isvGroupName;
    private String isvDockArea;

    public final String getApiUrl() {
        return "/bip/register/registerApp";
    }

    public void setEventTag(String eventTag) {
        this.eventTag = eventTag;
    }

    public String getEventTag() {
        return this.eventTag;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }

    public String getCallBackUrl() {
        return this.callBackUrl;
    }

    public void setRealmId(String realmId) {
        this.realmId = realmId;
    }

    public String getRealmId() {
        return this.realmId;
    }

    public void setIntervalTime(String intervalTime) {
        this.intervalTime = intervalTime;
    }

    public String getIntervalTime() {
        return this.intervalTime;
    }

    public void setIsvGroupName(String isvGroupName) {
        this.isvGroupName = isvGroupName;
    }

    public String getIsvGroupName() {
        return this.isvGroupName;
    }

    public void setIsvDockArea(String isvDockArea) {
        this.isvDockArea = isvDockArea;
    }

    public String getIsvDockArea() {
        return this.isvDockArea;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiBipRegisterRegisterAppResponse> getResponseClass() {
        return OapiBipRegisterRegisterAppResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
