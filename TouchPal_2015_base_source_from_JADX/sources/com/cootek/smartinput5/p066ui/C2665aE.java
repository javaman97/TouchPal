package com.cootek.smartinput5.p066ui;

import android.widget.PopupWindow;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.aE */
/* compiled from: HandWriteMaskView */
class C2665aE implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ HandWriteMaskView f11982a;

    C2665aE(HandWriteMaskView handWriteMaskView) {
        this.f11982a = handWriteMaskView;
    }

    public void onDismiss() {
        Engine.getInstance().getWidgetManager().mo9650h().mo8552o();
    }
}
