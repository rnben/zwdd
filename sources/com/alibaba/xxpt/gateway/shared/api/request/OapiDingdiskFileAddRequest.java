package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiDingdiskFileAddResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiDingdiskFileAddRequest.class */
public class OapiDingdiskFileAddRequest extends OapiRequest<OapiDingdiskFileAddResponse> {
    private String appName;
    private String bizScene;
    private String accessToken;
    private String deviceId;
    private String clientType;
    private String osType;
    private String clientDeviceModel;
    private Long size;
    private String name;
    private String mediaId;
    private String reqSource;
    private Long folderId;

    public final String getApiUrl() {
        return "/dingdisk/file/add";
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

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getSize() {
        return this.size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getMediaId() {
        return this.mediaId;
    }

    public void setReqSource(String reqSource) {
        this.reqSource = reqSource;
    }

    public String getReqSource() {
        return this.reqSource;
    }

    public void setFolderId(Long folderId) {
        this.folderId = folderId;
    }

    public Long getFolderId() {
        return this.folderId;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiDingdiskFileAddResponse> getResponseClass() {
        return OapiDingdiskFileAddResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
