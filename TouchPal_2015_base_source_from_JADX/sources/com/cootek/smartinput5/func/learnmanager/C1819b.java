package com.cootek.smartinput5.func.learnmanager;

import android.content.Context;
import android.os.Bundle;
import android.preference.Preference;
import com.cootek.smartinput5.func.learnmanager.C1813a;

/* renamed from: com.cootek.smartinput5.func.learnmanager.b */
/* compiled from: LearnProvider */
public abstract class C1819b {

    /* renamed from: a */
    public static int f6058a = 1;

    /* renamed from: b */
    public static int f6059b = 2;

    /* renamed from: c */
    public static int f6060c = 4;

    /* renamed from: d */
    public static int f6061d = 8;

    /* renamed from: e */
    public static int f6062e = 16;

    /* renamed from: f */
    public static int f6063f = 0;

    /* renamed from: g */
    public static int f6064g = 1;

    /* renamed from: h */
    public static int f6065h = 2;

    /* renamed from: i */
    public static int f6066i = 3;

    /* renamed from: j */
    protected boolean f6067j = false;

    /* renamed from: k */
    protected Context f6068k;

    /* renamed from: l */
    public Preference f6069l;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6846a(Context context, C1813a.C1816c cVar);

    /* renamed from: a */
    public abstract void mo6847a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo6848a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String[] mo6849a(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo6851c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo6852d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo6853e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo6854f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo6855g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract String mo6856h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo6857i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract int mo6858j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract int mo6859k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract int mo6860l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract Runnable mo6861m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract int mo6862n();

    public C1819b(Context context) {
        this.f6068k = context;
        this.f6067j = false;
    }

    /* renamed from: b */
    public boolean mo6850b() {
        return this.f6067j;
    }
}
