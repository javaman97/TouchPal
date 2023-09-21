package com.cootek.smartinput5.p066ui.settings;

import android.view.View;
import android.widget.Button;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.share.C1979a;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.bX */
/* compiled from: RateUsActivity */
class C3067bX implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Button f14015a;

    /* renamed from: b */
    final /* synthetic */ RateUsActivity f14016b;

    C3067bX(RateUsActivity rateUsActivity, Button button) {
        this.f14016b = rateUsActivity;
        this.f14015a = button;
    }

    public void onClick(View view) {
        if (C1979a.m9109a()) {
            this.f14016b.mo9955a();
        } else if (C1368X.m6324d()) {
            C1979a.m9113c(this.f14016b.f13614c);
            this.f14015a.setText(C1974m.m9063a(this.f14016b.f13614c, (int) R.string.share));
        }
    }
}
