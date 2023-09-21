package android.support.p001v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: android.support.v4.view.ae */
/* compiled from: ViewPropertyAnimatorCompatICS */
final class C0455ae extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0458ah f1065a;

    /* renamed from: b */
    final /* synthetic */ View f1066b;

    C0455ae(C0458ah ahVar, View view) {
        this.f1065a = ahVar;
        this.f1066b = view;
    }

    public void onAnimationCancel(Animator animator) {
        this.f1065a.mo1569c(this.f1066b);
    }

    public void onAnimationEnd(Animator animator) {
        this.f1065a.mo1568b(this.f1066b);
    }

    public void onAnimationStart(Animator animator) {
        this.f1065a.mo1567a(this.f1066b);
    }
}
