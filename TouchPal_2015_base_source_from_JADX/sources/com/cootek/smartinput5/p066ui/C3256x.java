package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.x */
/* compiled from: ClipboardSimpleAdapter */
class C3256x implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View f14333a;

    /* renamed from: b */
    final /* synthetic */ int f14334b;

    /* renamed from: c */
    final /* synthetic */ C2939q f14335c;

    C3256x(C2939q qVar, View view, int i) {
        this.f14335c = qVar;
        this.f14333a = view;
        this.f14334b = i;
    }

    public void onClick(View view) {
        if (this.f14333a.getVisibility() == 0) {
            this.f14335c.mo9734a(this.f14333a);
            return;
        }
        for (View next : this.f14335c.f13347b) {
            if (next != null && next.getVisibility() == 0) {
                this.f14335c.mo9734a(next);
            }
        }
        this.f14335c.mo9735a(this.f14333a, this.f14334b);
        C1246d.m6010a(this.f14335c.f13348c).mo4591a(C1246d.f3753aW, C1246d.f3819bj, C1246d.f3783b);
    }
}
