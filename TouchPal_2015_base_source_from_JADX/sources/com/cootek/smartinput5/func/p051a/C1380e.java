package com.cootek.smartinput5.func.p051a;

import com.cootek.smartinput5.engine.Engine;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Locale;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;

/* renamed from: com.cootek.smartinput5.func.a.e */
/* compiled from: HttpRequester */
public class C1380e {

    /* renamed from: a */
    public static final String f4325a = "CheckUpdates";

    /* renamed from: b */
    private static final String f4326b = C1380e.class.getSimpleName();

    /* renamed from: c */
    private static final boolean f4327c = false;

    /* renamed from: d */
    private static final String f4328d = "http://service.cootek.cn:80";

    /* renamed from: e */
    private static final String f4329e = "http://service.cootek.com:80";

    /* renamed from: f */
    private static final String f4330f = "/CooTekOnline/command.aspx?cmd=";

    /* renamed from: g */
    private static final String f4331g = "jsonString";

    /* renamed from: j */
    private static C1380e f4332j;

    /* renamed from: h */
    private final HttpClient f4333h = new C1382g("TouchPal/4.2", false);

    /* renamed from: i */
    private HttpRequestBase f4334i;

    private C1380e() {
    }

    /* renamed from: a */
    public static synchronized C1380e m6405a() {
        C1380e eVar;
        synchronized (C1380e.class) {
            if (f4332j == null) {
                synchronized (C1380e.class) {
                    if (f4332j == null) {
                        f4332j = new C1380e();
                    }
                }
            }
            eVar = f4332j;
        }
        return eVar;
    }

    /* renamed from: a */
    private HttpRequestBase m6406a(Object obj, String str, String str2, C1379d dVar) {
        URL url;
        try {
            url = new URL(str + str2);
        } catch (MalformedURLException e) {
            dVar.mo5883a(e);
            url = null;
        }
        HttpPost httpPost = new HttpPost(url.toString());
        httpPost.setHeader("serializer", "json");
        try {
            httpPost.setEntity(new StringEntity(obj.toString()));
        } catch (UnsupportedEncodingException e2) {
            dVar.mo5883a(e2);
        }
        return httpPost;
    }

    /* renamed from: a */
    public Object mo5885a(Object obj, String str, C1381f fVar, C1379d dVar) {
        String str2;
        Object obj2;
        if (!Engine.isInitialized() || !Engine.getInstance().getIms().getResources().getConfiguration().locale.equals(Locale.SIMPLIFIED_CHINESE)) {
            str2 = f4329e;
        } else {
            str2 = f4328d;
        }
        try {
            this.f4334i = m6406a(obj, str2, f4330f + str, dVar);
            if (this.f4334i == null || this.f4334i.isAborted()) {
                obj2 = null;
            } else {
                obj2 = this.f4333h.execute(this.f4334i, fVar);
            }
            return obj2;
        } catch (Exception e) {
            e.printStackTrace();
            this.f4334i = m6406a(obj, f4329e, f4330f + str, dVar);
            if (this.f4334i == null || this.f4334i.isAborted()) {
                return null;
            }
            try {
                return this.f4333h.execute(this.f4334i, fVar);
            } catch (ClientProtocolException e2) {
                dVar.mo5883a(e2);
                return null;
            } catch (SocketException e3) {
                dVar.mo5883a(e3);
                return null;
            } catch (SocketTimeoutException e4) {
                dVar.mo5883a(e4);
                return null;
            } catch (IOException e5) {
                dVar.mo5883a(e5);
                return null;
            }
        }
    }

    /* renamed from: b */
    public void mo5886b() {
        if (this.f4334i != null) {
            this.f4334i.abort();
            this.f4334i = null;
        }
    }
}
