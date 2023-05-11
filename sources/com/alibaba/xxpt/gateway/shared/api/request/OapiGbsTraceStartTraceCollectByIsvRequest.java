package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiGbsTraceStartTraceCollectByIsvResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiGbsTraceStartTraceCollectByIsvRequest.class */
public class OapiGbsTraceStartTraceCollectByIsvRequest extends OapiRequest<OapiGbsTraceStartTraceCollectByIsvResponse> {
    private String traceId;
    private Long tenantId;
    private Long userId;
    private String frequency;
    private String employeeCode;
    private Integer reportPeriod;
    private Integer collectPeriod;
    private Integer pushPeriod;

    public final String getApiUrl() {
        return "/gbs/trace/startTraceCollectByIsv";
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getFrequency() {
        return this.frequency;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeCode() {
        return this.employeeCode;
    }

    public void setReportPeriod(Integer reportPeriod) {
        this.reportPeriod = reportPeriod;
    }

    public Integer getReportPeriod() {
        return this.reportPeriod;
    }

    public void setCollectPeriod(Integer collectPeriod) {
        this.collectPeriod = collectPeriod;
    }

    public Integer getCollectPeriod() {
        return this.collectPeriod;
    }

    public void setPushPeriod(Integer pushPeriod) {
        this.pushPeriod = pushPeriod;
    }

    public Integer getPushPeriod() {
        return this.pushPeriod;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiGbsTraceStartTraceCollectByIsvResponse> getResponseClass() {
        return OapiGbsTraceStartTraceCollectByIsvResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
