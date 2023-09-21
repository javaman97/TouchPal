package com.cootek.smartinput.utilities;

import android.widget.Toast;

/* renamed from: com.cootek.smartinput.utilities.n */
/* compiled from: LogViewActivity */
class C1006n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2642a;

    /* renamed from: b */
    final /* synthetic */ C1004l f2643b;

    C1006n(C1004l lVar, String str) {
        this.f2643b = lVar;
        this.f2642a = str;
    }

    public void run() {
        Toast.makeText(this.f2643b.f2638a.f2590a, String.format("%s complete", new Object[]{this.f2642a}), 1).show();
    }
}
