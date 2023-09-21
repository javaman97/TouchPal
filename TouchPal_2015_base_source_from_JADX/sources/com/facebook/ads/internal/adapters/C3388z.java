package com.facebook.ads.internal.adapters;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.z */
public class C3388z extends C3368h {

    /* renamed from: b */
    private final C3351A f14784b;

    public C3388z(Context context, C3369i iVar, C3351A a) {
        super(context, iVar);
        this.f14784b = a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10637b() {
        if (this.f14784b != null) {
            HashMap hashMap = new HashMap();
            if (this.f14689a != null) {
                hashMap.put("mil", Boolean.valueOf(this.f14689a.mo10524a()));
            }
            this.f14784b.mo10585a((Map<String, Object>) hashMap);
        }
    }
}
