package com.cootek.smartinput5;

import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.I */
/* compiled from: GuideIntroM */
class C1030I implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1029H f2846a;

    C1030I(C1029H h) {
        this.f2846a = h;
    }

    public void run() {
        C1368X.m6320c().mo5846s().mo6308a(C1368X.m6313b(), C1549b.f4831b, this.f2846a.f2845a.getResString(R.string.SUPER_DICT_TARGET_VERSION));
        this.f2846a.f2845a.finish();
    }
}
