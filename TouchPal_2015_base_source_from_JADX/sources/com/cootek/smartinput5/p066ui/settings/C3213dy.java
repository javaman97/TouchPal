package com.cootek.smartinput5.p066ui.settings;

import android.view.View;
import android.widget.CheckBox;

/* renamed from: com.cootek.smartinput5.ui.settings.dy */
/* compiled from: TouchPalCloudActivity */
class C3213dy implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CheckBox f14275a;

    /* renamed from: b */
    final /* synthetic */ TouchPalCloudActivity f14276b;

    C3213dy(TouchPalCloudActivity touchPalCloudActivity, CheckBox checkBox) {
        this.f14276b = touchPalCloudActivity;
        this.f14275a = checkBox;
    }

    public void onClick(View view) {
        this.f14275a.setChecked(!this.f14275a.isChecked());
    }
}
