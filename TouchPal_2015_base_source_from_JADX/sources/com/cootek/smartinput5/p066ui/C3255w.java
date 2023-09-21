package com.cootek.smartinput5.p066ui;

import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.w */
/* compiled from: ClipboardSimpleAdapter */
class C3255w implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f14331a;

    /* renamed from: b */
    final /* synthetic */ C2939q f14332b;

    C3255w(C2939q qVar, int i) {
        this.f14332b = qVar;
        this.f14331a = i;
    }

    public void onClick(View view) {
        this.f14332b.mo9737b(this.f14331a);
        ((View) view.getParent().getParent()).startAnimation(this.f14332b.f13359n);
    }
}
