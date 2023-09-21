package com.cootek.smartinput5.p066ui;

import android.view.ViewGroup;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.control.C2826E;

/* renamed from: com.cootek.smartinput5.ui.dn */
/* compiled from: VoiceProcessMask */
class C2910dn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2906dj f13140a;

    C2910dn(C2906dj djVar) {
        this.f13140a = djVar;
    }

    public void run() {
        if (Engine.isInitialized()) {
            if (this.f13140a.f13135f != null) {
                this.f13140a.f13135f.mo9242b((C2826E.C2827a) this.f13140a);
            }
            Engine.getInstance().setMutiTouchPaused(false);
            Engine.getInstance().getVoiceProcessor().cancelInputVoice();
            FunctionBar h = Engine.getInstance().getWidgetManager().mo9650h();
            if (h != null) {
                h.setClickEnabled(true);
            }
            if (this.f13140a.isShowing()) {
                ((ViewGroup) this.f13140a.getContentView()).removeView(Engine.getInstance().getWidgetManager().mo9609O());
                this.f13140a.dismiss();
            }
            boolean unused = this.f13140a.f13136g = false;
        }
    }
}
