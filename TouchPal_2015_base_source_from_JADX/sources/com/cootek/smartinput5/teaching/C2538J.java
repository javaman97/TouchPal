package com.cootek.smartinput5.teaching;

import android.graphics.Rect;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.AnimationListener;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.teaching.J */
/* compiled from: TeachingTipStrokeFilter */
class C2538J extends AnimationListener {

    /* renamed from: a */
    final /* synthetic */ Rect f10900a;

    /* renamed from: b */
    final /* synthetic */ ImageView f10901b;

    /* renamed from: c */
    final /* synthetic */ int f10902c;

    /* renamed from: d */
    final /* synthetic */ TextView f10903d;

    /* renamed from: e */
    final /* synthetic */ Animation f10904e;

    /* renamed from: f */
    final /* synthetic */ C2531C f10905f;

    C2538J(C2531C c, Rect rect, ImageView imageView, int i, TextView textView, Animation animation) {
        this.f10905f = c;
        this.f10900a = rect;
        this.f10901b = imageView;
        this.f10902c = i;
        this.f10903d = textView;
        this.f10904e = animation;
    }

    public void onAnimationStart(Animation animation) {
        this.f10905f.mo8395a(this.f10900a.left, this.f10900a.top, this.f10900a.right, this.f10900a.bottom);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.f10901b.setLayoutParams(layoutParams);
        layoutParams.topMargin = this.f10900a.top + (this.f10900a.height() / 3);
        layoutParams.leftMargin = (this.f10900a.left - (this.f10901b.getMeasuredWidth() / 3)) + (this.f10900a.width() / 2);
    }

    public void onAnimationEnd(Animation animation) {
        Engine.getInstance().fireKeyOperation(this.f10902c, 0);
        Engine.getInstance().processEvent();
        this.f10901b.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f10901b.setVisibility(4);
        this.f10903d.startAnimation(this.f10904e);
        this.f10905f.mo8395a(0, 0, 0, 0);
    }
}
