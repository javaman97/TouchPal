package com.cootek.smartinput5.net;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;

/* renamed from: com.cootek.smartinput5.net.b */
/* compiled from: Activator */
class C2236b implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C2209a f9453a;

    C2236b(C2209a aVar) {
        this.f9453a = aVar;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        if (p != null && p.f9748Q == 0 && Settings.isInitialized()) {
            Settings.getInstance().setBoolSetting(Settings.HAS_ACTIVATE_EFFECTIVELY, true);
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
    }
}
