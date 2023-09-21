package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import android.widget.Toast;
import com.cootek.smartinput5.func.C1337C;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.af */
/* compiled from: CurveDictActivity */
class C3020af implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ C1337C f13929a;

    /* renamed from: b */
    final /* synthetic */ C1337C.C1339a f13930b;

    /* renamed from: c */
    final /* synthetic */ C1498a f13931c;

    /* renamed from: d */
    final /* synthetic */ CustomButtonPreference f13932d;

    /* renamed from: e */
    final /* synthetic */ CurveDictActivity f13933e;

    C3020af(CurveDictActivity curveDictActivity, C1337C c, C1337C.C1339a aVar, C1498a aVar2, CustomButtonPreference customButtonPreference) {
        this.f13933e = curveDictActivity;
        this.f13929a = c;
        this.f13930b = aVar;
        this.f13931c = aVar2;
        this.f13932d = customButtonPreference;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (C1358O.m6234a(C1358O.f4194e) == null) {
            Toast.makeText(this.f13933e, this.f13933e.mo7241b((int) R.string.sdcard_not_ready_message), 1).show();
            return true;
        }
        C1337C c = this.f13929a;
        this.f13929a.mo5564a(this.f13933e, this.f13931c.f4727f, C1337C.m6133a(this.f13930b), this.f13932d.getTitle().toString(), false);
        return false;
    }
}
