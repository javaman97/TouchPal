package com.cootek.smartinput5.net;

import android.text.TextUtils;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2243D;
import com.cootek.smartinput5.net.cmd.C2259P;

/* renamed from: com.cootek.smartinput5.net.an */
/* compiled from: VersionUpdater */
class C2227an implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C2226am f9411a;

    C2227an(C2226am amVar) {
        this.f9411a = amVar;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        C2243D d = (C2243D) p;
        if (d.f9746O == 200 && !TextUtils.isEmpty(d.f9521g)) {
            this.f9411a.m10088a(d);
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
    }
}
