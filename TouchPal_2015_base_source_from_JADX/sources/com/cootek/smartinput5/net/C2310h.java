package com.cootek.smartinput5.net;

import android.content.Context;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2243D;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.net.h */
/* compiled from: AdvertiseUpdater */
public class C2310h {

    /* renamed from: a */
    private static final int f10173a = 8192;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f10174b;

    public C2310h(Context context) {
        this.f10174b = context;
    }

    /* renamed from: a */
    public void mo7914a() {
        m10596b();
    }

    /* renamed from: b */
    private void m10596b() {
        String b = C1368X.m6320c().mo5853z().mo6628b();
        C2243D d = new C2243D();
        d.f9517c = C1974m.m9063a(this.f10174b, (int) R.string.app_id_advertise);
        d.f9518d = b;
        d.f9519e = true;
        d.f9520f = true;
        new C2373x(d).mo8060a((C2373x.C2376b) new C2311i(this, b));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10595a(String str, String str2) {
        new C2312j(this, str).execute(new Object[0]);
    }
}
