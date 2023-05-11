package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiAttendanceStatisticsGetcolumnvalJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiAttendanceStatisticsGetcolumnvalJsonRequest.class */
public class OapiAttendanceStatisticsGetcolumnvalJsonRequest extends OapiRequest<OapiAttendanceStatisticsGetcolumnvalJsonResponse> {
    private String fromDate;
    private String toDate;
    private Long tenantId;
    private List<Long> columnIdList;
    private Long userId;

    public final String getApiUrl() {
        return "/attendance/statistics/getcolumnval.json";
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getFromDate() {
        return this.fromDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getToDate() {
        return this.toDate;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setColumnIdList(List<Long> columnIdList) {
        this.columnIdList = columnIdList;
    }

    public List<Long> getColumnIdList() {
        return this.columnIdList;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return this.userId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiAttendanceStatisticsGetcolumnvalJsonResponse> getResponseClass() {
        return OapiAttendanceStatisticsGetcolumnvalJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
