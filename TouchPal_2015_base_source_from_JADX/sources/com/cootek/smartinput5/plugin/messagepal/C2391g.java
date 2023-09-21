package com.cootek.smartinput5.plugin.messagepal;

import android.text.TextUtils;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2243D;
import com.cootek.smartinput5.net.cmd.C2259P;

/* renamed from: com.cootek.smartinput5.plugin.messagepal.g */
/* compiled from: MessageUpdater */
class C2391g implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ String f10481a;

    /* renamed from: b */
    final /* synthetic */ C2389f f10482b;

    C2391g(C2389f fVar, String str) {
        this.f10482b = fVar;
        this.f10481a = str;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        C2243D d = (C2243D) p;
        if (!TextUtils.isEmpty(d.f9522h) && !TextUtils.isEmpty(d.f9521g)) {
            if (TextUtils.isEmpty(this.f10481a) || d.f9521g.compareTo(this.f10481a) > 0) {
                this.f10482b.m10927a(this.f10482b.mo8090b(), d.f9522h, d.f9521g);
            } else {
                d.mo7785j();
            }
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
    }
}
