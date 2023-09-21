package com.android.volley.toolbox;

import com.android.volley.C0817a;
import com.android.volley.C0833o;
import com.android.volley.toolbox.C0855h;
import com.weibo.net.C4054q;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: com.android.volley.toolbox.k */
/* compiled from: HurlStack */
public class C0859k implements C0858j {

    /* renamed from: a */
    private static final String f2278a = "Content-Type";

    /* renamed from: b */
    private final C0860a f2279b;

    /* renamed from: c */
    private final SSLSocketFactory f2280c;

    /* renamed from: com.android.volley.toolbox.k$a */
    /* compiled from: HurlStack */
    public interface C0860a {
        /* renamed from: a */
        String mo3128a(String str);
    }

    public C0859k() {
        this((C0860a) null);
    }

    public C0859k(C0860a aVar) {
        this(aVar, (SSLSocketFactory) null);
    }

    public C0859k(C0860a aVar, SSLSocketFactory sSLSocketFactory) {
        this.f2279b = aVar;
        this.f2280c = sSLSocketFactory;
    }

    /* renamed from: a */
    public HttpResponse mo3124a(C0833o<?> oVar, Map<String, String> map) throws IOException, C0817a {
        String str;
        String f = oVar.mo3070f();
        HashMap hashMap = new HashMap();
        hashMap.putAll(oVar.mo3075k());
        hashMap.putAll(map);
        if (this.f2279b != null) {
            str = this.f2279b.mo3128a(f);
            if (str == null) {
                throw new IOException("URL blocked by rewriter: " + f);
            }
        } else {
            str = f;
        }
        HttpURLConnection a = m4798a(new URL(str), oVar);
        for (String str2 : hashMap.keySet()) {
            a.addRequestProperty(str2, (String) hashMap.get(str2));
        }
        m4800a(a, oVar);
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        if (a.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(protocolVersion, a.getResponseCode(), a.getResponseMessage()));
        basicHttpResponse.setEntity(m4799a(a));
        for (Map.Entry entry : a.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                basicHttpResponse.addHeader(new BasicHeader((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return basicHttpResponse;
    }

    /* renamed from: a */
    private static HttpEntity m4799a(HttpURLConnection httpURLConnection) {
        InputStream errorStream;
        BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException e) {
            errorStream = httpURLConnection.getErrorStream();
        }
        basicHttpEntity.setContent(errorStream);
        basicHttpEntity.setContentLength((long) httpURLConnection.getContentLength());
        basicHttpEntity.setContentEncoding(httpURLConnection.getContentEncoding());
        basicHttpEntity.setContentType(httpURLConnection.getContentType());
        return basicHttpEntity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HttpURLConnection mo3127a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: a */
    private HttpURLConnection m4798a(URL url, C0833o<?> oVar) throws IOException {
        HttpURLConnection a = mo3127a(url);
        int v = oVar.mo3087v();
        a.setConnectTimeout(v);
        a.setReadTimeout(v);
        a.setUseCaches(false);
        a.setDoInput(true);
        if ("https".equals(url.getProtocol()) && this.f2280c != null) {
            ((HttpsURLConnection) a).setSSLSocketFactory(this.f2280c);
        }
        return a;
    }

    /* renamed from: a */
    static void m4800a(HttpURLConnection httpURLConnection, C0833o<?> oVar) throws IOException, C0817a {
        switch (oVar.mo3051a()) {
            case -1:
                byte[] o = oVar.mo3079o();
                if (o != null) {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod(C4054q.f16509e);
                    httpURLConnection.addRequestProperty("Content-Type", oVar.mo3078n());
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(o);
                    dataOutputStream.close();
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod(C4054q.f16510f);
                return;
            case 1:
                httpURLConnection.setRequestMethod(C4054q.f16509e);
                m4801b(httpURLConnection, oVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                m4801b(httpURLConnection, oVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod(C4054q.f16511g);
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod(C0855h.C0856a.f2277a);
                m4801b(httpURLConnection, oVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    /* renamed from: b */
    private static void m4801b(HttpURLConnection httpURLConnection, C0833o<?> oVar) throws IOException, C0817a {
        byte[] s = oVar.mo3083s();
        if (s != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", oVar.mo3082r());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(s);
            dataOutputStream.close();
        }
    }
}
