package com.cootek.smartinput5.func.nativeads;

import android.content.pm.PackageManager;
import android.os.Build;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.nativeads.C1876b;
import com.facebook.ads.C3330F;
import com.facebook.ads.C3509x;

/* renamed from: com.cootek.smartinput5.func.nativeads.i */
/* compiled from: FacebookAdsLoader */
public class C1884i extends C1876b {

    /* renamed from: b */
    public static final String f6269b = "606141872785367_855749987824553";

    /* renamed from: c */
    private C3330F f6270c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1876b.C1877a f6271d;

    public C1884i(C1902y yVar) {
        super(yVar);
    }

    /* renamed from: a */
    public void mo7002a() {
        this.f6270c = new C3330F(C1368X.m6313b(), f6269b, this.f6259a.f6438d);
        this.f6270c.mo10544a((C3330F.C3331a) new C1885j(this));
        try {
            this.f6270c.mo10543a();
        } catch (Exception e) {
            if (this.f6271d != null) {
                this.f6271d.mo7009b();
            }
        }
    }

    /* renamed from: b */
    public C1875a mo7005b() {
        C3509x c;
        if (this.f6270c == null || !this.f6270c.mo10548d() || (c = this.f6270c.mo10547c()) == null || !c.mo10865c()) {
            return null;
        }
        C1886k kVar = new C1886k(c);
        kVar.f6257e = this.f6259a;
        return kVar;
    }

    /* renamed from: a */
    public void mo7003a(C1876b.C1877a aVar) {
        this.f6271d = aVar;
    }

    /* renamed from: c */
    public void mo7007c() {
        this.f6270c = null;
    }

    /* renamed from: a */
    public void mo7004a(String str) {
    }

    /* renamed from: d */
    public static boolean m8660d() {
        if (Build.VERSION.SDK_INT < 9) {
            return false;
        }
        try {
            if (C1368X.m6313b().getPackageManager().getPackageInfo("com.facebook.katana", 0) != null) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
