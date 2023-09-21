package com.cootek.smartinput5.p066ui.settings;

import android.view.View;
import android.widget.CheckBox;

/* renamed from: com.cootek.smartinput5.ui.settings.dC */
/* compiled from: TouchPalCloudActivity */
class C3165dC implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CheckBox f14218a;

    /* renamed from: b */
    final /* synthetic */ TouchPalCloudActivity f14219b;

    C3165dC(TouchPalCloudActivity touchPalCloudActivity, CheckBox checkBox) {
        this.f14219b = touchPalCloudActivity;
        this.f14218a = checkBox;
    }

    public void onClick(View view) {
        this.f14218a.setChecked(!this.f14218a.isChecked());
    }
}
