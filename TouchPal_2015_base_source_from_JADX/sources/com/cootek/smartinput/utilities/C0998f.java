package com.cootek.smartinput.utilities;

/* renamed from: com.cootek.smartinput.utilities.f */
/* compiled from: GCUtils */
public class C0998f {

    /* renamed from: a */
    public static final int f2628a = 2;

    /* renamed from: b */
    public static final int f2629b = 5;

    /* renamed from: c */
    private static final String f2630c = "GCUtils";

    /* renamed from: d */
    private static final long f2631d = 1000;

    /* renamed from: e */
    private static C0998f f2632e = new C0998f();

    /* renamed from: f */
    private int f2633f = 0;

    /* renamed from: a */
    public static C0998f m5196a() {
        return f2632e;
    }

    /* renamed from: b */
    public void mo4085b() {
        this.f2633f = 0;
    }

    /* renamed from: c */
    public boolean mo4086c() {
        if (this.f2633f == 0) {
            System.gc();
        }
        int i = this.f2633f + 1;
        this.f2633f = i;
        if (i > 2) {
            return false;
        }
        try {
            Thread.sleep(1000);
            return true;
        } catch (InterruptedException e) {
            return false;
        }
    }
}
