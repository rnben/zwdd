package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiBipRegisterGetEventsResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiBipRegisterGetEventsRequest.class */
public class OapiBipRegisterGetEventsRequest extends OapiRequest<OapiBipRegisterGetEventsResponse> {
    private String realmId;

    public final String getApiUrl() {
        return "/bip/register/getEvents";
    }

    public void setRealmId(String realmId) {
        this.realmId = realmId;
    }

    public String getRealmId() {
        return this.realmId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiBipRegisterGetEventsResponse> getResponseClass() {
        return OapiBipRegisterGetEventsResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
