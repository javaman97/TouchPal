package android.support.p001v4.view.p017a;

import android.os.Bundle;
import android.support.p001v4.view.p017a.C0439q;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: android.support.v4.view.a.r */
/* compiled from: AccessibilityNodeProviderCompatKitKat */
final class C0441r extends AccessibilityNodeProvider {

    /* renamed from: a */
    final /* synthetic */ C0439q.C0440a f1056a;

    C0441r(C0439q.C0440a aVar) {
        this.f1056a = aVar;
    }

    /* renamed from: a */
    public AccessibilityNodeInfo mo1470a(int i) {
        return (AccessibilityNodeInfo) this.f1056a.mo1463a(i);
    }

    /* renamed from: a */
    public List<AccessibilityNodeInfo> mo1471a(String str, int i) {
        return this.f1056a.mo1464a(str, i);
    }

    /* renamed from: a */
    public boolean mo1472a(int i, int i2, Bundle bundle) {
        return this.f1056a.mo1465a(i, i2, bundle);
    }

    /* renamed from: b */
    public AccessibilityNodeInfo mo1473b(int i) {
        return (AccessibilityNodeInfo) this.f1056a.mo1466b(i);
    }
}
