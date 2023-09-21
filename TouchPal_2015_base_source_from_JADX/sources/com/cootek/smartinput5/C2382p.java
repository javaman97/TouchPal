package com.cootek.smartinput5;

import android.view.View;
import android.view.WindowManager;

/* renamed from: com.cootek.smartinput5.p */
/* compiled from: Guide */
class C2382p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WindowManager f10458a;

    /* renamed from: b */
    final /* synthetic */ View f10459b;

    /* renamed from: c */
    final /* synthetic */ Guide f10460c;

    C2382p(Guide guide, WindowManager windowManager, View view) {
        this.f10460c = guide;
        this.f10458a = windowManager;
        this.f10459b = view;
    }

    public void run() {
        this.f10458a.removeViewImmediate(this.f10459b);
    }
}
