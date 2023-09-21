package com.cootek.smartinput5.func.iab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.cootek.smartinput5.func.iab.U */
/* compiled from: Inventory */
public class C1753U implements C1777e {

    /* renamed from: a */
    private Map<String, C1766af> f5717a = new HashMap();

    /* renamed from: b */
    private Map<String, C1754V> f5718b = new HashMap();

    /* renamed from: c */
    public C1766af mo6717c(String str) {
        return this.f5717a.get(str);
    }

    /* renamed from: d */
    public C1754V mo6719d(String str) {
        return this.f5718b.get(str);
    }

    /* renamed from: e */
    public boolean mo6720e(String str) {
        return this.f5718b.containsKey(str);
    }

    /* renamed from: f */
    public boolean mo6721f(String str) {
        return this.f5717a.containsKey(str);
    }

    /* renamed from: a */
    public List<String> mo6711a() {
        return new ArrayList(this.f5718b.keySet());
    }

    /* renamed from: b */
    public List<C1754V> mo6715b() {
        return new ArrayList(this.f5718b.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo6723k(String str) {
        if (this.f5718b.containsKey(str)) {
            this.f5718b.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6713a(C1766af afVar) {
        if (afVar != null && afVar.mo6755a() != null) {
            this.f5717a.put(afVar.mo6755a(), afVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6714a(Collection<C1766af> collection) {
        if (collection != null) {
            for (C1766af a : collection) {
                mo6713a(a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6718c(C1754V v) {
        if (v != null && v.mo6726c() != null) {
            this.f5718b.put(v.mo6726c(), v);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6716b(Collection<C1754V> collection) {
        if (collection != null) {
            for (C1754V c : collection) {
                mo6718c(c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6712a(C1753U u) {
        if (u != null) {
            mo6716b(u.f5718b.values());
            mo6714a(u.f5717a.values());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo6722g() {
        this.f5718b.clear();
        this.f5717a.clear();
    }
}
