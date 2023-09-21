package com.cootek.smartinput5.func.iab;

/* renamed from: com.cootek.smartinput5.func.iab.p */
/* compiled from: IabErrorHandler */
final class C1799p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f5911a;

    /* renamed from: b */
    final /* synthetic */ boolean f5912b;

    C1799p(int i, boolean z) {
        this.f5911a = i;
        this.f5912b = z;
    }

    public void run() {
        C1794k.m8273b(this.f5911a, this.f5912b ? "purchase_success" : "not_purchased");
    }
}
