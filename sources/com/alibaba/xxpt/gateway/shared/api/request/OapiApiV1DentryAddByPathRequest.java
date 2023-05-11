package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiApiV1DentryAddByPathResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiApiV1DentryAddByPathRequest.class */
public class OapiApiV1DentryAddByPathRequest extends OapiRequest<OapiApiV1DentryAddByPathResponse> {
    private String appName;
    private String bizScene;
    private String accessToken;
    private String deviceId;
    private String clientType;
    private String osType;
    private Long spaceId;
    private String path;
    private Long size;
    private String name;
    private String externalAcl;
    private String mediaId;
    private String reqSource;
    private Boolean overwrite;
    private String access_token;

    public final String getApiUrl() {
        return "/api/v1/dentry/add_by_path";
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

    public void setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
    }

    public Long getSpaceId() {
        return this.spaceId;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
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

    public void setExternalAcl(String externalAcl) {
        this.externalAcl = externalAcl;
    }

    public String getExternalAcl() {
        return this.externalAcl;
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

    public void setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
    }

    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getAccess_token() {
        return this.access_token;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiApiV1DentryAddByPathResponse> getResponseClass() {
        return OapiApiV1DentryAddByPathResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
