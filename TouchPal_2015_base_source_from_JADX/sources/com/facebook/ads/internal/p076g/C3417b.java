package com.facebook.ads.internal.p076g;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.C3495j;
import com.facebook.ads.internal.C3346a;
import com.facebook.ads.internal.C3393c;
import com.facebook.ads.internal.p073d.C3396a;
import com.facebook.ads.internal.p074e.C3400c;
import com.facebook.ads.internal.p074e.C3401d;
import com.facebook.ads.internal.p075f.C3405a;
import com.facebook.ads.internal.p075f.C3410e;
import com.facebook.ads.internal.p077h.C3435e;
import com.facebook.ads.internal.p077h.C3452r;
import com.facebook.ads.internal.p077h.C3456v;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;

/* renamed from: com.facebook.ads.internal.g.b */
public class C3417b {

    /* renamed from: j */
    private static final C3452r f14915j = new C3452r();

    /* renamed from: k */
    private static final ThreadPoolExecutor f14916k = ((ThreadPoolExecutor) Executors.newCachedThreadPool(f14915j));

    /* renamed from: a */
    Map<String, String> f14917a;

    /* renamed from: b */
    private final C3424g f14918b = C3424g.m15032a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3419a f14919c;

    /* renamed from: d */
    private Context f14920d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3401d f14921e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C3405a f14922f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f14923g;

    /* renamed from: h */
    private boolean f14924h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final String f14925i;

    /* renamed from: com.facebook.ads.internal.g.b$a */
    public interface C3419a {
        /* renamed from: a */
        void mo10754a(C3393c cVar);

        /* renamed from: a */
        void mo10755a(C3427i iVar);
    }

    public C3417b() {
        String format;
        String b = C3495j.m15220b();
        if (C3456v.m15103a(b)) {
            format = "https://graph.facebook.com/network_ads_common/";
        } else {
            format = String.format("https://graph.%s.facebook.com/network_ads_common/", new Object[]{b});
        }
        this.f14925i = format;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15013a(C3393c cVar) {
        C3396a.m14939c("AdProvider failed in " + (System.currentTimeMillis() - this.f14923g) + "ms");
        if (this.f14919c != null) {
            new Handler(Looper.getMainLooper()).post(new C3423f(this, cVar));
        }
        mo10751a();
    }

    /* renamed from: a */
    private void m15016a(C3427i iVar) {
        C3396a.m14939c("AdProvider completed in " + (System.currentTimeMillis() - this.f14923g) + "ms");
        if (this.f14919c != null) {
            new Handler(Looper.getMainLooper()).post(new C3422e(this, iVar));
        }
        mo10751a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15017a(String str) {
        try {
            C3425h a = this.f14918b.mo10759a(str);
            switch (a.mo10760a()) {
                case ADS:
                    C3427i iVar = (C3427i) a;
                    C3400c a2 = iVar.mo10761b().mo10685a();
                    C3435e.m15051a(a2.mo10693c(), this.f14921e);
                    if (a2.mo10694d()) {
                        C3435e.m15052a(str, this.f14921e);
                    }
                    m15016a(iVar);
                    break;
                case f14940b:
                    String b = ((C3428j) a).mo10762b();
                    C3396a.m14941e("Facebook Ads SDK response error message. " + b);
                    C3346a aVar = C3346a.ERROR_MESSAGE;
                    if (b != null) {
                        str = b;
                    }
                    m15013a(aVar.mo10572a(str));
                    break;
                default:
                    C3396a.m14941e("Facebook Ads SDK unknown response.");
                    C3396a.m14937a(str);
                    m15013a(C3346a.UNKNOWN_RESPONSE.mo10572a(str));
                    break;
            }
            this.f14924h = false;
        } catch (JSONException e) {
            C3396a.m14941e("Failed to parse Facebook Ads SDK response");
            m15013a(C3346a.PARSER_FAILURE.mo10572a(e.getMessage()));
            e.printStackTrace();
        } catch (Exception e2) {
            C3396a.m14941e("Failed to parse Facebook Ads SDK response");
            m15013a(C3346a.PARSER_FAILURE.mo10572a(e2.getMessage()));
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C3410e m15018b() {
        return new C3421d(this);
    }

    /* renamed from: a */
    public void mo10751a() {
        if (this.f14922f != null) {
            C3396a.m14937a("AdProvider clean up Facebook Ads SDK client");
            this.f14922f.mo10707a(true);
            this.f14922f = null;
        }
        this.f14920d = null;
    }

    /* renamed from: a */
    public void mo10752a(Context context, C3401d dVar) {
        mo10751a();
        this.f14923g = System.currentTimeMillis();
        this.f14924h = true;
        this.f14920d = context;
        this.f14921e = dVar;
        if (C3435e.m15053a(dVar)) {
            String c = C3435e.m15055c(dVar);
            if (c != null) {
                m15017a(c);
            } else {
                m15013a(C3346a.LOAD_TOO_FREQUENTLY.mo10572a((String) null));
            }
        } else {
            f14916k.submit(new C3420c(this, context, dVar));
        }
    }

    /* renamed from: a */
    public void mo10753a(C3419a aVar) {
        this.f14919c = aVar;
    }
}
