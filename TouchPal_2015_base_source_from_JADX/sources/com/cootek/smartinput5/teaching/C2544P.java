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
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.p066ui.C2811cf;
import com.cootek.smartinput5.teaching.p065a.C2559a;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.teaching.P */
/* compiled from: TeachingTipSymbol */
public class C2544P extends C2557a {

    /* renamed from: b */
    private Runnable f10922b = new C2546R(this);

    public C2544P(Context context, String str) {
        super(context, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public int mo8356q() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo8345r() {
        return C1549b.f4791a;
    }

    /* renamed from: s */
    public void mo8355s() {
        super.mo8355s();
        Settings.getInstance().setBoolSetting(53, false);
        Settings.getInstance().setBoolSetting(31, true);
        Settings.getInstance().setBoolSetting(Settings.CURVE_ENABLED_UI, true);
        Settings.getInstance().setIntSetting(4, 1, 9, C1549b.f4791a, (Config) null, true);
        if (Engine.isInitialized()) {
            Engine.getInstance().updateResult(1, -1);
        }
    }

    /* renamed from: d */
    public TextWatcher mo8339d() {
        return new C2545Q(this);
    }

    /* renamed from: f */
    public String mo8340f() {
        return mo8392a((int) R.string.mission_use_symbol_gesture);
    }

    /* renamed from: g */
    public String mo8341g() {
        return mo8392a((int) R.string.mission_symbol_content);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Runnable mo8343k() {
        return this.f10922b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Runnable mo8344l() {
        return this.f10922b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo8342h() {
        super.mo8342h();
        Drawable a = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.teaching_hand);
        ImageView imageView = new ImageView(this.f10967a);
        imageView.setImageDrawable(a);
        ImageView imageView2 = new ImageView(this.f10967a);
        imageView2.setImageDrawable(a);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        imageView2.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        C2811cf f = Engine.getInstance().getWidgetManager().mo9646f();
        Rect a2 = C2559a.m11419a(f.mo9178a(1, "w", true), 0);
        float f2 = (float) a2.left;
        AnimationSet a3 = C2559a.m11423a(this.f10967a, (float) a2.left, f2, (float) a2.bottom, (float) a2.top);
        Rect a4 = C2559a.m11419a(f.mo9178a(1, "n", true), 0);
        float f3 = (float) a4.left;
        AnimationSet a5 = C2559a.m11423a(this.f10967a, (float) a4.left, f3, (float) a4.top, (float) a4.bottom);
        View a6 = C2559a.m11420a(this.f10967a, a2);
        View a7 = C2559a.m11420a(this.f10967a, a4);
        TextView a8 = mo8390a(this.f10967a, (int) R.string.tutorial_longpress_sym);
        TextView a9 = mo8390a(this.f10967a, (int) R.string.tutorial_slide_up);
        TextView a10 = mo8390a(this.f10967a, (int) R.string.tutorial_slide_down);
        TextView a11 = mo8390a(this.f10967a, (int) R.string.tutorial_slide_right);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        a8.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = a2.top + a2.height();
        layoutParams2.addRule(14);
        a9.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = a4.top - a4.height();
        layoutParams3.addRule(14);
        a10.setLayoutParams(layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = mo8400i() / 2;
        layoutParams4.addRule(14);
        a11.setLayoutParams(layoutParams4);
        a5.setAnimationListener(new C2547S(this, a7));
        a3.setAnimationListener(new C2551U(this, imageView, a6, a4, a10, C2559a.m11421a(this.f10967a, a10, (Runnable) null, new C2548T(this, imageView2, a5))));
        Animation a12 = C2559a.m11421a(this.f10967a, a9, (Runnable) null, new C2552V(this, imageView, a3));
        imageView2.setVisibility(4);
        imageView.setVisibility(4);
        a11.setVisibility(4);
        a10.setVisibility(4);
        a9.setVisibility(4);
        a6.setVisibility(4);
        a7.setVisibility(4);
        a8.setVisibility(4);
        mo8396a(a6);
        mo8396a(a7);
        mo8396a((View) a11);
        mo8396a((View) a10);
        mo8396a((View) a9);
        mo8396a((View) imageView2);
        mo8396a((View) imageView);
        mo8395a(a2.left, a2.top, a2.right, a2.bottom);
        a9.startAnimation(a12);
    }

    /* renamed from: w */
    public int mo8347w() {
        return R.string.teaching_tip_symbol;
    }
}
