package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.ClipboardBackend;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C2117w;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.C */
/* compiled from: ClipboardSimpleAdapter */
class C2610C implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CharSequence f11160a;

    /* renamed from: b */
    final /* synthetic */ int f11161b;

    /* renamed from: c */
    final /* synthetic */ C2939q f11162c;

    C2610C(C2939q qVar, CharSequence charSequence, int i) {
        this.f11162c = qVar;
        this.f11160a = charSequence;
        this.f11161b = i;
    }

    public void onClick(View view) {
        boolean z;
        boolean z2 = true;
        for (View next : this.f11162c.f13347b) {
            if (next != null) {
                if (next.getVisibility() == 0) {
                    this.f11162c.mo9734a(next);
                    z = false;
                } else {
                    z = z2;
                }
                z2 = z;
            }
        }
        if (z2) {
            C2117w.m9655a().setText(Engine.getInstance().getIms(), this.f11160a);
            if (ClipboardBackend.getInstance() != null) {
                ClipboardBackend.getInstance().performPaste(this.f11162c.m13606d(this.f11161b));
            }
            C1246d.m6010a(this.f11162c.f13348c).mo4591a(C1246d.f3753aW, C1246d.f3821bl, C1246d.f3783b);
            this.f11162c.mo9742g();
        }
    }
}
