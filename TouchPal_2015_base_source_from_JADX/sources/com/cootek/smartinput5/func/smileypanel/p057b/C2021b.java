package com.cootek.smartinput5.func.smileypanel.p057b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.smileypanel.C2057g;
import com.cootek.smartinput5.func.smileypanel.p057b.p058a.C2020i;
import com.cootek.smartinput5.func.smileypanel.p062e.C2052a;
import com.cootek.smartinput5.p066ui.C2787cK;
import com.cootek.smartinput5.p066ui.C2919e;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.smileypanel.b.b */
/* compiled from: DisplayItem */
class C2021b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2011a f7033a;

    C2021b(C2011a aVar) {
        this.f7033a = aVar;
    }

    public void onClick(View view) {
        String b;
        boolean boolSetting = Settings.getInstance().getBoolSetting(Settings.COMMIT_ANIMATION_ENABLED);
        C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - ad.mo9254l();
        iArr[1] = iArr[1] - view.getHeight();
        if (this.f7033a.f7000g == null) {
            C2919e unused = this.f7033a.f7000g = new C2919e(C1368X.m6313b(), this.f7033a.f7001h, R.style.CandidateConfirmAnimation, Settings.SUPER_DICT_DOWNLOADED);
            this.f7033a.f7000g.mo9671a(C1368X.m6320c().mo5841n().mo6248a((int) R.color.candidate_default, C2787cK.CANDIDATE_HIGHLIGHT), (float) this.f7033a.f6999f);
        }
        if (this.f7033a.f6994a.mo7374e()) {
            if (C1351J.m6188a().mo5641b() == 2) {
                b = C2052a.m9410a(this.f7033a.f6994a.mo7373d()).mo7412a();
            } else {
                b = this.f7033a.f6994a.mo7371b();
            }
            if (!C1351J.m6188a().mo5650i()) {
                Drawable drawable = (Drawable) C1351J.m6188a().mo5642b(this.f7033a.f6994a.mo7373d());
                this.f7033a.f7002i.getLocationInWindow(iArr);
                int min = Math.min((this.f7033a.f7002i.getHeight() - this.f7033a.f7002i.getPaddingTop()) - this.f7033a.f7002i.getPaddingBottom(), (this.f7033a.f7002i.getWidth() - this.f7033a.f7002i.getPaddingLeft()) - this.f7033a.f7002i.getPaddingRight());
                iArr[0] = (iArr[0] - ad.mo9254l()) + this.f7033a.f7002i.getPaddingLeft();
                iArr[1] = iArr[1] - this.f7033a.f7002i.getHeight();
                if (boolSetting) {
                    this.f7033a.f7000g.mo9672a(drawable, iArr[0], iArr[1], min, min);
                }
            } else if (boolSetting) {
                this.f7033a.f7000g.mo9675a(b, iArr[0], iArr[1], view.getWidth(), -1);
            }
        } else {
            b = this.f7033a.f6994a.mo7371b();
            if (boolSetting) {
                this.f7033a.f7000g.mo9675a(b, iArr[0], iArr[1], view.getWidth(), -1);
            }
        }
        ((TouchPalIME) Engine.getInstance().getIms()).commitText(b);
        if (this.f7033a.f6994a.mo7374e()) {
            C1351J.m6188a().mo5652l();
        }
        C2020i.m9332a().mo7376a(this.f7033a.f6994a);
        Context b2 = C1368X.m6313b();
        String stringSetting = Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_TAB);
        C2057g.m9420a(b2, stringSetting, Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_CATEGORY, 22, C1351J.m6188a().mo5645d(stringSetting), (Config) null), this.f7033a.f6994a.mo7373d());
    }
}
