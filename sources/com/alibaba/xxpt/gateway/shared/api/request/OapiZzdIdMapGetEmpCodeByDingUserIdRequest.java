package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiZzdIdMapGetEmpCodeByDingUserIdResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiZzdIdMapGetEmpCodeByDingUserIdRequest.class */
public class OapiZzdIdMapGetEmpCodeByDingUserIdRequest extends OapiRequest<OapiZzdIdMapGetEmpCodeByDingUserIdResponse> {
    private String dingUserId;
    private String realmId;

    public final String getApiUrl() {
        return "/zzd/idMap/getEmpCodeByDingUserId";
    }

    public void setDingUserId(String dingUserId) {
        this.dingUserId = dingUserId;
    }

    public String getDingUserId() {
        return this.dingUserId;
    }

    public void setRealmId(String realmId) {
        this.realmId = realmId;
    }

    public String getRealmId() {
        return this.realmId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiZzdIdMapGetEmpCodeByDingUserIdResponse> getResponseClass() {
        return OapiZzdIdMapGetEmpCodeByDingUserIdResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
