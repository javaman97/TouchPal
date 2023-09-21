package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.facebook.ads.C3344h;
import com.facebook.ads.C3496k;
import com.facebook.ads.internal.p074e.C3400c;
import com.facebook.ads.internal.p077h.C3432c;
import com.facebook.ads.internal.p077h.C3438g;
import com.facebook.ads.internal.p077h.C3442i;
import com.facebook.ads.internal.view.C3472a;
import com.facebook.ads.internal.view.C3474b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.o */
public class C3377o extends C3362b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f14714a = C3377o.class.getSimpleName();

    /* renamed from: b */
    private C3474b f14715b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3386x f14716c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3363c f14717d;

    /* renamed from: e */
    private Map<String, Object> f14718e;

    /* renamed from: f */
    private C3384v f14719f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C3472a f14720g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Context f14721h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f14722i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C3432c.C3433a f14723j;

    /* renamed from: e */
    private void m14846e() {
        this.f14722i = 0;
        this.f14723j = null;
        C3385w a = C3385w.m14883a("com.facebook.ads.internal.FacebookBannerAdapter", (JSONObject) this.f14718e.get("data"));
        if (C3438g.m15059a(this.f14721h, (C3367g) a)) {
            this.f14717d.mo10618a((C3362b) this, C3344h.f14638g);
            return;
        }
        this.f14715b = new C3474b(this.f14721h, new C3378p(this, a));
        this.f14716c = new C3386x(this.f14721h, this.f14715b, new C3379q(this));
        this.f14716c.mo10652a(a);
        this.f14715b.loadDataWithBaseURL(C3442i.m15073a(), a.mo10645d(), "text/html", "utf-8", (String) null);
        if (this.f14717d != null) {
            this.f14717d.mo10617a((C3362b) this, (View) this.f14715b);
        }
    }

    /* renamed from: f */
    private void m14848f() {
        this.f14719f = new C3384v();
        this.f14719f.mo10584a(this.f14721h, new C3380r(this, (C3400c) this.f14718e.get("definition")), this.f14718e);
    }

    /* renamed from: a */
    public void mo10614a(Context context, C3496k kVar, C3363c cVar, Map<String, Object> map) {
        this.f14721h = context;
        this.f14717d = cVar;
        this.f14718e = map;
        if (kVar == C3496k.RECTANGLE_HEIGHT_250) {
            m14848f();
        } else {
            m14846e();
        }
    }

    /* renamed from: b */
    public void mo10602b() {
        if (this.f14715b != null) {
            C3442i.m15077a((WebView) this.f14715b);
            this.f14715b.destroy();
            this.f14715b = null;
        }
        if (this.f14720g != null) {
            this.f14720g.mo10806b();
            this.f14720g = null;
        }
        if (this.f14719f != null) {
            this.f14719f.mo10602b();
            this.f14719f = null;
        }
    }

    /* renamed from: c */
    public void mo10615c() {
        if (this.f14716c != null) {
            this.f14716c.mo10636a();
        } else if (this.f14719f != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("mil", false);
            this.f14719f.mo10585a((Map<String, Object>) hashMap);
        }
    }
}
