package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiBipRegisterCancellResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiBipRegisterCancellRequest.class */
public class OapiBipRegisterCancellRequest extends OapiRequest<OapiBipRegisterCancellResponse> {
    private String realmId;
    private String id;

    public final String getApiUrl() {
        return "/bip/register/cancell";
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

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiBipRegisterCancellResponse> getResponseClass() {
        return OapiBipRegisterCancellResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
