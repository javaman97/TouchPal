package com.cootek.smartinput5.p066ui.control;

/* renamed from: com.cootek.smartinput5.ui.control.X */
/* compiled from: ToastWidget */
class C2850X implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f13005a;

    /* renamed from: b */
    final /* synthetic */ boolean f13006b;

    /* renamed from: c */
    final /* synthetic */ C2849W f13007c;

    C2850X(C2849W w, String str, boolean z) {
        this.f13007c = w;
        this.f13005a = str;
        this.f13006b = z;
    }

    public void run() {
        this.f13007c.m13214c(this.f13005a, this.f13006b);
    }
}
