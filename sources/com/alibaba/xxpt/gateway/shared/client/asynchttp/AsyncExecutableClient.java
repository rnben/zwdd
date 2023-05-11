package com.alibaba.xxpt.gateway.shared.client.asynchttp;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.Request;
import org.eclipse.jetty.util.ssl.SslContextFactory;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/asynchttp/AsyncExecutableClient.class */
public class AsyncExecutableClient {
    private String protocal;
    private String domainName;
    private String accessKey;
    private String secretKey;
    private InvokeCallback invokeCallback;
    private HttpClient httpClient = new HttpClient(new SslContextFactory.Client());

    public void init() {
        try {
            this.httpClient.start();
        } catch (Exception e) {
        }
    }

    public void destroy() {
        try {
            this.httpClient.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AsyncPostClient newPostClient(String api) {
        Request post = this.httpClient.POST(this.protocal + "://" + this.domainName + api);
        AsyncPostClient asyncPostClient = new AsyncPostClient(this, post, this.invokeCallback);
        return asyncPostClient;
    }

    public String getProtocal() {
        return this.protocal;
    }

    public void setProtocal(String protocal) {
        this.protocal = protocal;
    }

    public String getDomainName() {
        return this.domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return this.secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public InvokeCallback getInvokeCallback() {
        return this.invokeCallback;
    }

    public void setInvokeCallback(InvokeCallback invokeCallback) {
        this.invokeCallback = invokeCallback;
    }
}
