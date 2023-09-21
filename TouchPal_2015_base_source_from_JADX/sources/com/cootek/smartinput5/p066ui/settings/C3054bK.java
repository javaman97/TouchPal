package com.cootek.smartinput5.p066ui.settings;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.bK */
/* compiled from: OnlineShopActivity */
class C3054bK implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ OnlineShopActivity f14002a;

    C3054bK(OnlineShopActivity onlineShopActivity) {
        this.f14002a = onlineShopActivity;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
            case 1:
                if (view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            default:
                return false;
        }
    }
}
