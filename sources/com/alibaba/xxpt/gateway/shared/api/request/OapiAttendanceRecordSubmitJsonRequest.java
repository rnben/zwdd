package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiAttendanceRecordSubmitJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiAttendanceRecordSubmitJsonRequest.class */
public class OapiAttendanceRecordSubmitJsonRequest extends OapiRequest<OapiAttendanceRecordSubmitJsonResponse> {
    private String recordJson;

    public final String getApiUrl() {
        return "/attendance/record/submit.json";
    }

    public void setRecordJson(String recordJson) {
        this.recordJson = recordJson;
    }

    public String getRecordJson() {
        return this.recordJson;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiAttendanceRecordSubmitJsonResponse> getResponseClass() {
        return OapiAttendanceRecordSubmitJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
