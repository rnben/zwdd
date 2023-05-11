package com.alibaba.xxpt.gateway.shared.client.asynchttp;

import java.nio.ByteBuffer;
import org.eclipse.jetty.client.api.Request;
import org.eclipse.jetty.client.api.Response;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/asynchttp/InvokeCallback.class */
public interface InvokeCallback {
    void success(Response response, ByteBuffer byteBuffer);

    void failed(Request request, Throwable th);
}
