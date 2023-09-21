package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import com.cootek.smartinput5.cust.C1240a;

/* renamed from: com.cootek.smartinput5.ui.settings.ao */
/* compiled from: CustomizeSymbolDefaultPreference */
class C3029ao implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CustomizeSymbolDefaultPreference f13942a;

    C3029ao(CustomizeSymbolDefaultPreference customizeSymbolDefaultPreference) {
        this.f13942a = customizeSymbolDefaultPreference;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (C1240a.m5987a().mo4571c()) {
            this.f13942a.flush();
        }
    }
}
