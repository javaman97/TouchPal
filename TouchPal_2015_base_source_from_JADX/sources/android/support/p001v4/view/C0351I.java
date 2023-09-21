package android.support.p001v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

/* renamed from: android.support.v4.view.I */
/* compiled from: ViewCompatHC */
class C0351I {
    C0351I() {
    }

    /* renamed from: a */
    static long m1601a() {
        return ValueAnimator.getFrameDelay();
    }

    /* renamed from: a */
    public static float m1599a(View view) {
        return view.getAlpha();
    }

    /* renamed from: a */
    public static void m1603a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    /* renamed from: b */
    public static int m1604b(View view) {
        return view.getLayerType();
    }

    /* renamed from: a */
    public static int m1600a(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    /* renamed from: c */
    public static int m1606c(View view) {
        return view.getMeasuredWidthAndState();
    }

    /* renamed from: d */
    public static int m1608d(View view) {
        return view.getMeasuredHeightAndState();
    }

    /* renamed from: e */
    public static int m1610e(View view) {
        return view.getMeasuredState();
    }

    /* renamed from: f */
    public static float m1612f(View view) {
        return view.getTranslationX();
    }

    /* renamed from: g */
    public static float m1614g(View view) {
        return view.getTranslationY();
    }

    /* renamed from: h */
    public static float m1616h(View view) {
        return view.getX();
    }

    /* renamed from: i */
    public static float m1618i(View view) {
        return view.getY();
    }

    /* renamed from: j */
    public static float m1620j(View view) {
        return view.getRotation();
    }

    /* renamed from: k */
    public static float m1622k(View view) {
        return view.getRotationX();
    }

    /* renamed from: l */
    public static float m1624l(View view) {
        return view.getRotationY();
    }

    /* renamed from: m */
    public static float m1626m(View view) {
        return view.getScaleX();
    }

    /* renamed from: n */
    public static float m1627n(View view) {
        return view.getScaleY();
    }

    /* renamed from: a */
    public static void m1602a(View view, float f) {
        view.setTranslationX(f);
    }

    /* renamed from: b */
    public static void m1605b(View view, float f) {
        view.setTranslationY(f);
    }

    /* renamed from: c */
    public static void m1607c(View view, float f) {
        view.setAlpha(f);
    }

    /* renamed from: d */
    public static void m1609d(View view, float f) {
        view.setX(f);
    }

    /* renamed from: e */
    public static void m1611e(View view, float f) {
        view.setY(f);
    }

    /* renamed from: f */
    public static void m1613f(View view, float f) {
        view.setRotation(f);
    }

    /* renamed from: g */
    public static void m1615g(View view, float f) {
        view.setRotationX(f);
    }

    /* renamed from: h */
    public static void m1617h(View view, float f) {
        view.setRotationY(f);
    }

    /* renamed from: i */
    public static void m1619i(View view, float f) {
        view.setScaleX(f);
    }

    /* renamed from: j */
    public static void m1621j(View view, float f) {
        view.setScaleY(f);
    }

    /* renamed from: k */
    public static void m1623k(View view, float f) {
        view.setPivotX(f);
    }

    /* renamed from: l */
    public static void m1625l(View view, float f) {
        view.setPivotY(f);
    }

    /* renamed from: o */
    public static float m1628o(View view) {
        return view.getPivotX();
    }

    /* renamed from: p */
    public static float m1629p(View view) {
        return view.getPivotY();
    }
}
