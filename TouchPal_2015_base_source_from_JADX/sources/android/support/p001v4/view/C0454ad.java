package android.support.p001v4.view;

import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.view.ad */
/* compiled from: ViewPropertyAnimatorCompatICS */
class C0454ad {
    C0454ad() {
    }

    /* renamed from: a */
    public static void m2580a(View view, long j) {
        view.animate().setDuration(j);
    }

    /* renamed from: a */
    public static void m2579a(View view, float f) {
        view.animate().alpha(f);
    }

    /* renamed from: b */
    public static void m2584b(View view, float f) {
        view.animate().translationX(f);
    }

    /* renamed from: c */
    public static void m2587c(View view, float f) {
        view.animate().translationY(f);
    }

    /* renamed from: a */
    public static long m2578a(View view) {
        return view.animate().getDuration();
    }

    /* renamed from: a */
    public static void m2582a(View view, Interpolator interpolator) {
        view.animate().setInterpolator(interpolator);
    }

    /* renamed from: b */
    public static void m2585b(View view, long j) {
        view.animate().setStartDelay(j);
    }

    /* renamed from: b */
    public static long m2583b(View view) {
        return view.animate().getStartDelay();
    }

    /* renamed from: d */
    public static void m2589d(View view, float f) {
        view.animate().alphaBy(f);
    }

    /* renamed from: e */
    public static void m2590e(View view, float f) {
        view.animate().rotation(f);
    }

    /* renamed from: f */
    public static void m2591f(View view, float f) {
        view.animate().rotationBy(f);
    }

    /* renamed from: g */
    public static void m2592g(View view, float f) {
        view.animate().rotationX(f);
    }

    /* renamed from: h */
    public static void m2593h(View view, float f) {
        view.animate().rotationXBy(f);
    }

    /* renamed from: i */
    public static void m2594i(View view, float f) {
        view.animate().rotationY(f);
    }

    /* renamed from: j */
    public static void m2595j(View view, float f) {
        view.animate().rotationYBy(f);
    }

    /* renamed from: k */
    public static void m2596k(View view, float f) {
        view.animate().scaleX(f);
    }

    /* renamed from: l */
    public static void m2597l(View view, float f) {
        view.animate().scaleXBy(f);
    }

    /* renamed from: m */
    public static void m2598m(View view, float f) {
        view.animate().scaleY(f);
    }

    /* renamed from: n */
    public static void m2599n(View view, float f) {
        view.animate().scaleYBy(f);
    }

    /* renamed from: c */
    public static void m2586c(View view) {
        view.animate().cancel();
    }

    /* renamed from: o */
    public static void m2600o(View view, float f) {
        view.animate().x(f);
    }

    /* renamed from: p */
    public static void m2601p(View view, float f) {
        view.animate().xBy(f);
    }

    /* renamed from: q */
    public static void m2602q(View view, float f) {
        view.animate().y(f);
    }

    /* renamed from: r */
    public static void m2603r(View view, float f) {
        view.animate().yBy(f);
    }

    /* renamed from: s */
    public static void m2604s(View view, float f) {
        view.animate().translationXBy(f);
    }

    /* renamed from: t */
    public static void m2605t(View view, float f) {
        view.animate().translationYBy(f);
    }

    /* renamed from: d */
    public static void m2588d(View view) {
        view.animate().start();
    }

    /* renamed from: a */
    public static void m2581a(View view, C0458ah ahVar) {
        view.animate().setListener(new C0455ae(ahVar, view));
    }
}
