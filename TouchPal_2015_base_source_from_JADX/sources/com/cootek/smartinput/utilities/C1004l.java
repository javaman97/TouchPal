package com.cootek.smartinput.utilities;

import java.util.HashMap;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.PlatformActionListener;

/* renamed from: com.cootek.smartinput.utilities.l */
/* compiled from: LogViewActivity */
class C1004l implements PlatformActionListener {

    /* renamed from: a */
    final /* synthetic */ LogViewActivity f2638a;

    C1004l(LogViewActivity logViewActivity) {
        this.f2638a = logViewActivity;
    }

    public void onCancel(Platform platform, int i) {
        this.f2638a.f2599j.post(new C1005m(this, platform.getName(), i));
    }

    public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
        this.f2638a.f2599j.post(new C1006n(this, platform.getName()));
    }

    public void onError(Platform platform, int i, Throwable th) {
        this.f2638a.f2599j.post(new C1007o(this, platform.getName(), i));
        th.printStackTrace();
    }
}
