package com.cootek.smartinput5.p066ui.control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.control.BackDispatchView */
public class BackDispatchView extends FrameLayout {
    public BackDispatchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BackDispatchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BackDispatchView(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!Engine.isInitialized() || !Engine.getInstance().getWidgetManager().mo9618X().mo7430e()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return Engine.getInstance().getWidgetManager().mo9618X().mo7423a(motionEvent);
    }
}
