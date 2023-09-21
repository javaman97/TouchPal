package com.cootek.smartinput5.func.iab;

import android.content.DialogInterface;
import com.cootek.smartinput5.net.C2373x;

/* renamed from: com.cootek.smartinput5.func.iab.N */
/* compiled from: IabHelper */
class C1740N implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ C2373x f5702a;

    /* renamed from: b */
    final /* synthetic */ C1730E f5703b;

    C1740N(C1730E e, C2373x xVar) {
        this.f5703b = e;
        this.f5702a = xVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f5702a.mo8061b();
    }
}
