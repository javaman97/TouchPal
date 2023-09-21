package com.cootek.smartinput5.p066ui;

import android.view.TouchDelegate;

/* renamed from: com.cootek.smartinput5.ui.X */
/* compiled from: ExplicitWidget */
class C2652X implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2649V f11967a;

    C2652X(C2649V v) {
        this.f11967a = v;
    }

    public void run() {
        this.f11967a.f11920m.getHitRect(this.f11967a.f11903af);
        this.f11967a.f11903af.left -= this.f11967a.f11883K;
        this.f11967a.f11903af.top -= this.f11967a.f11883K;
        this.f11967a.f11903af.right += this.f11967a.f11883K;
        this.f11967a.f11926s.setTouchDelegate(new TouchDelegate(this.f11967a.f11903af, this.f11967a.f11920m));
        this.f11967a.f11924q.setTouchDelegate(new TouchDelegate(this.f11967a.f11903af, this.f11967a.f11920m));
    }
}
