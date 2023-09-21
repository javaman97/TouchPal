package com.cootek.smartinput5.urlnavigator;

import android.text.TextUtils;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2243D;
import com.cootek.smartinput5.net.cmd.C2259P;

/* renamed from: com.cootek.smartinput5.urlnavigator.o */
/* compiled from: RecommendedUpdater */
class C3276o implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ String f14394a;

    /* renamed from: b */
    final /* synthetic */ C3274n f14395b;

    C3276o(C3274n nVar, String str) {
        this.f14395b = nVar;
        this.f14394a = str;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        C2243D d = (C2243D) p;
        if (!TextUtils.isEmpty(d.f9522h) && !TextUtils.isEmpty(d.f9521g)) {
            if (TextUtils.isEmpty(this.f14394a) || d.f9521g.compareTo(this.f14394a) > 0) {
                this.f14395b.m14531a(C3278q.m14544b(this.f14395b.f14391d), d.f9522h, d.f9521g);
            } else {
                d.mo7785j();
            }
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
    }
}
