package com.cootek.smartinput5.p066ui.settings;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2361q;

/* renamed from: com.cootek.smartinput5.ui.settings.dW */
/* compiled from: TouchPalUpdateActivity */
class C3185dW implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalUpdateActivity f14241a;

    C3185dW(TouchPalUpdateActivity touchPalUpdateActivity) {
        this.f14241a = touchPalUpdateActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (C1368X.m6324d()) {
            if (!C1584bI.m7154g(this.f14241a) || !C1593bR.m7162a().f5075a) {
                C2361q.m10797b().mo8025k(C1368X.m6320c().mo5832R(), C1974m.m9063a((Context) this.f14241a, C1593bR.m7162a().mo6232a(16)), (String) null);
            } else {
                try {
                    C1584bI.m7134a((Context) this.f14241a, this.f14241a.getPackageName(), true, TouchPalUpdateActivity.f13759b);
                } catch (ActivityNotFoundException e) {
                }
            }
        }
        this.f14241a.finish();
    }
}
