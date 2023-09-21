package com.cootek.smartinput5;

import android.view.View;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1584bI;

/* renamed from: com.cootek.smartinput5.M */
/* compiled from: GuideIntroM */
class C1034M implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ GuideIntroM f2850a;

    C1034M(GuideIntroM guideIntroM) {
        this.f2850a = guideIntroM;
    }

    public void onClick(View view) {
        if (this.f2850a.f2794p == null) {
            return;
        }
        if (!this.f2850a.f2794p.isChecked()) {
            Settings.getInstance().setBoolSetting(Settings.SHOW_SUPER_DICT_DOWNLOAD_REMINDER, false);
        } else if (C1584bI.m7141a(this.f2850a.f2782c, (Runnable) null, false)) {
            this.f2850a.f2794p.setChecked(false);
        }
    }
}
