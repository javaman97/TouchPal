package com.cootek.smartinput5.func.smileypanel;

import android.view.View;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.func.smileypanel.i */
/* compiled from: SmileyListView */
class C2059i implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SmileyListView f8823a;

    C2059i(SmileyListView smileyListView) {
        this.f8823a = smileyListView;
    }

    public void onClick(View view) {
        Settings.getInstance().setBoolSetting(Settings.COLORFUL_EMOJI_BUTTON_SHOW, false);
        this.f8823a.mo7316d();
    }
}
