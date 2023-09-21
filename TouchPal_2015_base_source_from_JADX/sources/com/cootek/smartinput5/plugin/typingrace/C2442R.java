package com.cootek.smartinput5.plugin.typingrace;

import android.content.Context;
import android.provider.Settings;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.R */
/* compiled from: Utils */
public class C2442R {

    /* renamed from: a */
    private static final String f10639a = "HmacSHA1";

    /* renamed from: a */
    public static String m11079a(String[] strArr, String str) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "HmacSHA1");
        try {
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            for (String bytes : strArr) {
                instance.update(bytes.getBytes(Utils.UTF8));
            }
            return m11078a(instance.doFinal());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        } catch (InvalidKeyException e2) {
            e2.printStackTrace();
            return "";
        } catch (IllegalStateException e3) {
            e3.printStackTrace();
            return "";
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static String m11078a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m11077a(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "default_input_method");
    }
}
