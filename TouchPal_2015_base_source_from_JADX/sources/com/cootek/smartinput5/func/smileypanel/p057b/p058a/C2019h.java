package com.cootek.smartinput5.func.smileypanel.p057b.p058a;

import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.smileypanel.C2051e;
import com.cootek.smartinput5.func.smileypanel.p062e.C2052a;
import com.cootek.smartinput5.func.smileypanel.p062e.C2053b;

/* renamed from: com.cootek.smartinput5.func.smileypanel.b.a.h */
/* compiled from: RecentItem */
public class C2019h implements C2051e {

    /* renamed from: a */
    private String f7023a;

    /* renamed from: b */
    private long f7024b = 0;

    public C2019h(String str) {
        this.f7023a = str;
    }

    /* renamed from: a */
    public void mo7370a(long j) {
        this.f7024b = j;
    }

    /* renamed from: f */
    public long mo7375f() {
        return this.f7024b;
    }

    /* renamed from: a */
    public int mo7369a() {
        return 1;
    }

    /* renamed from: b */
    public String mo7371b() {
        if (C1351J.m6188a().mo5641b() == 2) {
            return C2052a.m9410a(this.f7023a).mo7412a();
        }
        return C2053b.m9412a(this.f7023a).mo7412a();
    }

    /* renamed from: c */
    public String mo7372c() {
        return C2053b.m9412a(this.f7023a).mo7412a();
    }

    /* renamed from: d */
    public String mo7373d() {
        return this.f7023a;
    }

    /* renamed from: e */
    public boolean mo7374e() {
        return true;
    }
}
