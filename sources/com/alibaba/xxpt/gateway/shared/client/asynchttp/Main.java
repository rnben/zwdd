package com.alibaba.xxpt.gateway.shared.client.asynchttp;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import org.eclipse.jetty.client.api.Request;
import org.eclipse.jetty.client.api.Response;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/asynchttp/Main.class */
public class Main {
    public static void main(String[] args) {
        AsyncExecutableClient asyncExecutableClient = new AsyncExecutableClient();
        asyncExecutableClient.setAccessKey("zwdd-mobile-ios-ePJVCOwtvIBVjm");
        asyncExecutableClient.setSecretKey("J3Uya39cYUXh4hNpkTUxM24620W3L5sBe32vN957");
        asyncExecutableClient.setDomainName("gudao-openplatform-daily");
        asyncExecutableClient.setProtocal("http");
        asyncExecutableClient.setInvokeCallback(new InvokeCallback() { // from class: com.alibaba.xxpt.gateway.shared.client.asynchttp.Main.1
            @Override // com.alibaba.xxpt.gateway.shared.client.asynchttp.InvokeCallback
            public void success(Response response, ByteBuffer content) {
                Charset charset = Charset.forName("utf-8");
                CharBuffer charBuffer = charset.decode(content);
                String s = charBuffer.toString();
                System.out.println(s);
            }

            @Override // com.alibaba.xxpt.gateway.shared.client.asynchttp.InvokeCallback
            public void failed(Request request, Throwable failure) {
                System.out.println("http failed." + failure.getMessage());
            }
        });
        asyncExecutableClient.init();
        AsyncPostClient asyncPostClient = asyncExecutableClient.newPostClient("/rpc/test/CallOPApiWithHSF");
        asyncPostClient.post();
    }
}
