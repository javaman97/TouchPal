package com.cootek.smartinput5.net;

import android.content.Context;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2249I;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.p046b.C1132b;

/* renamed from: com.cootek.smartinput5.net.g */
/* compiled from: ActiveStat */
public class C2309g implements C2373x.C2376b {

    /* renamed from: a */
    public static final int f10167a = 3;

    /* renamed from: b */
    private static C2309g f10168b = new C2309g();

    /* renamed from: c */
    private static final String f10169c = "ActiveStat";

    /* renamed from: d */
    private static final int f10170d = 86400;

    /* renamed from: e */
    private static boolean f10171e = false;

    /* renamed from: f */
    private static int f10172f = 0;

    private C2309g() {
    }

    /* renamed from: a */
    public static C2309g m10582a() {
        return f10168b;
    }

    /* renamed from: b */
    public static boolean m10585b() {
        return f10171e;
    }

    /* renamed from: a */
    public static void m10583a(boolean z) {
        f10171e = z;
    }

    /* renamed from: c */
    public boolean mo7910c() {
        if (C2188Q.m9853a().mo7686f() && ((double) (C2225al.m10050a() - Settings.getInstance().getIntSetting(Settings.LAST_ACTIVE_STAT_TIME))) >= 43200.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo7909a(Context context) {
        if (!m10585b()) {
            m10583a(true);
            new C2373x(m10584b(context)).mo8060a((C2373x.C2376b) this);
        }
    }

    /* renamed from: d */
    public int mo7911d() {
        return f10172f;
    }

    /* renamed from: e */
    public void mo7912e() {
        f10172f++;
    }

    /* renamed from: f */
    public void mo7913f() {
        f10172f = 0;
    }

    /* renamed from: b */
    private static C2249I m10584b(Context context) {
        C2249I i = new C2249I();
        i.f9615a = C2225al.m10065d(context);
        i.f9616b = C2225al.m10063c(context);
        i.f9617c = C1132b.m5654a(context).mo4414h();
        i.f9618d = C2225al.m10076j(context);
        i.f9619e = C2377y.m10894a(context).mo8068b();
        i.f9620f = C2377y.m10894a(context).mo8069c();
        i.f9621g = C2377y.m10894a(context).mo8070d();
        i.f9623i = Settings.getInstance().getStringSetting(Settings.REFERRER);
        i.f9622h = C2225al.m10079m(context);
        i.f9624j = C2225al.m10078l(context);
        return i;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        m10583a(false);
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        m10583a(false);
    }
}
