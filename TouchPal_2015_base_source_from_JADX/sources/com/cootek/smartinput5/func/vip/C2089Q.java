package com.cootek.smartinput5.func.vip;

import com.cootek.smartinput5.engine.Okinawa;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1626bx;
import com.cootek.smartinput5.func.p052b.C1549b;

/* renamed from: com.cootek.smartinput5.func.vip.Q */
/* compiled from: VipRenewData */
public class C2089Q {

    /* renamed from: a */
    final float f8944a = 0.001f;

    /* renamed from: a */
    public long mo7463a() {
        return C1368X.m6320c().mo5823I().mo6388f();
    }

    /* renamed from: b */
    public int mo7464b() {
        Okinawa h = C1368X.m6320c().mo5835h();
        return h.getUserWordCount(C1549b.f4831b) + h.getUserWordCount(C1549b.f4791a);
    }

    /* renamed from: c */
    public float mo7465c() {
        C1626bx I = C1368X.m6320c().mo5823I();
        if (I != null) {
            long f = I.mo6388f();
            long i = I.mo6391i();
            if (i != 0) {
                return ((float) f) / ((float) i);
            }
        }
        return 0.0f;
    }

    /* renamed from: d */
    public boolean mo7466d() {
        if (mo7463a() > 0 || mo7464b() > 0 || mo7465c() > 0.001f) {
            return true;
        }
        return false;
    }
}
