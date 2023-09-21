package com.cootek.smartinput5.teaching;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.AnimationListener;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.teaching.I */
/* compiled from: TeachingTipStrokeFilter */
class C2537I extends AnimationListener {

    /* renamed from: a */
    final /* synthetic */ TextView f10893a;

    /* renamed from: b */
    final /* synthetic */ ImageView f10894b;

    /* renamed from: c */
    final /* synthetic */ Rect f10895c;

    /* renamed from: d */
    final /* synthetic */ int f10896d;

    /* renamed from: e */
    final /* synthetic */ View f10897e;

    /* renamed from: f */
    final /* synthetic */ Animation f10898f;

    /* renamed from: g */
    final /* synthetic */ C2531C f10899g;

    C2537I(C2531C c, TextView textView, ImageView imageView, Rect rect, int i, View view, Animation animation) {
        this.f10899g = c;
        this.f10893a = textView;
        this.f10894b = imageView;
        this.f10895c = rect;
        this.f10896d = i;
        this.f10897e = view;
        this.f10898f = animation;
    }

    public void onAnimationStart(Animation animation) {
        this.f10893a.setVisibility(4);
        this.f10894b.setVisibility(0);
        this.f10899g.mo8395a(this.f10895c.left, this.f10895c.top, this.f10895c.right, this.f10895c.bottom);
    }

    public void onAnimationEnd(Animation animation) {
        Engine.getInstance().fireKeyOperation(this.f10896d, 0);
        Engine.getInstance().processEvent();
        this.f10897e.startAnimation(this.f10898f);
    }
}
