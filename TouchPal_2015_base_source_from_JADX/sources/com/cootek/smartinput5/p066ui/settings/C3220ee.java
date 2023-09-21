package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.ui.settings.ee */
/* compiled from: UsrWordManageActivity */
class C3220ee implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ UsrWordManageActivity f14285a;

    C3220ee(UsrWordManageActivity usrWordManageActivity) {
        this.f14285a = usrWordManageActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f14285a.f13783f != null) {
            this.f14285a.f13783f.mo10264c();
        }
        if (this.f14285a.f13784g != null) {
            this.f14285a.f13784g.invalidateViews();
        }
        this.f14285a.m14169h();
        if (this.f14285a.f13783f.getCount() < 1) {
            this.f14285a.m14151a(false);
        }
    }
}
