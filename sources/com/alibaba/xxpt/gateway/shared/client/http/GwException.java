package com.alibaba.xxpt.gateway.shared.client.http;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/GwException.class */
public class GwException extends Exception {
    private String errorResult;

    public GwException() {
    }

    public GwException(String message) {
        super(message);
        this.errorResult = message;
    }

    public GwException(String message, Throwable cause) {
        super(message, cause);
        this.errorResult = message;
    }

    public GwException(Throwable cause) {
        super(cause);
    }

    public String getErrorResult() {
        return this.errorResult;
    }
}
