package com.cootek.smartinput.utilities;

import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput.utilities.E */
/* compiled from: WorkerManager */
public class C0989E {

    /* renamed from: a */
    public static final boolean f2568a = true;

    /* renamed from: b */
    public static final String f2569b = "worker";

    /* renamed from: c */
    public static final int f2570c = 0;

    /* renamed from: d */
    public static final int f2571d = 1;

    /* renamed from: e */
    public static final int f2572e = 2;

    /* renamed from: f */
    public static final int f2573f = 3;

    /* renamed from: g */
    public static final int f2574g = 4;

    /* renamed from: h */
    private static C0989E f2575h;

    /* renamed from: i */
    private C0986C[] f2576i = new C0986C[2];

    /* renamed from: a */
    public static C0989E m5117a() {
        if (f2575h == null) {
            f2575h = new C0989E();
        }
        return f2575h;
    }

    private C0989E() {
        mo4045a(3, false);
        this.f2576i[0] = new C0986C(1);
        this.f2576i[1] = new C0986C(2);
    }

    /* renamed from: a */
    public void mo4046a(C0985B b) {
        C0986C b2 = m5118b(b.f2552b);
        if (b2 != null) {
            b2.mo4039a(b);
        }
    }

    /* renamed from: b */
    public void mo4048b(C0985B b) {
        C0986C b2 = m5118b(b.f2552b);
        if (b2 != null) {
            b2.mo4041b(b);
        }
    }

    /* renamed from: c */
    public void mo4049c(C0985B b) {
        C0986C b2 = m5118b(b.f2552b);
        if (b != null) {
            b.mo4032c();
        }
        if (b2 != null) {
            b2.mo4042c(b);
        }
    }

    /* renamed from: b */
    private C0986C m5118b(int i) {
        for (C0986C c : this.f2576i) {
            if (c.mo4038a() == i) {
                return c;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo4047a(int i) {
        return (Settings.getInstance().getIntSetting(Settings.UI_MULTITHREADING_OPTIMIZE) & (1 << i)) > 0;
    }

    /* renamed from: a */
    public void mo4045a(int i, boolean z) {
        int i2;
        int intSetting = Settings.getInstance().getIntSetting(Settings.UI_MULTITHREADING_OPTIMIZE);
        if (z) {
            i2 = intSetting | (1 << i);
        } else {
            i2 = intSetting & ((1 << i) ^ -1);
        }
        Settings.getInstance().setIntSetting(Settings.UI_MULTITHREADING_OPTIMIZE, i2);
    }
}
