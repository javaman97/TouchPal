package com.cootek.smartinput5.func.component;

import com.cootek.smartinput5.func.component.C1671f;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2270d;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.component.g */
/* compiled from: CloudBackupSync */
class C1674g extends C1671f.C1673b {

    /* renamed from: a */
    final /* synthetic */ ArrayList f5479a;

    /* renamed from: b */
    final /* synthetic */ boolean f5480b;

    /* renamed from: c */
    final /* synthetic */ C1671f f5481c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1674g(C1671f fVar, ArrayList arrayList, boolean z) {
        super();
        this.f5481c = fVar;
        this.f5479a = arrayList;
        this.f5480b = z;
    }

    /* renamed from: a */
    public void mo6540a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5479a.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2270d((C2270d.C2271a) it.next()));
        }
        this.f5481c.m7696a(this.f5480b, true, (ArrayList<C2259P>) arrayList);
    }
}
