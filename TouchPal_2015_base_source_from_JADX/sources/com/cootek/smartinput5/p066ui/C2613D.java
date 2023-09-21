package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.D */
/* compiled from: ClipboardSimpleAdapter */
class C2613D implements View.OnLongClickListener {

    /* renamed from: a */
    final /* synthetic */ View f11200a;

    /* renamed from: b */
    final /* synthetic */ int f11201b;

    /* renamed from: c */
    final /* synthetic */ C2939q f11202c;

    C2613D(C2939q qVar, View view, int i) {
        this.f11202c = qVar;
        this.f11200a = view;
        this.f11201b = i;
    }

    public boolean onLongClick(View view) {
        if (this.f11200a.getVisibility() == 0) {
            this.f11202c.mo9734a(this.f11200a);
        } else {
            for (View next : this.f11202c.f13347b) {
                if (next != null && next.getVisibility() == 0) {
                    this.f11202c.mo9734a(next);
                }
            }
            this.f11202c.mo9735a(this.f11200a, this.f11201b);
        }
        C1246d.m6010a(this.f11202c.f13348c).mo4591a(C1246d.f3753aW, C1246d.f3820bk, C1246d.f3783b);
        return true;
    }
}
