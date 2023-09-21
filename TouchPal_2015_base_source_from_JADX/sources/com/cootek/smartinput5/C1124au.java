package com.cootek.smartinput5;

import android.content.DialogInterface;
import android.preference.CheckBoxPreference;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.au */
/* compiled from: TouchPalOptionInte */
class C1124au implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CheckBoxPreference f3152a;

    /* renamed from: b */
    final /* synthetic */ TouchPalOptionInte f3153b;

    C1124au(TouchPalOptionInte touchPalOptionInte, CheckBoxPreference checkBoxPreference) {
        this.f3153b = touchPalOptionInte;
        this.f3152a = checkBoxPreference;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C1368X.m6320c().mo5846s().mo6309a(this.f3153b.f2890D, C1549b.f4831b, this.f3153b.mo7241b((int) R.string.SUPER_DICT_TARGET_VERSION), false);
        if (this.f3152a != null) {
            this.f3152a.setSummary(this.f3153b.m5464E());
        }
    }
}
