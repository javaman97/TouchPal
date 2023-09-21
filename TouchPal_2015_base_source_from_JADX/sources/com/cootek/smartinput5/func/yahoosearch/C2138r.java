package com.cootek.smartinput5.func.yahoosearch;

import android.view.inputmethod.InputMethodManager;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.r */
/* compiled from: YahooSearch */
class C2138r implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2137q f9094a;

    C2138r(C2137q qVar) {
        this.f9094a = qVar;
    }

    public void run() {
        this.f9094a.mo7541c();
        ((InputMethodManager) this.f9094a.f9089c.getSystemService("input_method")).toggleSoftInput(2, 2);
    }
}
