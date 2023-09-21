package com.cootek.smartinput5.p066ui.settings;

import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.ah */
/* compiled from: CustomCheckBoxPreference */
class C3022ah implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CustomCheckBoxPreference f13935a;

    C3022ah(CustomCheckBoxPreference customCheckBoxPreference) {
        this.f13935a = customCheckBoxPreference;
    }

    public void onClick(View view) {
        if (this.f13935a.mOnClickCustomListener != null) {
            this.f13935a.mOnClickCustomListener.mo9789a(this.f13935a);
        }
    }
}
