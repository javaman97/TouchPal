package com.facebook.ads.internal.p077h;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.ads.internal.adapters.C3367g;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: com.facebook.ads.internal.h.g */
public class C3438g {
    /* renamed from: a */
    public static Collection<String> m15058a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.optString(i));
        }
        return hashSet;
    }

    /* renamed from: a */
    public static boolean m15059a(Context context, C3367g gVar) {
        Collection<String> c;
        boolean z;
        C3437f a = gVar.mo10633a();
        if (a == null || a == C3437f.NONE || (c = gVar.mo10635c()) == null || c.isEmpty()) {
            return false;
        }
        Iterator<String> it = c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (m15060a(context, it.next())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z != (a == C3437f.INSTALLED)) {
            return false;
        }
        String b = gVar.mo10634b();
        if (C3456v.m15103a(b)) {
            return true;
        }
        new C3451q().execute(new String[]{b});
        return false;
    }

    /* renamed from: a */
    public static boolean m15060a(Context context, String str) {
        if (C3456v.m15103a(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
