package com.cootek.smartinput5;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.b */
/* compiled from: GateActivity */
class C1130b extends Handler {

    /* renamed from: a */
    final /* synthetic */ GateActivity f3160a;

    C1130b(GateActivity gateActivity) {
        this.f3160a = gateActivity;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        switch (message.what) {
            case 1:
                if (this.f3160a.f2712e != null) {
                    this.f3160a.f2712e.startAnimation(AnimationUtils.loadAnimation(this.f3160a.getApplicationContext(), R.anim.extract_progress));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
