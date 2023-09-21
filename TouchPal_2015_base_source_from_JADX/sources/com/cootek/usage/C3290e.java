package com.cootek.usage;

import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.UUID;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.cootek.usage.e */
final class C3290e {

    /* renamed from: a */
    private static int f14456a = 1;

    /* renamed from: b */
    private static int f14457b = 2;

    C3290e() {
    }

    /* renamed from: a */
    static String m14579a(String str, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
        instance.init(1, secretKeySpec);
        str.getBytes();
        try {
            byte[] bytes = str.getBytes(Utils.UTF8);
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.finish();
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return C3286a.m14566a(instance.doFinal(byteArray), 8);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    static String m14580a(byte[] bArr, String str) {
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(C3286a.m14567a(str, 8)));
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
        instance.init(1, generatePublic);
        return C3286a.m14566a(instance.doFinal(bArr), 8);
    }

    /* renamed from: a */
    static Cipher m14581a(String str, int i) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(str.getBytes());
        SecretKeySpec secretKeySpec = new SecretKeySpec(instance.digest(), "AES");
        Cipher instance2 = Cipher.getInstance("AES/ECB/PKCS5Padding");
        instance2.init(i, secretKeySpec);
        return instance2;
    }

    /* renamed from: a */
    static byte[] m14582a() {
        String uuid = UUID.randomUUID().toString();
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(uuid.getBytes());
        return instance.digest();
    }

    /* renamed from: a */
    private static byte[] m14583a(String str) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(str.getBytes());
        return instance.digest();
    }
}
