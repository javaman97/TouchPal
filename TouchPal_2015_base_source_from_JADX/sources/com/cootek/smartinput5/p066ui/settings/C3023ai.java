package com.cootek.smartinput5.p066ui.settings;

import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.ai */
/* compiled from: CustomCheckBoxPreference */
class C3023ai implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CustomCheckBoxPreference f13936a;

    C3023ai(CustomCheckBoxPreference customCheckBoxPreference) {
        this.f13936a = customCheckBoxPreference;
    }

    public void onClick(View view) {
        if (this.f13936a.mOnClickButtonListener != null) {
            this.f13936a.mOnClickButtonListener.mo9788a(this.f13936a);
        }
    }
}
