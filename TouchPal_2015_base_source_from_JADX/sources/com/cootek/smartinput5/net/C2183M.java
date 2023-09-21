package com.cootek.smartinput5.net;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.cootek.smartinput.utilities.C1011s;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2197U;
import com.cootek.smartinput5.net.C2364s;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.HandWriteMask;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.cootek.smartinput5.net.M */
/* compiled from: MultiPackDownloader */
public abstract class C2183M {

    /* renamed from: a */
    public static final int f9221a = -1;

    /* renamed from: b */
    public static final int f9222b = 0;

    /* renamed from: c */
    public static final int f9223c = 1;

    /* renamed from: d */
    public static final int f9224d = 2;

    /* renamed from: e */
    public static final int f9225e = 3;

    /* renamed from: f */
    protected static final String f9226f = "MultiDownloader";

    /* renamed from: o */
    private static int f9227o = 0;

    /* renamed from: p */
    private static final int f9228p = 4;

    /* renamed from: w */
    private static boolean f9229w = false;

    /* renamed from: g */
    protected HashSet<Integer>[] f9230g = new HashSet[4];

    /* renamed from: h */
    protected C2364s.C2365a[] f9231h;

    /* renamed from: i */
    protected Hashtable<String, C2364s.C2365a> f9232i;

    /* renamed from: j */
    protected Hashtable<Integer, String> f9233j;

    /* renamed from: k */
    protected Hashtable<Integer, String> f9234k;

    /* renamed from: l */
    protected Hashtable<Integer, File> f9235l;

    /* renamed from: m */
    protected Hashtable<Integer, C2184a> f9236m;

    /* renamed from: n */
    protected final Context f9237n;

    /* renamed from: q */
    private LinkedList<C2214ac> f9238q = new LinkedList<>();

    /* renamed from: r */
    private LinkedList<C2214ac> f9239r = new LinkedList<>();

    /* renamed from: s */
    private Handler f9240s = new C2185N(this);

    /* renamed from: t */
    private Hashtable<Integer, C1011s<Integer, Integer>> f9241t;

    /* renamed from: u */
    private Hashtable<Integer, C1011s<String, Integer>> f9242u;

    /* renamed from: v */
    private long f9243v = 0;

    /* renamed from: com.cootek.smartinput5.net.M$a */
    /* compiled from: MultiPackDownloader */
    public interface C2184a {
        /* renamed from: a */
        void mo5566a(String str, File file);

        /* renamed from: a */
        boolean mo5568a(String str);

        /* renamed from: b */
        void mo5571b(String str);

        /* renamed from: c */
        void mo5573c(String str);

        /* renamed from: f */
        void mo5577f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C2364s.C2365a mo7645a(int i, String str, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C2364s.C2365a mo7669i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract C2364s.C2365a mo7670j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract C2364s.C2365a mo7671k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract int mo7672l();

    /* renamed from: a */
    protected static final int m9798a() {
        int i = f9227o + 1;
        f9227o = i;
        return i;
    }

    public C2183M(Context context) {
        for (int i = 0; i < 4; i++) {
            this.f9230g[i] = new HashSet<>();
        }
        this.f9233j = new Hashtable<>();
        this.f9241t = new Hashtable<>();
        this.f9234k = new Hashtable<>();
        this.f9235l = new Hashtable<>();
        this.f9236m = new Hashtable<>();
        this.f9242u = new Hashtable<>();
        this.f9237n = context;
        this.f9231h = new C2364s.C2365a[3];
        this.f9232i = new Hashtable<>();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7651a(String str, String str2, String str3, C2184a aVar) {
        if (!m9800d(str)) {
            int a = m9798a();
            m9799a(a, str, str3, aVar);
            File file = new File(mo7653b(str), mo7657c(str) + (aVar == null ? ".apk" : ""));
            this.f9235l.put(Integer.valueOf(a), file);
            this.f9238q.add(new C2214ac(str, str2, file, a, this.f9240s));
            if (f9229w) {
                this.f9242u.put(Integer.valueOf(a), new C1011s(str, 0));
            } else {
                mo7717r();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7650a(String str, File file, String str2, C2184a aVar, boolean z) {
        if (!m9800d(str)) {
            int a = m9798a();
            m9799a(a, str, str2, aVar);
            this.f9235l.put(Integer.valueOf(a), file);
            this.f9238q.add(new C2214ac(str, file, (Object) Integer.valueOf(a), this.f9240s, z));
            if (f9229w) {
                this.f9242u.put(Integer.valueOf(a), new C1011s(str, 0));
            } else {
                mo7717r();
            }
        }
    }

    /* renamed from: b */
    public void mo7654b() {
        f9229w = true;
    }

    /* renamed from: c */
    public void mo7658c() {
        f9229w = false;
        mo7717r();
    }

    /* renamed from: d */
    public boolean mo7661d() {
        return f9229w;
    }

    /* renamed from: d */
    private boolean m9800d(String str) {
        for (Map.Entry next : this.f9233j.entrySet()) {
            if (((String) next.getValue()).equals(str)) {
                if (this.f9230g[2].contains(next.getKey())) {
                    mo7667g();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    private void mo7717r() {
        if (!this.f9238q.isEmpty()) {
            C2214ac first = this.f9238q.getFirst();
            if (!first.mo7733b()) {
                mo7646a(((Integer) first.mo7740i()).intValue());
                first.mo7732a();
            }
        }
    }

    /* renamed from: a */
    public boolean mo7652a(String str) {
        return this.f9233j.contains(str);
    }

    /* renamed from: e */
    public void mo7663e() {
        Iterator it = this.f9238q.iterator();
        while (it.hasNext()) {
            ((C2214ac) it.next()).mo7735d();
        }
        this.f9238q.clear();
        mo7668h();
    }

    /* renamed from: f */
    public void mo7664f() {
        if (!this.f9238q.isEmpty()) {
            C2214ac first = this.f9238q.getFirst();
            if (first.mo7737f()) {
                first.mo7736e();
            }
        }
    }

    /* renamed from: g */
    public void mo7667g() {
        Iterator<Integer> it = this.f9230g[2].iterator();
        while (it.hasNext()) {
            this.f9230g[0].add(Integer.valueOf(it.next().intValue()));
        }
        this.f9230g[2].clear();
        if (this.f9231h[0] == null) {
            this.f9231h[0] = mo7669i();
        }
        mo7649a(this.f9231h[0]);
        Iterator it2 = this.f9239r.iterator();
        while (it2.hasNext()) {
            C2214ac acVar = (C2214ac) it2.next();
            acVar.mo7734c();
            this.f9238q.add(acVar);
            C2184a aVar = this.f9236m.get((Integer) acVar.mo7740i());
            if (aVar != null) {
                aVar.mo5573c(this.f9233j.get((Integer) acVar.mo7740i()));
            }
        }
        this.f9239r.clear();
        if (this.f9231h[2] != null) {
            mo7656b(this.f9231h[2]);
        }
        mo7665f(2);
        mo7717r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public File mo7653b(String str) {
        if (str.equals(C1974m.m9063a(this.f9237n, (int) R.string.app_id_inappbilling)) || str.equals(C1974m.m9063a(this.f9237n, (int) R.string.app_id_dialer)) || str.equals(C1974m.m9063a(this.f9237n, (int) R.string.app_id_ime_international)) || str.equals(C1974m.m9063a(this.f9237n, (int) R.string.app_id_ime_mainland))) {
            return this.f9237n.getFilesDir();
        }
        return C1466av.m6848a(this.f9237n);
    }

    /* renamed from: a */
    private void m9799a(int i, String str, String str2, C2184a aVar) {
        this.f9230g[0].add(Integer.valueOf(i));
        this.f9234k.put(Integer.valueOf(i), str2);
        this.f9233j.put(Integer.valueOf(i), str);
        if (aVar != null) {
            this.f9236m.put(Integer.valueOf(i), aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7646a(int i) {
        if (this.f9231h[0] == null) {
            this.f9231h[0] = mo7669i();
        }
        mo7649a(this.f9231h[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7647a(int i, int i2, int i3, int i4) {
        this.f9241t.put(Integer.valueOf(i), new C1011s(Integer.valueOf(i3), Integer.valueOf(i4)));
        m9805s();
    }

    /* renamed from: s */
    private void m9805s() {
        C2197U.C2202e eVar = (C2197U.C2202e) this.f9231h[0];
        if (eVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f9243v >= 1000) {
                this.f9243v = currentTimeMillis;
                Enumeration<C1011s<Integer, Integer>> elements = this.f9241t.elements();
                int i = 0;
                int i2 = 0;
                while (elements.hasMoreElements()) {
                    C1011s nextElement = elements.nextElement();
                    i = ((Integer) nextElement.f2651b).intValue() + i;
                    i2 = ((Integer) nextElement.f2650a).intValue() + i2;
                }
                eVar.f9300h = i2;
                eVar.f9301i = i;
                mo7649a(this.f9231h[0]);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7655b(int i) {
        C2364s.C2365a aVar;
        C2364s.C2365a a;
        this.f9230g[0].remove(Integer.valueOf(i));
        if (this.f9230g[0].isEmpty()) {
            mo7656b(this.f9231h[0]);
            this.f9231h[0] = null;
        }
        C2184a aVar2 = this.f9236m.get(Integer.valueOf(i));
        String str = this.f9233j.get(Integer.valueOf(i));
        if (str != null) {
            if (aVar2 == null) {
                m9802h(i);
                this.f9230g[3].add(Integer.valueOf(i));
                a = mo7645a(i, str, 2);
                this.f9232i.put(str, a);
            } else if (aVar2 == C1368X.m6320c().mo5841n()) {
                m9802h(i);
                this.f9230g[3].add(Integer.valueOf(i));
                C2364s.C2365a a2 = mo7645a(i, str, 1);
                this.f9232i.put(str, a2);
                aVar2.mo5566a(str, this.f9235l.get(Integer.valueOf(i)));
                this.f9236m.remove(aVar2);
                a = a2;
            } else if (aVar2.mo5568a(str)) {
                m9802h(i);
                this.f9230g[3].add(Integer.valueOf(i));
                C2364s.C2365a a3 = mo7645a(i, str, 2);
                this.f9232i.put(str, a3);
                aVar2.mo5566a(str, this.f9235l.get(Integer.valueOf(i)));
                this.f9236m.remove(aVar2);
                a = a3;
            } else {
                this.f9230g[1].add(Integer.valueOf(i));
                aVar2.mo5566a(str, this.f9235l.get(Integer.valueOf(i)));
                this.f9236m.remove(Integer.valueOf(i));
                if (this.f9231h[1] == null) {
                    this.f9231h[1] = mo7670j();
                }
                a = this.f9231h[1];
            }
            C1056a.m5588a().mo4264a(C1056a.f2962W + i, this.f9237n);
            aVar = a;
        } else {
            aVar = null;
        }
        this.f9241t.remove(Integer.valueOf(i));
        this.f9233j.remove(Integer.valueOf(i));
        if (!this.f9238q.isEmpty()) {
            this.f9238q.removeFirst();
        }
        if (this.f9242u.containsKey(Integer.valueOf(i))) {
            this.f9242u.put(Integer.valueOf(i), new C1011s(this.f9242u.get(Integer.valueOf(i)).f2650a, 1));
            if (mo7677q()) {
                m9801e(mo7676p());
                this.f9242u.clear();
            }
        }
        mo7717r();
        mo7649a(aVar);
    }

    /* renamed from: h */
    private void m9802h(int i) {
        if (this.f9233j.containsKey(Integer.valueOf(i)) && this.f9232i.containsKey(this.f9233j.get(Integer.valueOf(i)))) {
            C2197U.C2200c cVar = (C2197U.C2200c) this.f9232i.get(this.f9233j.get(Integer.valueOf(i)));
            this.f9230g[3].remove(Integer.valueOf(cVar.f9295h));
            mo7656b((C2364s.C2365a) cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7659c(int i) {
        C2184a aVar = this.f9236m.get(Integer.valueOf(i));
        if (aVar != null && this.f9233j.containsKey(Integer.valueOf(i))) {
            aVar.mo5571b(this.f9233j.get(Integer.valueOf(i)));
        }
        this.f9230g[0].remove(Integer.valueOf(i));
        this.f9241t.remove(Integer.valueOf(i));
        if (this.f9230g[0].isEmpty()) {
            mo7656b(this.f9231h[0]);
            this.f9231h[0] = null;
        }
        if (this.f9231h[2] == null) {
            this.f9231h[2] = mo7671k();
        } else {
            this.f9231h[2].f10421e.defaults = 0;
        }
        this.f9230g[2].add(Integer.valueOf(i));
        if (!this.f9238q.isEmpty()) {
            this.f9239r.add(this.f9238q.removeFirst());
        }
        mo7717r();
        mo7649a(this.f9231h[2]);
        if (m9803i(i)) {
            m9807u();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo7668h() {
        if (this.f9231h[0] != null) {
            mo7656b(this.f9231h[0]);
        }
        for (C2184a f : this.f9236m.values()) {
            f.mo5577f();
        }
        mo7665f(0);
        this.f9241t.clear();
        this.f9242u.clear();
        m9808v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7657c(String str) {
        return str;
    }

    /* renamed from: a */
    public void mo7648a(int i, int i2, String str) {
        if (i2 > 2) {
            C2364s.C2365a aVar = this.f9232i.get(str);
            if (aVar == null) {
                return;
            }
            if (i == 0) {
                aVar.mo7719d();
            } else if (i == 1) {
                aVar.mo7720e();
            }
        } else if (i == 0) {
            if (this.f9231h[i2] != null) {
                this.f9231h[i2].mo7719d();
            }
        } else if (i == 1 && this.f9231h[i2] != null) {
            this.f9231h[i2].mo7720e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7660d(int i) {
        HashSet<Integer> hashSet = this.f9230g[i];
        if (hashSet.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String a = C1974m.m9063a(this.f9237n, (int) R.string.split_word);
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            sb.append(this.f9234k.get(Integer.valueOf(it.next().intValue())));
            sb.append(a);
        }
        sb.setLength(sb.length() - a.length());
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo7662e(int i) {
        return this.f9230g[i].size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo7665f(int i) {
        boolean z = false;
        if (i < 3) {
            this.f9231h[i] = null;
            Iterator<Integer> it = this.f9230g[i].iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                this.f9234k.remove(Integer.valueOf(intValue));
                this.f9235l.remove(Integer.valueOf(intValue));
                this.f9233j.remove(Integer.valueOf(intValue));
                this.f9236m.remove(Integer.valueOf(intValue));
            }
            if (i == 2) {
                this.f9239r.clear();
            }
        }
        this.f9230g[i].clear();
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            if (i2 >= 3) {
                break;
            } else if (this.f9231h[i2] != null) {
                z2 = false;
                break;
            } else {
                i2++;
            }
        }
        if (this.f9232i.isEmpty()) {
            z = z2;
        }
        if (z) {
            m9806t();
        }
    }

    /* renamed from: t */
    private void m9806t() {
        C2361q.m10797b().mo7995a(mo7672l());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public File mo7666g(int i) {
        return this.f9235l.get(Integer.valueOf(i));
    }

    /* renamed from: i */
    private boolean m9803i(int i) {
        if (this.f9236m.get(Integer.valueOf(i)) == C1368X.m6320c().mo5848u()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private void m9807u() {
        C2917du widgetManager;
        if (Engine.isInitialized() && (widgetManager = Engine.getInstance().getWidgetManager()) != null) {
            HandWriteMask p = widgetManager.mo9659p();
            if (p == null) {
                widgetManager.mo9658o();
                p = widgetManager.mo9659p();
            }
            if (p != null) {
                p.setStatus(3);
                C1368X.m6320c().mo5848u().mo5595a();
            }
        }
    }

    /* renamed from: v */
    private void m9808v() {
        if (Engine.isInitialized()) {
            C2917du widgetManager = Engine.getInstance().getWidgetManager();
            HandWriteMask p = widgetManager.mo9659p();
            if (widgetManager != null) {
                if (p == null) {
                    widgetManager.mo9658o();
                    p = widgetManager.mo9659p();
                }
                if (p != null && p.getStatus() == 2) {
                    p.setStatus(3);
                    C1368X.m6320c().mo5848u().mo5595a();
                }
            }
        }
    }

    /* renamed from: m */
    public boolean mo7673m() {
        if (this.f9238q == null || this.f9238q.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo7674n() {
        return this.f9242u.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public int mo7675o() {
        int i = 0;
        Iterator<Map.Entry<Integer, C1011s<String, Integer>>> it = this.f9242u.entrySet().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            if (((Integer) ((C1011s) it.next().getValue()).f2651b).intValue() == 1) {
                i = i2 + 1;
            } else {
                i = i2;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public String mo7676p() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<Integer, C1011s<String, Integer>> value : this.f9242u.entrySet()) {
            jSONArray.put(((C1011s) value.getValue()).f2650a);
        }
        return jSONArray.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo7677q() {
        return mo7675o() == mo7674n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7649a(C2364s.C2365a aVar) {
        C2364s.m10840a().mo8027a(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7656b(C2364s.C2365a aVar) {
        C2364s.m10840a().mo8028b(aVar);
    }

    /* renamed from: e */
    private void m9801e(String str) {
        Message obtain = Message.obtain((Handler) null, 15);
        Bundle bundle = new Bundle();
        bundle.putString(IPCManager.DOWNLOADED_PACKAGE_LIST, str);
        obtain.setData(bundle);
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5839l().notifyOtherProcesses(obtain);
        }
    }
}
