package com.cootek.smartinput5.p066ui.control;

/* renamed from: com.cootek.smartinput5.ui.control.Z */
/* compiled from: ToastWidget */
class C2852Z implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2849W f13009a;

    C2852Z(C2849W w) {
        this.f13009a = w;
    }

    public void run() {
        if (this.f13009a.f12998c != null) {
            this.f13009a.f12998c.cancel();
        }
    }
}
