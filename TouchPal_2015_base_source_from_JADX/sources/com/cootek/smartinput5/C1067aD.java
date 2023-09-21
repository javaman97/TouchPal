package com.cootek.smartinput5;

import android.preference.Preference;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1584bI;

/* renamed from: com.cootek.smartinput5.aD */
/* compiled from: TouchPalOptionInte */
class C1067aD implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3064a;

    C1067aD(TouchPalOptionInte touchPalOptionInte) {
        this.f3064a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (Settings.getInstance().getBoolSetting(Settings.SHOW_WAVE_TUTORIAL_DIALOG)) {
            Settings.getInstance().setBoolSetting(Settings.SHOW_WAVE_TUTORIAL_DIALOG, false);
        }
        C1584bI.m7145b(this.f3064a.f2890D, new C1068aE(this), false);
        return true;
    }
}
