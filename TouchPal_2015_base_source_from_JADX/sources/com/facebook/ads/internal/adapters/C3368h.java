package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.internal.p077h.C3439h;

/* renamed from: com.facebook.ads.internal.adapters.h */
public abstract class C3368h {

    /* renamed from: a */
    protected final C3369i f14689a;

    /* renamed from: b */
    private final Context f14690b;

    /* renamed from: c */
    private boolean f14691c;

    public C3368h(Context context, C3369i iVar) {
        this.f14690b = context;
        this.f14689a = iVar;
    }

    /* renamed from: a */
    public final void mo10636a() {
        if (!this.f14691c) {
            if (this.f14689a != null) {
                this.f14689a.mo10611b();
            }
            mo10637b();
            this.f14691c = true;
            C3439h.m15067a(this.f14690b, "Impression logged");
            if (this.f14689a != null) {
                this.f14689a.mo10638c();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo10637b();
}
