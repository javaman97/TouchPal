package com.cootek.smartinput5.p066ui.settings;

import com.cootek.smartinput.p044a.C0967f;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.settings.C2991aG;
import com.cootek.smartinput5.p066ui.settings.C3146cm;

/* renamed from: com.cootek.smartinput5.ui.settings.aI */
/* compiled from: IflyVoiceChoiceAdapter */
class C2994aI implements C3146cm.C3147a {

    /* renamed from: a */
    final /* synthetic */ C2991aG.C2992a f13818a;

    /* renamed from: b */
    final /* synthetic */ C2993aH f13819b;

    C2994aI(C2993aH aHVar, C2991aG.C2992a aVar) {
        this.f13819b = aHVar;
        this.f13818a = aVar;
    }

    /* renamed from: a */
    public void mo10074a(int i) {
        if (Settings.isInitialized() && this.f13819b.f13817c != null) {
            Settings.getInstance().setStringSetting(Settings.IFLY_VOICE_CHOSEN_LANGUAGE, ((C0967f) this.f13819b.f13817c.get(i)).toString());
            if (Engine.isInitialized()) {
                this.f13819b.mo10071c();
            }
        }
        if (this.f13818a != null) {
            this.f13818a.mo9570a();
        }
    }
}
