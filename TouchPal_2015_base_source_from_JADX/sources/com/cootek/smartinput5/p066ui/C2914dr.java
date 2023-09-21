package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.C2896da;

/* renamed from: com.cootek.smartinput5.ui.dr */
/* compiled from: VoiceView */
class C2914dr implements C2896da.C2897a {

    /* renamed from: a */
    final /* synthetic */ C2913dq f13145a;

    C2914dr(C2913dq dqVar) {
        this.f13145a = dqVar;
    }

    /* renamed from: a */
    public void mo9569a(String str) {
        this.f13145a.f13144a.f11962v.setText(str);
        Engine.getInstance().getVoiceProcessor().startInputVoice();
    }
}
