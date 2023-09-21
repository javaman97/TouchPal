package android.support.p001v4.p002a;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.ResolveInfo;

/* renamed from: android.support.v4.a.b */
/* compiled from: AccessibilityServiceInfoCompatIcs */
class C0030b {
    C0030b() {
    }

    /* renamed from: a */
    public static boolean m31a(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCanRetrieveWindowContent();
    }

    /* renamed from: b */
    public static String m32b(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getDescription();
    }

    /* renamed from: c */
    public static String m33c(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getId();
    }

    /* renamed from: d */
    public static ResolveInfo m34d(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getResolveInfo();
    }

    /* renamed from: e */
    public static String m35e(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getSettingsActivityName();
    }
}
