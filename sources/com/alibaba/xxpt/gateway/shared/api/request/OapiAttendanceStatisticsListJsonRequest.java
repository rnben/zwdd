package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiAttendanceStatisticsListJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiAttendanceStatisticsListJsonRequest.class */
public class OapiAttendanceStatisticsListJsonRequest extends OapiRequest<OapiAttendanceStatisticsListJsonResponse> {
    private String workDateFrom;
    private Long current;
    private List<Long> userIdList;
    private Long tenantId;
    private Long limit;
    private String workDateTo;

    public final String getApiUrl() {
        return "/attendance/statistics/list.json";
    }

    public void setWorkDateFrom(String workDateFrom) {
        this.workDateFrom = workDateFrom;
    }

    public String getWorkDateFrom() {
        return this.workDateFrom;
    }

    public void setCurrent(Long current) {
        this.current = current;
    }

    public Long getCurrent() {
        return this.current;
    }

    public void setUserIdList(List<Long> userIdList) {
        this.userIdList = userIdList;
    }

    public List<Long> getUserIdList() {
        return this.userIdList;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public Long getLimit() {
        return this.limit;
    }

    public void setWorkDateTo(String workDateTo) {
        this.workDateTo = workDateTo;
    }

    public String getWorkDateTo() {
        return this.workDateTo;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiAttendanceStatisticsListJsonResponse> getResponseClass() {
        return OapiAttendanceStatisticsListJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
