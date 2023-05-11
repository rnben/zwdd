package com.alibaba.xxpt.gateway.shared.client.http.adapter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.xxpt.gateway.shared.client.http.AbstractRequest;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import com.alibaba.xxpt.gateway.shared.client.http.impl.GetRequest;
import com.alibaba.xxpt.gateway.shared.client.http.impl.PostRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/adapter/RequestAdapter.class */
public class RequestAdapter {
    private static final Set<String> IGNORE_FIELD = new HashSet();
    private static final Set<Class> SUPPORT_PARAM_CLASS = new HashSet();

    static {
        IGNORE_FIELD.add("responseClass");
        IGNORE_FIELD.add("apiUrl");
        SUPPORT_PARAM_CLASS.add(Byte.TYPE);
        SUPPORT_PARAM_CLASS.add(Short.TYPE);
        SUPPORT_PARAM_CLASS.add(Integer.TYPE);
        SUPPORT_PARAM_CLASS.add(Long.TYPE);
        SUPPORT_PARAM_CLASS.add(Double.TYPE);
        SUPPORT_PARAM_CLASS.add(Float.TYPE);
        SUPPORT_PARAM_CLASS.add(Boolean.TYPE);
        SUPPORT_PARAM_CLASS.add(Character.TYPE);
        SUPPORT_PARAM_CLASS.add(Byte.class);
        SUPPORT_PARAM_CLASS.add(Short.class);
        SUPPORT_PARAM_CLASS.add(Integer.class);
        SUPPORT_PARAM_CLASS.add(Long.class);
        SUPPORT_PARAM_CLASS.add(Double.class);
        SUPPORT_PARAM_CLASS.add(Float.class);
        SUPPORT_PARAM_CLASS.add(Boolean.class);
        SUPPORT_PARAM_CLASS.add(Character.class);
        SUPPORT_PARAM_CLASS.add(String.class);
    }

    public static void adapter(AbstractRequest request, OapiRequest oapiRequest) {
        Map<String, List<String>> paramMap = parseOapiRequest(oapiRequest);
        if ("GET".equals(request.methodName())) {
            paramMap.forEach(key, value -> {
                value.forEach(v -> {
                    ((GetRequest) request).addParameter(key, v);
                });
            });
        } else if ("POST".equals(request.methodName())) {
            paramMap.forEach(key2, value2 -> {
                value2.forEach(v -> {
                    ((PostRequest) request).addParameter(key2, v);
                });
            });
        } else {
            throw new RuntimeException("do not support method  " + request.methodName());
        }
    }

    private static Map<String, List<String>> parseOapiRequest(OapiRequest oapiRequest) {
        if (oapiRequest == null) {
            throw new NullPointerException("param " + OapiRequest.class.getName() + " cannot be null");
        }
        Map<String, List<String>> paramMap = new LinkedHashMap<>(16);
        JSONObject params = (JSONObject) JSON.toJSON(oapiRequest);
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null && !IGNORE_FIELD.contains(entry.getKey())) {
                String key = entry.getKey();
                Object value = entry.getValue();
                List<String> valueList = new ArrayList<>(16);
                if (value instanceof JSONArray) {
                    Iterator it = ((JSONArray) value).iterator();
                    while (it.hasNext()) {
                        Object v = it.next();
                        valueList.add(toStringValue(v));
                    }
                } else {
                    valueList.add(toStringValue(value));
                }
                if (!valueList.isEmpty()) {
                    paramMap.put(key, valueList);
                }
            }
        }
        return paramMap;
    }

    private static String toStringValue(Object v) {
        if (v == null) {
            return null;
        }
        if (!SUPPORT_PARAM_CLASS.contains(v.getClass())) {
            throw new RuntimeException("do not support param type " + v.getClass().getName());
        }
        return v.toString();
    }
}
