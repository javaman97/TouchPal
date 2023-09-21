package com.cootek.smartinput5.func.nativeads;

import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.nativeads.C1876b;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.func.nativeads.e */
/* compiled from: DrawerAdsSource */
public class C1880e extends C1878c {

    /* renamed from: a */
    private C1875a f6261a;

    /* renamed from: b */
    private C1902y f6262b;

    /* renamed from: c */
    private C1884i f6263c = new C1884i(this.f6262b);

    /* renamed from: d */
    private C1894r f6264d = new C1894r(this.f6262b);

    /* renamed from: e */
    private C1879d f6265e = new C1879d(this.f6262b);

    public C1880e(C1902y yVar) {
        this.f6262b = yVar;
        this.f6264d.mo7003a((C1876b.C1877a) new C1881f(this));
        this.f6263c.mo7003a((C1876b.C1877a) new C1882g(this));
        this.f6265e.mo7003a((C1876b.C1877a) new C1883h(this));
    }

    /* renamed from: a */
    public void mo7010a() {
        this.f6261a = m8648d();
    }

    /* renamed from: b */
    public C1875a mo7012b() {
        return this.f6261a;
    }

    /* renamed from: d */
    private C1875a m8648d() {
        C1875a b = this.f6263c.mo7005b();
        if (b == null) {
            b = this.f6264d.mo7005b();
            if (b != null) {
                C1246d.m6010a(C1368X.m6313b()).mo4591a(C1246d.f3917dk, C1246d.f3918dl, C1246d.f3908db);
            }
        } else {
            C1246d.m6010a(C1368X.m6313b()).mo4591a(C1246d.f3917dk, C1246d.f3920dn, C1246d.f3908db);
        }
        if (b == null && (b = this.f6265e.mo7005b()) != null) {
            C1246d.m6010a(C1368X.m6313b()).mo4591a(C1246d.f3917dk, C1246d.f3919dm, C1246d.f3908db);
        }
        if (b == null) {
            C1246d.m6010a(C1368X.m6313b()).mo4591a(C1246d.f3917dk, C1246d.f3921do, C1246d.f3908db);
        }
        return b;
    }

    /* renamed from: c */
    public void mo7013c() {
        if (this.f6262b.mo7047a()) {
            Settings.getInstance().setLongSetting(Settings.ADVERTISE_UPDATE_TIME, System.currentTimeMillis(), 33, this.f6262b.f6436b, (Config) null, false);
            this.f6263c.mo7007c();
            this.f6264d.mo7007c();
            if (C1884i.m8660d()) {
                this.f6263c.mo7002a();
                C1246d.m6010a(C1368X.m6313b()).mo4594a(C1246d.f3916dj, true, C1246d.f3908db);
            } else {
                this.f6264d.mo7002a();
                C1246d.m6010a(C1368X.m6313b()).mo4594a(C1246d.f3916dj, false, C1246d.f3908db);
            }
        }
        if (this.f6262b.mo7048b()) {
            this.f6265e.mo7002a();
        }
    }

    /* renamed from: a */
    public void mo7011a(String str) {
        this.f6263c.mo7004a(str);
        this.f6264d.mo7004a(str);
        this.f6265e.mo7004a(str);
    }
}
