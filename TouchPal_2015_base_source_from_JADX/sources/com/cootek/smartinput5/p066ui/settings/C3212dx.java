package com.cootek.smartinput5.p066ui.settings;

import android.view.View;
import android.widget.CheckBox;

/* renamed from: com.cootek.smartinput5.ui.settings.dx */
/* compiled from: TouchPalCloudActivity */
class C3212dx implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CheckBox f14273a;

    /* renamed from: b */
    final /* synthetic */ TouchPalCloudActivity f14274b;

    C3212dx(TouchPalCloudActivity touchPalCloudActivity, CheckBox checkBox) {
        this.f14274b = touchPalCloudActivity;
        this.f14273a = checkBox;
    }

    public void onClick(View view) {
        this.f14273a.setChecked(!this.f14273a.isChecked());
    }
}
