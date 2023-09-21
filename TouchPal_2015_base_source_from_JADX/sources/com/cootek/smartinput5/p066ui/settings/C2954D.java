package com.cootek.smartinput5.p066ui.settings;

import com.baidu.pcs.BaiduPCSStatusListener;

/* renamed from: com.cootek.smartinput5.ui.settings.D */
/* compiled from: BaiduAuthActivity */
class C2954D extends BaiduPCSStatusListener {

    /* renamed from: a */
    final /* synthetic */ String f13425a;

    /* renamed from: b */
    final /* synthetic */ BaiduAuthActivity f13426b;

    C2954D(BaiduAuthActivity baiduAuthActivity, String str) {
        this.f13426b = baiduAuthActivity;
        this.f13425a = str;
    }

    public void onProgress(long j, long j2) {
        this.f13426b.f13389n.post(new C2955E(this, j, j2));
    }

    public long progressInterval() {
        return 300;
    }
}
