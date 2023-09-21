package com.cootek.smartinput5;

import android.view.View;
import com.cootek.smartinput5.func.C1584bI;

/* renamed from: com.cootek.smartinput5.H */
/* compiled from: GuideIntroM */
class C1029H implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ GuideIntroM f2845a;

    C1029H(GuideIntroM guideIntroM) {
        this.f2845a = guideIntroM;
    }

    public void onClick(View view) {
        boolean z;
        if (this.f2845a.f2793o == null || !this.f2845a.f2793o.isShown()) {
            if (this.f2845a.f2790l != null) {
                this.f2845a.f2790l.showNext();
                this.f2845a.m5364g();
            }
        } else if (this.f2845a.f2792n == null || this.f2845a.f2792n.getCurrentPageIndex() >= this.f2845a.f2792n.getTotalPageNumber() - 1) {
            if (this.f2845a.f2794p == null || !this.f2845a.f2794p.isShown() || !this.f2845a.f2794p.isChecked()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C1584bI.m7145b(this.f2845a.f2782c, new C1030I(this), false);
            } else {
                this.f2845a.finish();
            }
        } else {
            this.f2845a.f2792n.mo7095b(this.f2845a.f2792n.getCurrentPageIndex() + 1);
        }
    }
}
