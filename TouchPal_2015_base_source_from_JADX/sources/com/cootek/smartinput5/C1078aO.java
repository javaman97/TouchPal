package com.cootek.smartinput5;

import android.preference.Preference;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.component.C1654O;
import com.cootek.smartinput5.net.C2226am;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.aO */
/* compiled from: TouchPalOptionInte */
class C1078aO implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3076a;

    C1078aO(TouchPalOptionInte touchPalOptionInte) {
        this.f3076a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        new C1654O(this.f3076a).mo6473a();
        if (Settings.getInstance().getIntSetting(105) == 0) {
            new C2226am(C1368X.m6313b()).mo7754a();
        }
        C1246d.m6010a(this.f3076a.f2890D).mo4594a(C1246d.f3723T, true, C1246d.f3730a);
        return true;
    }
}
