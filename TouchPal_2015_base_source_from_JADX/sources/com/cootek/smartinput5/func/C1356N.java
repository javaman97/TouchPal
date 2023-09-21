package com.cootek.smartinput5.func;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.N */
/* compiled from: ExternalPackageManager */
public class C1356N {

    /* renamed from: b */
    private static C1356N f4182b;

    /* renamed from: a */
    private ArrayList<C1357a> f4183a = new ArrayList<>();

    /* renamed from: com.cootek.smartinput5.func.N$a */
    /* compiled from: ExternalPackageManager */
    public interface C1357a {
        /* renamed from: a */
        void mo5759a(String str);

        /* renamed from: b */
        void mo5760b(String str);
    }

    private C1356N() {
    }

    /* renamed from: a */
    public static C1356N m6227a() {
        if (f4182b == null) {
            f4182b = new C1356N();
        }
        return f4182b;
    }

    /* renamed from: a */
    public void mo5755a(C1357a aVar) {
        if (aVar != null && !this.f4183a.contains(aVar)) {
            this.f4183a.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo5757b(C1357a aVar) {
        if (aVar != null && this.f4183a.contains(aVar)) {
            this.f4183a.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo5756a(String str) {
        Iterator it = new ArrayList(this.f4183a).iterator();
        while (it.hasNext()) {
            ((C1357a) it.next()).mo5759a(str);
        }
    }

    /* renamed from: b */
    public void mo5758b(String str) {
        Iterator it = new ArrayList(this.f4183a).iterator();
        while (it.hasNext()) {
            ((C1357a) it.next()).mo5760b(str);
        }
    }
}
