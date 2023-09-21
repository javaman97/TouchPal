package com.p023a.p024a.p032b.p033a;

import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.a.a.b.a.e */
/* compiled from: ImageSize */
public class C0757e {

    /* renamed from: a */
    private static final int f1864a = 9;

    /* renamed from: b */
    private static final String f1865b = "x";

    /* renamed from: c */
    private final int f1866c;

    /* renamed from: d */
    private final int f1867d;

    public C0757e(int i, int i2) {
        this.f1866c = i;
        this.f1867d = i2;
    }

    public C0757e(int i, int i2, int i3) {
        if (i3 % Settings.FIRST_TUTORIAL_WELCOME == 0) {
            this.f1866c = i;
            this.f1867d = i2;
            return;
        }
        this.f1866c = i2;
        this.f1867d = i;
    }

    /* renamed from: a */
    public int mo2820a() {
        return this.f1866c;
    }

    /* renamed from: b */
    public int mo2823b() {
        return this.f1867d;
    }

    /* renamed from: a */
    public C0757e mo2822a(int i) {
        return new C0757e(this.f1866c / i, this.f1867d / i);
    }

    /* renamed from: a */
    public C0757e mo2821a(float f) {
        return new C0757e((int) (((float) this.f1866c) * f), (int) (((float) this.f1867d) * f));
    }

    public String toString() {
        return new StringBuilder(9).append(this.f1866c).append(f1865b).append(this.f1867d).toString();
    }
}
