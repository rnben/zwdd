package com.alibaba.xxpt.gateway.shared.client.http;

import com.alibaba.xxpt.gateway.shared.client.constants.HttpConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/ExecutableClient.class */
public class ExecutableClient {
    private CloseableHttpClient httpClient;
    private IdleConnectionMonitorThread idleConnectionMonitorThread;
    private String uri;
    private String protocal;
    private String domainName;
    private String accessKey;
    private String secretKey;
    private long idletime;
    private int validateAfterInactivity;
    private Integer timeout;
    private HttpRoutePlanner routePlanner;
    private boolean inited;

    public static ExecutableClient getInstance() {
        return FactoryHodler.EXECUTABLE_CLIENT;
    }

    public ExecutableClient() {
        this.idletime = 30L;
        this.validateAfterInactivity = 60000;
        this.inited = false;
    }

    public ExecutableClient(long idletime, boolean inited) {
        this.idletime = 30L;
        this.validateAfterInactivity = 60000;
        this.inited = false;
        this.idletime = idletime;
        this.inited = inited;
    }

    public void init() {
        if (this.inited) {
            return;
        }
        this.uri = String.format("%s://%s", this.protocal, this.domainName);
        Registry<ConnectionSocketFactory> registry = RegistryBuilder.create().register("http", PlainConnectionSocketFactory.getSocketFactory()).register("https", SSLConnectionSocketFactory.getSocketFactory()).build();
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(registry);
        cm.setMaxTotal(800);
        cm.setDefaultMaxPerRoute(400);
        cm.setValidateAfterInactivity(this.validateAfterInactivity);
        HttpClientBuilder httpClientBuilder = HttpClients.custom();
        if (null != getRoutePlanner()) {
            httpClientBuilder = httpClientBuilder.setRoutePlanner(getRoutePlanner());
        }
        this.httpClient = httpClientBuilder.setConnectionManager(cm).setConnectionManagerShared(true).build();
        this.idleConnectionMonitorThread = new IdleConnectionMonitorThread(cm, this.idletime);
        this.idleConnectionMonitorThread.start();
        this.inited = true;
    }

    public String execute(AbstractRequest httpRequest) throws GwException {
        String response = null;
        int retry = 3;
        while (retry > 0) {
            try {
                if (StringUtils.isEmpty(httpRequest.getAccessKey()) || StringUtils.isEmpty(httpRequest.getSecretKey())) {
                    httpRequest.accessKey(this.accessKey).secretKey(this.secretKey);
                }
                response = (String) this.httpClient.execute(httpRequest.getHttpRequest(), FactoryHodler.STRING_RESPONSE_HANDLER);
                break;
            } catch (NoHttpResponseException noHttpResponseException) {
                this.httpClient.getConnectionManager().closeExpiredConnections();
                this.httpClient.getConnectionManager().closeIdleConnections(this.idletime, TimeUnit.SECONDS);
                retry--;
                if (retry == 0) {
                    throw new GwException(noHttpResponseException.getMessage(), noHttpResponseException);
                }
            } catch (IOException e) {
                throw new GwException(e.getMessage(), e);
            }
        }
        return response;
    }

    public CloseableHttpResponse executeB(AbstractRequest httpRequest) throws GwException {
        try {
            if (StringUtils.isEmpty(httpRequest.getAccessKey()) || StringUtils.isEmpty(httpRequest.getSecretKey())) {
                httpRequest.accessKey(this.accessKey).secretKey(this.secretKey);
            }
            CloseableHttpResponse response = this.httpClient.execute(httpRequest.getHttpRequest());
            return response;
        } catch (IOException e) {
            throw new GwException(e.getMessage(), e);
        }
    }

    public IntelligentGetClient newIntelligentGetClient(String api) {
        return newIntelligentGetClient(api, this.timeout == null ? HttpConstants.HTTP_CLIENT_TIMEOUT : this.timeout.intValue());
    }

    public IntelligentGetClient newIntelligentGetClient(String api, int timeout) {
        return newIntelligentGetClient(api, "1.0", timeout);
    }

    public IntelligentGetClient newIntelligentGetClient(String api, String version) {
        return newIntelligentGetClient(api, version, this.timeout == null ? HttpConstants.HTTP_CLIENT_TIMEOUT : this.timeout.intValue());
    }

    public IntelligentGetClient newIntelligentGetClient(String api, String version, int timeout) {
        return IntelligentGetClient.newInstance(this, this.uri, api, version, timeout);
    }

    public GetClient newGetClient(String api) {
        return newGetClient(api, this.timeout == null ? HttpConstants.HTTP_CLIENT_TIMEOUT : this.timeout.intValue());
    }

    public GetClient newGetClient(String api, int timeout) {
        return newGetClient(api, "1.0", timeout);
    }

    public GetClient newGetClient(String api, String version) {
        return newGetClient(api, version, this.timeout == null ? HttpConstants.HTTP_CLIENT_TIMEOUT : this.timeout.intValue());
    }

    public GetClient newGetClient(String api, String version, int timeout) {
        return GetClient.newInstance(this, this.uri, api, version, timeout);
    }

    public IntelligentPostClient newIntelligentPostClient(String api) {
        return newIntelligentPostClient(api, this.timeout == null ? HttpConstants.HTTP_CLIENT_TIMEOUT : this.timeout.intValue());
    }

    public IntelligentPostClient newIntelligentPostClient(String api, int timeout) {
        return newIntelligentPostClient(api, "1.0", timeout);
    }

    public IntelligentPostClient newIntelligentPostClient(String api, String version) {
        return newIntelligentPostClient(api, version, this.timeout == null ? HttpConstants.HTTP_CLIENT_TIMEOUT : this.timeout.intValue());
    }

    public IntelligentPostClient newIntelligentPostClient(String api, String version, int timeout) {
        return IntelligentPostClient.newInstance(this, this.uri, api, version, timeout);
    }

    public PostClient newPostClient(String api) {
        return newPostClient(api, this.timeout == null ? HttpConstants.HTTP_CLIENT_TIMEOUT : this.timeout.intValue());
    }

    public PostClient newPostClient(String api, int timeout) {
        return newPostClient(api, "1.0", timeout);
    }

    public PostClient newPostClient(String api, String version) {
        return newPostClient(api, version, this.timeout == null ? HttpConstants.HTTP_CLIENT_TIMEOUT : this.timeout.intValue());
    }

    public PostClient newPostClient(String api, String version, int timeout) {
        return PostClient.newInstance(this, this.uri, api, version, timeout);
    }

    public void destroy() {
        if (this.idleConnectionMonitorThread != null) {
            this.idleConnectionMonitorThread.shutdown();
            try {
                this.idleConnectionMonitorThread.join();
            } catch (InterruptedException e) {
            }
        }
        if (this.httpClient != null) {
            try {
                this.httpClient.close();
            } catch (IOException e2) {
            }
        }
    }

    /* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/ExecutableClient$IdleConnectionMonitorThread.class */
    public static class IdleConnectionMonitorThread extends Thread {
        private final HttpClientConnectionManager connMgr;
        private final long idletime;
        private volatile boolean shutdown;

        public IdleConnectionMonitorThread(HttpClientConnectionManager connMgr, long idletime) {
            this.connMgr = connMgr;
            this.idletime = idletime;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!this.shutdown) {
                try {
                    synchronized (this) {
                        wait(2000L);
                        this.connMgr.closeExpiredConnections();
                        this.connMgr.closeIdleConnections(this.idletime, TimeUnit.SECONDS);
                    }
                } catch (InterruptedException e) {
                    return;
                }
            }
        }

        public void shutdown() {
            this.shutdown = true;
            synchronized (this) {
                notifyAll();
            }
        }
    }

    /* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/ExecutableClient$StringResponseHandler.class */
    public static class StringResponseHandler implements ResponseHandler<String> {
        private String encode;

        public StringResponseHandler(String encode) {
            this.encode = encode;
        }

        /* renamed from: handleResponse */
        public String m3handleResponse(HttpResponse response) throws IOException {
            StatusLine statusLine = response.getStatusLine();
            HttpEntity entity = response.getEntity();
            String responseBody = entity == null ? null : EntityUtils.toString(entity, this.encode);
            if (statusLine.getStatusCode() >= 300 || statusLine.getStatusCode() == 203) {
                EntityUtils.consume(entity);
                throw new HttpResponseException(statusLine.getStatusCode(), responseBody);
            }
            return responseBody;
        }
    }

    /* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/ExecutableClient$ByteResponseHandler.class */
    public static class ByteResponseHandler implements ResponseHandler<byte[]> {
        /* renamed from: handleResponse */
        public byte[] m1handleResponse(HttpResponse response) throws IOException {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            response.getEntity().writeTo(bos);
            return bos.toByteArray();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/http/ExecutableClient$FactoryHodler.class */
    public static class FactoryHodler {
        public static final ExecutableClient EXECUTABLE_CLIENT = new ExecutableClient();
        public static final StringResponseHandler STRING_RESPONSE_HANDLER = new StringResponseHandler(Consts.UTF_8.name());
        public static final ByteResponseHandler BYTE_RESPONSE_HANDLER = new ByteResponseHandler();

        private FactoryHodler() {
        }
    }

    public void setProtocal(String protocal) {
        this.protocal = protocal;
    }

    public Integer getTimeout() {
        return this.timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public CloseableHttpClient getHttpClient() {
        return this.httpClient;
    }

    public String getUri() {
        return this.uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public long getIdletime() {
        return this.idletime;
    }

    public void setIdletime(long idletime) {
        this.idletime = idletime;
    }

    public HttpRoutePlanner getRoutePlanner() {
        return this.routePlanner;
    }

    public void setRoutePlanner(HttpRoutePlanner routePlanner) {
        this.routePlanner = routePlanner;
    }

    public int getValidateAfterInactivity() {
        return this.validateAfterInactivity;
    }

    public void setValidateAfterInactivity(int validateAfterInactivity) {
        this.validateAfterInactivity = validateAfterInactivity;
    }
}
