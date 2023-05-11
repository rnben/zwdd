package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiBipRegisterFailedTasksResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiBipRegisterFailedTasksRequest.class */
public class OapiBipRegisterFailedTasksRequest extends OapiRequest<OapiBipRegisterFailedTasksResponse> {
    private String eventTag;
    private String realmId;

    public final String getApiUrl() {
        return "/bip/register/failedTasks";
    }

    public void setEventTag(String eventTag) {
        this.eventTag = eventTag;
    }

    public String getEventTag() {
        return this.eventTag;
    }

    public void setRealmId(String realmId) {
        this.realmId = realmId;
    }

    public String getRealmId() {
        return this.realmId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiBipRegisterFailedTasksResponse> getResponseClass() {
        return OapiBipRegisterFailedTasksResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
