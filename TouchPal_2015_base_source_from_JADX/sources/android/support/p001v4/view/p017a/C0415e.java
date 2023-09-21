package android.support.p001v4.view.p017a;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* renamed from: android.support.v4.view.a.e */
/* compiled from: AccessibilityManagerCompatIcs */
class C0415e {

    /* renamed from: android.support.v4.view.a.e$a */
    /* compiled from: AccessibilityManagerCompatIcs */
    interface C0416a {
        /* renamed from: a */
        void mo1324a(boolean z);
    }

    C0415e() {
    }

    /* renamed from: a */
    public static Object m1975a(C0416a aVar) {
        return new C0417f(aVar);
    }

    /* renamed from: a */
    public static boolean m1978a(AccessibilityManager accessibilityManager, Object obj) {
        return accessibilityManager.addAccessibilityStateChangeListener((AccessibilityManager.AccessibilityStateChangeListener) obj);
    }

    /* renamed from: b */
    public static boolean m1980b(AccessibilityManager accessibilityManager, Object obj) {
        return accessibilityManager.removeAccessibilityStateChangeListener((AccessibilityManager.AccessibilityStateChangeListener) obj);
    }

    /* renamed from: a */
    public static List<AccessibilityServiceInfo> m1977a(AccessibilityManager accessibilityManager, int i) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i);
    }

    /* renamed from: a */
    public static List<AccessibilityServiceInfo> m1976a(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    /* renamed from: b */
    public static boolean m1979b(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }
}
