package p018cn.sharesdk.framework.p020b;

import android.content.Context;
import com.cootek.p042a.p043a.C0911j;
import com.p023a.p024a.p032b.p037d.C0781a;
import java.util.ArrayList;
import java.util.HashMap;
import p018cn.sharesdk.framework.ShareSDK;
import p018cn.sharesdk.framework.p020b.p022b.C0642c;
import p018cn.sharesdk.framework.p020b.p022b.C0644e;
import p018cn.sharesdk.framework.p020b.p022b.C0647g;
import p018cn.sharesdk.framework.utils.C0663b;
import p018cn.sharesdk.framework.utils.C0665d;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.framework.b.b */
public class C0639b extends Thread {

    /* renamed from: a */
    private static C0639b f1529a;

    /* renamed from: b */
    private Context f1530b;

    /* renamed from: c */
    private C0663b f1531c;

    /* renamed from: d */
    private ArrayList<C0642c> f1532d = new ArrayList<>();

    /* renamed from: e */
    private String f1533e;

    /* renamed from: f */
    private boolean f1534f;

    /* renamed from: g */
    private long f1535g;

    /* renamed from: h */
    private boolean f1536h;

    private C0639b(Context context) {
        this.f1530b = context;
        this.f1531c = C0663b.m3793a(context);
    }

    /* renamed from: a */
    public static synchronized C0639b m3640a(Context context) {
        C0639b bVar;
        synchronized (C0639b.class) {
            if (f1529a == null) {
                if (context == null) {
                    bVar = null;
                } else {
                    f1529a = new C0639b(context.getApplicationContext());
                }
            }
            bVar = f1529a;
        }
        return bVar;
    }

    /* renamed from: b */
    private void m3641b(C0642c cVar) {
        cVar.f1548f = this.f1531c.mo2486o();
        cVar.f1549g = this.f1533e;
        cVar.f1550h = this.f1531c.mo2487p();
        cVar.f1551i = this.f1531c.mo2489r();
        cVar.f1552j = String.valueOf(ShareSDK.getSDKVersionCode() + C0781a.f1974b);
        cVar.f1553k = this.f1531c.mo2484m();
        cVar.f1554l = this.f1531c.mo2483l();
        if (!"cn.sharesdk.demo".equals(cVar.f1550h) && "api20".equals(this.f1533e)) {
            System.err.println("Your application is using the appkey of ShareSDK Demo, this will cause its data won't be count!");
        }
        cVar.f1555m = this.f1531c.mo2476e();
    }

    /* renamed from: b */
    private boolean m3642b() {
        C0663b a = C0663b.m3793a(this.f1530b);
        String u = a.mo2492u();
        String p = a.mo2487p();
        return p != null && p.equals(u);
    }

    /* renamed from: c */
    private void m3643c(C0642c cVar) {
        C0633a.m3595a(this.f1530b).mo2279a(cVar);
    }

    /* renamed from: a */
    public String mo2303a(String str, boolean z, int i, String str2) {
        if (!this.f1534f) {
            return str;
        }
        return C0633a.m3595a(this.f1530b).mo2277a(str, this.f1533e, i, z, str2);
    }

    /* renamed from: a */
    public synchronized void mo2304a() {
        if (this.f1534f) {
            long currentTimeMillis = System.currentTimeMillis() - this.f1535g;
            C0644e eVar = new C0644e();
            eVar.f1563a = currentTimeMillis;
            mo2305a((C0642c) eVar);
            this.f1534f = false;
            f1529a = null;
        }
    }

    /* renamed from: a */
    public void mo2305a(C0642c cVar) {
        synchronized (this.f1532d) {
            if (this.f1534f) {
                m3641b(cVar);
                if (cVar.mo2318a(this.f1530b)) {
                    this.f1532d.add(cVar);
                    cVar.mo2319b(this.f1530b);
                } else {
                    C0666e.m3834a("Drop event: " + cVar.toString(), new Object[0]);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2306a(String str) {
        this.f1533e = str;
    }

    /* renamed from: a */
    public synchronized void mo2307a(boolean z) {
        if (!this.f1534f) {
            C0633a.m3595a(this.f1530b).mo2280a(z);
            this.f1534f = true;
            super.start();
        }
    }

    /* renamed from: a */
    public boolean mo2308a(HashMap<String, Object> hashMap) {
        if (!this.f1534f) {
            System.err.println("Statistics module unopened");
            return false;
        }
        C0633a a = C0633a.m3595a(this.f1530b);
        try {
            String c = a.mo2282c(this.f1533e);
            HashMap<String, Object> a2 = new C0665d().mo2496a(c);
            if (a2.containsKey("error")) {
                System.err.println(c);
                return false;
            } else if (!a2.containsKey("res")) {
                System.err.println("SNS configuration is empty");
                return false;
            } else {
                String trim = a.mo2276a(this.f1533e, String.valueOf(a2.get("res")).replace(C0911j.f2473c, "")).trim();
                C0666e.m3837b("snsconf returns ===> %s", trim);
                hashMap.putAll(new C0665d().mo2496a(trim));
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public void run() {
        while (true) {
            if (this.f1534f || this.f1532d.size() > 0) {
                boolean b = m3642b();
                if (b) {
                    if (!this.f1536h) {
                        this.f1535g = System.currentTimeMillis();
                        mo2305a((C0642c) new C0647g());
                    }
                } else if (this.f1536h) {
                    C0644e eVar = new C0644e();
                    eVar.f1563a = System.currentTimeMillis() - this.f1535g;
                    mo2305a((C0642c) eVar);
                }
                this.f1536h = b;
                C0642c cVar = null;
                try {
                    synchronized (this.f1532d) {
                        if (this.f1532d.size() > 0) {
                            cVar = this.f1532d.remove(0);
                        }
                    }
                    if (cVar != null) {
                        m3643c(cVar);
                    }
                } catch (Throwable th) {
                    C0666e.m3835a(th);
                }
                try {
                    Thread.sleep(80);
                } catch (Throwable th2) {
                    C0666e.m3835a(th2);
                }
            } else {
                return;
            }
        }
    }
}
