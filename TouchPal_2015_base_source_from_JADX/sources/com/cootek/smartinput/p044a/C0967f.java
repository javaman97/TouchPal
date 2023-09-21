package com.cootek.smartinput.p044a;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.cootek.smartinput.a.f */
/* compiled from: IflyVoiceLanguageItem */
public enum C0967f {
    MANDARIN,
    CANTONESE,
    ENGLISH,
    HENANESE,
    SICHUANESE;
    

    /* renamed from: f */
    private static Map<String, C0967f> f2500f;

    /* renamed from: a */
    public abstract String mo3989a();

    /* renamed from: a */
    public abstract String mo3990a(Context context);

    /* renamed from: b */
    public abstract String mo3991b();

    static {
        int i;
        f2500f = new HashMap();
        for (C0967f fVar : values()) {
            f2500f.put(fVar.toString(), fVar);
        }
    }

    /* renamed from: a */
    public static boolean m5015a(String str) {
        return m5016b(str) != null;
    }

    /* renamed from: b */
    public static C0967f m5016b(String str) {
        C0967f fVar = f2500f.get(str);
        return fVar != null ? fVar : MANDARIN;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static String m5019e() {
        return "zh_cn";
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static String m5020f() {
        return "en_us";
    }
}
