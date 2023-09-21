package com.cootek.p042a.p043a;

import com.cootek.smartinput5.engine.Settings;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Stack;
import org.json.JSONObject;

/* renamed from: com.cootek.a.a.h */
/* compiled from: PerfDataRecorder */
class C0905h {

    /* renamed from: a */
    static int[] f2436a = {1, 5, 10, 20, 30, 50, 70, 100, Settings.SHOW_PRIVACY_POLICY, 200, Settings.SUPER_DICT_DOWNLOADED, SearchStatusData.RESPONSE_STATUS_SERVER_ERROR, 1000, 2000, 9999};

    /* renamed from: b */
    C0907b f2437b;

    /* renamed from: c */
    Hashtable<C0898b, C0908c> f2438c;

    /* renamed from: d */
    C0909d[] f2439d;

    /* renamed from: e */
    private C0900d f2440e;

    /* renamed from: f */
    private Stack<C0906a> f2441f;

    /* renamed from: g */
    private boolean f2442g;

    /* renamed from: h */
    private long f2443h;

    /* renamed from: i */
    private long f2444i;

    /* renamed from: com.cootek.a.a.h$a */
    /* compiled from: PerfDataRecorder */
    static class C0906a {

        /* renamed from: a */
        C0898b f2445a;

        /* renamed from: b */
        long f2446b;

        /* renamed from: c */
        long f2447c;

        C0906a() {
        }
    }

    /* renamed from: com.cootek.a.a.h$c */
    /* compiled from: PerfDataRecorder */
    static class C0908c {

        /* renamed from: a */
        C0898b f2457a;

        /* renamed from: b */
        int[] f2458b;

        /* renamed from: c */
        int[] f2459c;

        /* renamed from: d */
        int f2460d;

        /* renamed from: e */
        long f2461e;

        C0908c() {
        }

        /* renamed from: b */
        private int m4949b(long j) {
            int d = (int) C0911j.m4978d(j);
            int length = this.f2458b.length - 1;
            for (int i = 0; i < this.f2458b.length; i++) {
                if (d < this.f2458b[i]) {
                    return i;
                }
            }
            return length;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3433a(long j) {
            int b = m4949b(j);
            if (b >= 0 && b < this.f2459c.length) {
                int[] iArr = this.f2459c;
                iArr[b] = iArr[b] + 1;
            }
        }
    }

    /* renamed from: com.cootek.a.a.h$d */
    /* compiled from: PerfDataRecorder */
    static class C0909d implements Comparable<C0909d> {

        /* renamed from: a */
        C0898b f2462a;

        /* renamed from: b */
        long f2463b;

        /* renamed from: c */
        int f2464c;

        C0909d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3435a() {
            this.f2463b = 0;
            this.f2464c = 0;
        }

        /* renamed from: a */
        public int compareTo(C0909d dVar) {
            if (this.f2463b < dVar.f2463b) {
                return 1;
            }
            if (this.f2463b > dVar.f2463b) {
                return -1;
            }
            return 0;
        }
    }

    /* renamed from: com.cootek.a.a.h$b */
    /* compiled from: PerfDataRecorder */
    static class C0907b {

        /* renamed from: a */
        String f2448a;

        /* renamed from: b */
        int f2449b;

        /* renamed from: c */
        int f2450c = 3;

        /* renamed from: d */
        int f2451d = 3;

        /* renamed from: e */
        int[] f2452e = C0905h.f2436a;

        /* renamed from: f */
        C0898b[] f2453f;

        /* renamed from: g */
        C0898b[] f2454g;

        /* renamed from: h */
        LinkedHashSet<C0898b> f2455h;

        /* renamed from: i */
        LinkedHashSet<C0898b> f2456i;

        C0907b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3432a() {
            if (this.f2453f == null) {
                this.f2453f = new C0898b[0];
            }
            if (this.f2454g == null) {
                this.f2454g = new C0898b[0];
            }
            this.f2455h = m4947a(this.f2453f);
            this.f2456i = m4947a(this.f2454g);
        }

        /* renamed from: a */
        private LinkedHashSet<C0898b> m4947a(C0898b[] bVarArr) {
            LinkedHashSet<C0898b> linkedHashSet = new LinkedHashSet<>();
            for (C0898b add : bVarArr) {
                linkedHashSet.add(add);
            }
            return linkedHashSet;
        }
    }

    C0905h(C0907b bVar, C0900d dVar) {
        if (bVar != null) {
            bVar.mo3432a();
            this.f2437b = bVar;
            mo3426c();
            this.f2440e = dVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo3420a() {
        mo3426c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo3425b() {
        return this.f2442g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo3426c() {
        this.f2442g = false;
        this.f2438c = new Hashtable<>();
        this.f2441f = new Stack<>();
        this.f2439d = new C0909d[r2];
        for (int i = 0; i < this.f2439d.length; i++) {
            C0909d dVar = new C0909d();
            dVar.f2462a = C0898b.values()[i];
            this.f2439d[i] = dVar;
        }
        for (C0898b bVar : C0898b.values()) {
            C0908c cVar = new C0908c();
            cVar.f2457a = bVar;
            cVar.f2458b = this.f2437b.f2452e;
            cVar.f2459c = new int[cVar.f2458b.length];
            cVar.f2460d = 0;
            cVar.f2461e = 0;
            this.f2438c.put(cVar.f2457a, cVar);
        }
        if (this.f2440e != null) {
            this.f2440e.mo3391a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public JSONObject mo3428d() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo3430e() {
        if (!this.f2442g) {
            this.f2442g = true;
            this.f2443h = 0;
            for (C0909d a : this.f2439d) {
                a.mo3435a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void mo3431f() {
        if (this.f2442g) {
            this.f2442g = false;
            this.f2441f.clear();
            m4934g();
        }
    }

    /* renamed from: g */
    private void m4934g() {
        long j = 0;
        for (C0898b ordinal : this.f2437b.f2453f) {
            j += this.f2439d[ordinal.ordinal()].f2463b;
        }
        if (j != 0) {
            m4933b(C0898b.INNER, j);
            if (this.f2443h > 0) {
                m4933b(C0898b.ROOT, this.f2444i - this.f2443h);
            }
            if (j > C0911j.m4979e((long) this.f2437b.f2449b) && this.f2440e != null) {
                this.f2440e.mo3392a(j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo3421a(C0898b bVar) {
        if (mo3425b()) {
            C0906a aVar = new C0906a();
            aVar.f2447c = 0;
            aVar.f2445a = bVar;
            this.f2441f.push(aVar);
            aVar.f2446b = System.nanoTime();
            if (this.f2443h == 0) {
                this.f2443h = aVar.f2446b;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo3424b(C0898b bVar) {
        C0906a pop;
        if (mo3425b()) {
            if (!this.f2441f.isEmpty()) {
                long nanoTime = System.nanoTime();
                do {
                    pop = this.f2441f.pop();
                    if (this.f2441f.isEmpty() || pop.f2445a == bVar) {
                    }
                    pop = this.f2441f.pop();
                    break;
                } while (pop.f2445a == bVar);
                if (pop.f2445a == bVar) {
                    mo3423a(bVar, (nanoTime - pop.f2446b) - pop.f2447c, pop.f2447c);
                    this.f2444i = nanoTime;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo3423a(C0898b bVar, long j, long j2) {
        if (mo3425b()) {
            if (!this.f2441f.isEmpty() && mo3427c(bVar)) {
                this.f2441f.peek().f2447c += j + j2;
            }
            this.f2439d[bVar.ordinal()].f2464c++;
            this.f2439d[bVar.ordinal()].f2463b += j;
            m4933b(bVar, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3422a(C0898b bVar, long j) {
        mo3423a(bVar, j, 0);
    }

    /* renamed from: b */
    private void m4933b(C0898b bVar, long j) {
        C0908c cVar = this.f2438c.get(bVar);
        cVar.f2460d++;
        cVar.f2461e += j;
        cVar.mo3433a(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3427c(C0898b bVar) {
        return this.f2437b.f2455h.contains(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo3429d(C0898b bVar) {
        return this.f2437b.f2456i.contains(bVar);
    }
}
