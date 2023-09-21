package com.cootek.smartinput5.func.paopaopanel;

import android.widget.CompoundButton;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.B */
/* compiled from: TradSimpConvertContentLayout */
class C1923B implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ int f6514a;

    /* renamed from: b */
    final /* synthetic */ C1922A f6515b;

    C1923B(C1922A a, int i) {
        this.f6515b = a;
        this.f6514a = i;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Settings.getInstance().setIntSetting(60, this.f6514a);
        if (this.f6515b.f6508c != null) {
            this.f6515b.f6508c.mo4420a();
        }
        this.f6515b.mo7083a(this.f6514a);
        if (this.f6515b.f6513h != null || this.f6515b.f6512g == null) {
            this.f6515b.f6513h.mo9534b_();
        } else {
            this.f6515b.f6512g.dismiss();
        }
    }
}
