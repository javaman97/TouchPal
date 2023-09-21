package com.cootek.smartinput5.func.yahoosearch.p063ui;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.ui.d */
/* compiled from: SearchBrowserWebView */
class C2149d implements View.OnTouchListener {

    /* renamed from: d */
    private static final int f9129d = 1;

    /* renamed from: e */
    private static final int f9130e = 10;

    /* renamed from: a */
    Handler f9131a = new C2150e(this);

    /* renamed from: b */
    final /* synthetic */ SearchBrowserWebView f9132b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f9133c = 0;

    C2149d(SearchBrowserWebView searchBrowserWebView) {
        this.f9132b = searchBrowserWebView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 1:
                this.f9131a.sendMessageDelayed(this.f9131a.obtainMessage(1, view), 10);
                return false;
            default:
                return false;
        }
    }
}
