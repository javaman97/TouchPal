package android.support.p001v4.app;

import android.view.animation.Animation;

/* renamed from: android.support.v4.app.y */
/* compiled from: FragmentManager */
class C0181y implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ Fragment f483a;

    /* renamed from: b */
    final /* synthetic */ C0176t f484b;

    C0181y(C0176t tVar, Fragment fragment) {
        this.f484b = tVar;
        this.f483a = fragment;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.f483a.mAnimatingAway != null) {
            this.f483a.mAnimatingAway = null;
            this.f484b.mo572a(this.f483a, this.f483a.mStateAfterAnimating, 0, 0, false);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
