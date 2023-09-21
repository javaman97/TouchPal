package com.cootek.smartinput5;

import android.content.DialogInterface;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.aj */
/* compiled from: TouchPalOption */
final class C1113aj implements DialogInterface.OnCancelListener {
    C1113aj() {
    }

    public void onCancel(DialogInterface dialogInterface) {
        Settings.getInstance().setBoolSetting(Settings.USERDATA_COLLECT_ENABLE, true);
    }
}
