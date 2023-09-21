package com.cootek.smartinput5.net;

import android.text.TextUtils;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2243D;
import com.cootek.smartinput5.net.cmd.C2259P;

/* renamed from: com.cootek.smartinput5.net.i */
/* compiled from: AdvertiseUpdater */
class C2311i implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ String f10175a;

    /* renamed from: b */
    final /* synthetic */ C2310h f10176b;

    C2311i(C2310h hVar, String str) {
        this.f10176b = hVar;
        this.f10175a = str;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        C2243D d = (C2243D) p;
        if (!TextUtils.isEmpty(d.f9522h) && !TextUtils.isEmpty(d.f9521g)) {
            if (TextUtils.isEmpty(this.f10175a) || d.f9521g.compareTo(this.f10175a) > 0) {
                this.f10176b.m10595a(d.f9522h, d.f9521g);
            } else {
                d.mo7785j();
            }
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
    }
}
