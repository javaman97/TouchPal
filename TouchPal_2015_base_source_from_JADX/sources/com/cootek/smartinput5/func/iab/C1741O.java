package com.cootek.smartinput5.func.iab;

import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;

/* renamed from: com.cootek.smartinput5.func.iab.O */
/* compiled from: IabHelper */
class C1741O implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ String f5704a;

    /* renamed from: b */
    final /* synthetic */ String f5705b;

    /* renamed from: c */
    final /* synthetic */ int f5706c;

    /* renamed from: d */
    final /* synthetic */ C1730E f5707d;

    C1741O(C1730E e, String str, String str2, int i) {
        this.f5707d = e;
        this.f5704a = str;
        this.f5705b = str2;
        this.f5706c = i;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        this.f5707d.m7977a(this.f5704a, this.f5705b, this.f5706c, p);
        C1779g.m8167a(p, false);
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        C1779g.m8167a(p, true);
        C1794k.m8255a(this.f5707d.f5673B, this.f5706c, (int) C1778f.f5841s);
    }
}
