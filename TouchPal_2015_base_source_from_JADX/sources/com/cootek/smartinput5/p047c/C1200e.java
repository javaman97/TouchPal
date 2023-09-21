package com.cootek.smartinput5.p047c;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1411aV;

/* renamed from: com.cootek.smartinput5.c.e */
/* compiled from: ISwitcherPluginConfig */
public abstract class C1200e implements C1197b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo4476a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo4477b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo4478c();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo4479e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo4480f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo4481g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo4482h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo4483i();

    /* renamed from: a */
    public int mo4467a(String str) {
        if (mo4484j()) {
            return m5797b(str);
        }
        return m5798c(str);
    }

    /* renamed from: d */
    public int mo4468d() {
        if (mo4484j()) {
            return m5799l();
        }
        return mo4482h();
    }

    /* renamed from: l */
    private int m5799l() {
        if (mo4485k()) {
            return mo4483i();
        }
        return mo4482h();
    }

    /* renamed from: b */
    private int m5797b(String str) {
        if (str.equals(C1411aV.f4490q)) {
            if (mo4485k()) {
                return mo4478c();
            }
            return mo4479e();
        } else if (mo4485k()) {
            return mo4476a();
        } else {
            return mo4477b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo4484j() {
        return mo4480f().equals(C1411aV.f4488o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo4485k() {
        return Settings.getInstance().getBoolSetting(mo4481g());
    }

    /* renamed from: c */
    private int m5798c(String str) {
        if (str.equals(C1411aV.f4490q)) {
            return mo4479e();
        }
        return mo4477b();
    }
}
