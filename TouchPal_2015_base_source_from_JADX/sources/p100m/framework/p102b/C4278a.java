package p100m.framework.p102b;

import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: m.framework.b.a */
/* compiled from: Data */
public class C4278a {

    /* renamed from: a */
    private static final String f17438a = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /* renamed from: b */
    private static C4281d f17439b = new C4281d();

    /* renamed from: a */
    public static byte[] m17868a(String str) throws Throwable {
        byte[] bytes = str.getBytes("utf-8");
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        instance.update(bytes);
        return instance.digest();
    }

    /* renamed from: a */
    public static byte[] m17869a(String str, String str2) throws Throwable {
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
    public static byte[] m17870a(byte[] bArr, String str) throws Throwable {
        byte[] bytes = str.getBytes(Utils.UTF8);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher instance = Cipher.getInstance("AES/ECB/PKCS7Padding", "BC");
        instance.init(1, secretKeySpec);
        byte[] bArr2 = new byte[instance.getOutputSize(bytes.length)];
        instance.doFinal(bArr2, instance.update(bytes, 0, bytes.length, bArr2, 0));
        return bArr2;
    }

    /* renamed from: a */
    public static String m17865a(String str, byte[] bArr) throws Throwable {
        return new String(m17871a(str.getBytes(Utils.UTF8), bArr), Utils.UTF8);
    }

    /* renamed from: a */
    public static byte[] m17871a(byte[] bArr, byte[] bArr2) throws Throwable {
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

    /* renamed from: a */
    public static String m17867a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i++) {
            stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static HashMap<String, Object> m17873b(String str) {
        return f17439b.mo15973a(str);
    }

    /* renamed from: a */
    public static String m17866a(HashMap<String, Object> hashMap) {
        return f17439b.mo15972a(hashMap);
    }

    /* renamed from: a */
    public static String m17864a(long j) {
        String str = j == 0 ? "0" : "";
        while (j > 0) {
            j /= 62;
            str = String.valueOf(f17438a.charAt((int) (j % 62))) + str;
        }
        return str;
    }

    /* renamed from: c */
    public static String m17874c(String str) {
        byte[] d;
        if (str == null || (d = m17875d(str)) == null) {
            return null;
        }
        return C4280c.m17904a(d);
    }

    /* renamed from: d */
    public static byte[] m17875d(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes("utf-8"));
            return instance.digest();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static String m17872b(String str, String str2) throws Throwable {
        return URLEncoder.encode(str, str2).replace("\\+", "%20");
    }
}
