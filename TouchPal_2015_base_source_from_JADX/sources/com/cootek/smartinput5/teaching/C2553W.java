package com.cootek.smartinput5.teaching;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.C2811cf;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.teaching.W */
/* compiled from: TeachingTipsDelLeftSlide */
public class C2553W extends C2557a {
    public C2553W(Context context, String str) {
        super(context, str);
    }

    /* renamed from: f */
    public String mo8340f() {
        return mo8392a((int) R.string.mission_delete_everything);
    }

    /* renamed from: c */
    public String mo8386c() {
        return mo8392a((int) R.string.mission_del_by_slide);
    }

    /* renamed from: d */
    public TextWatcher mo8339d() {
        return new C2554X(this);
    }

    /* renamed from: a */
    private void m11363a(EditText editText, String str) {
        if (Engine.isInitialized()) {
            Engine.getInstance().fireCommitOperation(str);
            Engine.getInstance().processEvent();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo8342h() {
        super.mo8342h();
        C2811cf f = Engine.getInstance().getWidgetManager().mo9646f();
        m11363a((EditText) null, this.f10967a.getString(R.string.mission_delete_edit_text_content));
        if (f.mo9182b("sk_bk") == null) {
            C1368X.m6320c().mo5850w().mo8408a();
            return;
        }
        Rect a = f.mo9177a("sk_bk");
        mo8395a(a.left, a.top + 0, a.right, a.bottom + 0);
        Drawable a2 = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.teaching_hand);
        Drawable a3 = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.teaching_arrow);
        Rect a4 = Engine.getInstance().getWidgetManager().mo9646f().mo9177a("sk_bk");
        ImageView imageView = new ImageView(this.f10967a);
        ImageView imageView2 = new ImageView(this.f10967a);
        TextView a5 = mo8391a(this.f10967a, mo8392a((int) R.string.wizard_tips_del_slide_left));
        imageView.setImageDrawable(a2);
        imageView2.setImageDrawable(a3);
        imageView2.setVisibility(4);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = a4.left;
        layoutParams.topMargin = (int) ((float) (a4.top + 0 + (a4.height() / 2)));
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(4);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        imageView2.setLayoutParams(layoutParams2);
        imageView2.measure(0, 0);
        layoutParams2.topMargin = (int) ((float) (a4.top + 0));
        layoutParams2.leftMargin = a4.left - imageView2.getMeasuredWidth();
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        a5.setLayoutParams(layoutParams3);
        layoutParams3.addRule(14);
        layoutParams3.topMargin = mo8400i() / 3;
        mo8396a((View) imageView2);
        mo8396a((View) imageView);
        mo8396a((View) a5);
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, (float) (-imageView2.getMeasuredWidth()), 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillBefore(true);
        translateAnimation.setAnimationListener(new C2555Y(this, imageView, imageView2, a5));
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f10967a, R.anim.teaching_word_hide);
        loadAnimation.setAnimationListener(new C2556Z(this, imageView, translateAnimation));
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f10967a, R.anim.teaching_word_show);
        loadAnimation2.setFillAfter(true);
        loadAnimation2.setAnimationListener(new C2567aa(this, a5, loadAnimation));
        a5.startAnimation(loadAnimation2);
    }

    /* renamed from: w */
    public int mo8347w() {
        return R.string.teaching_tip_del_slide_left;
    }
}
