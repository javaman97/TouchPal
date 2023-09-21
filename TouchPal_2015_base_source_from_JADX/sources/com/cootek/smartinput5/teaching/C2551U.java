package com.cootek.smartinput5.teaching;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.AnimationListener;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.teaching.p065a.C2559a;

/* renamed from: com.cootek.smartinput5.teaching.U */
/* compiled from: TeachingTipSymbol */
class C2551U extends AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ImageView f10950a;

    /* renamed from: b */
    final /* synthetic */ View f10951b;

    /* renamed from: c */
    final /* synthetic */ Rect f10952c;

    /* renamed from: d */
    final /* synthetic */ TextView f10953d;

    /* renamed from: e */
    final /* synthetic */ Animation f10954e;

    /* renamed from: f */
    final /* synthetic */ C2544P f10955f;

    C2551U(C2544P p, ImageView imageView, View view, Rect rect, TextView textView, Animation animation) {
        this.f10955f = p;
        this.f10950a = imageView;
        this.f10951b = view;
        this.f10952c = rect;
        this.f10953d = textView;
        this.f10954e = animation;
    }

    public void onAnimationStart(Animation animation) {
        this.f10950a.setVisibility(4);
        this.f10951b.startAnimation(C2559a.m11422a(this.f10955f.f10967a, (Runnable) null));
    }

    public void onAnimationEnd(Animation animation) {
        Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_1_2"), 4);
        Engine.getInstance().processEvent();
        this.f10955f.mo8395a(this.f10952c.left, this.f10952c.top, this.f10952c.right, this.f10952c.bottom);
        this.f10953d.startAnimation(this.f10954e);
    }
}
