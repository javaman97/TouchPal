package com.cootek.smartinput5.func.nativeads;

import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.func.C1466av;

/* renamed from: com.cootek.smartinput5.func.nativeads.x */
/* compiled from: NativeAdsSource */
public enum C1901x {
    f6423a(C1411aV.f4491r),
    f6424b(C1466av.f4697f),
    sponsor_theme("sponsored_theme");
    

    /* renamed from: d */
    private String f6427d;

    private C1901x(String str) {
        this.f6427d = str;
    }

    /* renamed from: a */
    public String mo7045a() {
        return this.f6427d;
    }

    /* renamed from: a */
    public boolean mo7046a(String str) {
        return this.f6427d.equalsIgnoreCase(str);
    }

    /* renamed from: b */
    public static boolean m8736b(String str) {
        for (C1901x a : values()) {
            if (a.mo7046a(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static C1878c m8735a(C1902y yVar) {
        if (C1411aV.f4491r.equalsIgnoreCase(yVar.f6436b)) {
            return new C1880e(yVar);
        }
        return null;
    }
}
