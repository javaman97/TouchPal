package android.support.p001v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.f */
/* compiled from: AccessibilityDelegateCompatJellyBean */
class C0465f {

    /* renamed from: android.support.v4.view.f$a */
    /* compiled from: AccessibilityDelegateCompatJellyBean */
    public interface C0466a {
        /* renamed from: a */
        Object mo1580a(View view);

        /* renamed from: a */
        void mo1581a(View view, int i);

        /* renamed from: a */
        void mo1582a(View view, Object obj);

        /* renamed from: a */
        boolean mo1583a(View view, int i, Bundle bundle);

        /* renamed from: a */
        boolean mo1584a(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: a */
        boolean mo1585a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: b */
        void mo1586b(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: c */
        void mo1587c(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: d */
        void mo1588d(View view, AccessibilityEvent accessibilityEvent);
    }

    C0465f() {
    }

    /* renamed from: a */
    public static Object m2652a(C0466a aVar) {
        return new C0467g(aVar);
    }

    /* renamed from: a */
    public static Object m2653a(Object obj, View view) {
        return ((View.AccessibilityDelegate) obj).getAccessibilityNodeProvider(view);
    }

    /* renamed from: a */
    public static boolean m2654a(Object obj, View view, int i, Bundle bundle) {
        return ((View.AccessibilityDelegate) obj).performAccessibilityAction(view, i, bundle);
    }
}
