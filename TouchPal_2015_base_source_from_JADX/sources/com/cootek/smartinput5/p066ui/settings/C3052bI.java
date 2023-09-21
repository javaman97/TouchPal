package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.ui.settings.bI */
/* compiled from: LanguageSwitchModeDialogPreference */
class C3052bI implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ LanguageSwitchModeDialogPreference f14000a;

    C3052bI(LanguageSwitchModeDialogPreference languageSwitchModeDialogPreference) {
        this.f14000a = languageSwitchModeDialogPreference;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        int unused = this.f14000a.mSwitchModeIndex = i;
        this.f14000a.updateSetting();
        this.f14000a.updateSummary();
        dialogInterface.dismiss();
    }
}
