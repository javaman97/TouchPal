package com.cootek.smartinput5.func.skin;

import com.cootek.smartinput5.func.nativeads.C1875a;
import com.cootek.smartinput5.func.nativeads.C1888m;
import com.cootek.smartinput5.func.nativeads.C1896t;
import com.cootek.smartinput5.func.nativeads.C1900w;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.func.skin.l */
/* compiled from: SponsorThemeManager */
class C1998l implements C1896t.C1897a {

    /* renamed from: a */
    final /* synthetic */ long f6847a;

    /* renamed from: b */
    final /* synthetic */ boolean f6848b;

    /* renamed from: c */
    final /* synthetic */ String f6849c;

    /* renamed from: d */
    final /* synthetic */ C1997k f6850d;

    C1998l(C1997k kVar, long j, boolean z, String str) {
        this.f6850d = kVar;
        this.f6847a = j;
        this.f6848b = z;
        this.f6849c = str;
    }

    /* renamed from: a */
    public void mo7030a(C1900w wVar) {
        ArrayList<C1888m> c = wVar.mo7044c();
        if (c != null && c.size() > 0) {
            C1888m mVar = c.get(0);
            if (!this.f6850d.f6845e.containsKey(Long.valueOf(this.f6847a))) {
                this.f6850d.f6845e.put(Long.valueOf(this.f6847a), mVar);
                if (this.f6848b) {
                    this.f6850d.m9170a(this.f6849c, this.f6847a, (C1875a) mVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo7031a(String str) {
    }
}
