package android.support.p001v4.view.p017a;

import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import java.util.List;

/* renamed from: android.support.v4.view.a.t */
/* compiled from: AccessibilityRecordCompatIcs */
class C0448t {
    C0448t() {
    }

    /* renamed from: a */
    public static Object m2523a() {
        return AccessibilityRecord.obtain();
    }

    /* renamed from: a */
    public static Object m2524a(Object obj) {
        return AccessibilityRecord.obtain((AccessibilityRecord) obj);
    }

    /* renamed from: b */
    public static int m2530b(Object obj) {
        return ((AccessibilityRecord) obj).getAddedCount();
    }

    /* renamed from: c */
    public static CharSequence m2534c(Object obj) {
        return ((AccessibilityRecord) obj).getBeforeText();
    }

    /* renamed from: d */
    public static CharSequence m2538d(Object obj) {
        return ((AccessibilityRecord) obj).getClassName();
    }

    /* renamed from: e */
    public static CharSequence m2541e(Object obj) {
        return ((AccessibilityRecord) obj).getContentDescription();
    }

    /* renamed from: f */
    public static int m2544f(Object obj) {
        return ((AccessibilityRecord) obj).getCurrentItemIndex();
    }

    /* renamed from: g */
    public static int m2546g(Object obj) {
        return ((AccessibilityRecord) obj).getFromIndex();
    }

    /* renamed from: h */
    public static int m2548h(Object obj) {
        return ((AccessibilityRecord) obj).getItemCount();
    }

    /* renamed from: i */
    public static Parcelable m2550i(Object obj) {
        return ((AccessibilityRecord) obj).getParcelableData();
    }

    /* renamed from: j */
    public static int m2551j(Object obj) {
        return ((AccessibilityRecord) obj).getRemovedCount();
    }

    /* renamed from: k */
    public static int m2552k(Object obj) {
        return ((AccessibilityRecord) obj).getScrollX();
    }

    /* renamed from: l */
    public static int m2553l(Object obj) {
        return ((AccessibilityRecord) obj).getScrollY();
    }

    /* renamed from: m */
    public static Object m2554m(Object obj) {
        return ((AccessibilityRecord) obj).getSource();
    }

    /* renamed from: n */
    public static List<CharSequence> m2555n(Object obj) {
        return ((AccessibilityRecord) obj).getText();
    }

    /* renamed from: o */
    public static int m2556o(Object obj) {
        return ((AccessibilityRecord) obj).getToIndex();
    }

    /* renamed from: p */
    public static int m2557p(Object obj) {
        return ((AccessibilityRecord) obj).getWindowId();
    }

    /* renamed from: q */
    public static boolean m2558q(Object obj) {
        return ((AccessibilityRecord) obj).isChecked();
    }

    /* renamed from: r */
    public static boolean m2559r(Object obj) {
        return ((AccessibilityRecord) obj).isEnabled();
    }

    /* renamed from: s */
    public static boolean m2560s(Object obj) {
        return ((AccessibilityRecord) obj).isFullScreen();
    }

    /* renamed from: t */
    public static boolean m2561t(Object obj) {
        return ((AccessibilityRecord) obj).isPassword();
    }

    /* renamed from: u */
    public static boolean m2562u(Object obj) {
        return ((AccessibilityRecord) obj).isScrollable();
    }

    /* renamed from: v */
    public static void m2563v(Object obj) {
        ((AccessibilityRecord) obj).recycle();
    }

    /* renamed from: a */
    public static void m2525a(Object obj, int i) {
        ((AccessibilityRecord) obj).setAddedCount(i);
    }

    /* renamed from: a */
    public static void m2528a(Object obj, CharSequence charSequence) {
        ((AccessibilityRecord) obj).setBeforeText(charSequence);
    }

    /* renamed from: a */
    public static void m2529a(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setChecked(z);
    }

    /* renamed from: b */
    public static void m2532b(Object obj, CharSequence charSequence) {
        ((AccessibilityRecord) obj).setClassName(charSequence);
    }

    /* renamed from: c */
    public static void m2536c(Object obj, CharSequence charSequence) {
        ((AccessibilityRecord) obj).setContentDescription(charSequence);
    }

    /* renamed from: b */
    public static void m2531b(Object obj, int i) {
        ((AccessibilityRecord) obj).setCurrentItemIndex(i);
    }

    /* renamed from: b */
    public static void m2533b(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setEnabled(z);
    }

    /* renamed from: c */
    public static void m2535c(Object obj, int i) {
        ((AccessibilityRecord) obj).setFromIndex(i);
    }

    /* renamed from: c */
    public static void m2537c(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setFullScreen(z);
    }

    /* renamed from: d */
    public static void m2539d(Object obj, int i) {
        ((AccessibilityRecord) obj).setItemCount(i);
    }

    /* renamed from: a */
    public static void m2526a(Object obj, Parcelable parcelable) {
        ((AccessibilityRecord) obj).setParcelableData(parcelable);
    }

    /* renamed from: d */
    public static void m2540d(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setPassword(z);
    }

    /* renamed from: e */
    public static void m2542e(Object obj, int i) {
        ((AccessibilityRecord) obj).setRemovedCount(i);
    }

    /* renamed from: f */
    public static void m2545f(Object obj, int i) {
        ((AccessibilityRecord) obj).setScrollX(i);
    }

    /* renamed from: g */
    public static void m2547g(Object obj, int i) {
        ((AccessibilityRecord) obj).setScrollY(i);
    }

    /* renamed from: e */
    public static void m2543e(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setScrollable(z);
    }

    /* renamed from: a */
    public static void m2527a(Object obj, View view) {
        ((AccessibilityRecord) obj).setSource(view);
    }

    /* renamed from: h */
    public static void m2549h(Object obj, int i) {
        ((AccessibilityRecord) obj).setToIndex(i);
    }
}
