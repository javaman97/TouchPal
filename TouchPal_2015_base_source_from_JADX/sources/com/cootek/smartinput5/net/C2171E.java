package com.cootek.smartinput5.net;

import android.location.Location;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2298s;

/* renamed from: com.cootek.smartinput5.net.E */
/* compiled from: IpLocation */
public class C2171E {

    /* renamed from: com.cootek.smartinput5.net.E$a */
    /* compiled from: IpLocation */
    public interface C2172a {
        /* renamed from: a */
        void mo7621a();

        /* renamed from: a */
        void mo7622a(String str, String str2, String str3);
    }

    /* renamed from: a */
    public void mo7620a(C2172a aVar) {
        m9752b((Location) null, aVar);
    }

    /* renamed from: a */
    public void mo7619a(Location location, C2172a aVar) {
        m9752b(location, aVar);
    }

    /* renamed from: a */
    public void mo7618a(Location location) {
        m9752b(location, (C2172a) null);
    }

    /* renamed from: b */
    private void m9752b(Location location, C2172a aVar) {
        C2298s sVar = new C2298s();
        if (location != null) {
            sVar.f10096b = true;
            sVar.f10097c = location.getLatitude();
            sVar.f10098d = location.getLongitude();
        } else {
            sVar.f10096b = false;
        }
        new C2373x(sVar).mo8060a((C2373x.C2376b) new C2173F(this, aVar));
    }
}
