package p018cn.sharesdk.framework.utils;

import android.util.Base64;
import com.cootek.p042a.p043a.C0911j;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.net.URLEncoder;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: cn.sharesdk.framework.utils.a */
public class C0662a {

    /* renamed from: a */
    private static C0665d f1627a = new C0665d();

    /* renamed from: a */
    public static String m3783a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i++) {
            stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static byte[] m3784a(String str) {
        byte[] bytes = str.getBytes("utf-8");
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        instance.update(bytes);
        return instance.digest();
    }

    /* renamed from: a */
    public static byte[] m3785a(String str, String str2) {
        byte[] bytes = str.getBytes(Utils.UTF8);
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 16));
        byte[] bytes2 = str2.getBytes(Utils.UTF8);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher instance = Cipher.getInstance("AES/ECB/PKCS7Padding", "BC");
        instance.init(1, secretKeySpec);
        byte[] bArr2 = new byte[instance.getOutputSize(bytes2.length)];
        instance.doFinal(bArr2, instance.update(bytes2, 0, bytes2.length, bArr2, 0));
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m3786a(byte[] bArr, String str) {
        byte[] bytes = str.getBytes(Utils.UTF8);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher instance = Cipher.getInstance("AES/ECB/PKCS7Padding", "BC");
        instance.init(1, secretKeySpec);
        byte[] bArr2 = new byte[instance.getOutputSize(bytes.length)];
        instance.doFinal(bArr2, instance.update(bytes, 0, bytes.length, bArr2, 0));
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m3787a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "AES");
        Cipher instance = Cipher.getInstance("AES/ECB/NoPadding", "BC");
        instance.init(2, secretKeySpec);
        byte[] bArr4 = new byte[instance.getOutputSize(bArr2.length)];
        int update = instance.update(bArr2, 0, bArr2.length, bArr4, 0);
        int doFinal = instance.doFinal(bArr4, update) + update;
        return bArr4;
    }

    /* renamed from: b */
    public static String m3788b(String str) {
        byte[] c;
        if (str == null || (c = m3791c(str)) == null) {
            return null;
        }
        return C0664c.m3825a(c);
    }

    /* renamed from: b */
    public static String m3789b(String str, String str2) {
        Throwable th;
        String str3;
        try {
            str3 = Base64.encodeToString(m3785a(str2, str), 0);
            try {
                return str3.contains(C0911j.f2473c) ? str3.replace(C0911j.f2473c, "") : str3;
            } catch (Throwable th2) {
                th = th2;
                C0666e.m3838b(th);
                return str3;
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            str3 = null;
            th = th4;
            C0666e.m3838b(th);
            return str3;
        }
    }

    /* renamed from: c */
    public static String m3790c(String str, String str2) {
        return URLEncoder.encode(str, str2).replace("+", "%20");
    }

    /* renamed from: c */
    public static byte[] m3791c(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes("utf-8"));
            return instance.digest();
        } catch (Exception e) {
            C0666e.m3838b(e);
            return null;
        }
    }

    /* renamed from: d */
    public static String m3792d(String str) {
        try {
            return m3790c(str, "utf-8");
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return null;
        }
    }
}
