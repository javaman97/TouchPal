package com.cootek.smartinput5.p066ui.settings;

import android.view.View;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.cV */
/* compiled from: SkinDownloadActivity */
class C3127cV implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SkinDownloadActivity f14143a;

    C3127cV(SkinDownloadActivity skinDownloadActivity) {
        this.f14143a = skinDownloadActivity;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.skin_tab /*2131821026*/:
                if (this.f14143a.f13718l == 1) {
                    this.f14143a.m14051a(this.f14143a.f13716j, this.f14143a.m14057d());
                    this.f14143a.f13718l = 0;
                }
                this.f14143a.f13714h.setSelected(true);
                this.f14143a.f13715i.setSelected(false);
                return;
            case R.id.hotword_tab /*2131821027*/:
                if (this.f14143a.f13718l == 0) {
                    this.f14143a.m14051a(this.f14143a.f13716j, this.f14143a.m14055c());
                    this.f14143a.f13718l = 1;
                }
                this.f14143a.f13715i.setSelected(true);
                this.f14143a.f13714h.setSelected(false);
                return;
            default:
                return;
        }
    }
}
