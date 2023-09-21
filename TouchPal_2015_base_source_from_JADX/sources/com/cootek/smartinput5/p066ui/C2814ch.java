package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.MoveContrail;
import com.cootek.smartinput5.engine.SurfaceManager;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.cootek.smartinput5.p066ui.C2811cf;

/* renamed from: com.cootek.smartinput5.ui.ch */
/* compiled from: SoftKeyboard */
class C2814ch implements C2811cf.C2812a {

    /* renamed from: a */
    final /* synthetic */ C2811cf f12592a;

    C2814ch(C2811cf cfVar) {
        this.f12592a = cfVar;
    }

    /* renamed from: a */
    public void mo9205a(int i) {
        if (i == 0) {
            Engine.getInstance().getSurfaceManager().setAnimationType(SurfaceManager.SlipAnimationType.ANIM_SLIP_RIGHT);
        } else if (1 == i) {
            Engine.getInstance().getSurfaceManager().setAnimationType(SurfaceManager.SlipAnimationType.ANIM_SLIP_LEFT);
        } else if (5 == i) {
            Engine.getInstance().getSurfaceManager().setAnimationType(SurfaceManager.SlipAnimationType.ANIM_SLIP_DOWN);
        } else if (6 == i) {
            Engine.getInstance().getSurfaceManager().setAnimationType(SurfaceManager.SlipAnimationType.ANIM_SLIP_UP);
        } else {
            Engine.getInstance().getSurfaceManager().setAnimationType(SurfaceManager.SlipAnimationType.ANIM_NONE);
        }
        Engine.getInstance().fireSlipOperation(i);
        Engine.getInstance().processEvent();
        Engine.getInstance().getSurfaceManager().setAnimationType(SurfaceManager.SlipAnimationType.ANIM_NONE);
    }

    /* renamed from: a */
    public void mo9206a(MoveContrail moveContrail) {
        if (this.f12592a.mo9183b(moveContrail)) {
            Engine.getInstance().updateInputOp(C1712h.f5593o);
        } else if (this.f12592a.mo9185c(moveContrail)) {
            Engine.getInstance().updateInputOp(C1712h.f5596r);
        }
        Engine.getInstance().fireHandwriteOperation(moveContrail);
        Engine.getInstance().processEvent();
    }
}
