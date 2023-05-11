package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiOpenplatformAppcenterAddAppUsedRangeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiOpenplatformAppcenterAddAppUsedRangeRequest.class */
public class OapiOpenplatformAppcenterAddAppUsedRangeRequest extends OapiRequest<OapiOpenplatformAppcenterAddAppUsedRangeResponse> {
    private Long tenantId;
    private String orgCodes;
    private String accountIds;
    private String lineCodes;

    public final String getApiUrl() {
        return "/openplatform/appcenter/addAppUsedRange";
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setOrgCodes(String orgCodes) {
        this.orgCodes = orgCodes;
    }

    public String getOrgCodes() {
        return this.orgCodes;
    }

    public void setAccountIds(String accountIds) {
        this.accountIds = accountIds;
    }

    public String getAccountIds() {
        return this.accountIds;
    }

    public void setLineCodes(String lineCodes) {
        this.lineCodes = lineCodes;
    }

    public String getLineCodes() {
        return this.lineCodes;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiOpenplatformAppcenterAddAppUsedRangeResponse> getResponseClass() {
        return OapiOpenplatformAppcenterAddAppUsedRangeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
