package com.cootek.smartinput5.func.p052b;

import android.content.Context;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.cootek.smartinput5.func.b.aW */
/* compiled from: V4LanguageInfo */
public class C1522aW {

    /* renamed from: c */
    private static C1522aW f4762c;

    /* renamed from: a */
    private Object[][] f4763a = {new Object[]{C1549b.f4772H, Integer.valueOf(R.array.v4_package_name_arabics)}, new Object[]{C1549b.f4765A, Integer.valueOf(R.array.v4_package_name_romanians)}};

    /* renamed from: b */
    private HashMap<String, HashSet<String>> f4764b = new HashMap<>();

    private C1522aW(Context context) {
        for (Object[] objArr : this.f4763a) {
            HashSet hashSet = new HashSet();
            this.f4764b.put((String) objArr[0], hashSet);
            String[] b = C1974m.m9070b(context, ((Integer) objArr[1]).intValue());
            if (b != null) {
                for (String add : b) {
                    hashSet.add(add);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized C1522aW m6959a(Context context) {
        C1522aW aWVar;
        synchronized (C1522aW.class) {
            if (f4762c == null) {
                f4762c = new C1522aW(context);
            }
            aWVar = f4762c;
        }
        return aWVar;
    }

    /* renamed from: a */
    public HashSet<String> mo6189a(C1498a aVar) {
        if (aVar == null) {
            return null;
        }
        HashSet<String> hashSet = this.f4764b.get(aVar.f4727f);
        if (hashSet != null) {
            return hashSet;
        }
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add(aVar.f4734m);
        return hashSet2;
    }
}
