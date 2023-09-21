package com.cootek.smartinput5.p066ui.control;

/* renamed from: com.cootek.smartinput5.ui.control.Y */
/* compiled from: ToastWidget */
class C2851Y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2849W f13008a;

    C2851Y(C2849W w) {
        this.f13008a = w;
    }

    public void run() {
        C2849W.m13204a(this.f13008a, 1000);
        if (this.f13008a.f13004i >= 2000) {
            this.f13008a.m13211b(this.f13008a.f13003h, true);
            this.f13008a.f13000e.postDelayed(this, 1000);
        } else if (this.f13008a.f13004i > 1000) {
            this.f13008a.m13210b(this.f13008a.f13003h, this.f13008a.f13004i);
        }
    }
}
