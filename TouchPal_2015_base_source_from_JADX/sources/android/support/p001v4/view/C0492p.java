package android.support.p001v4.view;

import android.view.ViewGroup;

/* renamed from: android.support.v4.view.p */
/* compiled from: MarginLayoutParamsCompatJellybeanMr1 */
class C0492p {
    C0492p() {
    }

    /* renamed from: a */
    public static int m2804a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    /* renamed from: b */
    public static int m2806b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    /* renamed from: a */
    public static void m2805a(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginStart(i);
    }

    /* renamed from: b */
    public static void m2807b(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginEnd(i);
    }

    /* renamed from: c */
    public static boolean m2809c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    /* renamed from: d */
    public static int m2810d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getLayoutDirection();
    }

    /* renamed from: c */
    public static void m2808c(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setLayoutDirection(i);
    }

    /* renamed from: d */
    public static void m2811d(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.resolveLayoutDirection(i);
    }
}
