package com.cootek.smartinput5.func.p052b;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C1389aD;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.cootek.smartinput5.func.b.aT */
/* compiled from: LanguageListInfo */
public class C1519aT {

    /* renamed from: a */
    private final ArrayList<C1498a> f4752a = new ArrayList<>();

    /* renamed from: b */
    private final Hashtable<String, C1498a> f4753b = new Hashtable<>();

    /* renamed from: c */
    private final Hashtable<String, Hashtable<String, C1498a>> f4754c = new Hashtable<>();

    /* renamed from: d */
    private final ArrayList<C1498a> f4755d = new ArrayList<>();

    /* renamed from: a */
    public void mo6179a(String str, C1498a aVar) {
        if (m6945c(str, aVar)) {
            this.f4752a.add(aVar);
            this.f4753b.put(str, aVar);
            Hashtable hashtable = this.f4754c.get(aVar.f4739r);
            if (hashtable == null) {
                hashtable = new Hashtable();
                this.f4754c.put(aVar.f4739r, hashtable);
            }
            hashtable.put(str, aVar);
        }
    }

    /* renamed from: b */
    public void mo6182b(String str, C1498a aVar) {
        if (m6945c(str, aVar)) {
            this.f4752a.remove(aVar);
            this.f4753b.remove(str);
            Hashtable hashtable = this.f4754c.get(aVar.f4739r);
            if (hashtable != null) {
                hashtable.remove(str);
            }
        }
    }

    /* renamed from: a */
    public C1498a mo6176a(String str) {
        if (str == null) {
            return null;
        }
        return this.f4753b.get(str);
    }

    /* renamed from: c */
    private boolean m6945c(String str, C1498a aVar) {
        if (TextUtils.isEmpty(str) || aVar == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo6177a() {
        this.f4752a.clear();
        this.f4753b.clear();
        for (Hashtable<String, C1498a> clear : this.f4754c.values()) {
            clear.clear();
        }
        this.f4754c.clear();
        this.f4755d.clear();
    }

    /* renamed from: b */
    public List<C1498a> mo6181b() {
        return this.f4752a;
    }

    /* renamed from: c */
    public int mo6184c() {
        return this.f4752a.size();
    }

    /* renamed from: a */
    public C1498a mo6175a(int i) {
        if (i < 0 || i >= this.f4752a.size()) {
            return null;
        }
        return this.f4752a.get(i);
    }

    /* renamed from: a */
    public void mo6178a(Context context, C1498a[] aVarArr) {
        int i = 0;
        new ArrayList();
        ArrayList arrayList = new ArrayList(Arrays.asList(aVarArr));
        for (int i2 = 0; i2 < mo6184c(); i2++) {
            C1498a a = mo6175a(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                } else if (a.f4727f.equals(((C1498a) arrayList.get(i3)).f4727f)) {
                    arrayList.remove(i3);
                    break;
                } else {
                    i3++;
                }
            }
            if (!a.mo6157g() || !a.mo6156f()) {
                this.f4755d.add(a);
            }
        }
        while (i < arrayList.size()) {
            C1498a aVar = (C1498a) arrayList.get(i);
            if (C1389aD.m6452a(context, aVar)) {
                arrayList.remove(i);
                this.f4755d.add(aVar);
            } else {
                i++;
            }
        }
    }

    /* renamed from: d */
    public boolean mo6186d() {
        return this.f4755d.size() > 0;
    }

    /* renamed from: a */
    public void mo6180a(HashMap<String, Integer> hashMap) {
        if (hashMap != null) {
            Collections.sort(this.f4752a, new C1520aU(this, hashMap));
        }
    }

    /* renamed from: a */
    public static int m6944a(String str, HashMap<String, Integer> hashMap) {
        Integer num = hashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: b */
    public boolean mo6183b(String str) {
        if (str == null) {
            return false;
        }
        return this.f4753b.containsKey(str);
    }

    /* renamed from: c */
    public C1498a mo6185c(String str) {
        if (str == null) {
            return null;
        }
        Hashtable hashtable = this.f4754c.get(str);
        if (hashtable == null) {
            return null;
        }
        Iterator it = hashtable.keySet().iterator();
        if (it.hasNext()) {
            return (C1498a) hashtable.get((String) it.next());
        }
        return null;
    }
}
