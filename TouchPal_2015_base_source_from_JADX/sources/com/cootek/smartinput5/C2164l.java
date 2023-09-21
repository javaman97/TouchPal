package com.cootek.smartinput5;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.l */
/* compiled from: Guide */
class C2164l implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ Guide f9164a;

    C2164l(Guide guide) {
        this.f9164a = guide;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f9164a.f2737H.dismiss();
        return false;
    }
}
