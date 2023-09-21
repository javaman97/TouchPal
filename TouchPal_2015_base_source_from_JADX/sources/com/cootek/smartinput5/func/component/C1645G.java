package com.cootek.smartinput5.func.component;

import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1422ad;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.func.iab.C1730E;
import com.cootek.smartinput5.func.iab.C1746T;
import com.cootek.smartinput5.func.iab.C1754V;
import com.cootek.smartinput5.func.iab.C1778f;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2220ah;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2238A;
import com.cootek.smartinput5.net.cmd.C2245F;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2305z;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.cootek.smartinput5.func.component.G */
/* compiled from: GoodsStatusChecker */
public class C1645G extends C2220ah implements C2373x.C2376b {

    /* renamed from: a */
    private static final String f5327a = "GoodsStatusChecker";

    /* renamed from: f */
    private static final int f5328f = 1;

    /* renamed from: g */
    private static final int f5329g = 2;

    /* renamed from: h */
    private static final int f5330h = 3;

    /* renamed from: j */
    private static final int f5331j = 1;

    /* renamed from: k */
    private static final int f5332k = 2;

    /* renamed from: l */
    private static final int f5333l = 3;

    /* renamed from: m */
    private static Boolean f5334m = Boolean.FALSE;

    /* renamed from: o */
    private static final String f5335o = "goods_permission_config_file";

    /* renamed from: b */
    private ArrayList<C2373x> f5336b;

    /* renamed from: c */
    private ArrayList<C2245F.C2246a> f5337c;

    /* renamed from: d */
    private ArrayList<C2238A.C2239a> f5338d;

    /* renamed from: e */
    private int f5339e = 0;

    /* renamed from: i */
    private int f5340i = 0;

    /* renamed from: n */
    private int f5341n;

    public C1645G(C2220ah.C2221a aVar) {
        super(aVar);
        if (aVar == null) {
            this.f5341n = 1;
        } else {
            this.f5341n = 2;
        }
        m7509k();
    }

    /* renamed from: k */
    private void m7509k() {
        this.f5336b = new ArrayList<>();
        this.f5337c = new ArrayList<>();
        this.f5338d = new ArrayList<>();
    }

    /* renamed from: l */
    private void m7510l() {
        this.f5340i = 0;
        if (this.f5337c != null) {
            this.f5337c.clear();
        }
        if (this.f5338d != null) {
            this.f5338d.clear();
        }
        mo6454a(Boolean.TRUE);
        this.f5336b.clear();
        boolean booleanValue = C1132b.m5654a(C1368X.m6313b()).mo4392a(C1135d.PLUGIN_UN_PERMIT, (Boolean) true).booleanValue();
        C1368X.m6320c().mo5840m().mo6065b(booleanValue);
        if (booleanValue) {
            m7515q();
            m7516r();
        }
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        if (p instanceof C2245F) {
            m7503a((C2245F) p);
        } else if (p instanceof C2238A) {
            m7502a((C2238A) p);
        } else if (p instanceof C2305z) {
            m7504a((C2305z) p);
        }
        if (this.f5340i == 3) {
            m7511m();
        }
    }

    /* renamed from: m */
    private void m7511m() {
        m7512n();
        this.f5340i = 0;
        mo7752i();
        mo6454a(Boolean.FALSE);
    }

    /* renamed from: e */
    public void mo6457e() {
        if (this.f5336b != null && !this.f5336b.isEmpty()) {
            Iterator<C2373x> it = this.f5336b.iterator();
            while (it.hasNext()) {
                it.next().mo8061b();
            }
            this.f5336b.clear();
        }
        this.f5340i = 0;
        mo6538f();
        mo6454a(Boolean.FALSE);
    }

    /* renamed from: n */
    private void m7512n() {
        String str;
        ArrayList arrayList;
        C1617br a = C1617br.m7367a();
        Iterator<C2245F.C2246a> it = this.f5337c.iterator();
        ArrayList arrayList2 = null;
        while (it.hasNext()) {
            C2245F.C2246a next = it.next();
            if (!next.mo7807t()) {
                int a2 = next.mo7788a();
                C2238A.C2239a b = m7506b(next.mo7789b());
                if (b != null) {
                    str = b.f9473h;
                } else if (a == null || !a.mo6337d() || !C1368X.m6320c().mo5840m().mo6062a()) {
                    str = null;
                }
                C1422ad.C1428e a3 = mo6451a(a2, str);
                if (b != null) {
                    this.f5338d.remove(b);
                }
                C1422ad.C1424a aVar = new C1422ad.C1424a();
                aVar.f4587a = next.mo7792e();
                aVar.f4588b = a3;
                if (arrayList2 == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = arrayList2;
                }
                arrayList.add(aVar);
                arrayList2 = arrayList;
            }
        }
        C1368X.m6320c().mo5840m().mo6059a(this.f5337c, (ArrayList<C1422ad.C1424a>) arrayList2);
        C1368X.m6320c().mo5840m().mo6071g();
    }

    /* renamed from: b */
    private C2238A.C2239a m7506b(int i) {
        C2238A.C2239a aVar;
        if (this.f5338d == null) {
            return null;
        }
        Iterator<C2238A.C2239a> it = this.f5338d.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (i == aVar.f9472g) {
                break;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private void m7502a(C2238A a) {
        boolean z;
        ArrayList<C2238A.C2239a> j = a.mo7771j();
        if (j != null) {
            this.f5338d = j;
        }
        Iterator<C2238A.C2239a> it = this.f5338d.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().f9473h.equals("start_purchase")) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            m7514p();
        } else {
            this.f5340i |= 2;
        }
    }

    /* renamed from: a */
    private void m7503a(C2245F f) {
        this.f5340i |= 1;
        ArrayList<C2245F.C2246a> m = f.mo7787m();
        C1017y.m5228d(f5327a, "onQueryStoreInfoFinished: " + m);
        if (m != null) {
            this.f5337c = m;
        }
    }

    /* renamed from: o */
    private void m7513o() {
        this.f5339e = 0;
    }

    /* renamed from: c */
    private boolean m7507c(int i) {
        return this.f5339e == 3;
    }

    /* renamed from: a */
    private void m7504a(C2305z zVar) {
        boolean j = zVar.mo7908j();
        C1368X.m6320c().mo5840m().mo6065b(j);
        if (j) {
            m7515q();
            m7516r();
            return;
        }
        this.f5340i = 0;
        mo7752i();
        mo6454a(Boolean.FALSE);
    }

    /* renamed from: p */
    private void m7514p() {
        mo6453a((C1746T.C1750d) null, (C1746T.C1750d) null);
    }

    /* renamed from: a */
    public void mo6453a(C1746T.C1750d dVar, C1746T.C1750d dVar2) {
        m7513o();
        C1730E.m7962a(C1368X.m6313b());
        C1730E.m8005d().mo6685e();
        if (dVar == null) {
            dVar = new C1646H(this);
        }
        C1730E.m8005d().mo6679a(C1778f.f5818al, dVar);
        if (dVar2 == null) {
            dVar2 = new C1647I(this);
        }
        C1730E.m8005d().mo6679a(C1778f.f5819am, dVar2);
    }

    /* renamed from: q */
    private void m7515q() {
        C2245F f = new C2245F();
        f.f9573h = Boolean.TRUE;
        C2373x xVar = new C2373x(f);
        this.f5336b.add(xVar);
        xVar.mo8060a((C2373x.C2376b) this);
    }

    /* renamed from: r */
    private void m7516r() {
        C2373x xVar = new C2373x(new C2238A());
        this.f5336b.add(xVar);
        xVar.mo8060a((C2373x.C2376b) this);
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
    }

    /* renamed from: g */
    public boolean mo6458g() {
        return f5334m.booleanValue();
    }

    /* renamed from: a */
    public void mo6454a(Boolean bool) {
        f5334m = bool;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6450a() {
        return Settings.getInstance().getIntSetting(Settings.GOODS_CHECK_NEXT_TIME);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo6455b() {
        return 7.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6452a(int i) {
        Settings.getInstance().setIntSetting(Settings.GOODS_CHECK_NEXT_TIME, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6456c() {
        if (mo6458g()) {
            mo6538f();
        } else if (!mo6478a_() || C2188Q.m9853a().mo7686f()) {
            m7510l();
        } else {
            this.f5340i = 0;
            mo6538f();
            mo6454a(Boolean.FALSE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m7508d(int i) {
        this.f5339e |= i;
        if (m7507c(i)) {
            C1730E.m8005d().mo6686f();
            this.f5340i |= 2;
            if (this.f5340i == 3) {
                m7511m();
            }
        }
    }

    /* renamed from: a */
    public C1422ad.C1428e mo6451a(int i, String str) {
        C1422ad.C1428e eVar = C1422ad.C1428e.Normal;
        if (str == null) {
            return C1422ad.C1428e.ShouldPurchase;
        }
        if ("purchase_success".equals(str)) {
            return C1422ad.C1428e.Normal;
        }
        if ("start_purchase".equals(str)) {
            return m7505a(i, 0) ? C1422ad.C1428e.Normal : C1422ad.C1428e.ShouldPurchase;
        }
        if ("not_purchased".equals(str) || "refund_success".equals(str)) {
            return C1422ad.C1428e.ShouldPurchase;
        }
        if ("start_refund".equals(str)) {
            return m7505a(i, 2) ? C1422ad.C1428e.ShouldPurchase : C1422ad.C1428e.Normal;
        }
        if (C1422ad.f4563i.equals(str)) {
            return C1422ad.C1428e.Expired;
        }
        return eVar;
    }

    /* renamed from: a */
    private boolean m7505a(int i, int i2) {
        boolean z;
        if (!C1730E.m8004c()) {
            return false;
        }
        List<C1754V> b = C1730E.m8005d().mo6715b();
        if (b != null) {
            Iterator<C1754V> it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1754V next = it.next();
                C1730E.m8005d();
                Object a = C1730E.m7951a(next, "goods_id");
                if (a != null && ((Integer) a).intValue() == i && next.mo6728e() == i2) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return z;
    }
}
