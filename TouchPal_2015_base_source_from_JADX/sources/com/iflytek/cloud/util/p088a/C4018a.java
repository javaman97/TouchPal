package com.iflytek.cloud.util.p088a;

import android.content.Context;
import com.iflytek.cloud.util.p088a.p089a.C4019a;
import com.iflytek.cloud.util.p088a.p091c.C4027a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.iflytek.cloud.util.a.a */
public class C4018a {

    /* renamed from: a */
    protected Context f16407a;

    /* renamed from: b */
    private C4027a f16408b;

    /* renamed from: c */
    private String[] f16409c = null;

    /* renamed from: d */
    private String[] f16410d = null;

    /* renamed from: e */
    private HashMap<String, String> f16411e = new HashMap<>();

    /* renamed from: f */
    private HashMap<String, String> f16412f = new HashMap<>();

    /* renamed from: g */
    private List<C4019a> f16413g = new ArrayList();

    /* renamed from: h */
    private HashMap<String, String> f16414h = new HashMap<>();

    /* renamed from: i */
    private HashMap<String, String> f16415i = new HashMap<>();

    public C4018a(Context context, C4027a aVar) {
        this.f16408b = aVar;
        this.f16407a = context;
    }

    /* renamed from: b */
    private void m17113b() {
        if (this.f16412f.size() > 0) {
            this.f16412f = null;
            this.f16412f = new HashMap<>();
        }
        if (this.f16415i.size() > 0) {
            this.f16415i = null;
            this.f16415i = new HashMap<>();
        }
        if (this.f16411e.size() > 0) {
            this.f16411e = null;
            this.f16411e = new HashMap<>();
        }
        if (this.f16409c != null && this.f16409c.length > 0) {
            this.f16409c = null;
        }
    }

    /* renamed from: a */
    public void mo14758a(int i) {
        if (this.f16414h != null && this.f16414h.size() > 0) {
            this.f16414h.clear();
        }
        if (this.f16408b != null) {
            this.f16414h = this.f16408b.mo14775a(i);
        }
    }

    /* renamed from: a */
    public String[] mo14759a() {
        m17113b();
        ArrayList arrayList = new ArrayList();
        HashMap<String, String> d = this.f16408b.mo14777d();
        List<C4019a> e = this.f16408b.mo14778e();
        for (String next : d.keySet()) {
            String str = d.get(next);
            this.f16411e.put(next + "p", str);
            arrayList.add(str);
            if (str.contains("\u0000")) {
                this.f16415i.put(str.replace("\u0000", " "), str);
            }
        }
        for (C4019a next2 : e) {
            String a = next2.mo14760a();
            String c = next2.mo14762c();
            String b = next2.mo14761b();
            this.f16412f.put(a + "s", c);
            this.f16411e.put(a + "s", b);
            arrayList.add(b);
            if (b.contains("\u0000")) {
                this.f16415i.put(b.replace("\u0000", " "), b);
            }
            this.f16413g.add(next2);
        }
        HashSet hashSet = new HashSet(arrayList);
        this.f16409c = (String[]) hashSet.toArray(new String[hashSet.size()]);
        return this.f16409c;
    }
}
