package android.support.p001v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* renamed from: android.support.v4.widget.s */
/* compiled from: ScrollerCompatGingerbread */
class C0588s {
    C0588s() {
    }

    /* renamed from: a */
    public static Object m3373a(Context context, Interpolator interpolator) {
        return interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    /* renamed from: a */
    public static boolean m3379a(Object obj) {
        return ((OverScroller) obj).isFinished();
    }

    /* renamed from: b */
    public static int m3380b(Object obj) {
        return ((OverScroller) obj).getCurrX();
    }

    /* renamed from: c */
    public static int m3382c(Object obj) {
        return ((OverScroller) obj).getCurrY();
    }

    /* renamed from: d */
    public static boolean m3383d(Object obj) {
        return ((OverScroller) obj).computeScrollOffset();
    }

    /* renamed from: a */
    public static void m3375a(Object obj, int i, int i2, int i3, int i4) {
        ((OverScroller) obj).startScroll(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m3376a(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((OverScroller) obj).startScroll(i, i2, i3, i4, i5);
    }

    /* renamed from: a */
    public static void m3377a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((OverScroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    /* renamed from: a */
    public static void m3378a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        ((OverScroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    /* renamed from: e */
    public static void m3384e(Object obj) {
        ((OverScroller) obj).abortAnimation();
    }

    /* renamed from: a */
    public static void m3374a(Object obj, int i, int i2, int i3) {
        ((OverScroller) obj).notifyHorizontalEdgeReached(i, i2, i3);
    }

    /* renamed from: b */
    public static void m3381b(Object obj, int i, int i2, int i3) {
        ((OverScroller) obj).notifyVerticalEdgeReached(i, i2, i3);
    }

    /* renamed from: f */
    public static boolean m3385f(Object obj) {
        return ((OverScroller) obj).isOverScrolled();
    }

    /* renamed from: g */
    public static int m3386g(Object obj) {
        return ((OverScroller) obj).getFinalX();
    }

    /* renamed from: h */
    public static int m3387h(Object obj) {
        return ((OverScroller) obj).getFinalY();
    }
}
