package com.cootek.smartinput5.func.mainentrance;

import com.cootek.smartinput5.func.C1601bg;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.C1810j;
import java.util.Comparator;

/* renamed from: com.cootek.smartinput5.func.mainentrance.t */
/* compiled from: SkinProvider */
class C1868t implements Comparator<C1810j> {

    /* renamed from: a */
    final /* synthetic */ C1859m f6241a;

    C1868t(C1859m mVar) {
        this.f6241a = mVar;
    }

    /* renamed from: a */
    public int compare(C1810j jVar, C1810j jVar2) {
        long j;
        long j2 = ((C1601bg) jVar).f5107k;
        long j3 = ((C1601bg) jVar2).f5107k;
        if (this.f6241a.f6223l.containsKey(jVar.mo6810a())) {
            j2 = ((Long) this.f6241a.f6223l.get(jVar.mo6810a())).longValue();
        }
        if (this.f6241a.f6223l.containsKey(jVar2.mo6810a())) {
            j = ((Long) this.f6241a.f6223l.get(jVar2.mo6810a())).longValue();
        } else {
            j = j3;
        }
        String a = jVar.mo6810a();
        String a2 = jVar2.mo6810a();
        if (C1602bh.m7250e(a) > -1 && C1602bh.m7250e(a2) > -1) {
            return 0;
        }
        if (j2 == 0 && j == 0) {
            return a.compareTo(a2);
        }
        if (j2 == j) {
            return a.compareTo(a2);
        }
        if (j2 > j) {
            return -1;
        }
        return 1;
    }
}
