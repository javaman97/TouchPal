package com.cootek.smartinput5.teaching;

import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.AnimationListener;
import com.cootek.smartinput5.teaching.p065a.C2559a;

/* renamed from: com.cootek.smartinput5.teaching.M */
/* compiled from: TeachingTipSwitchLanguage */
class C2541M extends AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ImageView f10912a;

    /* renamed from: b */
    final /* synthetic */ ImageView f10913b;

    /* renamed from: c */
    final /* synthetic */ TextView f10914c;

    /* renamed from: d */
    final /* synthetic */ C2540L f10915d;

    C2541M(C2540L l, ImageView imageView, ImageView imageView2, TextView textView) {
        this.f10915d = l;
        this.f10912a = imageView;
        this.f10913b = imageView2;
        this.f10914c = textView;
    }

    public void onAnimationStart(Animation animation) {
        this.f10912a.setVisibility(0);
        this.f10913b.setVisibility(0);
        this.f10914c.setVisibility(4);
        this.f10914c.setText("");
    }

    public void onAnimationEnd(Animation animation) {
        this.f10912a.setVisibility(8);
        this.f10913b.setVisibility(8);
        this.f10915d.mo8395a(0, 0, 0, 0);
        C2559a.m11440g();
        this.f10915d.mo8398b();
    }
}
