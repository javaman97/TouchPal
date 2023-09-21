package com.cootek.smartinput5.func.smileypanel;

import android.view.MotionEvent;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.func.smileypanel.h */
/* compiled from: SmileyListView */
class C2058h implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ SmileyListView f8822a;

    C2058h(SmileyListView smileyListView) {
        this.f8822a = smileyListView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (Engine.isInitialized()) {
            Engine.getInstance().getWidgetManager().mo9618X().mo7420a(false);
        }
        return true;
    }
}
