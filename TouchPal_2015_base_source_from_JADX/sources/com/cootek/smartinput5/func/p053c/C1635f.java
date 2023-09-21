package com.cootek.smartinput5.func.p053c;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.func.c.f */
/* compiled from: PaopaoManager */
class C1635f implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CheckBox f5313a;

    /* renamed from: b */
    final /* synthetic */ C1632c f5314b;

    C1635f(C1632c cVar, CheckBox checkBox) {
        this.f5314b = cVar;
        this.f5313a = checkBox;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Settings.getInstance().setBoolSetting(Settings.USERDATA_COLLECT_ENABLE, this.f5313a.isChecked());
    }
}
