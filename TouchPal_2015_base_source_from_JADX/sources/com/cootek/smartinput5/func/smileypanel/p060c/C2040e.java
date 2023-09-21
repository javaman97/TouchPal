package com.cootek.smartinput5.func.smileypanel.p060c;

import android.view.View;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.smileypanel.C2057g;
import com.cootek.smartinput5.func.smileypanel.SmileyListView;

/* renamed from: com.cootek.smartinput5.func.smileypanel.c.e */
/* compiled from: EmojiArtItem */
class C2040e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2039d f7090a;

    C2040e(C2039d dVar) {
        this.f7090a = dVar;
    }

    public void onClick(View view) {
        if (Settings.getInstance().getBoolSetting(Settings.COMMIT_ANIMATION_ENABLED)) {
            this.f7090a.m9385f();
        } else {
            this.f7090a.mo7405e();
        }
        C2057g.m9420a(C1368X.m6313b(), SmileyListView.f6865d, Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_CATEGORY, 22, C1351J.m6188a().mo5645d(SmileyListView.f6865d), (Config) null), String.valueOf(this.f7090a.f7089n));
    }
}
