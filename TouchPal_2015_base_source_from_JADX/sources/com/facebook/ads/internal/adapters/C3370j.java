package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.internal.adapters.j */
public class C3370j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f14692a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final View f14693b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f14694c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3371a f14695d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Handler f14696e = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Runnable f14697f = new C3372k(this);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f14698g;

    /* renamed from: com.facebook.ads.internal.adapters.j$a */
    public interface C3371a {
        /* renamed from: a */
        void mo10523a();
    }

    public C3370j(Context context, View view, int i, C3371a aVar) {
        this.f14692a = context;
        this.f14693b = view;
        this.f14694c = i;
        this.f14695d = aVar;
    }

    /* renamed from: a */
    public void mo10639a() {
        this.f14696e.postDelayed(this.f14697f, 1000);
    }

    /* renamed from: b */
    public void mo10640b() {
        this.f14696e.removeCallbacks(this.f14697f);
    }
}
