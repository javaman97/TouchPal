package com.cootek.smartinput5.net;

import android.content.Context;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2243D;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;

/* renamed from: com.cootek.smartinput5.net.am */
/* compiled from: VersionUpdater */
public class C2226am {

    /* renamed from: a */
    private static final int f9408a = 0;

    /* renamed from: b */
    private static final int f9409b = 30;

    /* renamed from: c */
    private Context f9410c;

    public C2226am(Context context) {
        this.f9410c = context;
    }

    /* renamed from: a */
    public void mo7754a() {
        C2243D d = new C2243D();
        d.f9517c = C1368X.m6320c().mo5832R();
        d.f9518d = String.valueOf(C1368X.m6319c(this.f9410c));
        d.f9519e = false;
        d.f9520f = true;
        new C2373x(d).mo8060a((C2373x.C2376b) new C2227an(this));
    }

    /* renamed from: a */
    private void m10086a(Context context) {
        if (Settings.getInstance().getBoolSetting(Settings.FIRST_VERSION_UPDATE)) {
            Settings.getInstance().setBoolSetting(Settings.FIRST_VERSION_UPDATE, false);
            if (m10090b(context) > 0) {
                Settings.getInstance().setIntSetting(Settings.LAST_NOTIFY_UPDATE, (m10089b() + m10090b(context)) - 30);
            }
        }
    }

    /* renamed from: b */
    private int m10090b(Context context) {
        return C1132b.m5654a(context).mo4397a(C1135d.FIRST_VERSION_UPDATE_INTERVAL, (Integer) 0).intValue();
    }

    /* renamed from: b */
    private int m10089b() {
        return (int) ((((System.currentTimeMillis() / 1000) / 60) / 60) / 24);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10088a(C2243D d) {
        try {
            int intValue = Integer.valueOf(d.f9521g).intValue();
            m10086a(this.f9410c);
            if (intValue > C1368X.m6319c(this.f9410c)) {
                int b = m10089b();
                if (b - Settings.getInstance().getIntSetting(Settings.LAST_NOTIFY_UPDATE) >= 30) {
                    Settings.getInstance().setIntSetting(Settings.LAST_NOTIFY_UPDATE, b);
                    C1368X.m6320c().mo5849v().mo6416a(C1368X.m6320c().mo5849v().mo6414a().mo6406b());
                    return;
                }
                return;
            }
            d.mo7785j();
        } catch (NumberFormatException e) {
        }
    }
}
