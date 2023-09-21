package com.cootek.smartinput5.func.component;

import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.component.E */
/* compiled from: ContactNameIndexer */
class C1643E implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1689v f5325a;

    C1643E(C1689v vVar) {
        this.f5325a = vVar;
    }

    public void run() {
        if (this.f5325a.f5513b != null) {
            new C2894d.C2895a(this.f5325a.f5513b).setMessage(C1974m.m9063a(this.f5325a.f5514c, (int) R.string.contactname_index_none_message)).setPositiveButton(C1974m.m9063a(this.f5325a.f5514c, (int) R.string.yes), new C1644F(this)).show();
        }
    }
}
