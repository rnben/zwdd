package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiZzdIdMapGetEmpCodeByDtUserIdResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiZzdIdMapGetEmpCodeByDtUserIdRequest.class */
public class OapiZzdIdMapGetEmpCodeByDtUserIdRequest extends OapiRequest<OapiZzdIdMapGetEmpCodeByDtUserIdResponse> {
    private String dtUserId;
    private String realmId;

    public final String getApiUrl() {
        return "/zzd/idMap/getEmpCodeByDtUserId";
    }

    public void setDtUserId(String dtUserId) {
        this.dtUserId = dtUserId;
    }

    public String getDtUserId() {
        return this.dtUserId;
    }

    public void setRealmId(String realmId) {
        this.realmId = realmId;
    }

    public String getRealmId() {
        return this.realmId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiZzdIdMapGetEmpCodeByDtUserIdResponse> getResponseClass() {
        return OapiZzdIdMapGetEmpCodeByDtUserIdResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
