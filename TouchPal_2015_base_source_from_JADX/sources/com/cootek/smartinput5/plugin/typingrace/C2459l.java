package com.cootek.smartinput5.plugin.typingrace;

import android.view.MotionEvent;
import android.view.View;
import com.cootek.smartinput5.plugin.typingrace.Racing;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.l */
/* compiled from: Racing */
class C2459l implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ Racing f10715a;

    /* renamed from: b */
    final /* synthetic */ Racing.C2443a f10716b;

    C2459l(Racing.C2443a aVar, Racing racing) {
        this.f10716b = aVar;
        this.f10715a = racing;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 4) {
            return false;
        }
        this.f10716b.dismiss();
        return false;
    }
}
