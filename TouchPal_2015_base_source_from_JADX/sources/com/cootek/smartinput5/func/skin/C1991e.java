package com.cootek.smartinput5.func.skin;

import android.app.ProgressDialog;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.skin.e */
/* compiled from: SponsorThemeActivity */
class C1991e extends Handler {

    /* renamed from: a */
    final /* synthetic */ SponsorThemeActivity f6835a;

    C1991e(SponsorThemeActivity sponsorThemeActivity) {
        this.f6835a = sponsorThemeActivity;
    }

    public void handleMessage(Message message) {
        if (C1368X.m6324d()) {
            Bundle data = message.getData();
            switch (message.what) {
                case 2:
                    if (this.f6835a.f6819h.equalsIgnoreCase(data.getString(IPCManager.SKIN_REMOVED_PACKAGE_NAME))) {
                        this.f6835a.finish();
                        return;
                    }
                    return;
                case 3:
                    if (data.getInt(IPCManager.SETTING_KEY, -1) == 80) {
                        boolean unused = this.f6835a.f6822k = this.f6835a.f6819h.equalsIgnoreCase(data.getString(IPCManager.SETTING_VALUE));
                        this.f6835a.m9157g();
                        return;
                    }
                    return;
                case 257:
                    this.f6835a.f6825n.setVisibility(0);
                    AnimationDrawable animationDrawable = (AnimationDrawable) this.f6835a.getResources().getDrawable(R.drawable.cat_progress);
                    this.f6835a.f6825n.setImageDrawable(animationDrawable);
                    animationDrawable.start();
                    return;
                case 258:
                    this.f6835a.f6825n.setVisibility(8);
                    return;
                case 259:
                    this.f6835a.f6824m.loadUrl("about:blank");
                    return;
                case 260:
                    if (this.f6835a.f6826o == null) {
                        ProgressDialog unused2 = this.f6835a.f6826o = new ProgressDialog(this.f6835a);
                        this.f6835a.f6826o.setOnDismissListener(new C1992f(this));
                    }
                    this.f6835a.f6826o.show();
                    return;
                case Settings.USER_DIC_BASE_VERSION:
                    if (this.f6835a.f6826o != null && this.f6835a.f6826o.isShowing()) {
                        this.f6835a.f6826o.dismiss();
                    }
                    this.f6835a.m9159h();
                    return;
                default:
                    return;
            }
        }
    }
}
