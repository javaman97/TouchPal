package android.support.p001v4.view.p017a;

import android.os.Bundle;
import android.support.p001v4.view.p017a.C0429l;
import android.support.p001v4.view.p017a.C0436o;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.view.a.m */
/* compiled from: AccessibilityNodeProviderCompat */
class C0434m implements C0436o.C0437a {

    /* renamed from: a */
    final /* synthetic */ C0429l f1051a;

    /* renamed from: b */
    final /* synthetic */ C0429l.C0431b f1052b;

    C0434m(C0429l.C0431b bVar, C0429l lVar) {
        this.f1052b = bVar;
        this.f1051a = lVar;
    }

    /* renamed from: a */
    public boolean mo1462a(int i, int i2, Bundle bundle) {
        return this.f1051a.mo1457a(i, i2, bundle);
    }

    /* renamed from: a */
    public List<Object> mo1461a(String str, int i) {
        List<C0418g> a = this.f1051a.mo1456a(str, i);
        ArrayList arrayList = new ArrayList();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(a.get(i2).mo1327a());
        }
        return arrayList;
    }

    /* renamed from: a */
    public Object mo1460a(int i) {
        C0418g a = this.f1051a.mo1454a(i);
        if (a == null) {
            return null;
        }
        return a.mo1327a();
    }
}
