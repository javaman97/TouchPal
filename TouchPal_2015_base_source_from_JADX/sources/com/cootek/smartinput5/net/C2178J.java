package com.cootek.smartinput5.net;

import android.location.Location;
import com.cootek.smartinput5.net.C2366t;

/* renamed from: com.cootek.smartinput5.net.J */
/* compiled from: LBSManager */
class C2178J implements C2366t.C2369c {

    /* renamed from: a */
    final /* synthetic */ C2174G f9218a;

    C2178J(C2174G g) {
        this.f9218a = g;
    }

    /* renamed from: c */
    public void mo7638c(Location location) {
    }

    /* renamed from: a */
    public void mo7636a(Location location) {
    }

    /* renamed from: b */
    public void mo7637b(Location location) {
        if (location == null || System.currentTimeMillis() - location.getTime() > 3600000) {
            this.f9218a.f9205L.mo7620a(this.f9218a.f9213b);
            return;
        }
        this.f9218a.f9204K.mo8041b(this.f9218a.f9214c);
        this.f9218a.f9204K.mo8033a(location, 1, this.f9218a.f9215d);
    }
}
