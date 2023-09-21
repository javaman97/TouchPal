package com.cootek.smartinput5.net;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.net.af */
/* compiled from: TWebView */
class C2218af implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ TWebView f9380a;

    C2218af(TWebView tWebView) {
        this.f9380a = tWebView;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f9380a.f9270i != null) {
            this.f9380a.f9270i.onCancel(dialogInterface);
        }
    }
}
