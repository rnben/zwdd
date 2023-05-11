package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiOpenplatformAppcenterGetAppUsedRangeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiOpenplatformAppcenterGetAppUsedRangeRequest.class */
public class OapiOpenplatformAppcenterGetAppUsedRangeRequest extends OapiRequest<OapiOpenplatformAppcenterGetAppUsedRangeResponse> {
    private Long tenantId;
    private Long currentPage;

    public final String getApiUrl() {
        return "/openplatform/appcenter/getAppUsedRange";
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public Long getCurrentPage() {
        return this.currentPage;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiOpenplatformAppcenterGetAppUsedRangeResponse> getResponseClass() {
        return OapiOpenplatformAppcenterGetAppUsedRangeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
