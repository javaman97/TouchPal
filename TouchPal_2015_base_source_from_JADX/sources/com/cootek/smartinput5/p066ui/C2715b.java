package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.ui.b */
/* compiled from: AddUserwordBar */
class C2715b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AddUserwordBar f12116a;

    C2715b(AddUserwordBar addUserwordBar) {
        this.f12116a = addUserwordBar;
    }

    public void onClick(View view) {
        Settings.getInstance().setBoolSetting(47, true);
    }
}
