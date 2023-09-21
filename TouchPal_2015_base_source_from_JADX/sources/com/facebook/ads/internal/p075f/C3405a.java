package com.facebook.ads.internal.p075f;

import android.content.Context;
import com.facebook.ads.C3501p;
import com.facebook.ads.internal.C3404f;
import com.facebook.ads.internal.p074e.C3403e;
import com.facebook.ads.internal.p077h.C3439h;
import com.facebook.ads.internal.p077h.C3442i;
import com.facebook.ads.internal.p077h.C3452r;
import com.facebook.ads.internal.p077h.C3453s;
import com.iflytek.speech.VoiceWakeuperAidl;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.SyncBasicHttpContext;

/* renamed from: com.facebook.ads.internal.f.a */
public class C3405a {

    /* renamed from: a */
    private static final C3452r f14877a = new C3452r();

    /* renamed from: b */
    private static final ThreadPoolExecutor f14878b = ((ThreadPoolExecutor) Executors.newCachedThreadPool(f14877a));

    /* renamed from: c */
    private final DefaultHttpClient f14879c;

    /* renamed from: d */
    private final Map<Context, List<WeakReference<Future<?>>>> f14880d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Map<String, String> f14881e;

    /* renamed from: f */
    private Context f14882f;

    /* renamed from: com.facebook.ads.internal.f.a$a */
    private static class C3406a extends HttpEntityWrapper {
        public C3406a(HttpEntity httpEntity) {
            super(httpEntity);
        }

        public InputStream getContent() {
            return new GZIPInputStream(this.wrappedEntity.getContent());
        }

        public long getContentLength() {
            return -1;
        }
    }

    public C3405a(Context context, C3404f fVar) {
        this.f14882f = context;
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        basicHttpParams.setParameter("http.protocol.cookie-policy", "compatibility");
        ConnManagerParams.setTimeout(basicHttpParams, 10000);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(100));
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 100);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 10000);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 10000);
        HttpConnectionParams.setTcpNoDelay(basicHttpParams, true);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpProtocolParams.setUserAgent(basicHttpParams, C3442i.m15075a(context, fVar) + " FacebookADsSDK/" + C3501p.f15147f + " (" + "AB/" + C3403e.f14852d + VoiceWakeuperAidl.PARAMS_SEPARATE + "AV/" + C3403e.f14854f + VoiceWakeuperAidl.PARAMS_SEPARATE + "BV/" + C3403e.f14855g + VoiceWakeuperAidl.PARAMS_SEPARATE + "LC/" + Locale.getDefault().toString() + ")");
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        if (C3439h.m15069a()) {
            m14976a(basicHttpParams, schemeRegistry);
        } else {
            schemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
        }
        this.f14879c = new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
        this.f14879c.addRequestInterceptor(new C3407b(this));
        this.f14879c.addResponseInterceptor(new C3408c(this));
        this.f14880d = new WeakHashMap();
        this.f14881e = new HashMap();
    }

    /* renamed from: a */
    private HttpEntity m14974a(C3412g gVar) {
        if (gVar != null) {
            return gVar.mo10730a();
        }
        return null;
    }

    /* renamed from: a */
    private HttpEntityEnclosingRequestBase m14975a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, HttpEntity httpEntity) {
        if (httpEntity != null) {
            httpEntityEnclosingRequestBase.setEntity(httpEntity);
        }
        return httpEntityEnclosingRequestBase;
    }

    /* renamed from: a */
    private void m14976a(BasicHttpParams basicHttpParams, SchemeRegistry schemeRegistry) {
        try {
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            instance.load((InputStream) null, (char[]) null);
            C3453s sVar = new C3453s(instance);
            sVar.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            HttpProtocolParams.setContentCharset(basicHttpParams, Utils.UTF8);
            schemeRegistry.register(new Scheme("https", sVar, 443));
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public void mo10704a(String str, C3412g gVar, C3410e eVar) {
        mo10705a(str, m14974a(gVar), (String) null, eVar);
    }

    /* renamed from: a */
    public void mo10705a(String str, HttpEntity httpEntity, String str2, C3410e eVar) {
        mo10706a(this.f14879c, (HttpUriRequest) m14975a((HttpEntityEnclosingRequestBase) new HttpPost(str), httpEntity), str2, eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10706a(DefaultHttpClient defaultHttpClient, HttpUriRequest httpUriRequest, String str, C3410e eVar) {
        if (str != null) {
            httpUriRequest.addHeader("Content-Type", str);
        }
        Future submit = f14878b.submit(new C3409d(defaultHttpClient, new SyncBasicHttpContext(new BasicHttpContext()), httpUriRequest, eVar));
        List list = this.f14880d.get(this.f14882f);
        if (list == null) {
            list = new LinkedList();
            this.f14880d.put(this.f14882f, list);
        }
        list.add(new WeakReference(submit));
    }

    /* renamed from: a */
    public void mo10707a(boolean z) {
        List<WeakReference> list = this.f14880d.get(this.f14882f);
        if (list != null) {
            for (WeakReference weakReference : list) {
                Future future = (Future) weakReference.get();
                if (future != null) {
                    future.cancel(z);
                }
            }
        }
        this.f14880d.remove(this.f14882f);
    }
}
