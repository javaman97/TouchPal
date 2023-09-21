package com.cootek.smartinput5.p066ui.settings;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.cootek.smartinput5.func.C1584bI;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.da */
/* compiled from: SpecialThanksActivity */
class C3189da implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SpecialThanksActivity f14245a;

    C3189da(SpecialThanksActivity specialThanksActivity) {
        this.f14245a = specialThanksActivity;
    }

    public void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.f14245a.getResString(R.string.getlocalization_touchpal_link)));
        C1584bI.m7130a(this.f14245a.getApplicationContext(), intent, 0);
    }
}
