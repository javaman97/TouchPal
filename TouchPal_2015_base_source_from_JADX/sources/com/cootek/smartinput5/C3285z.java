package com.cootek.smartinput5;

import android.content.Context;
import android.os.Handler;

/* renamed from: com.cootek.smartinput5.z */
/* compiled from: GuideIMEActivedMonitor */
public class C3285z {

    /* renamed from: a */
    private final int f14410a = 1;

    /* renamed from: b */
    private final long f14411b = 300;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f14412c;

    /* renamed from: d */
    private Handler f14413d = new C1019A(this);

    public C3285z(Context context) {
        this.f14412c = context;
    }

    /* renamed from: a */
    public void mo10485a() {
        this.f14413d.sendEmptyMessageDelayed(1, 300);
    }

    /* renamed from: b */
    public void mo10486b() {
        this.f14413d.removeCallbacksAndMessages((Object) null);
        this.f14413d.removeMessages(1);
    }

    /* renamed from: c */
    public void mo10487c() {
        this.f14413d.removeMessages(1);
    }
}
