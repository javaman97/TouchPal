package com.cootek.smartinput5.func.smileypanel;

import android.content.ActivityNotFoundException;
import android.view.View;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1584bI;

/* renamed from: com.cootek.smartinput5.func.smileypanel.j */
/* compiled from: SmileyListView */
class C2060j implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SmileyListView f8824a;

    C2060j(SmileyListView smileyListView) {
        this.f8824a = smileyListView;
    }

    public void onClick(View view) {
        Settings.getInstance().setBoolSetting(Settings.COLORFUL_EMOJI_BUTTON_SHOW, false);
        Settings.getInstance().setBoolSetting(Settings.DISPLAY_EMOJI_BY_SYSTEM, false);
        if (this.f8824a.m9209f()) {
            try {
                C1584bI.m7134a(this.f8824a.f6902u, C1351J.f4164i, true, C1351J.f4163h);
            } catch (ActivityNotFoundException e) {
                this.f8824a.mo7315c();
            }
        } else {
            this.f8824a.mo7315c();
        }
    }
}
