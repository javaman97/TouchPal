package android.support.p001v4.view.p017a;

import android.os.Bundle;
import android.support.p001v4.view.p017a.C0436o;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: android.support.v4.view.a.p */
/* compiled from: AccessibilityNodeProviderCompatJellyBean */
final class C0438p extends AccessibilityNodeProvider {

    /* renamed from: a */
    final /* synthetic */ C0436o.C0437a f1055a;

    C0438p(C0436o.C0437a aVar) {
        this.f1055a = aVar;
    }

    /* renamed from: a */
    public AccessibilityNodeInfo mo1467a(int i) {
        return (AccessibilityNodeInfo) this.f1055a.mo1460a(i);
    }

    /* renamed from: a */
    public List<AccessibilityNodeInfo> mo1468a(String str, int i) {
        return this.f1055a.mo1461a(str, i);
    }

    /* renamed from: a */
    public boolean mo1469a(int i, int i2, Bundle bundle) {
        return this.f1055a.mo1462a(i, i2, bundle);
    }
}
