package com.cootek.smartinput5;

import android.view.View;
import android.widget.ImageView;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.y */
/* compiled from: GuideFinishedActivity */
class C3284y implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ImageView f14408a;

    /* renamed from: b */
    final /* synthetic */ GuideFinishedActivity f14409b;

    C3284y(GuideFinishedActivity guideFinishedActivity, ImageView imageView) {
        this.f14409b = guideFinishedActivity;
        this.f14408a = imageView;
    }

    public void onClick(View view) {
        boolean z = !Settings.getInstance().getBoolSetting(Settings.USERDATA_COLLECT_ENABLE);
        this.f14408a.setSelected(z);
        Settings.getInstance().setBoolSetting(Settings.USERDATA_COLLECT_ENABLE, z);
    }
}
