package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import com.cootek.smartinput5.func.component.C1670e;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.settings.dm */
/* compiled from: TouchPalCloudActivity */
class C3201dm implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1670e f14258a;

    /* renamed from: b */
    final /* synthetic */ C3199dk f14259b;

    C3201dm(C3199dk dkVar, C1670e eVar) {
        this.f14259b = dkVar;
        this.f14258a = eVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f14258a.mo6525b();
        C1246d.m6010a(this.f14259b.f14256a.f13734a).mo4594a(C1246d.f3725V, true, C1246d.f3730a);
        C1056a.m5588a().mo4264a(C1056a.f2946G, this.f14259b.f14256a.f13734a);
    }
}
