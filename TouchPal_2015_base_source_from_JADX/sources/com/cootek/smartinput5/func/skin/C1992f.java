package com.cootek.smartinput5.func.skin;

import android.content.DialogInterface;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.func.skin.f */
/* compiled from: SponsorThemeActivity */
class C1992f implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ C1991e f6836a;

    C1992f(C1991e eVar) {
        this.f6836a = eVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f6836a.f6835a.f6827p.removeMessages(Settings.USER_DIC_BASE_VERSION);
    }
}
