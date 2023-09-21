package com.cootek.smartinput5.p066ui.settings;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.p066ui.VoiceView;
import com.cootek.smartinput5.p066ui.settings.C2991aG;
import com.cootek.smartinput5.p066ui.settings.C3146cm;

/* renamed from: com.cootek.smartinput5.ui.settings.em */
/* compiled from: VoiceChoiceAdapter */
class C3228em implements C3146cm.C3147a {

    /* renamed from: a */
    final /* synthetic */ C2991aG.C2992a f14294a;

    /* renamed from: b */
    final /* synthetic */ C3227el f14295b;

    C3228em(C3227el elVar, C2991aG.C2992a aVar) {
        this.f14295b = elVar;
        this.f14294a = aVar;
    }

    /* renamed from: a */
    public void mo10074a(int i) {
        VoiceView f;
        if (Settings.isInitialized() && this.f14295b.f14293d != null) {
            Settings.getInstance().setStringSetting(Settings.VOICE_INPUT_LANGUAGE, ((C1389aD.C1391b) this.f14295b.f14293d.get(i)).f4400a);
            if (Engine.isInitialized() && (f = Engine.getInstance().getWidgetManager().mo9645f(false)) != null && f.isShown()) {
                Engine.getInstance().fireLuaCallOperation(Engine.LUA_CALL_UPDATE_VOICE_SYM_KEY);
                Engine.getInstance().processEvent();
            }
        }
        if (this.f14294a != null) {
            this.f14294a.mo9570a();
        }
    }
}
