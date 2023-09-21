package com.cootek.smartinput5.func.iab;

import android.text.TextUtils;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.cootek.smartinput5.func.iab.ae */
/* compiled from: Security */
public class C1765ae {

    /* renamed from: a */
    private static final String f5745a = "IABUtil/Security";

    /* renamed from: b */
    private static final String f5746b = "RSA";

    /* renamed from: c */
    private static final String f5747c = "SHA1withRSA";

    /* renamed from: a */
    public static boolean m8111a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            return m8112a(m8110a(str), str2, str3);
        }
        Log.e(f5745a, "Purchase verification failed: missing data.");
        return false;
    }

    /* renamed from: a */
    public static PublicKey m8110a(String str) {
        try {
            return KeyFactory.getInstance(f5746b).generatePublic(new X509EncodedKeySpec(C1774b.m8145a(str)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e2) {
            Log.e(f5745a, "Invalid key specification.");
            throw new IllegalArgumentException(e2);
        } catch (C1775c e3) {
            Log.e(f5745a, "Base64 decoding failed.");
            throw new IllegalArgumentException(e3);
        }
    }

    /* renamed from: a */
    public static boolean m8112a(PublicKey publicKey, String str, String str2) {
        try {
            Signature instance = Signature.getInstance(f5747c);
            instance.initVerify(publicKey);
            instance.update(str.getBytes());
            if (instance.verify(C1774b.m8145a(str2))) {
                return true;
            }
            Log.e(f5745a, "Signature verification failed.");
            return false;
        } catch (NoSuchAlgorithmException e) {
            Log.e(f5745a, "NoSuchAlgorithmException.");
            return false;
        } catch (InvalidKeyException e2) {
            Log.e(f5745a, "Invalid key specification.");
            return false;
        } catch (SignatureException e3) {
            Log.e(f5745a, "Signature exception.");
            return false;
        } catch (C1775c e4) {
            Log.e(f5745a, "Base64 decoding failed.");
            return false;
        }
    }
}
