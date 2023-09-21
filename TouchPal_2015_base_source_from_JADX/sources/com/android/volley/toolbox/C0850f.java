package com.android.volley.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.C0819c;
import com.android.volley.C0830l;
import com.android.volley.C0833o;
import com.android.volley.C0840s;

/* renamed from: com.android.volley.toolbox.f */
/* compiled from: ClearCacheRequest */
public class C0850f extends C0833o<Object> {

    /* renamed from: a */
    private final C0819c f2258a;

    /* renamed from: b */
    private final Runnable f2259b;

    public C0850f(C0819c cVar, Runnable runnable) {
        super(0, (String) null, (C0840s.C0841a) null);
        this.f2258a = cVar;
        this.f2259b = runnable;
    }

    /* renamed from: j */
    public boolean mo3074j() {
        this.f2258a.mo3032b();
        if (this.f2259b == null) {
            return true;
        }
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.f2259b);
        return true;
    }

    /* renamed from: u */
    public C0833o.C0835b mo3086u() {
        return C0833o.C0835b.IMMEDIATE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0840s<Object> mo3059a(C0830l lVar) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3064b(Object obj) {
    }
}
