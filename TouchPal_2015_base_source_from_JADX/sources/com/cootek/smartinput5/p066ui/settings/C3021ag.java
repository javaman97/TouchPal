package com.cootek.smartinput5.p066ui.settings;

import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.ag */
/* compiled from: CustomButtonPreference */
class C3021ag implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CustomButtonPreference f13934a;

    C3021ag(CustomButtonPreference customButtonPreference) {
        this.f13934a = customButtonPreference;
    }

    public void onClick(View view) {
        if (this.f13934a.mOnCustomButtonClickListener != null) {
            this.f13934a.mOnCustomButtonClickListener.onCustomButtonClick(this.f13934a);
        }
    }
}
