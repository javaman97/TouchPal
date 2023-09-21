package com.cootek.smartinput5.p066ui;

/* renamed from: com.cootek.smartinput5.ui.bf */
/* compiled from: LanguageSelectorPopup */
class C2754bf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f12290a;

    /* renamed from: b */
    final /* synthetic */ C2752be f12291b;

    C2754bf(C2752be beVar, int i) {
        this.f12291b = beVar;
        this.f12290a = i;
    }

    public void run() {
        if (this.f12291b.f12272l > this.f12291b.f12261a) {
            int c = this.f12291b.f12267g / this.f12291b.f12261a;
            this.f12291b.f12275o.scrollTo(((c / 2) + (this.f12290a * c)) - (this.f12291b.f12267g / 2), 0);
        }
    }
}
