package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.ui.cO */
/* compiled from: TopScrollView */
class C2791cO implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f12398a;

    /* renamed from: b */
    final /* synthetic */ int f12399b;

    /* renamed from: c */
    final /* synthetic */ int f12400c;

    /* renamed from: d */
    final /* synthetic */ int f12401d;

    /* renamed from: e */
    final /* synthetic */ TopScrollView f12402e;

    C2791cO(TopScrollView topScrollView, int i, int i2, int i3, int i4) {
        this.f12402e = topScrollView;
        this.f12398a = i;
        this.f12399b = i2;
        this.f12400c = i3;
        this.f12401d = i4;
    }

    public void run() {
        boolean z = false;
        boolean z2 = true;
        if (this.f12402e.f11819u < 255 - this.f12398a) {
            this.f12402e.f11819u += this.f12398a;
            z2 = false;
        }
        if (this.f12402e.f11820v - this.f12399b > 125) {
            this.f12402e.f11820v -= this.f12399b;
            z2 = false;
        }
        if (this.f12402e.f11821w - ((float) this.f12400c) > 80.0f) {
            this.f12402e.f11821w -= (float) this.f12400c;
        } else {
            z = z2;
        }
        if (!z) {
            this.f12402e.invalidate();
            this.f12402e.m12033a(this.f12401d, this.f12398a, this.f12399b, this.f12400c);
            return;
        }
        this.f12402e.f11819u = 255;
        this.f12402e.f11820v = Settings.CLOUD_HANDWRITING_ENABLED;
        this.f12402e.f11821w = 80.0f;
        this.f12402e.invalidate();
    }
}
