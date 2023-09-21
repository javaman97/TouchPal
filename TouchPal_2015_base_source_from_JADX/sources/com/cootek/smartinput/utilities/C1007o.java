package com.cootek.smartinput.utilities;

import android.widget.Toast;

/* renamed from: com.cootek.smartinput.utilities.o */
/* compiled from: LogViewActivity */
class C1007o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2644a;

    /* renamed from: b */
    final /* synthetic */ int f2645b;

    /* renamed from: c */
    final /* synthetic */ C1004l f2646c;

    C1007o(C1004l lVar, String str, int i) {
        this.f2646c = lVar;
        this.f2644a = str;
        this.f2645b = i;
    }

    public void run() {
        Toast.makeText(this.f2646c.f2638a.f2590a, String.format("%s error:%d", new Object[]{this.f2644a, Integer.valueOf(this.f2645b)}), 1).show();
    }
}
