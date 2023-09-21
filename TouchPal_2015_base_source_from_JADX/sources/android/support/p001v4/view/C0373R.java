package android.support.p001v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.R */
/* compiled from: ViewGroupCompatIcs */
class C0373R {
    C0373R() {
    }

    /* renamed from: a */
    public static boolean m1691a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
