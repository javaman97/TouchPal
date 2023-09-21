package com.cootek.smartinput5.net;

import android.content.Context;
import android.location.Address;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2171E;
import com.emoji.keyboard.touchpal.R;
import java.util.Locale;

/* renamed from: com.cootek.smartinput5.net.I */
/* compiled from: LBSManager */
class C2177I implements C2171E.C2172a {

    /* renamed from: a */
    final /* synthetic */ C2174G f9217a;

    C2177I(C2174G g) {
        this.f9217a = g;
    }

    /* renamed from: a */
    public void mo7622a(String str, String str2, String str3) {
        if (C1368X.m6324d()) {
            Address address = new Address(Locale.CHINESE);
            address.setCountryCode(str);
            Context b = C1368X.m6313b();
            if (C1974m.m9063a(b, (int) R.string.LOCALITY_SIMPLE_GUANGDONG).equals(str2)) {
                str2 = C1974m.m9063a(b, (int) R.string.LOCALITY_GUANGDONG);
            }
            address.setAdminArea(str2);
            address.setLocality(str3);
            Address unused = this.f9217a.m9761a(address);
            if (this.f9217a.f9212U != null) {
                this.f9217a.f9212U.mo7634a(address);
            }
        }
    }

    /* renamed from: a */
    public void mo7621a() {
        if (this.f9217a.f9212U != null) {
            this.f9217a.f9212U.mo7633a();
        }
    }
}
