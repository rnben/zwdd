package com.alibaba.xxpt.gateway.shared.client.http.api;

import com.alibaba.xxpt.gateway.shared.client.http.api.OapiResponse;
import java.io.Serializable;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/api/OapiRequest.class */
public abstract class OapiRequest<T extends OapiResponse> implements Serializable {
    public abstract Class<T> getResponseClass();

    public abstract boolean isSame();
}
