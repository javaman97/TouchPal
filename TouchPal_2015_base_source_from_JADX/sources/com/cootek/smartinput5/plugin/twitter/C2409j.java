package com.cootek.smartinput5.plugin.twitter;

import android.os.Bundle;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.HttpVersion;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

/* renamed from: com.cootek.smartinput5.plugin.twitter.j */
/* compiled from: OAuthUtils */
public class C2409j {

    /* renamed from: a */
    public static final String f10543a = "1.0";

    /* renamed from: b */
    public static final String f10544b = "HMAC-SHA1";

    /* renamed from: c */
    public static final String f10545c = "oauth_callback";

    /* renamed from: d */
    public static final String f10546d = "oauth_consumer_key";

    /* renamed from: e */
    public static final String f10547e = "oauth_nonce";

    /* renamed from: f */
    public static final String f10548f = "oauth_signature";

    /* renamed from: g */
    public static final String f10549g = "oauth_signature_method";

    /* renamed from: h */
    public static final String f10550h = "oauth_timestamp";

    /* renamed from: i */
    public static final String f10551i = "oauth_version";

    /* renamed from: j */
    public static final String f10552j = "oauth_consumer_secret";

    /* renamed from: k */
    public static final String f10553k = "oauth_token_secret";

    /* renamed from: l */
    public static final String f10554l = "oauth_token";

    /* renamed from: m */
    public static final String f10555m = "status";

    /* renamed from: n */
    public static final String f10556n = "include_entities";

    /* renamed from: o */
    public static final String f10557o = "oauth_verifier";

    /* renamed from: p */
    public static final String f10558p = "access_token";

    /* renamed from: q */
    public static final String f10559q = "access_token_secret";

    /* renamed from: a */
    public static String m11010a(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str2.startsWith(str + '=')) {
                return str2.split("=")[1].trim();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C2408i m11007a(C2408i iVar) {
        if (iVar == null) {
            return null;
        }
        C2408i iVar2 = new C2408i();
        for (int i = 0; i < iVar.mo8132a(); i++) {
            iVar2.mo8136a(m11008a(iVar.mo8138b(i)), m11008a(iVar.mo8140c(i)));
        }
        return iVar2;
    }

    /* renamed from: a */
    public static DefaultHttpClient m11011a() {
        try {
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            instance.load((InputStream) null, (char[]) null);
            C2405f fVar = new C2405f(instance);
            fVar.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
            HttpProtocolParams.setContentCharset(basicHttpParams, Utils.UTF8);
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 10000);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 10000);
            SchemeRegistry schemeRegistry = new SchemeRegistry();
            schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            schemeRegistry.register(new Scheme("https", fVar, 443));
            return new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
        } catch (Exception e) {
            e.printStackTrace();
            return new DefaultHttpClient();
        }
    }

    /* renamed from: b */
    public static String m11014b(C2408i iVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("OAuth ");
        for (int i = 0; i < iVar.mo8132a(); i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(m11008a(iVar.mo8138b(i)));
            sb.append("=");
            sb.append("\"");
            sb.append(m11008a(iVar.mo8140c(i)));
            sb.append("\"");
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static C2408i m11017c(C2408i iVar) {
        C2408i iVar2 = new C2408i();
        int[] iArr = new int[iVar.mo8132a()];
        for (int i = 0; i < iVar.mo8132a(); i++) {
            iArr[i] = i;
        }
        for (int i2 = 0; i2 < iVar.mo8132a(); i2++) {
            for (int i3 = i2 + 1; i3 < iVar.mo8132a(); i3++) {
                if (m11006a(i2, i3, iArr, iVar) > 0) {
                    int i4 = iArr[i2];
                    iArr[i2] = iArr[i3];
                    iArr[i3] = i4;
                }
            }
        }
        for (int i5 = 0; i5 < iVar.mo8132a(); i5++) {
            int i6 = iArr[i5];
            iVar2.mo8136a(iVar.mo8138b(i6), iVar.mo8140c(i6));
        }
        return iVar2;
    }

    /* renamed from: a */
    private static int m11006a(int i, int i2, int[] iArr, C2408i iVar) {
        return iVar.mo8138b(iArr[i]).compareTo(iVar.mo8138b(iArr[i2]));
    }

    /* renamed from: a */
    public static String m11009a(String str, String str2, String str3) {
        return str2.toUpperCase() + C2261Q.f9808n + m11008a(str3) + C2261Q.f9808n + m11008a(str);
    }

    /* renamed from: b */
    public static String m11015b(String str, String str2, String str3) {
        byte[] bArr = null;
        try {
            Mac instance = Mac.getInstance("HMAC-SHA1");
            String str4 = m11008a(str2) + C2261Q.f9808n;
            if (str3 != null) {
                str4 = str4 + m11008a(str3);
            }
            instance.init(new SecretKeySpec(str4.getBytes(), "HMAC-SHA1"));
            bArr = instance.doFinal(str.getBytes());
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
        }
        return String.valueOf(m11012a(bArr));
    }

    /* renamed from: d */
    public static String m11018d(C2408i iVar) {
        if (iVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iVar.mo8132a(); i++) {
            if (i != 0) {
                sb.append(C2261Q.f9808n);
            }
            sb.append(iVar.mo8138b(i));
            sb.append("=");
            sb.append(iVar.mo8140c(i));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m11008a(String str) {
        String str2 = null;
        try {
            str2 = URLEncoder.encode(str, Utils.UTF8);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder(str2.length());
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '*') {
                sb.append("%2A");
            } else if (charAt == '+') {
                sb.append("%20");
            } else if (charAt == '%' && i + 1 < str2.length() && str2.charAt(i + 1) == '7' && str2.charAt(i + 2) == 'E') {
                sb.append('~');
                i += 2;
            } else {
                sb.append(charAt);
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static char[] m11012a(byte[] bArr) {
        boolean z;
        byte b;
        boolean z2;
        int i;
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();
        char[] cArr = new char[(((bArr.length + 2) / 3) * 4)];
        int i2 = 0;
        int i3 = 0;
        while (i3 < bArr.length) {
            int i4 = (bArr[i3] & 255) << 8;
            if (i3 + 1 < bArr.length) {
                i4 |= bArr[i3 + 1] & 255;
                z = true;
            } else {
                z = false;
            }
            int i5 = i4 << 8;
            if (i3 + 2 < bArr.length) {
                b = i5 | (bArr[i3 + 2] & 255);
                z2 = true;
            } else {
                b = i5;
                z2 = false;
            }
            cArr[i2 + 3] = charArray[z2 ? b & 63 : 64];
            int i6 = b >> 6;
            int i7 = i2 + 2;
            if (z) {
                i = i6 & 63;
            } else {
                i = 64;
            }
            cArr[i7] = charArray[i];
            int i8 = i6 >> 6;
            cArr[i2 + 1] = charArray[i8 & 63];
            cArr[i2 + 0] = charArray[(i8 >> 6) & 63];
            i3 += 3;
            i2 += 4;
        }
        return cArr;
    }

    /* renamed from: c */
    private static Bundle m11016c(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String split : str.split(C2261Q.f9808n)) {
                String[] split2 = split.split("=");
                bundle.putString(URLDecoder.decode(split2[0]), URLDecoder.decode(split2[1]));
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m11013b(String str) {
        try {
            URL url = new URL(str.replace("twitterandroidsdk", "http"));
            Bundle c = m11016c(url.getQuery());
            c.putAll(m11016c(url.getRef()));
            return c;
        } catch (MalformedURLException e) {
            return new Bundle();
        }
    }
}
