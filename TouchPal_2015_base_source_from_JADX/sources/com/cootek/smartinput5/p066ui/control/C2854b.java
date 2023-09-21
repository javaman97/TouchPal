package com.cootek.smartinput5.p066ui.control;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.FunctionBar;

/* renamed from: com.cootek.smartinput5.ui.control.b */
/* compiled from: AnimationController */
public class C2854b {

    /* renamed from: a */
    public final int f13016a = 1;

    /* renamed from: b */
    public final int f13017b = 2;

    /* renamed from: c */
    public final int f13018c = -1;

    /* renamed from: d */
    public final int f13019d = 0;

    /* renamed from: e */
    public final int f13020e = 1;

    /* renamed from: f */
    public final int f13021f = 2;

    /* renamed from: g */
    public final int f13022g = 3;

    /* renamed from: h */
    public final int f13023h = 4;

    /* renamed from: i */
    public final int f13024i = 5;

    /* renamed from: j */
    public final int f13025j = 6;

    /* renamed from: k */
    public final int f13026k = 7;

    /* renamed from: com.cootek.smartinput5.ui.control.b$a */
    /* compiled from: AnimationController */
    private class C2855a implements Animation.AnimationListener {

        /* renamed from: b */
        private View f13028b;

        /* renamed from: c */
        private int f13029c;

        public C2855a(View view, int i) {
            this.f13028b = view;
            this.f13029c = i;
        }

        public void onAnimationStart(Animation animation) {
        }

        public void onAnimationEnd(Animation animation) {
            C2917du widgetManager;
            FunctionBar h;
            this.f13028b.setVisibility(this.f13029c);
            if (Engine.isInitialized() && (widgetManager = Engine.getInstance().getWidgetManager()) != null && (h = widgetManager.mo9650h()) != null) {
                h.setClickableOnAnim(true);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* renamed from: a */
    private void m13228a(Animation animation, int i, long j, long j2) {
        switch (i) {
            case 0:
                animation.setInterpolator(new LinearInterpolator());
                break;
            case 1:
                animation.setInterpolator(new AccelerateInterpolator(2.0f));
                break;
            case 2:
                animation.setInterpolator(new DecelerateInterpolator(2.0f));
                break;
            case 3:
                animation.setInterpolator(new AccelerateDecelerateInterpolator());
                break;
            case 4:
                animation.setInterpolator(new BounceInterpolator());
                break;
            case 5:
                animation.setInterpolator(new OvershootInterpolator());
                break;
            case 6:
                animation.setInterpolator(new AnticipateInterpolator());
                break;
            case 7:
                animation.setInterpolator(new AnticipateOvershootInterpolator());
                break;
        }
        animation.setDuration(j);
        animation.setStartOffset(j2);
    }

    /* renamed from: a */
    private void m13227a(View view, Animation animation, long j, long j2) {
        m13228a(animation, 2, j, j2);
        animation.setAnimationListener(new C2855a(view, 0));
        view.startAnimation(animation);
    }

    /* renamed from: b */
    private void m13229b(View view, Animation animation, long j, long j2) {
        m13228a(animation, 1, j, j2);
        animation.setAnimationListener(new C2855a(view, 8));
        view.startAnimation(animation);
    }

    /* renamed from: a */
    public void mo9484a(View view) {
        view.setVisibility(0);
    }

    /* renamed from: b */
    public void mo9486b(View view) {
        view.setVisibility(8);
    }

    /* renamed from: c */
    public void mo9488c(View view) {
        view.setVisibility(4);
    }

    /* renamed from: a */
    public void mo9485a(View view, long j, long j2) {
        m13227a(view, (Animation) new AlphaAnimation(0.0f, 1.0f), j, j2);
    }

    /* renamed from: b */
    public void mo9487b(View view, long j, long j2) {
        m13229b(view, new AlphaAnimation(1.0f, 0.0f), j, j2);
    }

    /* renamed from: c */
    public void mo9489c(View view, long j, long j2) {
        m13227a(view, (Animation) new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f), j, j2);
    }

    /* renamed from: d */
    public void mo9490d(View view, long j, long j2) {
        m13229b(view, new TranslateAnimation(2, 0.0f, 2, -1.0f, 2, 0.0f, 2, 0.0f), j, j2);
    }

    /* renamed from: e */
    public void mo9491e(View view, long j, long j2) {
        m13227a(view, (Animation) new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 2, 0.5f, 2, 0.5f), j, j2);
    }

    /* renamed from: f */
    public void mo9492f(View view, long j, long j2) {
        m13229b(view, new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 2, 0.5f, 2, 0.5f), j, j2);
    }

    /* renamed from: g */
    public void mo9493g(View view, long j, long j2) {
        m13227a(view, (Animation) new RotateAnimation(-90.0f, 0.0f, 1, 0.0f, 1, 1.0f), j, j2);
    }

    /* renamed from: h */
    public void mo9494h(View view, long j, long j2) {
        m13229b(view, new RotateAnimation(0.0f, 90.0f, 1, 0.0f, 1, 1.0f), j, j2);
    }

    /* renamed from: i */
    public void mo9495i(View view, long j, long j2) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(rotateAnimation);
        m13227a(view, (Animation) animationSet, j, j2);
    }

    /* renamed from: j */
    public void mo9496j(View view, long j, long j2) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(rotateAnimation);
        m13229b(view, animationSet, j, j2);
    }

    /* renamed from: k */
    public void mo9497k(View view, long j, long j2) {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, -1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        m13227a(view, (Animation) animationSet, j, j2);
    }

    /* renamed from: l */
    public void mo9498l(View view, long j, long j2) {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        m13229b(view, animationSet, j, j2);
    }
}
