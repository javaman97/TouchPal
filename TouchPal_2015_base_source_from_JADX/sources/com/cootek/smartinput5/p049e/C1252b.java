package com.cootek.smartinput5.p049e;

import com.cootek.smartinput5.engine.CandidateItem;
import com.cootek.smartinput5.engine.Settings;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.e.b */
/* compiled from: SlideSentenceManager */
public class C1252b {

    /* renamed from: a */
    public static final boolean f3996a = false;

    /* renamed from: b */
    public static final int f3997b = 10;

    /* renamed from: c */
    public static final int f3998c = 6;

    /* renamed from: d */
    public static final int f3999d = 4;

    /* renamed from: e */
    public static final int f4000e = 0;

    /* renamed from: f */
    public static final int f4001f = 1;

    /* renamed from: g */
    public static final int f4002g = 2;

    /* renamed from: h */
    public static boolean f4003h = true;

    /* renamed from: i */
    public static boolean f4004i = false;

    /* renamed from: j */
    public static boolean f4005j = false;

    /* renamed from: k */
    private static final String f4006k = "SlideSentenceManager";

    /* renamed from: l */
    private C1254b f4007l;

    /* renamed from: m */
    private C1254b f4008m;

    /* renamed from: n */
    private C1254b f4009n;

    /* renamed from: o */
    private C1254b f4010o;

    /* renamed from: p */
    private ArrayList<C1253a> f4011p = new ArrayList<>();

    /* renamed from: com.cootek.smartinput5.e.b$a */
    /* compiled from: SlideSentenceManager */
    public interface C1253a {
        /* renamed from: a */
        void mo4625a(String str);

        /* renamed from: a */
        void mo4626a(boolean z, C1254b bVar, boolean z2, int i);
    }

    /* renamed from: com.cootek.smartinput5.e.b$b */
    /* compiled from: SlideSentenceManager */
    public interface C1254b {
        CandidateItem get(int i);

        boolean hasSlideSentence();

        void reset();
    }

    public C1252b(C1254b bVar, C1254b bVar2, C1254b bVar3) {
        this.f4007l = bVar;
        this.f4009n = bVar2;
        this.f4008m = bVar3;
        this.f4010o = bVar;
        f4005j = !Settings.getInstance().getBoolSetting(31);
    }

    /* renamed from: a */
    public void mo4621a(C1253a aVar) {
        if (!this.f4011p.contains(aVar)) {
            this.f4011p.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo4623b(C1253a aVar) {
        if (this.f4011p.contains(aVar)) {
            this.f4011p.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo4618a() {
        this.f4011p.clear();
    }

    /* renamed from: c */
    public void mo4624c(C1253a aVar) {
        this.f4011p.remove(aVar);
    }

    /* renamed from: a */
    public void mo4619a(int i) {
        if (m6070b(i)) {
            m6069b(i, this.f4010o.hasSlideSentence());
        }
    }

    /* renamed from: a */
    public void mo4620a(int i, boolean z) {
        if (m6070b(i)) {
            m6069b(i, z);
        }
    }

    /* renamed from: b */
    private void m6069b(int i, boolean z) {
        Iterator<C1253a> it = this.f4011p.iterator();
        while (it.hasNext()) {
            it.next().mo4626a(z, this.f4010o, true, i);
        }
    }

    /* renamed from: b */
    private boolean m6070b(int i) {
        this.f4007l.reset();
        this.f4009n.reset();
        this.f4008m.reset();
        this.f4010o.reset();
        if (!f4003h) {
            return false;
        }
        switch (i) {
            case 0:
                this.f4010o = this.f4007l;
                break;
            case 1:
                this.f4010o = this.f4009n;
                break;
            case 2:
                this.f4010o = this.f4008m;
                break;
        }
        return true;
    }

    /* renamed from: a */
    public void mo4622a(String str) {
        Iterator<C1253a> it = this.f4011p.iterator();
        while (it.hasNext()) {
            it.next().mo4625a(str);
        }
    }
}
