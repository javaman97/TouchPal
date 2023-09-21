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
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.p066ui.C2811cf;
import com.cootek.smartinput5.teaching.p065a.C2559a;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.teaching.t */
/* compiled from: TeachingTipPrediction */
public class C2600t extends C2557a {
    public C2600t(Context context, String str) {
        super(context, str);
    }

    /* renamed from: f */
    public String mo8340f() {
        return mo8392a((int) R.string.mission_turn_off_prediction);
    }

    /* renamed from: g */
    public String mo8341g() {
        return mo8392a((int) R.string.mission_sxsw);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo8345r() {
        return C1549b.f4791a;
    }

    /* renamed from: s */
    public void mo8355s() {
        super.mo8355s();
        Settings.getInstance().setBoolSetting(1, false);
    }

    /* renamed from: d */
    public TextWatcher mo8339d() {
        return new C2601u(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo8342h() {
        super.mo8342h();
        Settings.getInstance().setBoolSetting(1, false);
        Engine.getInstance().getSurfaceManager().updateSurface();
        Drawable a = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.teaching_hand);
        ImageView imageView = new ImageView(this.f10967a);
        imageView.setImageDrawable(a);
        C2811cf f = Engine.getInstance().getWidgetManager().mo9646f();
        Rect a2 = C2559a.m11419a(f.mo9182b("sk_sp"), 0);
        imageView.measure(0, 0);
        float measuredWidth = (float) (a2.right - imageView.getMeasuredWidth());
        float centerY = (float) a2.centerY();
        View a3 = C2559a.m11420a(this.f10967a, a2);
        TextView a4 = mo8390a(this.f10967a, (int) R.string.tutorial_slide_right);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.topMargin = mo8400i() / 3;
        a4.setLayoutParams(layoutParams);
        AnimationSet a5 = C2559a.m11423a(this.f10967a, (float) a2.left, measuredWidth, (float) a2.centerY(), centerY);
        a5.setAnimationListener(new C2602v(this, a3, f, a4, imageView));
        super.mo8395a(a2.left, a2.top, a2.right, a2.bottom);
        Animation a6 = C2559a.m11421a(this.f10967a, a4, (Runnable) null, new C2603w(this, imageView, a5));
        imageView.setVisibility(8);
        mo8396a((View) imageView);
        mo8396a((View) a4);
        a4.startAnimation(a6);
    }

    /* renamed from: w */
    public int mo8347w() {
        return R.string.teaching_tip_prediction;
    }
}
