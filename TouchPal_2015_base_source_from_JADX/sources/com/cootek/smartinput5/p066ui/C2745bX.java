package com.cootek.smartinput5.p066ui;

import android.text.TextUtils;
import com.cootek.smartinput5.engine.CandidateItem;
import com.cootek.smartinput5.p066ui.control.C2829G;
import com.cootek.smartinput5.p066ui.control.C2877u;

/* renamed from: com.cootek.smartinput5.ui.bX */
/* compiled from: SoftCandidatePad */
class C2745bX extends C2877u {

    /* renamed from: a */
    final /* synthetic */ C2744bW f12254a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2745bX(C2744bW bWVar, int i, int i2, int i3) {
        super(i, i2, i3);
        this.f12254a = bWVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo9021a(int i) {
        CandidateItem b = this.f12254a.mo9017b(i);
        if (b == null) {
            return -1;
        }
        if (!this.f12254a.f12543P) {
            return 1;
        }
        String displayString = b.getDisplayString();
        if (TextUtils.isEmpty(displayString)) {
            return 1;
        }
        if (C2829G.m12929a(displayString.charAt(0))) {
            if (displayString.length() <= 4) {
                return 1;
            }
            if (displayString.length() > 8) {
                return 4;
            }
            return 2;
        } else if (displayString.length() <= 8) {
            return 1;
        } else {
            if (displayString.length() > 20) {
                return 4;
            }
            return 2;
        }
    }
}
