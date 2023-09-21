package com.cootek.smartinput.utilities;

import android.widget.Toast;

/* renamed from: com.cootek.smartinput.utilities.m */
/* compiled from: LogViewActivity */
class C1005m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2639a;

    /* renamed from: b */
    final /* synthetic */ int f2640b;

    /* renamed from: c */
    final /* synthetic */ C1004l f2641c;

    C1005m(C1004l lVar, String str, int i) {
        this.f2641c = lVar;
        this.f2639a = str;
        this.f2640b = i;
    }

    public void run() {
        Toast.makeText(this.f2641c.f2638a.f2590a, String.format("%s cancel:%d", new Object[]{this.f2639a, Integer.valueOf(this.f2640b)}), 1).show();
    }
}
