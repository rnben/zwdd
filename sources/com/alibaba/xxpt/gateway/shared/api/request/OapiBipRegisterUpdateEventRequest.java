package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiBipRegisterUpdateEventResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiBipRegisterUpdateEventRequest.class */
public class OapiBipRegisterUpdateEventRequest extends OapiRequest<OapiBipRegisterUpdateEventResponse> {
    private String realmId;
    private String id;
    private String callBackUrl;
    private String intervalTime;

    public final String getApiUrl() {
        return "/bip/register/updateEvent";
    }

    public void setRealmId(String realmId) {
        this.realmId = realmId;
    }

    public String getRealmId() {
        return this.realmId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }

    public String getCallBackUrl() {
        return this.callBackUrl;
    }

    public void setIntervalTime(String intervalTime) {
        this.intervalTime = intervalTime;
    }

    public String getIntervalTime() {
        return this.intervalTime;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiBipRegisterUpdateEventResponse> getResponseClass() {
        return OapiBipRegisterUpdateEventResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
