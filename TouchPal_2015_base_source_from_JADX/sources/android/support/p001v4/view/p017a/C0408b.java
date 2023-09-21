package android.support.p001v4.view.p017a;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: android.support.v4.view.a.b */
/* compiled from: AccessibilityEventCompatIcs */
class C0408b {
    C0408b() {
    }

    /* renamed from: a */
    public static int m1946a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    /* renamed from: a */
    public static void m1948a(AccessibilityEvent accessibilityEvent, Object obj) {
        accessibilityEvent.appendRecord((AccessibilityRecord) obj);
    }

    /* renamed from: a */
    public static Object m1947a(AccessibilityEvent accessibilityEvent, int i) {
        return accessibilityEvent.getRecord(i);
    }
}
