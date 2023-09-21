package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import com.cootek.smartinput5.net.C2373x;

/* renamed from: com.cootek.smartinput5.ui.settings.dT */
/* compiled from: TouchPalUpdateActivity */
class C3182dT implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ C2373x f14237a;

    /* renamed from: b */
    final /* synthetic */ TouchPalUpdateActivity f14238b;

    C3182dT(TouchPalUpdateActivity touchPalUpdateActivity, C2373x xVar) {
        this.f14238b = touchPalUpdateActivity;
        this.f14237a = xVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f14237a.mo8061b();
        this.f14238b.finish();
    }
}
