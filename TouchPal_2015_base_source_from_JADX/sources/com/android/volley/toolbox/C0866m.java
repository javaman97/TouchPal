package com.android.volley.toolbox;

import android.widget.ImageView;
import com.android.volley.C0883x;
import com.android.volley.toolbox.C0861l;

/* renamed from: com.android.volley.toolbox.m */
/* compiled from: ImageLoader */
final class C0866m implements C0861l.C0865d {

    /* renamed from: a */
    final /* synthetic */ int f2298a;

    /* renamed from: b */
    final /* synthetic */ ImageView f2299b;

    /* renamed from: c */
    final /* synthetic */ int f2300c;

    C0866m(int i, ImageView imageView, int i2) {
        this.f2298a = i;
        this.f2299b = imageView;
        this.f2300c = i2;
    }

    /* renamed from: a */
    public void mo3102a(C0883x xVar) {
        if (this.f2298a != 0) {
            this.f2299b.setImageResource(this.f2298a);
        }
    }

    /* renamed from: a */
    public void mo3142a(C0861l.C0864c cVar, boolean z) {
        if (cVar.mo3140b() != null) {
            this.f2299b.setImageBitmap(cVar.mo3140b());
        } else if (this.f2300c != 0) {
            this.f2299b.setImageResource(this.f2300c);
        }
    }
}
