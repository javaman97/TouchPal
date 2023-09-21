package com.cootek.smartinput5;

import android.view.View;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.j */
/* compiled from: Guide */
class C2162j implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Guide f9162a;

    C2162j(Guide guide) {
        this.f9162a = guide;
    }

    public void onClick(View view) {
        boolean z;
        this.f9162a.m5304s();
        if (Settings.getInstance().getIntSetting(Settings.GUIDE_PLAY_STATE) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f9162a.m5262a(0, z);
        boolean unused = this.f9162a.f2755y = true;
    }
}
