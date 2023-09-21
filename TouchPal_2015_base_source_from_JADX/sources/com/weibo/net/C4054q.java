package com.weibo.net;

import android.app.AlertDialog;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.cootek.smartinput5.func.nativeads.C1899v;
import com.cootek.smartinput5.net.cmd.C2250J;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.weibo.net.q */
/* compiled from: Utility */
public class C4054q {

    /* renamed from: a */
    public static final String f16505a = "7cd4a6d158c";

    /* renamed from: b */
    public static final String f16506b = "--7cd4a6d158c";

    /* renamed from: c */
    public static final String f16507c = "--7cd4a6d158c--";

    /* renamed from: d */
    public static final String f16508d = "multipart/form-data";

    /* renamed from: e */
    public static final String f16509e = "POST";

    /* renamed from: f */
    public static final String f16510f = "GET";

    /* renamed from: g */
    public static final String f16511g = "DELETE";

    /* renamed from: h */
    private static C4062x f16512h = new C4062x();

    /* renamed from: i */
    private static C4043f f16513i = null;

    /* renamed from: j */
    private static C4053p f16514j = null;

    /* renamed from: k */
    private static final int f16515k = 50000;

    /* renamed from: l */
    private static final int f16516l = 200000;

    /* renamed from: a */
    public static void m17230a(C4053p pVar) {
        f16514j = pVar;
    }

    /* renamed from: a */
    public static void m17229a(C4043f fVar) {
        f16513i = fVar;
    }

    /* renamed from: a */
    public static void m17234a(String str, HttpUriRequest httpUriRequest, C4062x xVar, String str2, C4053p pVar) throws C4061w {
        String a;
        if (!m17235a(f16512h)) {
            for (int i = 0; i < f16512h.mo15033a(); i++) {
                String b = f16512h.mo15039b(i);
                httpUriRequest.setHeader(b, f16512h.mo15042c(b));
            }
        }
        if (!(m17235a(xVar) || f16513i == null || (a = f16513i.mo14987a(str, str2, xVar, C4057s.m17252c(), C4057s.m17253d(), pVar)) == null)) {
            httpUriRequest.setHeader("Authorization", a);
        }
        httpUriRequest.setHeader("User-Agent", System.getProperties().getProperty("http.agent") + " WeiboAndroidSDK");
    }

    /* renamed from: a */
    public static boolean m17235a(C4062x xVar) {
        if (xVar == null || xVar.mo15033a() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m17233a(String str, String str2) {
        f16512h.mo15037a(str, str2);
    }

    /* renamed from: b */
    public static void m17239b(C4062x xVar) {
        f16512h.mo15035a(xVar);
    }

    /* renamed from: a */
    public static void m17227a() {
        f16512h.mo15040b();
    }

    /* renamed from: a */
    public static String m17222a(Bundle bundle, String str) {
        if (bundle == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : bundle.keySet()) {
            if (bundle.getByteArray(str2) == null) {
                sb.append("Content-Disposition: form-data; name=\"" + str2 + "\"\r\n\r\n" + bundle.getString(str2));
                sb.append("\r\n--" + str + "\r\n");
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m17240c(C4062x xVar) {
        if (xVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (int i = 0; i < xVar.mo15033a(); i++) {
            if (z) {
                z = false;
            } else {
                sb.append(C2261Q.f9808n);
            }
            sb.append(URLEncoder.encode(xVar.mo15039b(i)) + "=" + URLEncoder.encode(xVar.mo15041c(i)));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Bundle m17219a(String str) {
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
    public static Bundle m17237b(String str) {
        try {
            URL url = new URL(str.replace("weiboconnect", "http"));
            Bundle a = m17219a(url.getQuery());
            a.putAll(m17219a(url.getRef()));
            return a;
        } catch (MalformedURLException e) {
            return new Bundle();
        }
    }

    /* renamed from: a */
    public static UrlEncodedFormEntity m17226a(Bundle bundle) throws C4061w {
        if (bundle == null || bundle.isEmpty()) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                arrayList.add(new BasicNameValuePair(str, bundle.getString(str)));
            }
            return new UrlEncodedFormEntity(arrayList, Utils.UTF8);
        } catch (UnsupportedEncodingException e) {
            throw new C4061w((Exception) e);
        }
    }

    /* renamed from: a */
    public static String m17220a(Context context, String str, String str2, C4062x xVar, C4053p pVar) throws C4061w {
        String str3 = "";
        for (int i = 0; i < xVar.mo15033a(); i++) {
            String b = xVar.mo15039b(i);
            if (b.equals("pic")) {
                str3 = xVar.mo15042c(b);
                xVar.mo15036a(b);
            }
        }
        if (TextUtils.isEmpty(str3)) {
            return m17221a(context, str, str2, xVar, (String) null, pVar);
        }
        return m17221a(context, str, str2, xVar, str3, pVar);
    }

    /* renamed from: a */
    public static String m17221a(Context context, String str, String str2, C4062x xVar, String str3, C4053p pVar) throws C4061w {
        HttpUriRequest httpUriRequest;
        int i;
        String str4 = null;
        try {
            HttpClient a = m17225a(context);
            if (str2.equals(f16510f)) {
                str = str + C2261Q.f9807m + m17240c(xVar);
                httpUriRequest = new HttpGet(str);
            } else if (str2.equals(f16509e)) {
                httpUriRequest = new HttpPost(str);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(51200);
                if (!TextUtils.isEmpty(str3)) {
                    m17232a((OutputStream) byteArrayOutputStream, xVar);
                    httpUriRequest.setHeader("Content-Type", "multipart/form-data; boundary=7cd4a6d158c");
                    m17231a((OutputStream) byteArrayOutputStream, BitmapFactory.decodeFile(str3));
                } else {
                    httpUriRequest.setHeader("Content-Type", "application/x-www-form-urlencoded");
                    byteArrayOutputStream.write(m17242d(xVar).getBytes(Utils.UTF8));
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                httpUriRequest.setEntity(new ByteArrayEntity(byteArray));
            } else if (str2.equals(f16511g)) {
                httpUriRequest = new HttpDelete(str);
            } else {
                httpUriRequest = null;
            }
            m17234a(str2, httpUriRequest, xVar, str, pVar);
            HttpResponse execute = a.execute(httpUriRequest);
            if (execute.getStatusLine().getStatusCode() == 200) {
                return m17224a(execute);
            }
            try {
                JSONObject jSONObject = new JSONObject(m17224a(execute));
                str4 = jSONObject.getString("error");
                i = jSONObject.getInt(C2250J.f9627c);
            } catch (JSONException e) {
                e.printStackTrace();
                i = 0;
            }
            throw new C4061w(String.format(str4, new Object[0]), i);
        } catch (IOException e2) {
            throw new C4061w((Exception) e2);
        }
    }

    /* renamed from: a */
    public static HttpClient m17225a(Context context) {
        Cursor cursor;
        try {
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            instance.load((InputStream) null, (char[]) null);
            C4055a aVar = new C4055a(instance);
            aVar.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 10000);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 10000);
            HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
            HttpProtocolParams.setContentCharset(basicHttpParams, Utils.UTF8);
            SchemeRegistry schemeRegistry = new SchemeRegistry();
            schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            schemeRegistry.register(new Scheme("https", aVar, 443));
            ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, f16515k);
            HttpConnectionParams.setSoTimeout(basicHttpParams, f16516l);
            HttpClient defaultHttpClient = new DefaultHttpClient(threadSafeClientConnManager, basicHttpParams);
            if (!((WifiManager) context.getSystemService(C1899v.f6395s)).isWifiEnabled()) {
                try {
                    cursor = context.getContentResolver().query(Uri.parse("content://telephony/carriers/preferapn"), (String[]) null, (String) null, (String[]) null, (String) null);
                } catch (Exception e) {
                    e.printStackTrace();
                    cursor = null;
                }
                if (cursor != null) {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndex("proxy"));
                        if (string != null && string.trim().length() > 0) {
                            defaultHttpClient.getParams().setParameter("http.route.default-proxy", new HttpHost(string, 80));
                        }
                        try {
                            cursor.close();
                        } catch (Exception e2) {
                        }
                    }
                }
            }
            return defaultHttpClient;
        } catch (Exception e3) {
            return new DefaultHttpClient();
        }
    }

    /* renamed from: com.weibo.net.q$a */
    /* compiled from: Utility */
    public static class C4055a extends SSLSocketFactory {

        /* renamed from: a */
        SSLContext f16517a = SSLContext.getInstance("TLS");

        public C4055a(KeyStore keyStore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
            super(keyStore);
            C4056r rVar = new C4056r(this);
            this.f16517a.init((KeyManager[]) null, new TrustManager[]{rVar}, (SecureRandom) null);
        }

        public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
            return this.f16517a.getSocketFactory().createSocket(socket, str, i, z);
        }

        public Socket createSocket() throws IOException {
            return this.f16517a.getSocketFactory().createSocket();
        }
    }

    /* renamed from: b */
    public static HttpClient m17238b(Context context) {
        Cursor cursor;
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, f16515k);
        HttpConnectionParams.setSoTimeout(basicHttpParams, f16516l);
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient(basicHttpParams);
        if (!((WifiManager) context.getSystemService(C1899v.f6395s)).isWifiEnabled()) {
            try {
                cursor = context.getContentResolver().query(Uri.parse("content://telephony/carriers/preferapn"), (String[]) null, (String) null, (String[]) null, (String) null);
            } catch (Exception e) {
                e.printStackTrace();
                cursor = null;
            }
            if (cursor != null && cursor.moveToFirst()) {
                String string = cursor.getString(cursor.getColumnIndex("proxy"));
                if (string != null && string.trim().length() > 0) {
                    defaultHttpClient.getParams().setParameter("http.route.default-proxy", new HttpHost(string, 80));
                }
                try {
                    cursor.close();
                } catch (Exception e2) {
                }
            }
        }
        return defaultHttpClient;
    }

    /* renamed from: a */
    private static void m17231a(OutputStream outputStream, Bitmap bitmap) throws C4061w {
        StringBuilder sb = new StringBuilder();
        sb.append(f16506b).append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"pic\"; filename=\"").append("news_image").append("\"\r\n");
        sb.append("Content-Type: ").append("image/png").append("\r\n\r\n");
        BufferedInputStream bufferedInputStream = null;
        try {
            outputStream.write(sb.toString().getBytes());
            bitmap.compress(Bitmap.CompressFormat.PNG, 75, outputStream);
            outputStream.write("\r\n".getBytes());
            outputStream.write("\r\n--7cd4a6d158c--".getBytes());
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    throw new C4061w((Exception) e);
                }
            }
        } catch (IOException e2) {
            throw new C4061w((Exception) e2);
        } catch (Throwable th) {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e3) {
                    throw new C4061w((Exception) e3);
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static void m17232a(OutputStream outputStream, C4062x xVar) throws C4061w {
        int i = 0;
        while (i < xVar.mo15033a()) {
            String b = xVar.mo15039b(i);
            StringBuilder sb = new StringBuilder(10);
            sb.setLength(0);
            sb.append(f16506b).append("\r\n");
            sb.append("content-disposition: form-data; name=\"").append(b).append("\"\r\n\r\n");
            sb.append(xVar.mo15042c(b)).append("\r\n");
            try {
                outputStream.write(sb.toString().getBytes());
                i++;
            } catch (IOException e) {
                throw new C4061w((Exception) e);
            }
        }
    }

    /* renamed from: a */
    private static String m17224a(HttpResponse httpResponse) throws C4061w {
        InputStream inputStream;
        try {
            InputStream content = httpResponse.getEntity().getContent();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Header firstHeader = httpResponse.getFirstHeader(C2261Q.f9795ap);
            if (firstHeader == null || firstHeader.getValue().toLowerCase().indexOf("gzip") <= -1) {
                inputStream = content;
            } else {
                inputStream = new GZIPInputStream(content);
            }
            byte[] bArr = new byte[512];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return new String(byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IllegalStateException e) {
            throw new C4061w((Exception) e);
        } catch (IOException e2) {
            throw new C4061w((Exception) e2);
        }
    }

    /* renamed from: a */
    private static String m17223a(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1000);
        for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
            sb.append(readLine);
        }
        inputStream.close();
        return sb.toString();
    }

    /* renamed from: c */
    public static void m17241c(Context context) {
        CookieSyncManager.createInstance(context);
        CookieManager.getInstance().removeAllCookie();
    }

    /* renamed from: a */
    public static void m17228a(Context context, String str, String str2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.create().show();
    }

    /* renamed from: d */
    public static String m17242d(C4062x xVar) {
        if (xVar == null || m17235a(xVar)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < xVar.mo15033a(); i2++) {
            String b = xVar.mo15039b(i2);
            if (i != 0) {
                sb.append(C2261Q.f9808n);
            }
            try {
                sb.append(URLEncoder.encode(b, Utils.UTF8)).append("=").append(URLEncoder.encode(xVar.mo15042c(b), Utils.UTF8));
            } catch (UnsupportedEncodingException e) {
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static char[] m17236a(byte[] bArr) {
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
}
