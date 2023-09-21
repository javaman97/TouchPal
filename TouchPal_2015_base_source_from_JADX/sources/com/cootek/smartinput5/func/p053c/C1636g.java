package com.cootek.smartinput5.func.p053c;

import android.content.DialogInterface;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.func.c.g */
/* compiled from: PaopaoManager */
class C1636g implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ C1632c f5315a;

    C1636g(C1632c cVar) {
        this.f5315a = cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Settings.getInstance().setBoolSetting(Settings.USERDATA_COLLECT_ENABLE, true);
    }
}
