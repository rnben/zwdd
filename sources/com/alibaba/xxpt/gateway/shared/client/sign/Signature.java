package com.alibaba.xxpt.gateway.shared.client.sign;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Consts;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/client/sign/Signature.class */
public class Signature {
    private static final char SEPERATOR = 1;
    private static final char DELIMITER = '\n';
    private static final String HMAC_SHA256 = "HmacSHA256";
    private static final String MD5 = "MD5";
    private String method;
    private String timestamp;
    private String nonce;
    private String path;
    private TreeMap<String, String> parameter = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    private String secretKey;
    private static final byte[] EMPTY_BYTES = new byte[0];
    private static char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private Signature() {
    }

    public static Signature newInstance() {
        return new Signature();
    }

    public Signature path(String path) {
        this.path = path;
        return this;
    }

    public Signature method(String method) {
        this.method = method;
        return this;
    }

    public Signature secretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    public String sign() {
        ByteArrayOutputStream output = buildByteStream();
        return hmacSha256(output.toByteArray());
    }

    public String signMd5() {
        ByteArrayOutputStream output = buildByteStream();
        output.write(DELIMITER);
        try {
            output.write(this.secretKey.getBytes(Consts.UTF_8));
            return md5hex(output.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private ByteArrayOutputStream buildByteStream() {
        byte[] parameterBytes = assembleParameter();
        this.timestamp = currentNow();
        this.nonce = StringUtils.join(new String[]{String.valueOf(System.nanoTime()), RandomStringUtils.randomNumeric(4)});
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try {
            output.write(this.method.getBytes(Consts.UTF_8));
            output.write(DELIMITER);
            output.write(this.timestamp.getBytes(Consts.UTF_8));
            output.write(DELIMITER);
            output.write(this.nonce.getBytes(Consts.UTF_8));
            output.write(DELIMITER);
            output.write(this.path.getBytes(Consts.UTF_8));
            if (ArrayUtils.isNotEmpty(parameterBytes)) {
                output.write(DELIMITER);
                output.write(parameterBytes);
            }
            return output;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addParameter(String name, String value) {
        if (StringUtils.isEmpty(value) || StringUtils.isEmpty(name)) {
            return;
        }
        if (this.parameter.containsKey(name)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.parameter.get(name)).append((char) 1).append(value);
            this.parameter.put(name, sb.toString());
            return;
        }
        this.parameter.put(name, value);
    }

    private byte[] assembleParameter() {
        if (this.parameter.isEmpty()) {
            return EMPTY_BYTES;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.parameter.entrySet()) {
            if (StringUtils.contains(entry.getValue(), (int) SEPERATOR)) {
                String[] arr = StringUtils.split(entry.getValue(), (char) 1);
                List<String> list = new ArrayList<>();
                int length = arr.length;
                for (int i = 0; i < length; i += SEPERATOR) {
                    String element = arr[i];
                    list.add(element);
                }
                Collections.sort(list);
                for (String str : list) {
                    sb.append("&").append(String.format("%s=%s", entry.getKey(), str));
                }
            } else {
                sb.append("&").append(String.format("%s=%s", entry.getKey(), entry.getValue()));
            }
        }
        String content = sb.substring(SEPERATOR);
        return content.getBytes(Consts.UTF_8);
    }

    private String currentNow() {
        DateTimeFormatter dateTimeFormatter = ISODateTimeFormat.dateTime();
        return dateTimeFormatter.print(new DateTime());
    }

    private String hmacSha256(byte[] message) {
        byte[] secretKeyBytes = this.secretKey.getBytes(Consts.UTF_8);
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKeyBytes, HMAC_SHA256);
        try {
            Mac mac = Mac.getInstance(HMAC_SHA256);
            mac.init(secretKeySpec);
            mac.update(message);
            byte[] digestBytes = Base64.encodeBase64(mac.doFinal());
            return new String(digestBytes, Consts.UTF_8);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    private String md5hex(byte[] message) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MD5);
            messageDigest.update(message);
            byte[] digest = messageDigest.digest();
            int j = digest.length;
            char[] str = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i += SEPERATOR) {
                byte byte0 = digest[i];
                int i2 = k;
                int k2 = k + SEPERATOR;
                str[i2] = hexDigits[(byte0 >>> 4) & 15];
                k = k2 + SEPERATOR;
                str[k2] = hexDigits[byte0 & 15];
            }
            return new String(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getNonce() {
        return this.nonce;
    }

    public String getTimestamp() {
        return this.timestamp;
    }
}
