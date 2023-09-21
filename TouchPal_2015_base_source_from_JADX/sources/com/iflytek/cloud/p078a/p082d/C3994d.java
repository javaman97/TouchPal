package com.iflytek.cloud.p078a.p082d;

import java.security.MessageDigest;

/* renamed from: com.iflytek.cloud.a.d.d */
public class C3994d {
    /* renamed from: a */
    public static synchronized String m17042a(String str) {
        String str2;
        synchronized (C3994d.class) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                char[] charArray = str.toCharArray();
                byte[] bArr = new byte[charArray.length];
                for (int i = 0; i < charArray.length; i++) {
                    bArr[i] = (byte) charArray[i];
                }
                byte[] digest = instance.digest(bArr);
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b : digest) {
                    byte b2 = b & 255;
                    if (b2 < 16) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(Integer.toHexString(b2));
                }
                str2 = stringBuffer.toString();
            } catch (Exception e) {
                e.printStackTrace();
                str2 = "";
            }
        }
        return str2;
    }
}
