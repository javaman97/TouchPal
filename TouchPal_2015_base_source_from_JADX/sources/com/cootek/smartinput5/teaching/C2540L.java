package com.cootek.smartinput5.teaching;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.C2811cf;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.teaching.L */
/* compiled from: TeachingTipSwitchLanguage */
public class C2540L extends C2557a {

    /* renamed from: b */
    private Context f10911b;

    public C2540L(Context context, String str) {
        super(context, str);
        this.f10911b = context;
    }

    /* renamed from: w */
    public int mo8347w() {
        return R.string.teaching_tip_switch_language;
    }

    /* renamed from: f */
    public String mo8340f() {
        return this.f10911b.getResources().getString(R.string.mission_switch_language);
    }

    /* renamed from: s */
    public void mo8355s() {
        Settings.getInstance().setBoolSetting(Settings.LANG_KEY_ENABLED, false);
        Settings.getInstance().setIntSetting(Settings.LANGUAGE_SWITCHING_MODE, 2);
    }

    /* renamed from: u */
    public boolean mo8346u() {
        if (C1368X.m6320c().mo5842o().mo5945g().length > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public void mo8342h() {
        super.mo8342h();
        C2811cf f = Engine.getInstance().getWidgetManager().mo9646f();
        if (f.mo9182b("sk_sp") == null) {
            C1368X.m6320c().mo5850w().mo8408a();
            return;
        }
        Rect a = f.mo9177a("sk_sp");
        mo8395a(a.left, a.top + 0, a.right, a.bottom + 0);
        Drawable a2 = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.teaching_hand);
        Drawable a3 = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.teaching_arrow);
        Rect a4 = Engine.getInstance().getWidgetManager().mo9646f().mo9177a("sk_sp");
        ImageView imageView = new ImageView(this.f10911b);
        ImageView imageView2 = new ImageView(this.f10911b);
        TextView a5 = mo8391a(this.f10911b, C1368X.m6320c().mo5841n().mo6269e((int) R.string.wizard_tips_space_left_slide));
        imageView.setImageDrawable(a2);
        imageView2.setImageDrawable(a3);
        imageView2.setVisibility(4);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = a4.right - (a4.width() / 2);
        layoutParams.topMargin = (int) ((float) (a4.top + 0 + (a4.height() / 2)));
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(4);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        imageView2.setLayoutParams(layoutParams2);
        imageView2.measure(0, 0);
        layoutParams2.topMargin = (((int) ((float) (a4.top + 0))) + (a4.height() / 2)) - (imageView2.getMeasuredHeight() / 2);
        layoutParams2.leftMargin = a4.left - imageView2.getMeasuredWidth();
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        a5.setLayoutParams(layoutParams3);
        layoutParams3.addRule(14);
        layoutParams3.topMargin = mo8400i() / 3;
        mo8396a((View) imageView2);
        mo8396a((View) imageView);
        mo8396a((View) a5);
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, (float) ((-a4.width()) / 2), 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillBefore(true);
        translateAnimation.setAnimationListener(new C2541M(this, imageView, imageView2, a5));
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f10911b, R.anim.teaching_word_hide);
        loadAnimation.setAnimationListener(new C2542N(this, imageView, translateAnimation));
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f10911b, R.anim.teaching_word_show);
        loadAnimation2.setFillAfter(true);
        loadAnimation2.setAnimationListener(new C2543O(this, a5, loadAnimation));
        a5.startAnimation(loadAnimation2);
    }
}
