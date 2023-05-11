package com.alibaba.xxpt.gateway.shared.client.asynchttp;

import com.alibaba.xxpt.gateway.shared.client.constants.HttpConstants;
import com.alibaba.xxpt.gateway.shared.client.sign.Signature;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.client.api.Request;
import org.eclipse.jetty.client.util.FormContentProvider;
import org.eclipse.jetty.reactive.client.ReactiveRequest;
import org.eclipse.jetty.reactive.client.ReactiveResponse;
import org.eclipse.jetty.util.Fields;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/asynchttp/AsyncPostClient.class */
public class AsyncPostClient {
    private Request request;
    private AsyncExecutableClient asyncExecutableClient;
    private InvokeCallback invokeCallback;
    private Fields fields = new Fields();
    private Signature signature = Signature.newInstance();

    public AsyncPostClient(AsyncExecutableClient asyncExecutableClient, Request request, InvokeCallback invokeCallback) {
        this.request = request;
        this.asyncExecutableClient = asyncExecutableClient;
        this.invokeCallback = invokeCallback;
    }

    public AsyncPostClient addParameter(String key, String value) {
        this.fields.add(key, value);
        this.signature.addParameter(key, value);
        return this;
    }

    public void post() {
        if (this.fields.getSize() > 0) {
            FormContentProvider formContentProvider = new FormContentProvider(this.fields);
            this.request.content(formContentProvider);
        }
        Map<String, String> headers = getHeaders();
        if (((headers != null) & (headers.size() > 0)) && headers != null && headers.size() > 0) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                this.request.header(entry.getKey(), entry.getValue());
            }
        }
        this.request.onResponseContent(response, content -> {
            this.invokeCallback.success(response, content);
        });
        this.request.onRequestFailure(request1, failure -> {
            this.invokeCallback.failed(request1, failure);
        });
        ReactiveRequest reactiveRequest = ReactiveRequest.newBuilder(this.request).build();
        Publisher<ReactiveResponse> publisher = reactiveRequest.response(ReactiveResponse.Content.discard());
        publisher.subscribe(new Subscriber<ReactiveResponse>() { // from class: com.alibaba.xxpt.gateway.shared.client.asynchttp.AsyncPostClient.1
            public void onSubscribe(Subscription subscription) {
                subscription.request(1L);
            }

            public void onNext(ReactiveResponse response2) {
                response2.getResponse();
            }

            public void onError(Throwable failure2) {
            }

            public void onComplete() {
            }
        });
    }

    private Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        this.signature.method(this.request.getMethod()).path(this.request.getPath()).secretKey(this.asyncExecutableClient.getSecretKey());
        String signStr = this.signature.sign();
        headers.put(HttpConstants.X_HMAC_AUTH_API_KEY_HEADER, this.asyncExecutableClient.getAccessKey());
        headers.put(HttpConstants.X_HMAC_AUTH_SIGNATURE_HEADER, signStr);
        headers.put(HttpConstants.X_HMAC_AUTH_TIMESTAMP_HEADER, this.signature.getTimestamp());
        headers.put(HttpConstants.X_HMAC_AUTH_VERSION_HEADER, "1.0");
        headers.put(HttpConstants.X_HMAC_AUTH_NONCE_HEADER, this.signature.getNonce());
        return headers;
    }
}
