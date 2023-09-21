package android.support.p001v4.view;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.Y */
/* compiled from: ViewParentCompatICS */
public class C0392Y {
    /* renamed from: a */
    public static boolean m1757a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
