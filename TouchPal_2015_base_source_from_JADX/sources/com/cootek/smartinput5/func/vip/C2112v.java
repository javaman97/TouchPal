package com.cootek.smartinput5.func.vip;

import android.preference.Preference;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.func.vip.v */
/* compiled from: VipInfoActivity */
class C2112v implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ VipInfoActivity f8985a;

    C2112v(VipInfoActivity vipInfoActivity) {
        this.f8985a = vipInfoActivity;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (this.f8985a.f8953a != null) {
            this.f8985a.f8953a.mo4591a(C1246d.f3875cm, C1246d.f3876cn, C1246d.f3867ce);
        }
        this.f8985a.m9606r();
        return true;
    }
}
