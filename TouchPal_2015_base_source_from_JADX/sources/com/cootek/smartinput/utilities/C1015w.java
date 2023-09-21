package com.cootek.smartinput.utilities;

import android.content.Intent;

/* renamed from: com.cootek.smartinput.utilities.w */
/* compiled from: TJavascriptHandler */
class C1015w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TJavascriptHandler f2656a;

    C1015w(TJavascriptHandler tJavascriptHandler) {
        this.f2656a = tJavascriptHandler;
    }

    public void run() {
        Intent intent = this.f2656a.mActivity.getIntent();
        this.f2656a.mActivity.finish();
        this.f2656a.mActivity.startActivity(intent);
    }
}
