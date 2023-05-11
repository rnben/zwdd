package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiCalendarUpdateResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiCalendarUpdateRequest.class */
public class OapiCalendarUpdateRequest extends OapiRequest<OapiCalendarUpdateResponse> {
    private Long tenantId;
    private Long accountId;

    public final String getApiUrl() {
        return "/calendar/update";
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiCalendarUpdateResponse> getResponseClass() {
        return OapiCalendarUpdateResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
