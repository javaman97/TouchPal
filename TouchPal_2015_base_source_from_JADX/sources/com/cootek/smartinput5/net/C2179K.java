package com.cootek.smartinput5.net;

import android.location.Address;
import android.location.Location;
import com.cootek.smartinput5.net.C2366t;
import java.util.List;

/* renamed from: com.cootek.smartinput5.net.K */
/* compiled from: LBSManager */
class C2179K implements C2366t.C2368b {

    /* renamed from: a */
    final /* synthetic */ C2174G f9219a;

    C2179K(C2174G g) {
        this.f9219a = g;
    }

    /* renamed from: a */
    public void mo7640a(Location location, List<Address> list) {
        if (!list.isEmpty()) {
            Address a = this.f9219a.m9761a(list.get(0));
            if (this.f9219a.f9212U != null) {
                if (a != null) {
                    this.f9219a.f9212U.mo7634a(a);
                } else {
                    this.f9219a.f9212U.mo7633a();
                }
            }
        }
        if (location != null) {
            this.f9219a.f9205L.mo7618a(location);
        }
    }

    /* renamed from: a */
    public void mo7639a(Location location) {
        if (C2188Q.m9853a().mo7686f()) {
            this.f9219a.f9205L.mo7619a(location, this.f9219a.f9213b);
        } else if (this.f9219a.f9212U != null) {
            this.f9219a.f9212U.mo7633a();
        }
    }
}
