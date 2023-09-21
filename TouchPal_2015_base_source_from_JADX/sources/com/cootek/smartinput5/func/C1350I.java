package com.cootek.smartinput5.func;

import android.text.TextUtils;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2302w;

/* renamed from: com.cootek.smartinput5.func.I */
/* compiled from: DomainLookupManager */
class C1350I implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C1348H f4155a;

    C1350I(C1348H h) {
        this.f4155a = h;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        C2302w wVar = (C2302w) p;
        if (!TextUtils.isEmpty(wVar.f10129c)) {
            String unused = this.f4155a.f4131c = wVar.f10129c;
        } else {
            String unused2 = this.f4155a.f4131c = "";
        }
        boolean unused3 = this.f4155a.f4132d = false;
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        boolean unused = this.f4155a.f4132d = false;
    }
}
