package com.cootek.smartinput5;

import android.widget.Toast;
import com.cootek.smartinput5.net.C2212ab;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.F */
/* compiled from: GuideIntroM */
class C1024F implements C2212ab.C2213a {

    /* renamed from: a */
    final /* synthetic */ GuideIntroM f2706a;

    C1024F(GuideIntroM guideIntroM) {
        this.f2706a = guideIntroM;
    }

    /* renamed from: a */
    public void mo4115a() {
        this.f2706a.m5379o();
    }

    /* renamed from: a */
    public void mo4116a(int i, int i2, int i3) {
    }

    /* renamed from: b */
    public void mo4117b() {
        this.f2706a.m5381p();
        this.f2706a.m5372k();
    }

    /* renamed from: c */
    public void mo4118c() {
        this.f2706a.m5381p();
        this.f2706a.m5377n();
        Toast.makeText(this.f2706a.f2782c, this.f2706a.getResString(R.string.download_faield), 0).show();
    }

    /* renamed from: d */
    public void mo4119d() {
        this.f2706a.m5381p();
        this.f2706a.m5377n();
    }
}
