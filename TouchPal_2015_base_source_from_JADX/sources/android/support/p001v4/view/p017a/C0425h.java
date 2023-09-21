package android.support.p001v4.view.p017a;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

/* renamed from: android.support.v4.view.a.h */
/* compiled from: AccessibilityNodeInfoCompatIcs */
class C0425h {
    C0425h() {
    }

    /* renamed from: a */
    public static Object m2242a() {
        return AccessibilityNodeInfo.obtain();
    }

    /* renamed from: a */
    public static Object m2243a(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    /* renamed from: a */
    public static Object m2244a(Object obj) {
        return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo) obj);
    }

    /* renamed from: a */
    public static void m2246a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).addAction(i);
    }

    /* renamed from: a */
    public static void m2248a(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).addChild(view);
    }

    /* renamed from: a */
    public static List<Object> m2245a(Object obj, String str) {
        return ((AccessibilityNodeInfo) obj).findAccessibilityNodeInfosByText(str);
    }

    /* renamed from: b */
    public static int m2251b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getActions();
    }

    /* renamed from: a */
    public static void m2247a(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInParent(rect);
    }

    /* renamed from: b */
    public static void m2253b(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInScreen(rect);
    }

    /* renamed from: b */
    public static Object m2252b(Object obj, int i) {
        return ((AccessibilityNodeInfo) obj).getChild(i);
    }

    /* renamed from: c */
    public static int m2257c(Object obj) {
        return ((AccessibilityNodeInfo) obj).getChildCount();
    }

    /* renamed from: d */
    public static CharSequence m2263d(Object obj) {
        return ((AccessibilityNodeInfo) obj).getClassName();
    }

    /* renamed from: e */
    public static CharSequence m2267e(Object obj) {
        return ((AccessibilityNodeInfo) obj).getContentDescription();
    }

    /* renamed from: f */
    public static CharSequence m2269f(Object obj) {
        return ((AccessibilityNodeInfo) obj).getPackageName();
    }

    /* renamed from: g */
    public static Object m2271g(Object obj) {
        return ((AccessibilityNodeInfo) obj).getParent();
    }

    /* renamed from: h */
    public static CharSequence m2273h(Object obj) {
        return ((AccessibilityNodeInfo) obj).getText();
    }

    /* renamed from: i */
    public static int m2275i(Object obj) {
        return ((AccessibilityNodeInfo) obj).getWindowId();
    }

    /* renamed from: j */
    public static boolean m2278j(Object obj) {
        return ((AccessibilityNodeInfo) obj).isCheckable();
    }

    /* renamed from: k */
    public static boolean m2279k(Object obj) {
        return ((AccessibilityNodeInfo) obj).isChecked();
    }

    /* renamed from: l */
    public static boolean m2280l(Object obj) {
        return ((AccessibilityNodeInfo) obj).isClickable();
    }

    /* renamed from: m */
    public static boolean m2281m(Object obj) {
        return ((AccessibilityNodeInfo) obj).isEnabled();
    }

    /* renamed from: n */
    public static boolean m2282n(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocusable();
    }

    /* renamed from: o */
    public static boolean m2283o(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocused();
    }

    /* renamed from: p */
    public static boolean m2284p(Object obj) {
        return ((AccessibilityNodeInfo) obj).isLongClickable();
    }

    /* renamed from: q */
    public static boolean m2285q(Object obj) {
        return ((AccessibilityNodeInfo) obj).isPassword();
    }

    /* renamed from: r */
    public static boolean m2286r(Object obj) {
        return ((AccessibilityNodeInfo) obj).isScrollable();
    }

    /* renamed from: s */
    public static boolean m2287s(Object obj) {
        return ((AccessibilityNodeInfo) obj).isSelected();
    }

    /* renamed from: c */
    public static boolean m2262c(Object obj, int i) {
        return ((AccessibilityNodeInfo) obj).performAction(i);
    }

    /* renamed from: c */
    public static void m2258c(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInParent(rect);
    }

    /* renamed from: d */
    public static void m2264d(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInScreen(rect);
    }

    /* renamed from: a */
    public static void m2250a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setCheckable(z);
    }

    /* renamed from: b */
    public static void m2256b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setChecked(z);
    }

    /* renamed from: a */
    public static void m2249a(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setClassName(charSequence);
    }

    /* renamed from: c */
    public static void m2261c(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setClickable(z);
    }

    /* renamed from: b */
    public static void m2255b(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setContentDescription(charSequence);
    }

    /* renamed from: d */
    public static void m2266d(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setEnabled(z);
    }

    /* renamed from: e */
    public static void m2268e(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocusable(z);
    }

    /* renamed from: f */
    public static void m2270f(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocused(z);
    }

    /* renamed from: g */
    public static void m2272g(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setLongClickable(z);
    }

    /* renamed from: c */
    public static void m2260c(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setPackageName(charSequence);
    }

    /* renamed from: b */
    public static void m2254b(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setParent(view);
    }

    /* renamed from: h */
    public static void m2274h(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setPassword(z);
    }

    /* renamed from: i */
    public static void m2276i(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setScrollable(z);
    }

    /* renamed from: j */
    public static void m2277j(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setSelected(z);
    }

    /* renamed from: c */
    public static void m2259c(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setSource(view);
    }

    /* renamed from: d */
    public static void m2265d(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setText(charSequence);
    }

    /* renamed from: t */
    public static void m2288t(Object obj) {
        ((AccessibilityNodeInfo) obj).recycle();
    }
}
