package com.cootek.smartinput5.p066ui.settings;

import android.content.Intent;
import com.cootek.smartinput5.p066ui.settings.CustomCheckBoxPreference;

/* renamed from: com.cootek.smartinput5.ui.settings.bD */
/* compiled from: LanguageListActivityInte */
class C3047bD implements CustomCheckBoxPreference.C2953b {

    /* renamed from: a */
    final /* synthetic */ String f13986a;

    /* renamed from: b */
    final /* synthetic */ LanguageListActivityInte f13987b;

    C3047bD(LanguageListActivityInte languageListActivityInte, String str) {
        this.f13987b = languageListActivityInte;
        this.f13986a = str;
    }

    /* renamed from: a */
    public void mo9789a(CustomCheckBoxPreference customCheckBoxPreference) {
        Intent intent = new Intent();
        intent.putExtra(LanguageEditActivityInte.f13510a, this.f13986a);
        intent.setClass(this.f13987b, LanguageEditActivityInte.class);
        this.f13987b.startActivity(intent);
    }
}
