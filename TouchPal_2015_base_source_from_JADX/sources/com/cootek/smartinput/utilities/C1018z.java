package com.cootek.smartinput.utilities;

/* renamed from: com.cootek.smartinput.utilities.z */
/* compiled from: ThresholdObjectCachePool */
public class C1018z<T> implements C1000h<T> {

    /* renamed from: a */
    C1001i<T> f2698a;

    /* renamed from: b */
    private Object[] f2699b;

    /* renamed from: c */
    private int f2700c;

    public C1018z(C1001i<T> iVar, int i) {
        this.f2698a = iVar;
        this.f2699b = new Object[i];
        mo4088a();
    }

    /* renamed from: a */
    public T mo4087a(Object... objArr) {
        if (this.f2700c >= this.f2699b.length) {
            return this.f2698a.createInstance(objArr);
        }
        if (this.f2699b[this.f2700c] == null) {
            this.f2699b[this.f2700c] = this.f2698a.createInstance(objArr);
        }
        T[] tArr = this.f2699b;
        int i = this.f2700c;
        this.f2700c = i + 1;
        return tArr[i];
    }

    /* renamed from: a */
    public void mo4088a() {
        this.f2700c = 0;
    }
}
