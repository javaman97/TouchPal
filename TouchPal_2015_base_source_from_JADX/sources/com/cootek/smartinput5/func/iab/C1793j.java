package com.cootek.smartinput5.func.iab;

import android.content.DialogInterface;
import com.cootek.smartinput5.func.iab.C1789h;

/* renamed from: com.cootek.smartinput5.func.iab.j */
/* compiled from: IabDialogManager */
class C1793j implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ C1789h.C1790a f5898a;

    /* renamed from: b */
    final /* synthetic */ C1789h f5899b;

    C1793j(C1789h hVar, C1789h.C1790a aVar) {
        this.f5899b = hVar;
        this.f5898a = aVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f5898a.mo6660e() != null) {
            this.f5898a.mo6660e().onDismiss(dialogInterface);
        }
    }
}
