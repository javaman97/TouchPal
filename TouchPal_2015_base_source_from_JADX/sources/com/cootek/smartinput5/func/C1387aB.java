package com.cootek.smartinput5.func;

import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.func.aB */
/* compiled from: KeySpeedStatistic */
public class C1387aB {

    /* renamed from: a */
    public static final boolean f4346a = false;

    /* renamed from: b */
    private static final int f4347b = 2000;

    /* renamed from: c */
    private static C1387aB f4348c = null;

    /* renamed from: i */
    private static final String f4349i = "KeySpeedStatistic";

    /* renamed from: d */
    private long f4350d;

    /* renamed from: e */
    private long f4351e;

    /* renamed from: f */
    private long f4352f;

    /* renamed from: g */
    private long f4353g;

    /* renamed from: h */
    private long f4354h;

    /* renamed from: a */
    public static C1387aB m6416a() {
        if (f4348c == null) {
            f4348c = new C1387aB();
            f4348c.m6417c();
        }
        return f4348c;
    }

    /* renamed from: c */
    private void m6417c() {
        this.f4350d = Long.parseLong(Settings.getInstance().getStringSetting(Settings.KEY_SPEED_TOTAL_TIME));
        this.f4351e = Long.parseLong(Settings.getInstance().getStringSetting(Settings.KEY_SPEED_TOTAL_KEY_TIMES));
        m6418d();
    }

    /* renamed from: d */
    private void m6418d() {
        this.f4354h = 0;
        this.f4352f = 0;
        this.f4353g = 0;
    }

    /* renamed from: a */
    public void mo5907a(long j) {
        if (this.f4352f == 0) {
            this.f4353g = j;
            this.f4352f = j;
        } else if (j - this.f4353g > 2000) {
            mo5908b();
            return;
        } else {
            this.f4353g = j;
        }
        this.f4354h++;
    }

    /* renamed from: b */
    public void mo5908b() {
        if (this.f4354h > 1) {
            this.f4350d = (this.f4350d + this.f4353g) - this.f4352f;
            this.f4351e = (this.f4351e + this.f4354h) - 1;
            Settings.getInstance().setStringSetting(Settings.KEY_SPEED_TOTAL_TIME, "" + this.f4350d);
            Settings.getInstance().setStringSetting(Settings.KEY_SPEED_TOTAL_KEY_TIMES, "" + this.f4351e);
        }
        f4348c.m6418d();
    }
}
