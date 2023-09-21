package com.cootek.smartinput5.teaching;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.p066ui.C2806cb;
import com.cootek.smartinput5.p066ui.C2811cf;
import com.cootek.smartinput5.teaching.p065a.C2559a;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.teaching.C */
/* compiled from: TeachingTipStrokeFilter */
public class C2531C extends C2557a {

    /* renamed from: b */
    private static final int f10876b = 0;

    /* renamed from: c */
    private static final int f10877c = 1;

    /* renamed from: d */
    private static final int f10878d = 2;

    /* renamed from: e */
    private final int f10879e = 10;

    /* renamed from: f */
    private int f10880f = -1;

    /* renamed from: g */
    private Runnable f10881g = new C2533E(this);

    public C2531C(Context context, String str) {
        super(context, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo8345r() {
        return C1549b.f4831b;
    }

    /* renamed from: d */
    public TextWatcher mo8339d() {
        return new C2532D(this);
    }

    /* renamed from: f */
    public String mo8340f() {
        return mo8392a((int) R.string.mission_stroke_filter_content);
    }

    /* renamed from: g */
    public String mo8341g() {
        return mo8392a((int) R.string.mission_stroke_filter_content_highlight);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Runnable mo8343k() {
        return this.f10881g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Runnable mo8344l() {
        return this.f10881g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo8342h() {
        super.mo8342h();
        C2806cb x = m11280x();
        C2806cb y = m11281y();
        if (x != null && y != null) {
            int z = m11282z();
            int A = m11279A();
            Rect a = C2559a.m11419a(x, 0);
            Rect a2 = C2559a.m11419a(y, 0);
            if (a != null && a2 != null) {
                View a3 = C2559a.m11420a(this.f10967a, a);
                View a4 = C2559a.m11420a(this.f10967a, a2);
                if (a3 != null && a4 != null) {
                    ImageView imageView = new ImageView(this.f10967a);
                    imageView.setImageDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.teaching_hand));
                    ImageView imageView2 = new ImageView(this.f10967a);
                    imageView2.setImageDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.teaching_word_ru));
                    ImageView imageView3 = new ImageView(this.f10967a);
                    imageView3.setImageDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.teaching_pie));
                    String a5 = mo8392a((int) R.string.paopao_teaching_pinyin_first);
                    TextView a6 = mo8391a(this.f10967a, a5);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.topMargin = mo8400i() / 3;
                    layoutParams.addRule(14);
                    a6.setLayoutParams(layoutParams);
                    String a7 = mo8392a((int) R.string.paopao_tesching_bihua_then);
                    TextView a8 = mo8391a(this.f10967a, a7);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams2.addRule(13);
                    layoutParams2.topMargin = 0;
                    a8.setLayoutParams(layoutParams2);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                    imageView2.setLayoutParams(layoutParams3);
                    imageView2.measure(0, 0);
                    layoutParams3.leftMargin = (mo8401j() - imageView2.getMeasuredWidth()) / 2;
                    layoutParams3.topMargin = (mo8400i() - imageView2.getMeasuredHeight()) / 2;
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                    imageView.setLayoutParams(layoutParams4);
                    imageView.measure(0, 0);
                    layoutParams4.topMargin = a.top + (a.height() / 3);
                    layoutParams4.leftMargin = (a.left - (imageView.getMeasuredWidth() / 3)) + (a.width() / 2);
                    RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
                    imageView3.setLayoutParams(layoutParams5);
                    imageView3.measure(0, 0);
                    layoutParams5.leftMargin = layoutParams3.leftMargin;
                    layoutParams5.topMargin = layoutParams3.topMargin;
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f10967a, R.anim.teaching_click);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f10967a, R.anim.teaching_click);
                    Animation a9 = C2559a.m11421a(this.f10967a, a6, new C2534F(this, a3, loadAnimation), (Runnable) null);
                    TranslateAnimation translateAnimation = new TranslateAnimation(0, (float) ((layoutParams5.leftMargin + ((imageView3.getMeasuredWidth() * 4) / 9)) - (imageView.getMeasuredWidth() / 3)), 0, (float) ((layoutParams5.leftMargin + ((imageView3.getMeasuredWidth() * 3) / 25)) - (imageView.getMeasuredWidth() / 3)), 0, (float) ((layoutParams5.topMargin + ((imageView3.getMeasuredHeight() * 3) / 7)) - (imageView.getMeasuredHeight() / 13)), 0, (float) ((layoutParams5.topMargin + ((imageView3.getMeasuredHeight() * 4) / 5)) - (imageView.getMeasuredHeight() / 13)));
                    translateAnimation.setDuration(AnimationUtils.loadAnimation(this.f10967a, R.anim.handpie).getDuration());
                    translateAnimation.setFillAfter(true);
                    Animation a10 = C2559a.m11421a(this.f10967a, a8, new C2535G(this, imageView2, imageView3, imageView, translateAnimation), (Runnable) null);
                    loadAnimation.setAnimationListener(new C2537I(this, a6, imageView, a, z, a4, loadAnimation2));
                    loadAnimation2.setAnimationListener(new C2538J(this, a2, imageView, A, a8, a10));
                    translateAnimation.setAnimationListener(new C2539K(this, imageView, a8, imageView2, imageView3));
                    a10.setFillAfter(true);
                    a3.setVisibility(4);
                    a4.setVisibility(4);
                    imageView2.setVisibility(4);
                    imageView3.setVisibility(4);
                    imageView.setVisibility(4);
                    a8.setVisibility(4);
                    mo8396a((View) imageView3);
                    mo8396a((View) imageView);
                    mo8396a(a3);
                    mo8396a(a4);
                    mo8396a((View) imageView2);
                    mo8396a((View) a6);
                    mo8396a((View) a8);
                    a6.startAnimation(a9);
                }
            }
        }
    }

    /* renamed from: x */
    private C2806cb m11280x() {
        C2811cf f = Engine.getInstance().getWidgetManager().mo9646f();
        if (f == null) {
            return null;
        }
        C2806cb a = f.mo9178a(1, "r", true);
        if (a == null) {
            a = f.mo9178a(1, "pqrs", true);
        }
        if (a == null) {
            return f.mo9178a(8, "r", true);
        }
        return a;
    }

    /* renamed from: y */
    private C2806cb m11281y() {
        C2811cf f = Engine.getInstance().getWidgetManager().mo9646f();
        if (f != null) {
            C2806cb a = f.mo9178a(1, C1351J.f4162g, true);
            if (a == null) {
                C2806cb a2 = f.mo9178a(1, "tuv", true);
                if (a2 == null) {
                    C2806cb a3 = f.mo9178a(4, C1351J.f4162g, true);
                    if (a3 != null) {
                        this.f10880f = 1;
                        return a3;
                    }
                } else {
                    this.f10880f = 2;
                    return a2;
                }
            } else {
                this.f10880f = 0;
                return a;
            }
        }
        return null;
    }

    /* renamed from: z */
    private int m11282z() {
        return C2559a.m11418a(this.f10880f, new String[]{"sk_1_4", "sk_1_2", "sk_3_1"});
    }

    /* renamed from: A */
    private int m11279A() {
        return C2559a.m11418a(this.f10880f, new String[]{"sk_1_7", "sk_1_4", "sk_3_2"});
    }

    /* renamed from: w */
    public int mo8347w() {
        return R.string.teaching_tip_strok_filter;
    }

    /* renamed from: u */
    public boolean mo8346u() {
        if (C1368X.m6324d()) {
            C1389aD o = C1368X.m6320c().mo5842o();
            if (!o.mo5960o(C1549b.f4831b) || !o.mo5954l(C1549b.f4831b).mo6156f()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
