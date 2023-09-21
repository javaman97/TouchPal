package com.cootek.smartinput5.p066ui.settings;

import com.baidu.pcs.BaiduPCSStatusListener;

/* renamed from: com.cootek.smartinput5.ui.settings.t */
/* compiled from: BaiduAuthActivity */
class C3245t extends BaiduPCSStatusListener {

    /* renamed from: a */
    final /* synthetic */ String f14314a;

    /* renamed from: b */
    final /* synthetic */ BaiduAuthActivity f14315b;

    C3245t(BaiduAuthActivity baiduAuthActivity, String str) {
        this.f14315b = baiduAuthActivity;
        this.f14314a = str;
    }

    public void onProgress(long j, long j2) {
        this.f14315b.f13389n.post(new C3246u(this, j, j2));
    }

    public long progressInterval() {
        return 300;
    }
}
