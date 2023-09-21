package com.cootek.smartinput5;

import android.content.DialogInterface;
import com.cootek.smartinput5.p066ui.guideintro.C2922a;

/* renamed from: com.cootek.smartinput5.D */
/* compiled from: GuideIntroM */
class C1022D implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ GuideIntroM f2704a;

    C1022D(GuideIntroM guideIntroM) {
        this.f2704a = guideIntroM;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f2704a.f2783e != null) {
            this.f2704a.f2783e[3].mo9690a(C2922a.f13255b[(i + 4) - 1], this.f2704a.f2787i, this.f2704a.f2788j, this.f2704a.f2798t);
            this.f2704a.f2783e[3].mo9689a();
            this.f2704a.m5375m();
        }
    }
}
