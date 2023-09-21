package com.cootek.smartinput5.func;

import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.cootek.smartinput5.func.M */
/* compiled from: EncryptionManager */
public class C1355M {
    /* renamed from: a */
    public static String m6226a(String str) {
        if (str == null) {
            str = "";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(str.getBytes(Utils.UTF8));
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    stringBuffer.append("0").append(hexString);
                } else {
                    stringBuffer.append(hexString);
                }
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
