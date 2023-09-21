package com.cootek.smartinput5.func.smileypanel.p060c;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.p066ui.C2726bF;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.smileypanel.c.d */
/* compiled from: EmojiArtItem */
public class C2039d {

    /* renamed from: a */
    private static final int f7075a = 6;

    /* renamed from: b */
    private static final float f7076b = 1.5f;

    /* renamed from: c */
    private static final String f7077c = "art_content";

    /* renamed from: o */
    private static float f7078o;

    /* renamed from: d */
    private String f7079d;

    /* renamed from: e */
    private int f7080e = this.f7083h.length;

    /* renamed from: f */
    private final int f7081f;

    /* renamed from: g */
    private final int f7082g;

    /* renamed from: h */
    private String[] f7083h;

    /* renamed from: i */
    private Context f7084i;

    /* renamed from: j */
    private View f7085j;

    /* renamed from: k */
    private TextView f7086k;

    /* renamed from: l */
    private int f7087l;

    /* renamed from: m */
    private int f7088m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final int f7089n;

    public C2039d(Context context, View view, String str, int i, int i2, int i3) {
        this.f7079d = str;
        this.f7083h = str.split(C0911j.f2473c);
        this.f7081f = i;
        this.f7082g = i2;
        this.f7084i = context;
        this.f7085j = view;
        this.f7089n = i3;
    }

    /* renamed from: a */
    public String mo7400a() {
        return this.f7079d;
    }

    /* renamed from: b */
    public int mo7402b() {
        return this.f7082g;
    }

    /* renamed from: c */
    public int mo7403c() {
        return this.f7081f;
    }

    /* renamed from: d */
    public int mo7404d() {
        return ((float) this.f7080e) / 6.0f > f7076b ? 2 : 1;
    }

    /* renamed from: a */
    public View mo7399a(Context context, View view, int i, boolean z) {
        TextView textView;
        int c;
        int b;
        RelativeLayout relativeLayout = (RelativeLayout) view;
        if (relativeLayout == null) {
            relativeLayout = new RelativeLayout(context);
            relativeLayout.setGravity(17);
            C2726bF bFVar = C2726bF.KEY_BG;
            C1602bh n = C1368X.m6320c().mo5841n();
            Drawable a = n.mo6250a((int) R.drawable.emojiart_item_bg, bFVar);
            int b2 = n.mo6260b((int) R.color.emoji_art_text_color);
            relativeLayout.setBackgroundDrawable(a);
            TextView textView2 = new TextView(context);
            textView2.setTag(f7077c);
            relativeLayout.addView(textView2);
            textView2.setPadding(0, 0, 0, 0);
            textView2.setTextColor(b2);
            textView = textView2;
        } else {
            TextView textView3 = (TextView) relativeLayout.findViewWithTag(f7077c);
            textView3.setBackgroundColor(0);
            textView = textView3;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
        int dimension = (int) context.getResources().getDimension(R.dimen.emoji_art_item_padding);
        int i2 = dimension / 2;
        int i3 = dimension / 2;
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(i2, i3, i2, i3);
            relativeLayout.setLayoutParams(layoutParams);
        }
        if (f7078o == 0.0f) {
            f7078o = textView.getTextSize();
        }
        textView.setTextSize(0, f7078o);
        textView.setText(mo7400a());
        textView.measure(0, 0);
        int measuredWidth = textView.getMeasuredWidth();
        int measuredHeight = textView.getMeasuredHeight();
        if (z) {
            c = mo7403c() - (i2 * 2);
            b = (mo7402b() / i) - (i3 * 2);
            layoutParams.width = mo7403c() - (i2 * 2);
            layoutParams.height = mo7402b() / i;
        } else {
            c = mo7403c() - (i2 * 2);
            b = mo7402b() - (i3 * 2);
            layoutParams.width = mo7403c() - (i2 * 2);
            layoutParams.height = (i2 * 2) + mo7402b();
        }
        relativeLayout.setLayoutParams(layoutParams);
        float min = Math.min((((float) c) * 0.8f) / ((float) measuredWidth), (((float) b) * 0.8f) / ((float) measuredHeight));
        if (min < 1.0f) {
            textView.setTextSize(0, min * f7078o);
        }
        relativeLayout.setOnClickListener(new C2040e(this));
        return relativeLayout;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m9385f() {
        m9386g();
    }

    /* renamed from: g */
    private void m9386g() {
        PopupWindow popupWindow = new PopupWindow(this.f7084i);
        m9387h();
        popupWindow.setWidth(this.f7087l);
        popupWindow.setHeight(this.f7088m);
        popupWindow.setTouchable(false);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        LinearLayout linearLayout = new LinearLayout(this.f7084i);
        this.f7086k = new TextView(this.f7084i);
        this.f7086k.setText(mo7400a());
        this.f7086k.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.bg_emoji_art_anim));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        linearLayout.setPadding(0, Engine.getInstance().getWidgetManager().mo9630ad().mo9261s() / (this.f7080e + 1), 0, 0);
        linearLayout.setGravity(1);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.addView(this.f7086k);
        popupWindow.setContentView(linearLayout);
        popupWindow.showAtLocation(this.f7085j, 49, 0, 0);
        m9383b(popupWindow);
    }

    /* renamed from: b */
    private void m9383b(PopupWindow popupWindow) {
        if (this.f7086k != null) {
            this.f7086k.startAnimation(m9384c(popupWindow));
        }
    }

    /* renamed from: c */
    private Animation m9384c(PopupWindow popupWindow) {
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration((long) 1000);
        animationSet.addAnimation(alphaAnimation);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 300.0f);
        translateAnimation.setDuration((long) 1300);
        animationSet.addAnimation(translateAnimation);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.2f, 0.5f, 1.2f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new DecelerateInterpolator(3.0f));
        scaleAnimation.setDuration((long) 1000);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset((long) 1000);
        alphaAnimation2.setDuration((long) Settings.SUPER_DICT_DOWNLOADED);
        animationSet.addAnimation(alphaAnimation2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.2f, 0.5f, 1.2f, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setStartOffset((long) 1000);
        scaleAnimation2.setDuration((long) Settings.SUPER_DICT_DOWNLOADED);
        animationSet.addAnimation(scaleAnimation2);
        animationSet.setAnimationListener(new C2041f(this, popupWindow));
        return animationSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo7405e() {
        ((TouchPalIME) Engine.getInstance().getIms()).commitText(mo7400a() + C0911j.f2473c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7401a(PopupWindow popupWindow) {
        if (popupWindow != null && popupWindow.isShowing()) {
            new Handler().post(new C2042g(this, popupWindow));
        }
    }

    /* renamed from: h */
    private void m9387h() {
        this.f7087l = this.f7084i.getResources().getDisplayMetrics().widthPixels;
        this.f7088m = this.f7084i.getResources().getDisplayMetrics().heightPixels - m9388i();
    }

    /* renamed from: i */
    private int m9388i() {
        int identifier = this.f7084i.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return this.f7084i.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
