package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.ui.c */
/* compiled from: AddUserwordBar */
class C2776c implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AddUserwordBar f12374a;

    C2776c(AddUserwordBar addUserwordBar) {
        this.f12374a = addUserwordBar;
    }

    public void onClick(View view) {
        Settings.getInstance().setBoolSetting(47, false);
    }
}
