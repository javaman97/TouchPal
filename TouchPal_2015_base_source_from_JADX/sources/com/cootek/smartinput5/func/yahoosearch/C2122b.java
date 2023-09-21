package com.cootek.smartinput5.func.yahoosearch;

import android.view.View;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.b */
/* compiled from: BrowserActivity */
class C2122b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ BrowserActivity f9066a;

    C2122b(BrowserActivity browserActivity) {
        this.f9066a = browserActivity;
    }

    public void onClick(View view) {
        if (this.f9066a.f9036q.canGoBack()) {
            this.f9066a.f9036q.goBack();
        } else {
            this.f9066a.finish();
        }
    }
}
