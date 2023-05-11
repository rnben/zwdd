package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiDingdiskFilePhysicalDeleteResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiDingdiskFilePhysicalDeleteRequest.class */
public class OapiDingdiskFilePhysicalDeleteRequest extends OapiRequest<OapiDingdiskFilePhysicalDeleteResponse> {
    private String appName;
    private String bizScene;
    private String accessToken;
    private String deviceId;
    private String clientType;
    private String osType;
    private String clientDeviceModel;
    private Long spaceId;
    private Long dentryId;
    private String reqSource;
    private String user;

    public final String getApiUrl() {
        return "/dingdisk/file/physicalDelete";
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setBizScene(String bizScene) {
        this.bizScene = bizScene;
    }

    public String getBizScene() {
        return this.bizScene;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getClientType() {
        return this.clientType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getOsType() {
        return this.osType;
    }

    public void setClientDeviceModel(String clientDeviceModel) {
        this.clientDeviceModel = clientDeviceModel;
    }

    public String getClientDeviceModel() {
        return this.clientDeviceModel;
    }

    public void setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
    }

    public Long getSpaceId() {
        return this.spaceId;
    }

    public void setDentryId(Long dentryId) {
        this.dentryId = dentryId;
    }

    public Long getDentryId() {
        return this.dentryId;
    }

    public void setReqSource(String reqSource) {
        this.reqSource = reqSource;
    }

    public String getReqSource() {
        return this.reqSource;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return this.user;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiDingdiskFilePhysicalDeleteResponse> getResponseClass() {
        return OapiDingdiskFilePhysicalDeleteResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
