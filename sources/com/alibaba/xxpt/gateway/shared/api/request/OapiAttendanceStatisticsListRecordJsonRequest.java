package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiAttendanceStatisticsListRecordJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiAttendanceStatisticsListRecordJsonRequest.class */
public class OapiAttendanceStatisticsListRecordJsonRequest extends OapiRequest<OapiAttendanceStatisticsListRecordJsonResponse> {
    private String checkDateFrom;
    private List<Long> userIds;
    private Long tenantId;
    private Integer pageSize;
    private Integer currentPage;
    private String checkDateTo;

    public final String getApiUrl() {
        return "/attendance/statistics/listRecord.json";
    }

    public void setCheckDateFrom(String checkDateFrom) {
        this.checkDateFrom = checkDateFrom;
    }

    public String getCheckDateFrom() {
        return this.checkDateFrom;
    }

    public void setUserIds(List<Long> userIds) {
        this.userIds = userIds;
    }

    public List<Long> getUserIds() {
        return this.userIds;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public void setCheckDateTo(String checkDateTo) {
        this.checkDateTo = checkDateTo;
    }

    public String getCheckDateTo() {
        return this.checkDateTo;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiAttendanceStatisticsListRecordJsonResponse> getResponseClass() {
        return OapiAttendanceStatisticsListRecordJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
