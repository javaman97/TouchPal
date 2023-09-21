package com.cootek.smartinput.utilities;

/* renamed from: com.cootek.smartinput.utilities.s */
/* compiled from: Pair */
public class C1011s<F, S> {

    /* renamed from: a */
    public final F f2650a;

    /* renamed from: b */
    public final S f2651b;

    public C1011s(F f, S s) {
        this.f2650a = f;
        this.f2651b = s;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1011s)) {
            return false;
        }
        C1011s sVar = (C1011s) obj;
        if (!this.f2650a.equals(sVar.f2650a) || !this.f2651b.equals(sVar.f2651b)) {
            return false;
        }
        return true;
    }
}
