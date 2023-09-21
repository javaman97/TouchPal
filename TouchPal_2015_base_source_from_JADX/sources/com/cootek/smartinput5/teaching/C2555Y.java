package com.cootek.smartinput5.teaching;

import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.AnimationListener;
import com.cootek.smartinput5.teaching.p065a.C2559a;

/* renamed from: com.cootek.smartinput5.teaching.Y */
/* compiled from: TeachingTipsDelLeftSlide */
class C2555Y extends AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ImageView f10960a;

    /* renamed from: b */
    final /* synthetic */ ImageView f10961b;

    /* renamed from: c */
    final /* synthetic */ TextView f10962c;

    /* renamed from: d */
    final /* synthetic */ C2553W f10963d;

    C2555Y(C2553W w, ImageView imageView, ImageView imageView2, TextView textView) {
        this.f10963d = w;
        this.f10960a = imageView;
        this.f10961b = imageView2;
        this.f10962c = textView;
    }

    public void onAnimationStart(Animation animation) {
        this.f10960a.setVisibility(0);
        this.f10961b.setVisibility(0);
        this.f10962c.setVisibility(4);
        this.f10962c.setText("");
    }

    public void onAnimationEnd(Animation animation) {
        this.f10960a.setVisibility(8);
        this.f10961b.setVisibility(8);
        this.f10963d.mo8395a(0, 0, 0, 0);
        C2559a.m11439f();
        this.f10963d.mo8398b();
    }
}
