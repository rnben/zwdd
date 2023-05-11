package com.alibaba.xxpt.gateway.shared.client.http.api;

import java.io.Serializable;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/api/OapiResponse.class */
public abstract class OapiResponse implements Serializable {
    private String _RequestId;
    private String Message;
    private String HostId;
    private String Code;
    private String bizErrorCode;
    private String debug;
    private Boolean success;

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getDebug() {
        return this.debug;
    }

    public void setDebug(String debug) {
        this.debug = debug;
    }

    public String get_RequestId() {
        return this._RequestId;
    }

    public void set_RequestId(String _RequestId) {
        this._RequestId = _RequestId;
    }

    public String getMessage() {
        return this.Message;
    }

    public void setMessage(String message) {
        this.Message = message;
    }

    public String getHostId() {
        return this.HostId;
    }

    public void setHostId(String hostId) {
        this.HostId = hostId;
    }

    public String getCode() {
        return this.Code;
    }

    public void setCode(String code) {
        this.Code = code;
    }

    public String getBizErrorCode() {
        return this.bizErrorCode;
    }

    public void setBizErrorCode(String bizErrorCode) {
        this.bizErrorCode = bizErrorCode;
    }
}
