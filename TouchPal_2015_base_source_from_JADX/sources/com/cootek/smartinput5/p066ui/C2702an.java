package com.cootek.smartinput5.p066ui;

/* renamed from: com.cootek.smartinput5.ui.an */
/* compiled from: FunctionBar */
class C2702an implements Runnable {

    /* renamed from: a */
    final /* synthetic */ FunctionBar f12097a;

    C2702an(FunctionBar functionBar) {
        this.f12097a = functionBar;
    }

    public void run() {
        if (this.f12097a.f11245J != null && this.f12097a.f11269x != null) {
            int d = this.f12097a.f11245J.mo9071d();
            this.f12097a.f11269x.scrollTo(this.f12097a.f11245J.mo9070b(d).left, this.f12097a.f11269x.getScrollY());
            this.f12097a.m11652a(d);
        }
    }
}
