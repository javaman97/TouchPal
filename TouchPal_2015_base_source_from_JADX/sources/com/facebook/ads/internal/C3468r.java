package com.facebook.ads.internal;

import android.content.Context;
import android.os.Handler;
import com.facebook.ads.C3495j;
import com.facebook.ads.C3496k;
import com.facebook.ads.C3509x;
import com.facebook.ads.internal.adapters.C3351A;
import com.facebook.ads.internal.adapters.C3353a;
import com.facebook.ads.internal.adapters.C3373l;
import com.facebook.ads.internal.p074e.C3398a;
import com.facebook.ads.internal.p074e.C3399b;
import com.facebook.ads.internal.p074e.C3401d;
import com.facebook.ads.internal.p076g.C3416a;
import com.facebook.ads.internal.p076g.C3417b;
import com.facebook.ads.internal.p076g.C3427i;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.internal.r */
public class C3468r implements C3417b.C3419a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f15049a;

    /* renamed from: b */
    private final String f15050b;

    /* renamed from: c */
    private final C3417b f15051c = new C3417b();

    /* renamed from: d */
    private final C3404f f15052d;

    /* renamed from: e */
    private final C3395d f15053e;

    /* renamed from: f */
    private final C3496k f15054f;

    /* renamed from: g */
    private final int f15055g;

    /* renamed from: h */
    private final EnumSet<C3509x.C3511b> f15056h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Handler f15057i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Runnable f15058j;

    /* renamed from: k */
    private C3469a f15059k;

    /* renamed from: l */
    private C3399b f15060l;

    /* renamed from: com.facebook.ads.internal.r$a */
    public interface C3469a {
        /* renamed from: a */
        void mo10549a(C3393c cVar);

        /* renamed from: a */
        void mo10550a(List<C3351A> list);
    }

    public C3468r(Context context, String str, C3404f fVar, C3496k kVar, C3395d dVar, int i, EnumSet<C3509x.C3511b> enumSet) {
        this.f15049a = context;
        this.f15050b = str;
        this.f15052d = fVar;
        this.f15054f = kVar;
        this.f15053e = dVar;
        this.f15055g = i;
        this.f15056h = enumSet;
        this.f15051c.mo10753a((C3417b.C3419a) this);
        this.f15057i = new Handler();
        this.f15058j = new C3470s(this);
    }

    /* renamed from: c */
    private List<C3351A> m15164c() {
        C3399b bVar = this.f15060l;
        C3398a c = bVar.mo10690c();
        ArrayList arrayList = new ArrayList(bVar.mo10689b());
        for (C3398a aVar = c; aVar != null; aVar = bVar.mo10690c()) {
            C3353a a = C3373l.m14833a(aVar.f14819b, C3416a.NATIVE);
            if (a != null && a.mo10582a() == C3416a.NATIVE) {
                HashMap hashMap = new HashMap();
                hashMap.put("data", aVar.f14820c);
                hashMap.put("definition", bVar.mo10685a());
                ((C3351A) a).mo10584a(this.f15049a, new C3471t(this, arrayList), hashMap);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo10802a() {
        this.f15051c.mo10752a(this.f15049a, new C3401d(this.f15049a, this.f15050b, this.f15054f, this.f15052d, this.f15053e, this.f15055g, C3495j.m15219a(this.f15049a)));
    }

    /* renamed from: a */
    public void mo10754a(C3393c cVar) {
        this.f15057i.postDelayed(this.f15058j, 1800000);
        if (this.f15059k != null) {
            this.f15059k.mo10549a(cVar);
        }
    }

    /* renamed from: a */
    public void mo10755a(C3427i iVar) {
        C3399b b = iVar.mo10761b();
        if (b == null) {
            throw new IllegalStateException("no placement in response");
        }
        long b2 = b.mo10685a().mo10692b();
        if (b2 == 0) {
            b2 = 1800000;
        }
        this.f15057i.postDelayed(this.f15058j, b2);
        this.f15060l = b;
        List<C3351A> c = m15164c();
        if (this.f15059k == null) {
            return;
        }
        if (c.isEmpty()) {
            this.f15059k.mo10549a(C3346a.NO_FILL.mo10572a(""));
        } else {
            this.f15059k.mo10550a(c);
        }
    }

    /* renamed from: a */
    public void mo10803a(C3469a aVar) {
        this.f15059k = aVar;
    }

    /* renamed from: b */
    public void mo10804b() {
        this.f15057i.removeCallbacks(this.f15058j);
        this.f15051c.mo10751a();
    }
}
