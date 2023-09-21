package com.cootek.smartinput5.teaching;

import android.widget.TextView;

/* renamed from: com.cootek.smartinput5.teaching.s */
/* compiled from: TeachingTipHandwrite */
class C2599s implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TextView f11129a;

    /* renamed from: b */
    final /* synthetic */ C2596p f11130b;

    C2599s(C2596p pVar, TextView textView) {
        this.f11130b = pVar;
        this.f11129a = textView;
    }

    public void run() {
        this.f11130b.mo8395a(0, 0, 0, 0);
        this.f11129a.setVisibility(8);
        this.f11130b.mo8398b();
    }
}
