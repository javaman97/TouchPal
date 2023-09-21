package com.facebook.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.facebook.ads.C3495j;
import com.facebook.ads.C3496k;
import com.facebook.ads.internal.adapters.C3351A;
import com.facebook.ads.internal.adapters.C3353a;
import com.facebook.ads.internal.adapters.C3362b;
import com.facebook.ads.internal.adapters.C3365e;
import com.facebook.ads.internal.adapters.C3373l;
import com.facebook.ads.internal.p072c.C3394a;
import com.facebook.ads.internal.p074e.C3398a;
import com.facebook.ads.internal.p074e.C3399b;
import com.facebook.ads.internal.p074e.C3400c;
import com.facebook.ads.internal.p074e.C3401d;
import com.facebook.ads.internal.p076g.C3416a;
import com.facebook.ads.internal.p076g.C3417b;
import com.facebook.ads.internal.p076g.C3427i;
import com.facebook.ads.internal.p077h.C3439h;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.i */
public class C3458i extends C3394a implements C3417b.C3419a {

    /* renamed from: b */
    private static final String f15016b = C3458i.class.getSimpleName();

    /* renamed from: c */
    private final Context f15017c;

    /* renamed from: d */
    private final String f15018d;

    /* renamed from: e */
    private final C3417b f15019e = new C3417b();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Handler f15020f;

    /* renamed from: g */
    private final Runnable f15021g;

    /* renamed from: h */
    private final Runnable f15022h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile boolean f15023i;

    /* renamed from: j */
    private boolean f15024j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile boolean f15025k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C3353a f15026l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public View f15027m;

    /* renamed from: n */
    private C3399b f15028n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C3401d f15029o;

    /* renamed from: p */
    private C3404f f15030p;

    /* renamed from: q */
    private C3395d f15031q;

    /* renamed from: r */
    private C3496k f15032r;

    /* renamed from: s */
    private int f15033s;

    public C3458i(Context context, String str, C3404f fVar, C3496k kVar, C3395d dVar, int i) {
        this.f15017c = context;
        this.f15018d = str;
        this.f15030p = fVar;
        this.f15032r = kVar;
        this.f15031q = dVar;
        this.f15033s = i;
        this.f15019e.mo10753a((C3417b.C3419a) this);
        this.f15020f = new Handler();
        this.f15021g = new C3460j(this);
        this.f15022h = new C3461k(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15107a(C3353a aVar) {
        if (aVar != null) {
            aVar.mo10602b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m15121j() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Adapter listener must be called on the main thread.");
        }
    }

    /* renamed from: k */
    private C3416a m15123k() {
        return this.f15032r == null ? C3416a.NATIVE : this.f15032r == C3496k.INTERSTITIAL ? C3416a.INTERSTITIAL : C3416a.BANNER;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m15124l() {
        this.f15029o = new C3401d(this.f15017c, this.f15018d, this.f15032r, this.f15030p, this.f15031q, this.f15033s, C3495j.m15219a(this.f15017c));
        this.f15019e.mo10752a(this.f15017c, this.f15029o);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m15127m() {
        C3399b bVar = this.f15028n;
        C3398a c = bVar.mo10690c();
        if (c == null) {
            this.f14795a.mo10673a(C3346a.NO_FILL.mo10572a(""));
            m15129n();
            return;
        }
        String str = c.f14819b;
        C3353a a = C3373l.m14833a(str, bVar.mo10685a().mo10691a());
        if (a == null) {
            Log.e(f15016b, "Adapter does not exist: " + str);
            m15127m();
        } else if (m15123k() != a.mo10582a()) {
            this.f14795a.mo10673a(C3346a.INTERNAL_ERROR.mo10572a(""));
        } else {
            HashMap hashMap = new HashMap();
            C3400c a2 = bVar.mo10685a();
            hashMap.put("data", c.f14820c);
            hashMap.put("definition", a2);
            if (this.f15029o == null) {
                this.f14795a.mo10673a(C3346a.UNKNOWN_ERROR.mo10572a("environment is empty"));
            }
            switch (a.mo10582a()) {
                case INTERSTITIAL:
                    C3365e eVar = (C3365e) a;
                    C3464n nVar = new C3464n(this, eVar);
                    this.f15020f.postDelayed(nVar, 10000);
                    eVar.mo10625a(this.f15017c, new C3465o(this, nVar), hashMap);
                    return;
                case BANNER:
                    C3362b bVar2 = (C3362b) a;
                    C3462l lVar = new C3462l(this, bVar2);
                    this.f15020f.postDelayed(lVar, 10000);
                    bVar2.mo10614a(this.f15017c, this.f15032r, new C3463m(this, lVar), hashMap);
                    return;
                case NATIVE:
                    C3351A a3 = (C3351A) a;
                    C3466p pVar = new C3466p(this, a3);
                    this.f15020f.postDelayed(pVar, 10000);
                    a3.mo10584a(this.f15017c, new C3467q(this, pVar), hashMap);
                    return;
                default:
                    Log.e(f15016b, "attempt unexpected adapter type");
                    return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m15129n() {
        C3399b bVar;
        if (!this.f15024j && !this.f15023i && (bVar = this.f15028n) != null) {
            C3400c a = bVar.mo10685a();
            long b = a.mo10692b();
            switch (m15123k()) {
                case INTERSTITIAL:
                    if (!C3439h.m15070a(this.f15017c)) {
                        this.f15020f.postDelayed(this.f15022h, 1000);
                        break;
                    }
                    break;
                case BANNER:
                    if (this.f15027m != null && !C3439h.m15071a(this.f15017c, this.f15027m, a.mo10695e())) {
                        this.f15020f.postDelayed(this.f15022h, 1000);
                        return;
                    }
                default:
                    return;
            }
            if (b > 0) {
                this.f15020f.postDelayed(this.f15021g, b);
                this.f15023i = true;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m15131o() {
        if (this.f15023i) {
            this.f15020f.removeCallbacks(this.f15021g);
            this.f15023i = false;
        }
    }

    /* renamed from: a */
    public void mo10788a() {
        C3353a aVar = this.f15026l;
        if (aVar != null && aVar.mo10582a() == C3416a.BANNER) {
            ((C3362b) aVar).mo10615c();
        }
    }

    /* renamed from: a */
    public void mo10754a(C3393c cVar) {
        this.f14795a.mo10673a(cVar);
        int a = cVar.mo10678a().mo10571a();
        if (this.f15023i) {
            return;
        }
        if (a == 1002 || a == 1000) {
            this.f15020f.postDelayed(this.f15021g, 30000);
            this.f15023i = true;
        }
    }

    /* renamed from: a */
    public void mo10755a(C3427i iVar) {
        C3399b b = iVar.mo10761b();
        if (b == null || b.mo10685a() == null) {
            throw new IllegalStateException("invalid placement in response");
        }
        this.f15028n = b;
        m15127m();
    }

    /* renamed from: b */
    public C3400c mo10789b() {
        if (this.f15028n == null) {
            return null;
        }
        return this.f15028n.mo10685a();
    }

    /* renamed from: c */
    public void mo10790c() {
        m15124l();
    }

    /* renamed from: d */
    public void mo10791d() {
        if (this.f15026l == null) {
            throw new IllegalStateException("no adapter ready to start");
        } else if (this.f15025k) {
            throw new IllegalStateException("ad already started");
        } else {
            this.f15025k = true;
            switch (this.f15026l.mo10582a()) {
                case INTERSTITIAL:
                    ((C3365e) this.f15026l).mo10626c();
                    return;
                case BANNER:
                    if (this.f15027m == null) {
                        throw new IllegalStateException("ad is not ready");
                    }
                    this.f14795a.mo10671a(this.f15027m);
                    m15129n();
                    return;
                case NATIVE:
                    C3351A a = (C3351A) this.f15026l;
                    if (!a.mo10599o()) {
                        throw new IllegalStateException("ad is not ready or already displayed");
                    }
                    this.f14795a.mo10672a(a);
                    return;
                default:
                    Log.e(f15016b, "start unexpected adapter type");
                    return;
            }
        }
    }

    /* renamed from: e */
    public void mo10792e() {
        if (this.f15025k) {
            m15131o();
            m15107a(this.f15026l);
            this.f15027m = null;
            this.f15025k = false;
        }
    }

    /* renamed from: f */
    public void mo10793f() {
        if (this.f15025k) {
            m15131o();
        }
    }

    /* renamed from: g */
    public void mo10794g() {
        if (this.f15025k) {
            m15129n();
        }
    }

    /* renamed from: h */
    public void mo10795h() {
        m15131o();
        m15124l();
    }

    /* renamed from: i */
    public void mo10796i() {
        this.f15024j = true;
        m15131o();
    }
}
