package com.alibaba.xxpt.gateway.shared.client.http.adapter;

import com.alibaba.fastjson.JSON;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiSameResponse;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/adapter/ResponseAdapter.class */
public class ResponseAdapter {
    public static <T extends OapiResponse> T adapter(String responseStringResult, OapiRequest oapiRequest) {
        if (responseStringResult == null) {
            return null;
        }
        if (oapiRequest == null) {
            throw new NullPointerException("param " + OapiRequest.class.getName() + " cannot be null");
        }
        Class<T> clazz = oapiRequest.getResponseClass();
        try {
            if (oapiRequest.isSame()) {
                OapiSameResponse result = (OapiSameResponse) oapiRequest.getResponseClass().newInstance();
                result.setSuccess(true);
                result.setContent(responseStringResult);
                return result;
            }
            return (T) JSON.parseObject(responseStringResult, clazz);
        } catch (Exception e) {
            try {
                T result2 = oapiRequest.getResponseClass().newInstance();
                result2.setSuccess(false);
                result2.setMessage(responseStringResult);
                return result2;
            } catch (IllegalAccessException | InstantiationException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
