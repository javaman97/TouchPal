package com.cootek.smartinput5.func;

import com.cootek.smartinput5.func.C1389aD;
import java.util.Comparator;

/* renamed from: com.cootek.smartinput5.func.aH */
/* compiled from: LanguageManager */
class C1395aH implements Comparator<C1389aD.C1391b> {

    /* renamed from: a */
    final /* synthetic */ C1389aD f4408a;

    /* renamed from: b */
    private final String[] f4409b = {C1389aD.f4365a, C1389aD.f4366b, C1389aD.f4367c, C1389aD.f4368d};

    C1395aH(C1389aD aDVar) {
        this.f4408a = aDVar;
    }

    /* renamed from: a */
    public int compare(C1389aD.C1391b bVar, C1389aD.C1391b bVar2) {
        String str = bVar.f4400a;
        String str2 = bVar2.f4400a;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < this.f4409b.length; i3++) {
            if (this.f4409b[i3].equalsIgnoreCase(str)) {
                i2 = i3;
            }
            if (this.f4409b[i3].equalsIgnoreCase(str2)) {
                i = i3;
            }
        }
        if (i2 != -1 && i == -1) {
            return -1;
        }
        if (i2 == -1 && i != -1) {
            return 1;
        }
        if (i2 == -1 || i == -1) {
            return this.f4408a.mo5964q(bVar.f4402c) - this.f4408a.mo5964q(bVar2.f4402c);
        }
        return i2 - i;
    }
}
