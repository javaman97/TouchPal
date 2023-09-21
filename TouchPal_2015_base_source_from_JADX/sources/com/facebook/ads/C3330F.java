package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.C3509x;
import com.facebook.ads.internal.C3395d;
import com.facebook.ads.internal.C3404f;
import com.facebook.ads.internal.C3468r;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* renamed from: com.facebook.ads.F */
public class C3330F {

    /* renamed from: a */
    private static final C3395d f14592a = C3395d.ADS;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f14593b;

    /* renamed from: c */
    private final String f14594c;

    /* renamed from: d */
    private final int f14595d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final List<C3509x> f14596e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f14597f = -1;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C3331a f14598g;

    /* renamed from: h */
    private C3468r f14599h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f14600i = false;

    /* renamed from: com.facebook.ads.F$a */
    public interface C3331a {
        /* renamed from: a */
        void mo7017a();

        /* renamed from: a */
        void mo7018a(C3344h hVar);
    }

    public C3330F(Context context, String str, int i) {
        this.f14593b = context;
        this.f14594c = str;
        this.f14595d = Math.max(i, 0);
        this.f14596e = new ArrayList(i);
    }

    /* renamed from: a */
    public void mo10543a() {
        mo10545a((EnumSet<C3509x.C3511b>) EnumSet.of(C3509x.C3511b.NONE));
    }

    /* renamed from: a */
    public void mo10544a(C3331a aVar) {
        this.f14598g = aVar;
    }

    /* renamed from: a */
    public void mo10545a(EnumSet<C3509x.C3511b> enumSet) {
        C3404f fVar = C3404f.NATIVE_UNKNOWN;
        int i = this.f14595d;
        if (this.f14599h != null) {
            this.f14599h.mo10804b();
        }
        this.f14599h = new C3468r(this.f14593b, this.f14594c, fVar, (C3496k) null, f14592a, i, enumSet);
        this.f14599h.mo10803a((C3468r.C3469a) new C3332G(this, enumSet));
        this.f14599h.mo10802a();
    }

    /* renamed from: b */
    public int mo10546b() {
        return this.f14596e.size();
    }

    /* renamed from: c */
    public C3509x mo10547c() {
        int i = this.f14597f;
        this.f14597f = i + 1;
        C3509x xVar = this.f14596e.get(i % this.f14596e.size());
        return i >= this.f14596e.size() ? new C3509x(xVar) : xVar;
    }

    /* renamed from: d */
    public boolean mo10548d() {
        return this.f14600i;
    }
}
