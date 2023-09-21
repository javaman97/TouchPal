package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import android.preference.CheckBoxPreference;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.ds */
/* compiled from: TouchPalCloudActivity */
class C3207ds implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CheckBoxPreference f14267a;

    /* renamed from: b */
    final /* synthetic */ TouchPalCloudActivity f14268b;

    C3207ds(TouchPalCloudActivity touchPalCloudActivity, CheckBoxPreference checkBoxPreference) {
        this.f14268b = touchPalCloudActivity;
        this.f14267a = checkBoxPreference;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C1368X.m6320c().mo5846s().mo6309a(this.f14268b.f13734a, C1549b.f4831b, this.f14268b.mo7241b((int) R.string.SUPER_DICT_TARGET_VERSION), false);
        if (this.f14267a != null) {
            this.f14267a.setSummary(this.f14268b.mo7241b((int) R.string.download_apk_inprogress));
            this.f14267a.setOnPreferenceClickListener(new C3208dt(this));
        }
    }
}
