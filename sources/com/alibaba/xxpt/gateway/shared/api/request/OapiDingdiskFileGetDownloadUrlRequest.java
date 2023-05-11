package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiDingdiskFileGetDownloadUrlResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiDingdiskFileGetDownloadUrlRequest.class */
public class OapiDingdiskFileGetDownloadUrlRequest extends OapiRequest<OapiDingdiskFileGetDownloadUrlResponse> {
    private String appName;
    private String bizScene;
    private String accessToken;
    private String deviceId;
    private String clientType;
    private String osType;
    private String clientDeviceModel;
    private String reqSource;
    private Long fileId;

    public final String getApiUrl() {
        return "/dingdisk/file/getDownloadUrl";
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

    public void setReqSource(String reqSource) {
        this.reqSource = reqSource;
    }

    public String getReqSource() {
        return this.reqSource;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public Long getFileId() {
        return this.fileId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiDingdiskFileGetDownloadUrlResponse> getResponseClass() {
        return OapiDingdiskFileGetDownloadUrlResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
