package android.support.p001v4.view;

import android.graphics.Paint;
import android.view.View;

/* renamed from: android.support.v4.view.L */
/* compiled from: ViewCompatJellybeanMr1 */
class C0354L {
    C0354L() {
    }

    /* renamed from: a */
    public static int m1649a(View view) {
        return view.getLabelFor();
    }

    /* renamed from: a */
    public static void m1650a(View view, int i) {
        view.setLabelFor(i);
    }

    /* renamed from: a */
    public static void m1652a(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    /* renamed from: b */
    public static int m1653b(View view) {
        return view.getLayoutDirection();
    }

    /* renamed from: b */
    public static void m1654b(View view, int i) {
        view.setLayoutDirection(i);
    }

    /* renamed from: c */
    public static int m1655c(View view) {
        return view.getPaddingStart();
    }

    /* renamed from: d */
    public static int m1656d(View view) {
        return view.getPaddingEnd();
    }

    /* renamed from: a */
    public static void m1651a(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }
}
