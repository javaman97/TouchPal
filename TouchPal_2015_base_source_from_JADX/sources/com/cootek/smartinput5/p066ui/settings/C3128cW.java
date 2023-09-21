package com.cootek.smartinput5.p066ui.settings;

/* renamed from: com.cootek.smartinput5.ui.settings.cW */
/* compiled from: SkinDownloadActivity */
class C3128cW implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f14144a;

    /* renamed from: b */
    final /* synthetic */ String f14145b;

    /* renamed from: c */
    final /* synthetic */ SkinDownloadActivity f14146c;

    C3128cW(SkinDownloadActivity skinDownloadActivity, int i, String str) {
        this.f14146c = skinDownloadActivity;
        this.f14144a = i;
        this.f14145b = str;
    }

    public void run() {
        this.f14146c.f13720n.mo9959a(this.f14144a);
        this.f14146c.f13720n.setTitle(this.f14145b);
    }
}
