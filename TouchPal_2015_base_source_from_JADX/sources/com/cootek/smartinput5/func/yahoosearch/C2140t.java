package com.cootek.smartinput5.func.yahoosearch;

import android.view.inputmethod.InputMethodManager;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.t */
/* compiled from: YahooSearchActivity */
class C2140t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ YahooSearchActivity f9096a;

    C2140t(YahooSearchActivity yahooSearchActivity) {
        this.f9096a = yahooSearchActivity;
    }

    public void run() {
        ((InputMethodManager) this.f9096a.getSystemService("input_method")).toggleSoftInput(2, 2);
    }
}
