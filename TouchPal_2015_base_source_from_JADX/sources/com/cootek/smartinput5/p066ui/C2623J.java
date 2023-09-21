package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.J */
/* compiled from: DialectBar */
class C2623J implements C2727bG {

    /* renamed from: a */
    final /* synthetic */ DialectBar f11454a;

    C2623J(DialectBar dialectBar) {
        this.f11454a = dialectBar;
    }

    public String getDisplayString() {
        return C1974m.m9063a(this.f11454a.getContext(), (int) R.string.replace_dialect_hint);
    }

    public int getTag() {
        return -1;
    }

    public boolean hasLongPressIcon() {
        return false;
    }

    public boolean hasAdditionalIcon() {
        return false;
    }
}
