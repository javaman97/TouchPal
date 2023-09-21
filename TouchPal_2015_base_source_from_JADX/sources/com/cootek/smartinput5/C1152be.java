package com.cootek.smartinput5;

import android.app.Dialog;
import android.view.View;

/* renamed from: com.cootek.smartinput5.be */
/* compiled from: TouchPalOptionInte */
class C1152be implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Dialog f3502a;

    /* renamed from: b */
    final /* synthetic */ TouchPalOptionInte f3503b;

    C1152be(TouchPalOptionInte touchPalOptionInte, Dialog dialog) {
        this.f3503b = touchPalOptionInte;
        this.f3502a = dialog;
    }

    public void onClick(View view) {
        this.f3502a.dismiss();
    }
}
