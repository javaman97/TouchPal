package com.cootek.smartinput5.p066ui.settings;

import android.text.TextUtils;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2243D;
import com.cootek.smartinput5.net.cmd.C2259P;

/* renamed from: com.cootek.smartinput5.ui.settings.dU */
/* compiled from: TouchPalUpdateActivity */
class C3183dU implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ TouchPalUpdateActivity f14239a;

    C3183dU(TouchPalUpdateActivity touchPalUpdateActivity) {
        this.f14239a = touchPalUpdateActivity;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        if (!this.f14239a.f13761c) {
            C2243D d = (C2243D) p;
            if (d.f9746O != 200 || TextUtils.isEmpty(d.f9521g)) {
                this.f14239a.m14128b();
                this.f14239a.m14130c();
                return;
            }
            this.f14239a.m14125a(d);
            this.f14239a.m14128b();
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
    }
}
