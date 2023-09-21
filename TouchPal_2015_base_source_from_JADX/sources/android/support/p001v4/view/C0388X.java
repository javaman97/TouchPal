package android.support.p001v4.view;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

/* renamed from: android.support.v4.view.X */
/* compiled from: ViewParentCompat */
public class C0388X {

    /* renamed from: a */
    static final C0390b f988a;

    /* renamed from: android.support.v4.view.X$b */
    /* compiled from: ViewParentCompat */
    interface C0390b {
        /* renamed from: a */
        boolean mo1231a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent);
    }

    /* renamed from: android.support.v4.view.X$c */
    /* compiled from: ViewParentCompat */
    static class C0391c implements C0390b {
        C0391c() {
        }

        /* renamed from: a */
        public boolean mo1231a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
            if (view == null) {
                return false;
            }
            ((AccessibilityManager) view.getContext().getSystemService("accessibility")).sendAccessibilityEvent(accessibilityEvent);
            return true;
        }
    }

    /* renamed from: android.support.v4.view.X$a */
    /* compiled from: ViewParentCompat */
    static class C0389a extends C0391c {
        C0389a() {
        }

        /* renamed from: a */
        public boolean mo1231a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
            return C0392Y.m1757a(viewParent, view, accessibilityEvent);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f988a = new C0389a();
        } else {
            f988a = new C0391c();
        }
    }

    private C0388X() {
    }

    /* renamed from: a */
    public static boolean m1753a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return f988a.mo1231a(viewParent, view, accessibilityEvent);
    }
}
