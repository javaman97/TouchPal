package com.cootek.smartinput5.teaching;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.C2806cb;
import com.cootek.smartinput5.p066ui.C2811cf;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.teaching.p065a.C2559a;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.teaching.x */
/* compiled from: TeachingTipSmiley */
public class C2604x extends C2557a {

    /* renamed from: b */
    private Runnable f11140b = new C2530B(this);

    public C2604x(Context context, String str) {
        super(context, str);
    }

    /* renamed from: d */
    public TextWatcher mo8339d() {
        return new C2605y(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo8399e() {
        return true;
    }

    /* renamed from: f */
    public String mo8340f() {
        return mo8392a((int) R.string.mission_use_smiley_gesture);
    }

    /* renamed from: g */
    public String mo8341g() {
        return mo8392a((int) R.string.mission_smiley_symbol);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo8342h() {
        C2917du widgetManager = Engine.getInstance().getWidgetManager();
        if (widgetManager != null && widgetManager.mo9650h() != null && widgetManager.mo9646f() != null) {
            super.mo8342h();
            Drawable a = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.teaching_hand);
            C2811cf f = widgetManager.mo9646f();
            int height = widgetManager.mo9650h().getHeight();
            C2806cb b = f.mo9182b("sk_sp");
            ImageView imageView = new ImageView(this.f10967a);
            imageView.setImageDrawable(a);
            Rect a2 = C2559a.m11419a(b, height);
            View a3 = C2559a.m11420a(this.f10967a, a2);
            TextView a4 = mo8390a(this.f10967a, (int) R.string.mission_smiley_title);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = mo8400i() / 3;
            layoutParams.addRule(14);
            a4.setLayoutParams(layoutParams);
            float centerX = (float) a2.centerX();
            AnimationSet a5 = C2559a.m11423a(this.f10967a, (float) a2.centerX(), centerX, (float) a2.centerY(), (float) (a2.bottom - (a2.height() * 3)));
            a5.setAnimationListener(new C2606z(this, imageView, a4));
            Animation a6 = C2559a.m11421a(this.f10967a, a4, (Runnable) null, new C2529A(this, a2, imageView, a5));
            imageView.setVisibility(8);
            mo8396a((View) a4);
            mo8396a(a3);
            mo8396a((View) imageView);
            a4.startAnimation(a6);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Runnable mo8343k() {
        return this.f11140b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Runnable mo8344l() {
        return this.f11140b;
    }

    /* renamed from: w */
    public int mo8347w() {
        return R.string.teaching_tip_smiley;
    }
}
