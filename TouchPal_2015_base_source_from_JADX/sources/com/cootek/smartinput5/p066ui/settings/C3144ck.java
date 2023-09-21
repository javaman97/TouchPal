package com.cootek.smartinput5.p066ui.settings;

import android.view.MotionEvent;
import android.view.View;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.ck */
/* compiled from: ShareFrame */
class C3144ck implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ ShareFrame f14183a;

    C3144ck(ShareFrame shareFrame) {
        this.f14183a = shareFrame;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int i2;
        if (this.f14183a.f13620d) {
            i = R.color.share_limit_warning;
        } else {
            i = R.color.share_limit_normal;
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            if (this.f14183a.f13620d) {
                i2 = R.color.share_limit_warning_pressed;
            } else {
                i2 = R.color.share_limit_pressed;
            }
            this.f14183a.setBackgroundColor(this.f14183a.f13617a.getResources().getColor(i2));
        }
        this.f14183a.setBackgroundColor(this.f14183a.f13617a.getResources().getColor(i2));
        return false;
    }
}
