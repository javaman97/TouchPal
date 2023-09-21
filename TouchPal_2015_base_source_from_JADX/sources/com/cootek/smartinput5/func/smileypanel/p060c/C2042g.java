package com.cootek.smartinput5.func.smileypanel.p060c;

import android.widget.PopupWindow;

/* renamed from: com.cootek.smartinput5.func.smileypanel.c.g */
/* compiled from: EmojiArtItem */
class C2042g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PopupWindow f7093a;

    /* renamed from: b */
    final /* synthetic */ C2039d f7094b;

    C2042g(C2039d dVar, PopupWindow popupWindow) {
        this.f7094b = dVar;
        this.f7093a = popupWindow;
    }

    public void run() {
        this.f7093a.dismiss();
    }
}
