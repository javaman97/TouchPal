package com.cootek.smartinput5;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.ai */
/* compiled from: TouchPalOption */
final class C1112ai implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CheckBox f3134a;

    C1112ai(CheckBox checkBox) {
        this.f3134a = checkBox;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Settings.getInstance().setBoolSetting(Settings.USERDATA_COLLECT_ENABLE, this.f3134a.isChecked());
    }
}
