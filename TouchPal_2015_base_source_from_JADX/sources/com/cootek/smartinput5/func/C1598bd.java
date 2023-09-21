package com.cootek.smartinput5.func;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p045a.C1063f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.cootek.smartinput5.func.bd */
/* compiled from: ResourceManager */
public class C1598bd implements C1441aq {

    /* renamed from: a */
    private Context f5085a;

    /* renamed from: b */
    private Resources f5086b;

    /* renamed from: c */
    private HashMap<Integer, String> f5087c = new HashMap<>();

    /* renamed from: d */
    private HashMap<C1443as, HashMap<String, Integer>> f5088d = new HashMap<>();

    public C1598bd(Context context) {
        this.f5085a = context;
        this.f5086b = context.getResources();
        C1811k.m8322a().mo6817a((C1441aq) this);
    }

    /* renamed from: i */
    public void mo5948i(String str) {
        mo6240a(str);
    }

    /* renamed from: j */
    public void mo5951j(String str) {
        mo6240a(str);
    }

    /* renamed from: a */
    public void mo5928a() {
    }

    /* renamed from: a */
    public void mo5933a(boolean z) {
    }

    /* renamed from: b */
    public int mo5935b() {
        return -1;
    }

    /* renamed from: c */
    public void mo6242c() {
        this.f5088d.clear();
    }

    /* renamed from: a */
    public void mo6240a(String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry next : this.f5088d.entrySet()) {
                if (str.equalsIgnoreCase(((C1443as) next.getKey()).getPackageName())) {
                    ((HashMap) next.getValue()).clear();
                    arrayList.add(next.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f5088d.remove((C1443as) it.next());
            }
            arrayList.clear();
        }
    }

    /* renamed from: a */
    public void mo6239a(C1443as asVar) {
        if (this.f5088d.containsKey(asVar)) {
            this.f5088d.get(asVar).clear();
            this.f5088d.remove(asVar);
        }
    }

    /* renamed from: a */
    public String mo6238a(int i) {
        String str = null;
        if (i == 0) {
            return null;
        }
        if (this.f5087c.containsKey(Integer.valueOf(i))) {
            return this.f5087c.get(Integer.valueOf(i));
        }
        try {
            str = this.f5086b.getResourceName(i);
        } catch (Resources.NotFoundException e) {
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String substring = str.substring(str.indexOf(":") + 1);
        this.f5087c.put(Integer.valueOf(i), substring);
        return substring;
    }

    /* renamed from: a */
    public int mo6236a(C1443as asVar, int i) {
        if (this.f5085a.getPackageName().equals(asVar.getPackageName())) {
            return i;
        }
        String a = mo6238a(i);
        if (TextUtils.isEmpty(a)) {
            return 0;
        }
        return mo6237a(asVar, a);
    }

    /* renamed from: a */
    public int mo6237a(C1443as asVar, String str) {
        if (this.f5085a.getPackageName().equals(asVar.getPackageName())) {
            return this.f5086b.getIdentifier(str, (String) null, this.f5085a.getPackageName());
        }
        String packageName = asVar.getPackageName();
        if (!this.f5088d.containsKey(asVar)) {
            this.f5088d.put(asVar, new HashMap());
        }
        HashMap hashMap = this.f5088d.get(asVar);
        if (hashMap.containsKey(str)) {
            return ((Integer) hashMap.get(str)).intValue();
        }
        int identifier = asVar.getResources().getIdentifier(str, (String) null, packageName);
        if (identifier > 0) {
            hashMap.put(str, Integer.valueOf(identifier));
        }
        return identifier;
    }

    /* renamed from: a */
    private int m7182a(Resources resources, String str, String str2) {
        int i;
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (str2.startsWith("@+")) {
            i = 2;
        } else if (!str2.startsWith(C1063f.f3053e)) {
            return 0;
        } else {
            i = 1;
        }
        if (str2.length() <= i) {
            return 0;
        }
        return resources.getIdentifier(str + ":" + str2.substring(i), (String) null, (String) null);
    }

    /* renamed from: b */
    private String m7183b(Resources resources, String str, String str2) {
        int a = m7182a(resources, str, str2);
        return a > 0 ? C1974m.m9063a(this.f5085a, a) : str2;
    }

    /* renamed from: b */
    public String mo6241b(String str) {
        return (!TextUtils.isEmpty(str) && str.startsWith(C1063f.f3053e)) ? m7183b(this.f5086b, this.f5085a.getPackageName(), str) : str;
    }
}
