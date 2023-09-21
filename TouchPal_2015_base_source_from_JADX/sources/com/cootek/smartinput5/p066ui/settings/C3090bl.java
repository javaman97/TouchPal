package com.cootek.smartinput5.p066ui.settings;

import android.content.Intent;
import com.cootek.smartinput5.p066ui.settings.CustomCheckBoxPreference;

/* renamed from: com.cootek.smartinput5.ui.settings.bl */
/* compiled from: LanguageListActivity */
class C3090bl implements CustomCheckBoxPreference.C2952a {

    /* renamed from: a */
    final /* synthetic */ String f14076a;

    /* renamed from: b */
    final /* synthetic */ LanguageListActivity f14077b;

    C3090bl(LanguageListActivity languageListActivity, String str) {
        this.f14077b = languageListActivity;
        this.f14076a = str;
    }

    /* renamed from: a */
    public void mo9788a(CustomCheckBoxPreference customCheckBoxPreference) {
        Intent intent = new Intent();
        intent.putExtra(CurveDictActivity.f13405a, this.f14076a);
        intent.setClass(this.f14077b, CurveDictActivity.class);
        this.f14077b.startActivity(intent);
    }
}
