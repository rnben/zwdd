package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiCalendarCancelCalendarResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiCalendarCancelCalendarRequest.class */
public class OapiCalendarCancelCalendarRequest extends OapiRequest<OapiCalendarCancelCalendarResponse> {
    private String tenantId;
    private Long accountId;

    public final String getApiUrl() {
        return "/calendar/cancelCalendar";
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiCalendarCancelCalendarResponse> getResponseClass() {
        return OapiCalendarCancelCalendarResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
