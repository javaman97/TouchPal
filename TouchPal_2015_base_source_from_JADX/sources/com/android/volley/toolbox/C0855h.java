package com.android.volley.toolbox;

import com.android.volley.C0817a;
import com.android.volley.C0833o;
import com.p023a.p024a.p032b.p037d.C0781a;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: com.android.volley.toolbox.h */
/* compiled from: HttpClientStack */
public class C0855h implements C0858j {

    /* renamed from: b */
    private static final String f2275b = "Content-Type";

    /* renamed from: a */
    protected final HttpClient f2276a;

    public C0855h(HttpClient httpClient) {
        this.f2276a = httpClient;
    }

    /* renamed from: a */
    private static void m4790a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String next : map.keySet()) {
            httpUriRequest.setHeader(next, map.get(next));
        }
    }

    /* renamed from: a */
    private static List<NameValuePair> m4788a(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (String next : map.keySet()) {
            arrayList.add(new BasicNameValuePair(next, map.get(next)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public HttpResponse mo3124a(C0833o<?> oVar, Map<String, String> map) throws IOException, C0817a {
        HttpUriRequest b = m4791b(oVar, map);
        m4790a(b, map);
        m4790a(b, oVar.mo3075k());
        mo3125a(b);
        HttpParams params = b.getParams();
        int v = oVar.mo3087v();
        HttpConnectionParams.setConnectionTimeout(params, C0781a.f1973a);
        HttpConnectionParams.setSoTimeout(params, v);
        return this.f2276a.execute(b);
    }

    /* renamed from: b */
    static HttpUriRequest m4791b(C0833o<?> oVar, Map<String, String> map) throws C0817a {
        switch (oVar.mo3051a()) {
            case -1:
                byte[] o = oVar.mo3079o();
                if (o == null) {
                    return new HttpGet(oVar.mo3070f());
                }
                HttpPost httpPost = new HttpPost(oVar.mo3070f());
                httpPost.addHeader("Content-Type", oVar.mo3078n());
                httpPost.setEntity(new ByteArrayEntity(o));
                return httpPost;
            case 0:
                return new HttpGet(oVar.mo3070f());
            case 1:
                HttpPost httpPost2 = new HttpPost(oVar.mo3070f());
                httpPost2.addHeader("Content-Type", oVar.mo3082r());
                m4789a((HttpEntityEnclosingRequestBase) httpPost2, oVar);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(oVar.mo3070f());
                httpPut.addHeader("Content-Type", oVar.mo3082r());
                m4789a((HttpEntityEnclosingRequestBase) httpPut, oVar);
                return httpPut;
            case 3:
                return new HttpDelete(oVar.mo3070f());
            case 4:
                return new HttpHead(oVar.mo3070f());
            case 5:
                return new HttpOptions(oVar.mo3070f());
            case 6:
                return new HttpTrace(oVar.mo3070f());
            case 7:
                C0856a aVar = new C0856a(oVar.mo3070f());
                aVar.addHeader("Content-Type", oVar.mo3082r());
                m4789a((HttpEntityEnclosingRequestBase) aVar, oVar);
                return aVar;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    /* renamed from: a */
    private static void m4789a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, C0833o<?> oVar) throws C0817a {
        byte[] s = oVar.mo3083s();
        if (s != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(s));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3125a(HttpUriRequest httpUriRequest) throws IOException {
    }

    /* renamed from: com.android.volley.toolbox.h$a */
    /* compiled from: HttpClientStack */
    public static final class C0856a extends HttpEntityEnclosingRequestBase {

        /* renamed from: a */
        public static final String f2277a = "PATCH";

        public C0856a() {
        }

        public C0856a(URI uri) {
            setURI(uri);
        }

        public C0856a(String str) {
            setURI(URI.create(str));
        }

        public String getMethod() {
            return f2277a;
        }
    }
}
