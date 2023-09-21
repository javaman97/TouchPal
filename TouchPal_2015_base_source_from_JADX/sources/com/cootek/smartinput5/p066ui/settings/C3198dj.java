package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import com.cootek.smartinput5.func.component.C1670e;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.settings.dj */
/* compiled from: TouchPalCloudActivity */
class C3198dj implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1670e f14254a;

    /* renamed from: b */
    final /* synthetic */ C3196dh f14255b;

    C3198dj(C3196dh dhVar, C1670e eVar) {
        this.f14255b = dhVar;
        this.f14254a = eVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f14254a.mo6523a();
        C1246d.m6010a(this.f14255b.f14252a.f13734a).mo4594a(C1246d.f3724U, true, C1246d.f3730a);
        C1056a.m5588a().mo4264a(C1056a.f2945F, this.f14255b.f14252a.f13734a);
    }
}
