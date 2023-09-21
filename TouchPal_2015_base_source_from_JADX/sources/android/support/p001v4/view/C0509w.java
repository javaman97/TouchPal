package android.support.p001v4.view;

import android.view.MotionEvent;

/* renamed from: android.support.v4.view.w */
/* compiled from: MotionEventCompatEclair */
class C0509w {
    C0509w() {
    }

    /* renamed from: a */
    public static int m2890a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    /* renamed from: b */
    public static int m2891b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    /* renamed from: c */
    public static float m2892c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    /* renamed from: d */
    public static float m2893d(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    /* renamed from: a */
    public static int m2889a(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }
}
