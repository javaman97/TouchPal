package com.cootek.smartinput5.p066ui;

import android.content.DialogInterface;
import android.view.View;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.z */
/* compiled from: ClipboardSimpleAdapter */
class C3258z implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View f14339a;

    /* renamed from: b */
    final /* synthetic */ C3257y f14340b;

    C3258z(C3257y yVar, View view) {
        this.f14340b = yVar;
        this.f14339a = view;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f14340b.f14338c.mo9737b(this.f14340b.f14336a);
        ((View) this.f14339a.getParent().getParent()).startAnimation(this.f14340b.f14338c.f13359n);
        C1246d.m6010a(this.f14340b.f14338c.f13348c).mo4591a(C1246d.f3753aW, C1246d.f3825bp, C1246d.f3783b);
    }
}
