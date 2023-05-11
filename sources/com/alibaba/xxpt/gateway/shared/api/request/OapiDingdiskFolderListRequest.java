package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiDingdiskFolderListResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiDingdiskFolderListRequest.class */
public class OapiDingdiskFolderListRequest extends OapiRequest<OapiDingdiskFolderListResponse> {
    private String appName;
    private String bizScene;
    private String accessToken;
    private String deviceId;
    private String clientType;
    private String osType;
    private String clientDeviceModel;
    private Integer pageIndex;
    private Integer sortType;
    private Integer pageSize;
    private String reqSource;
    private Long folderId;

    public final String getApiUrl() {
        return "/dingdisk/folder/list";
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

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public void setSortType(Integer sortType) {
        this.sortType = sortType;
    }

    public Integer getSortType() {
        return this.sortType;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return this.pageSize;
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
    public Class<OapiDingdiskFolderListResponse> getResponseClass() {
        return OapiDingdiskFolderListResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
