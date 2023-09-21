package com.android.volley;

/* renamed from: com.android.volley.f */
/* compiled from: DefaultRetryPolicy */
public class C0823f implements C0880u {

    /* renamed from: a */
    public static final int f2165a = 2500;

    /* renamed from: b */
    public static final int f2166b = 1;

    /* renamed from: c */
    public static final float f2167c = 1.0f;

    /* renamed from: d */
    private int f2168d;

    /* renamed from: e */
    private int f2169e;

    /* renamed from: f */
    private final int f2170f;

    /* renamed from: g */
    private final float f2171g;

    public C0823f() {
        this(f2165a, 1, 1.0f);
    }

    public C0823f(int i, int i2, float f) {
        this.f2168d = i;
        this.f2170f = i2;
        this.f2171g = f;
    }

    /* renamed from: a */
    public int mo3039a() {
        return this.f2168d;
    }

    /* renamed from: b */
    public int mo3041b() {
        return this.f2169e;
    }

    /* renamed from: a */
    public void mo3040a(C0883x xVar) throws C0883x {
        this.f2169e++;
        this.f2168d = (int) (((float) this.f2168d) + (((float) this.f2168d) * this.f2171g));
        if (!mo3042c()) {
            throw xVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo3042c() {
        return this.f2169e <= this.f2170f;
    }
}
