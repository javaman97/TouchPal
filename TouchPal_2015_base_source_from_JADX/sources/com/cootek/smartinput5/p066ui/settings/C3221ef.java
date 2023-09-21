package com.cootek.smartinput5.p066ui.settings;

import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.ef */
/* compiled from: UsrWordManageActivity */
class C3221ef implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ UsrWordManageActivity f14286a;

    C3221ef(UsrWordManageActivity usrWordManageActivity) {
        this.f14286a = usrWordManageActivity;
    }

    public void onClick(View view) {
        boolean z;
        if (this.f14286a.f13792o) {
            z = false;
        } else {
            z = true;
        }
        if (this.f14286a.f13783f != null) {
            this.f14286a.f13783f.mo10262b(z);
        }
        this.f14286a.f13784g.invalidateViews();
    }
}
