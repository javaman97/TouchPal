package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.G */
/* compiled from: ClipboardView */
class C2617G implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ClipboardView f11272a;

    C2617G(ClipboardView clipboardView) {
        this.f11272a = clipboardView;
    }

    public void onClick(View view) {
        C1246d.m6010a(this.f11272a.f11191i).mo4591a(C1246d.f3752aV, C1246d.f3813bd, C1246d.f3783b);
        Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_back"), 0);
        Engine.getInstance().processEvent();
    }
}
