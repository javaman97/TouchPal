package com.cootek.smartinput5.func.iab;

import android.text.TextUtils;
import com.cootek.smartinput5.net.cmd.C2250J;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.iab.ag */
/* compiled from: SyncOrder */
class C1767ag {

    /* renamed from: a */
    ArrayList<C1768a> f5754a = new ArrayList<>();

    /* renamed from: b */
    String f5755b;

    C1767ag(String str) {
        this.f5755b = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6763a(C1768a aVar) {
        if (aVar != null) {
            this.f5754a.add(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2250J mo6762a() {
        C2250J j = new C2250J();
        if (!m8119a(j, this)) {
            return null;
        }
        return j;
    }

    /* renamed from: a */
    private boolean m8119a(C2250J j, C1767ag agVar) {
        boolean z;
        boolean z2 = false;
        if (agVar == null || !C1730E.m8004c()) {
            return false;
        }
        HashMap hashMap = new HashMap();
        Iterator<C1768a> it = agVar.f5754a.iterator();
        while (true) {
            z = z2;
            if (!it.hasNext()) {
                break;
            }
            C1768a next = it.next();
            if (next != null) {
                if ("start_purchase".equals(next.f5757b)) {
                    C1754V d = C1730E.m8005d().mo6719d(next.f5760e);
                    Object a = C1730E.m7951a(d, C1730E.f5659m);
                    if (a != null && !C1730E.m8005d().mo6689i((String) a)) {
                        C2250J.C2251a aVar = new C2250J.C2251a(next.f5756a, C1730E.m7989b(d), "Google");
                        aVar.mo7818a(d);
                        aVar.mo7819a(next.f5759d);
                        j.mo7814a(aVar);
                        hashMap.put(next.f5760e, next);
                        z = true;
                    }
                } else if ("purchase_success".equals(next.f5757b)) {
                    hashMap.put(next.f5760e, next);
                }
            }
            z2 = z;
        }
        for (C1754V next2 : C1730E.m8005d().mo6715b()) {
            if (next2 != null && hashMap.get(next2.mo6726c()) == null) {
                try {
                    JSONObject jSONObject = new JSONObject(next2.mo6729f());
                    if (TextUtils.equals(jSONObject.optString("type"), agVar.f5755b)) {
                        String string = jSONObject.getString(C1730E.f5659m);
                        if (!C1730E.m8005d().mo6689i(string)) {
                            C2250J.C2251a aVar2 = new C2250J.C2251a(string, "purchase_success", "Google");
                            aVar2.mo7818a(next2);
                            j.mo7814a(aVar2);
                            z = true;
                        }
                    }
                } catch (JSONException e) {
                }
            }
        }
        return z;
    }

    /* renamed from: com.cootek.smartinput5.func.iab.ag$a */
    /* compiled from: SyncOrder */
    static class C1768a {

        /* renamed from: a */
        public String f5756a;

        /* renamed from: b */
        public String f5757b;

        /* renamed from: c */
        public String f5758c;

        /* renamed from: d */
        public String f5759d;

        /* renamed from: e */
        public String f5760e;

        C1768a() {
        }
    }
}
