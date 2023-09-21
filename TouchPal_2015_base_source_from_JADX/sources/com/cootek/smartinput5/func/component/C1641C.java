package com.cootek.smartinput5.func.component;

import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.component.C */
/* compiled from: ContactNameIndexer */
class C1641C implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1689v f5323a;

    C1641C(C1689v vVar) {
        this.f5323a = vVar;
    }

    public void run() {
        if (this.f5323a.f5513b != null) {
            new C2894d.C2895a(this.f5323a.f5513b).setMessage(C1974m.m9063a(this.f5323a.f5514c, (int) R.string.contactname_cleardone_message)).setPositiveButton(C1974m.m9063a(this.f5323a.f5514c, (int) R.string.yes), new C1642D(this)).show();
        }
    }
}
