package com.cootek.smartinput5.func.component;

import android.content.Context;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.learnmanager.C1830k;
import com.cootek.smartinput5.func.vip.C2081O;
import com.cootek.smartinput5.net.C2180L;
import com.cootek.smartinput5.net.C2186O;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2191S;
import com.cootek.smartinput5.net.C2206X;
import com.cootek.smartinput5.net.C2220ah;
import com.cootek.smartinput5.net.C2222ai;
import com.cootek.smartinput5.net.C2313k;
import com.cootek.smartinput5.net.C2354m;
import com.cootek.smartinput5.net.C2360p;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.component.d */
/* compiled from: AutoUpdater */
public class C1669d implements C2220ah.C2221a {

    /* renamed from: a */
    private static final String f5448a = "AutoUpdater";

    /* renamed from: b */
    private static C1669d f5449b;

    /* renamed from: c */
    private static long f5450c;

    /* renamed from: d */
    private static boolean f5451d = true;

    /* renamed from: e */
    private ArrayList<C1658S> f5452e = new ArrayList<>();

    /* renamed from: a */
    public static void m7669a() {
        if (!Engine.isInitialized() || !Engine.getInstance().getIms().isInputViewShown()) {
            m7671c();
        } else {
            f5451d = true;
        }
    }

    /* renamed from: b */
    public static void m7670b() {
        if (f5451d) {
            m7671c();
        }
    }

    /* renamed from: c */
    private static void m7671c() {
        long currentTimeMillis = ((System.currentTimeMillis() / 1000) / 60) / 30;
        if (f5449b == null || currentTimeMillis > f5450c) {
            f5450c = currentTimeMillis;
            f5449b = new C1669d();
            f5449b.m7672d();
        }
        f5451d = false;
    }

    private C1669d() {
    }

    /* renamed from: d */
    private void m7672d() {
        boolean f = C2188Q.m9853a().mo7686f();
        m7673e();
        Iterator it = new ArrayList(this.f5452e).iterator();
        while (it.hasNext()) {
            C1658S s = (C1658S) it.next();
            if (f || !s.mo6478a_()) {
                s.mo6479h();
            }
        }
    }

    /* renamed from: e */
    private void m7673e() {
        if (C1368X.m6324d()) {
            Context b = C1368X.m6313b();
            if (C1132b.m5654a(b).mo4392a(C1135d.PERF_DATA_CHECKER, (Boolean) true).booleanValue()) {
                this.f5452e.add(new C2206X(this));
            }
            if (C1132b.m5654a(b).mo4392a(C1135d.DOMAIN_LOOKUP_CHECKER, (Boolean) true).booleanValue()) {
                this.f5452e.add(new C2360p(this));
            }
            if (C1132b.m5654a(b).mo4392a(C1135d.NETWORK_DATA_CHECKER, (Boolean) true).booleanValue()) {
                this.f5452e.add(new C2186O(this));
            }
            if (C1132b.m5654a(b).mo4392a(C1135d.LOCALIZE_WEBSITE_CHECKER, (Boolean) true).booleanValue()) {
                this.f5452e.add(new C2180L(this));
            }
            if (C1132b.m5654a(b).mo4392a(C1135d.BACKGROUND_NETWORK_CHECKER, (Boolean) true).booleanValue()) {
                this.f5452e.add(new C2354m(this));
            }
            if (C1132b.m5654a(b).mo4392a(C1135d.AUTO_REBUILD_CHECKER, (Boolean) true).booleanValue()) {
                this.f5452e.add(new C1668c(this));
            }
            if (C1132b.m5654a(b).mo4392a(C1135d.NEW_LOG_CHECKER, Boolean.valueOf(C1593bR.m7162a().f5076b)).booleanValue()) {
                this.f5452e.add(new C2191S(this));
            }
            if (C1132b.m5654a(b).mo4392a(C1135d.UPLOAD_INFO_CHECKER, Boolean.valueOf(C1593bR.m7162a().f5076b)).booleanValue()) {
                this.f5452e.add(new C2222ai(this));
            }
            this.f5452e.add(new C1688u(this));
            this.f5452e.add(new C1830k(this));
            this.f5452e.add(new C1666a(this));
            this.f5452e.add(new C2081O(this));
            if (C1593bR.m7162a().f5075a) {
                this.f5452e.add(new C1645G(this));
            }
            C1671f a = C1684q.m7769a().mo6553b(C1368X.m6313b(), 1).mo6487a();
            a.mo7750a((C2220ah.C2221a) this);
            this.f5452e.add(a);
            this.f5452e.add(new C2313k(this));
        }
    }

    /* renamed from: a */
    public void mo6522a(C2220ah ahVar) {
        if (this.f5452e.contains(ahVar)) {
            this.f5452e.remove(ahVar);
        }
        if (this.f5452e.isEmpty()) {
            f5449b = null;
        }
    }
}
