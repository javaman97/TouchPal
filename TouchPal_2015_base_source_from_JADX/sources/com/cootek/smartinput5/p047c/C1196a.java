package com.cootek.smartinput5.p047c;

import com.cootek.smartinput5.func.C1411aV;

/* renamed from: com.cootek.smartinput5.c.a */
/* compiled from: IFuncPluginConfig */
public abstract class C1196a implements C1197b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo4461a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo4462b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo4463c();

    /* renamed from: a */
    public int mo4467a(String str) {
        return m5774b(str);
    }

    /* renamed from: d */
    public int mo4468d() {
        return mo4463c();
    }

    /* renamed from: b */
    private int m5774b(String str) {
        if (str.equals(C1411aV.f4490q)) {
            return mo4462b();
        }
        return mo4461a();
    }
}
