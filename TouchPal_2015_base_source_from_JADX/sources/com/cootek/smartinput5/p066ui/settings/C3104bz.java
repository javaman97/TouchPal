package com.cootek.smartinput5.p066ui.settings;

import android.content.Intent;
import com.cootek.smartinput5.p066ui.settings.CustomCheckBoxPreference;

/* renamed from: com.cootek.smartinput5.ui.settings.bz */
/* compiled from: LanguageListActivityInte */
class C3104bz implements CustomCheckBoxPreference.C2953b {

    /* renamed from: a */
    final /* synthetic */ LanguageListActivityInte f14112a;

    C3104bz(LanguageListActivityInte languageListActivityInte) {
        this.f14112a = languageListActivityInte;
    }

    /* renamed from: a */
    public void mo9789a(CustomCheckBoxPreference customCheckBoxPreference) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClass(this.f14112a.f13531b, LanguageMixInputActivityInte.class);
        this.f14112a.f13531b.startActivity(intent);
    }
}
