package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.cC */
/* compiled from: SymGridView */
class C2779cC implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SymGridView f12377a;

    C2779cC(SymGridView symGridView) {
        this.f12377a = symGridView;
    }

    public void onClick(View view) {
        Engine.getInstance().fireKeyOperation(((Integer) view.getTag()).intValue(), 0);
        Engine.getInstance().processEvent();
        Engine.getInstance().feedback();
    }
}
