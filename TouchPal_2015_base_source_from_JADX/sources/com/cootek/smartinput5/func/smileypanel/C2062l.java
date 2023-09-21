package com.cootek.smartinput5.func.smileypanel;

/* renamed from: com.cootek.smartinput5.func.smileypanel.l */
/* compiled from: SmileyScrollView */
class C2062l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SmileyScrollView f8845a;

    C2062l(SmileyScrollView smileyScrollView) {
        this.f8845a = smileyScrollView;
    }

    public void run() {
        int unused = this.f8845a.f6931A = 0;
        if (this.f8845a.f6942s == null) {
            return;
        }
        if (this.f8845a.getScrollY() == 0) {
            int unused2 = this.f8845a.f6949z = 0;
            this.f8845a.f6942s.mo7344h();
            return;
        }
        int unused3 = this.f8845a.f6949z = 1;
        this.f8845a.f6942s.mo7343g();
        if (this.f8845a.getScrollY() != this.f8845a.getScrollHeight()) {
            this.f8845a.m9244a(this.f8845a.getScrollHeight());
        }
    }
}
