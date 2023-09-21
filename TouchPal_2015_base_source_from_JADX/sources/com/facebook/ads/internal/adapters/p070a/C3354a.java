package com.facebook.ads.internal.adapters.p070a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.facebook.ads.C3505t;
import com.facebook.ads.internal.adapters.C3370j;
import com.facebook.ads.internal.adapters.C3385w;
import com.facebook.ads.internal.adapters.C3386x;
import com.facebook.ads.internal.adapters.p070a.C3358e;
import com.facebook.ads.internal.p077h.C3432c;
import com.facebook.ads.internal.p077h.C3434d;
import com.facebook.ads.internal.p077h.C3442i;
import com.facebook.ads.internal.view.C3474b;

/* renamed from: com.facebook.ads.internal.adapters.a.a */
public class C3354a implements C3358e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f14669a = C3354a.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3358e.C3360a f14670b;

    /* renamed from: c */
    private C3474b f14671c;

    /* renamed from: d */
    private C3385w f14672d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3386x f14673e;

    /* renamed from: f */
    private C3370j f14674f;

    /* renamed from: g */
    private long f14675g = System.currentTimeMillis();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f14676h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C3432c.C3433a f14677i;

    public C3354a(C3505t tVar, C3358e.C3360a aVar) {
        this.f14670b = aVar;
        this.f14671c = new C3474b(tVar, new C3355b(this, tVar));
        this.f14671c.setId(100001);
        this.f14671c.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f14673e = new C3386x(tVar, this.f14671c, new C3356c(this));
        this.f14673e.mo10654d();
        this.f14674f = new C3370j(tVar, this.f14671c, 1, new C3357d(this));
        this.f14674f.mo10639a();
        aVar.mo10612a((View) this.f14671c);
    }

    /* renamed from: a */
    public void mo10603a() {
        if (this.f14671c != null) {
            this.f14671c.onPause();
        }
    }

    /* renamed from: a */
    public void mo10604a(Intent intent, Bundle bundle) {
        if (bundle == null || !bundle.containsKey("dataModel")) {
            this.f14672d = C3385w.m14884b(intent);
            if (this.f14672d != null) {
                this.f14673e.mo10652a(this.f14672d);
                this.f14671c.loadDataWithBaseURL(C3442i.m15073a(), this.f14672d.mo10645d(), "text/html", "utf-8", (String) null);
                return;
            }
            return;
        }
        this.f14672d = C3385w.m14882a(bundle.getBundle("dataModel"));
        if (this.f14672d != null) {
            this.f14671c.loadDataWithBaseURL(C3442i.m15073a(), this.f14672d.mo10645d(), "text/html", "utf-8", (String) null);
        }
    }

    /* renamed from: a */
    public void mo10605a(Bundle bundle) {
        if (this.f14672d != null) {
            bundle.putBundle("dataModel", this.f14672d.mo10651j());
        }
    }

    /* renamed from: b */
    public void mo10606b() {
        if (this.f14676h > 0 && this.f14677i != null) {
            C3434d.m15049a(C3432c.m15046a(this.f14676h, this.f14677i, this.f14672d.mo10650i()));
        }
        if (this.f14671c != null) {
            this.f14671c.onResume();
        }
    }

    /* renamed from: c */
    public void mo10607c() {
        C3434d.m15049a(C3432c.m15046a(this.f14675g, C3432c.C3433a.XOUT, this.f14672d.mo10650i()));
        if (this.f14674f != null) {
            this.f14674f.mo10640b();
            this.f14674f = null;
        }
        if (this.f14671c != null) {
            C3442i.m15077a((WebView) this.f14671c);
            this.f14671c.destroy();
            this.f14671c = null;
        }
    }
}
