package com.cootek.smartinput5.p066ui.settings;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.ui.settings.bJ */
/* compiled from: OnlineShopActivity */
class C3053bJ extends Handler {

    /* renamed from: a */
    final /* synthetic */ OnlineShopActivity f14001a;

    C3053bJ(OnlineShopActivity onlineShopActivity) {
        this.f14001a = onlineShopActivity;
    }

    public void handleMessage(Message message) {
        if (this.f14001a.f13580v != null) {
            switch (message.what) {
                case 0:
                    this.f14001a.f13580v.show();
                    break;
                case 1:
                    this.f14001a.f13580v.hide();
                    break;
                case 2:
                    if (this.f14001a.f13579u != null) {
                        this.f14001a.f13579u.stopLoading();
                        this.f14001a.m13915c();
                        this.f14001a.f13581w.sendEmptyMessage(1);
                        break;
                    }
                    break;
            }
        }
        super.handleMessage(message);
    }
}
