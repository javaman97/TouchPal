package android.support.p001v4.view.p017a;

import android.os.Bundle;
import android.support.p001v4.view.p017a.C0429l;
import android.support.p001v4.view.p017a.C0439q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.view.a.n */
/* compiled from: AccessibilityNodeProviderCompat */
class C0435n implements C0439q.C0440a {

    /* renamed from: a */
    final /* synthetic */ C0429l f1053a;

    /* renamed from: b */
    final /* synthetic */ C0429l.C0432c f1054b;

    C0435n(C0429l.C0432c cVar, C0429l lVar) {
        this.f1054b = cVar;
        this.f1053a = lVar;
    }

    /* renamed from: a */
    public boolean mo1465a(int i, int i2, Bundle bundle) {
        return this.f1053a.mo1457a(i, i2, bundle);
    }

    /* renamed from: a */
    public List<Object> mo1464a(String str, int i) {
        List<C0418g> a = this.f1053a.mo1456a(str, i);
        ArrayList arrayList = new ArrayList();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(a.get(i2).mo1327a());
        }
        return arrayList;
    }

    /* renamed from: a */
    public Object mo1463a(int i) {
        C0418g a = this.f1053a.mo1454a(i);
        if (a == null) {
            return null;
        }
        return a.mo1327a();
    }

    /* renamed from: b */
    public Object mo1466b(int i) {
        C0418g b = this.f1053a.mo1458b(i);
        if (b == null) {
            return null;
        }
        return b.mo1327a();
    }
}
