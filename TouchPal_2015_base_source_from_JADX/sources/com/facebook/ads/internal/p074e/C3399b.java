package com.facebook.ads.internal.p074e;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.e.b */
public class C3399b {

    /* renamed from: a */
    protected String f14822a;

    /* renamed from: b */
    protected List<C3398a> f14823b = new ArrayList();

    /* renamed from: c */
    protected C3400c f14824c;

    /* renamed from: d */
    private int f14825d = 0;

    /* renamed from: a */
    public C3400c mo10685a() {
        return this.f14824c;
    }

    /* renamed from: a */
    public void mo10686a(C3398a aVar) {
        this.f14823b.add(aVar);
    }

    /* renamed from: a */
    public void mo10687a(C3400c cVar) {
        this.f14824c = cVar;
    }

    /* renamed from: a */
    public void mo10688a(String str) {
        this.f14822a = str;
    }

    /* renamed from: b */
    public int mo10689b() {
        return this.f14823b.size();
    }

    /* renamed from: c */
    public C3398a mo10690c() {
        if (this.f14825d >= this.f14823b.size()) {
            return null;
        }
        this.f14825d++;
        return this.f14823b.get(this.f14825d - 1);
    }
}
