package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.C2896da;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.dq */
/* compiled from: VoiceView */
class C2913dq implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ VoiceView f13144a;

    C2913dq(VoiceView voiceView) {
        this.f13144a = voiceView;
    }

    public void onClick(View view) {
        C2896da daVar = new C2896da(VoiceView.f11949r, true, true);
        daVar.mo9528a((CharSequence) this.f13144a.m12287a((int) R.string.voice_input_language_choose_title));
        daVar.mo9568a((C2896da.C2897a) new C2914dr(this));
        Engine.getInstance().getVoiceProcessor().cancelInputVoice();
        daVar.mo7053a();
    }
}
