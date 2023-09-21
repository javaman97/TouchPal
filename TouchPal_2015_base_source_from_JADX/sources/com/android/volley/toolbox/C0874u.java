package com.android.volley.toolbox;

import com.android.volley.C0883x;
import com.android.volley.toolbox.C0861l;

/* renamed from: com.android.volley.toolbox.u */
/* compiled from: NetworkImageView */
class C0874u implements C0861l.C0865d {

    /* renamed from: a */
    final /* synthetic */ boolean f2318a;

    /* renamed from: b */
    final /* synthetic */ NetworkImageView f2319b;

    C0874u(NetworkImageView networkImageView, boolean z) {
        this.f2319b = networkImageView;
        this.f2318a = z;
    }

    /* renamed from: a */
    public void mo3102a(C0883x xVar) {
        if (this.f2319b.f2241c != 0) {
            this.f2319b.setImageResource(this.f2319b.f2241c);
        }
    }

    /* renamed from: a */
    public void mo3142a(C0861l.C0864c cVar, boolean z) {
        if (z && this.f2318a) {
            this.f2319b.post(new C0875v(this, cVar));
        } else if (cVar.mo3140b() != null) {
            this.f2319b.setImageBitmap(cVar.mo3140b());
        } else if (this.f2319b.f2240b != 0) {
            this.f2319b.setImageResource(this.f2319b.f2240b);
        }
    }
}
