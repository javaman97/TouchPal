package com.appsflyer;

import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Map;

public class HashUtils {
    public native String getNativeCode(String str, String str2, String str3);

    public String getHashCode(Map<String, String> map) {
        String str = map.get(ServerParameters.TIMESTAMP);
        return toSHA1(map.get(ServerParameters.AF_DEV_KEY).substring(0, 7) + map.get(ServerParameters.AF_USER_ID).substring(0, 7) + str.substring(str.length() - 7));
    }

    public static String toSHA1(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            instance.update(str.getBytes(Utils.UTF8));
            return byteToHex(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static String byteToHex(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            formatter.format("%02x", new Object[]{Byte.valueOf(bArr[i])});
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
