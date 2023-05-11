package com.alibaba.xxpt.gateway.shared.client;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import org.apache.commons.lang3.ArrayUtils;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/NetworkUtils.class */
public class NetworkUtils {
    private static String ip = getIp();
    private static String mac = mac();

    public static String getIp() {
        return ip;
    }

    public static String getMac() {
        return mac;
    }

    private static String ip() {
        String ip2 = "127.0.0.1";
        try {
            InetAddress address = InetAddress.getLocalHost();
            ip2 = address.getHostAddress();
        } catch (UnknownHostException e) {
        }
        return ip2;
    }

    private static String mac() {
        try {
            InetAddress address = InetAddress.getLocalHost();
            byte[] mac2 = NetworkInterface.getByInetAddress(address).getHardwareAddress();
            if (ArrayUtils.isEmpty(mac2)) {
                return "";
            }
            StringBuilder sb = new StringBuilder(17);
            for (int i = 0; i < mac2.length; i++) {
                if (i != 0) {
                    sb.append(":");
                }
                int temp = mac2[i] & 255;
                String str = Integer.toHexString(temp);
                if (str.length() == 1) {
                    sb.append("0" + str);
                } else {
                    sb.append(str);
                }
            }
            return sb.toString().toUpperCase();
        } catch (Exception e) {
            return "";
        }
    }
}
