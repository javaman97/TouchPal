package com.cootek.smartinput5.func.paopaopanel;

import android.content.Context;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.C1974m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.b */
/* compiled from: KeyboardSubTypeProvider */
public class C1933b {

    /* renamed from: a */
    private static final int[] f6553a = {1, 2, 3};

    /* renamed from: b */
    private static final HashMap<Integer, Integer> f6554b = new C1934c();

    /* renamed from: a */
    public static int m8860a() {
        return Settings.getInstance().getIntSetting(3, 1, C1368X.m6320c().mo5835h().getLanguageCategory(Engine.getInstance().getCurrentLanguageId(), 1), (Config) null);
    }

    /* renamed from: a */
    public List<Integer> mo7115a(String str) {
        ArrayList arrayList = new ArrayList();
        int languageSupportSubType = Engine.getInstance().getLanguageSupportSubType(str);
        arrayList.clear();
        if (!C1549b.f4835f.equals(str)) {
            for (int i = 0; i < f6553a.length; i++) {
                if (((1 << f6553a[i]) & languageSupportSubType) != 0) {
                    arrayList.add(Integer.valueOf(f6553a[i]));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m8861a(int i, Context context) {
        if (context != null && f6554b.containsKey(Integer.valueOf(i))) {
            return C1974m.m9063a(context, f6554b.get(Integer.valueOf(i)).intValue());
        }
        return null;
    }
}
