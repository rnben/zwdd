package com.alibaba.xxpt.gateway.shared.client.http;

import com.alibaba.xxpt.gateway.shared.client.NetworkUtils;
import com.alibaba.xxpt.gateway.shared.client.constants.HttpConstants;
import com.alibaba.xxpt.gateway.shared.client.sign.Signature;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.client.methods.HttpUriRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/AbstractRequest.class */
public abstract class AbstractRequest {
    private final int timeout;
    private final String version;
    private String accessKey;
    private String secretKey;
    private Signature signature = Signature.newInstance();

    protected abstract HttpUriRequest newHttpRequest();

    public abstract String methodName();

    public AbstractRequest(int timeout, String version) {
        this.timeout = timeout;
        this.version = version;
    }

    public HttpUriRequest getHttpRequest() {
        String signStr;
        HttpUriRequest request = newHttpRequest();
        this.signature.method(methodName()).path(request.getURI().getPath()).secretKey(this.secretKey);
        Header header = request.getFirstHeader(HttpConstants.X_HMAC_AUTH_ALGORITHM_HEADER);
        if (header == null) {
            signStr = this.signature.sign();
        } else {
            String algorithm = header.getValue();
            if (StringUtils.equals(algorithm, HttpConstants.X_HMAC_AUTH_ALGORITHM_MD5)) {
                signStr = this.signature.signMd5();
            } else {
                signStr = this.signature.sign();
            }
        }
        request.addHeader(HttpConstants.X_HMAC_AUTH_API_KEY_HEADER, this.accessKey);
        request.addHeader(HttpConstants.X_HMAC_AUTH_SIGNATURE_HEADER, signStr);
        request.addHeader(HttpConstants.X_HMAC_AUTH_TIMESTAMP_HEADER, this.signature.getTimestamp());
        request.addHeader(HttpConstants.X_HMAC_AUTH_VERSION_HEADER, this.version);
        request.addHeader(HttpConstants.X_HMAC_AUTH_NONCE_HEADER, this.signature.getNonce());
        request.addHeader(HttpConstants.X_HMAC_AUTH_IP_HEADER, NetworkUtils.getIp());
        request.addHeader(HttpConstants.X_HMAC_AUTH_MAC_HEADER, NetworkUtils.getMac());
        return request;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void addSignParameter(String name, String value) {
        this.signature.addParameter(name, value);
    }

    public AbstractRequest accessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public AbstractRequest secretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getSecretKey() {
        return this.secretKey;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isEmpty(String str) {
        if (str == null || "".equals(str.trim())) {
            return true;
        }
        return false;
    }
}
