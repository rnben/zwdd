package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiGbsTraceQueryQueryUserByGeoScopeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiGbsTraceQueryQueryUserByGeoScopeRequest.class */
public class OapiGbsTraceQueryQueryUserByGeoScopeRequest extends OapiRequest<OapiGbsTraceQueryQueryUserByGeoScopeResponse> {
    private Long searchLimitTime;
    private Integer geoType;
    private Double latitude;
    private Long tenantId;
    private Double radius;
    private Double longitude;

    public final String getApiUrl() {
        return "/gbs/traceQuery/queryUserByGeoScope";
    }

    public void setSearchLimitTime(Long searchLimitTime) {
        this.searchLimitTime = searchLimitTime;
    }

    public Long getSearchLimitTime() {
        return this.searchLimitTime;
    }

    public void setGeoType(Integer geoType) {
        this.geoType = geoType;
    }

    public Integer getGeoType() {
        return this.geoType;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return this.radius;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiGbsTraceQueryQueryUserByGeoScopeResponse> getResponseClass() {
        return OapiGbsTraceQueryQueryUserByGeoScopeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
