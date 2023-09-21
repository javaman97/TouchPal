package com.p023a.p024a.p025a.p026a.p029b;

import com.p023a.p024a.p041c.C0813d;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.a.a.a.a.b.c */
/* compiled from: Md5FileNameGenerator */
public class C0728c implements C0726a {

    /* renamed from: a */
    private static final String f1802a = "MD5";

    /* renamed from: b */
    private static final int f1803b = 36;

    /* renamed from: a */
    public String mo2731a(String str) {
        return new BigInteger(m4121a(str.getBytes())).abs().toString(36);
    }

    /* renamed from: a */
    private byte[] m4121a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(f1802a);
            instance.update(bArr);
            return instance.digest();
        } catch (NoSuchAlgorithmException e) {
            C0813d.m4623a((Throwable) e);
            return null;
        }
    }
}
