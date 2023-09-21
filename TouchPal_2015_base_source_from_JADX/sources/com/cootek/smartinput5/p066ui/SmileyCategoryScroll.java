package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.smileypanel.SmileyListView;
import com.cootek.smartinput5.func.smileypanel.p056a.C2008c;
import com.cootek.smartinput5.p066ui.control.C2878v;
import com.emoji.keyboard.touchpal.C3305b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.SmileyCategoryScroll */
public class SmileyCategoryScroll extends HorizontalScrollView {

    /* renamed from: a */
    protected int f11531a;

    /* renamed from: b */
    protected int f11532b;

    /* renamed from: c */
    private final float f11533c = 0.15f;

    /* renamed from: d */
    private final float f11534d = 1.0f;

    /* renamed from: e */
    private Context f11535e;

    /* renamed from: f */
    private AttributeSet f11536f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f11537g;

    /* renamed from: h */
    private SoftKeyboardView f11538h;

    /* renamed from: i */
    private C2008c[] f11539i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public SmileyListView f11540j;

    public SmileyCategoryScroll(Context context) {
        super(context);
        this.f11535e = context;
        setHorizontalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(true);
        int i = this.f11535e.getResources().getDisplayMetrics().widthPixels;
        int o = Engine.getInstance().getWidgetManager().mo9648g().getKeyboard().mo9193o();
        this.f11531a = (int) (((float) i) * 1.0f);
        this.f11532b = (int) (((float) o) * 0.15f);
        setMinimumHeight(this.f11532b);
        setMinimumWidth(this.f11531a);
    }

    public SmileyCategoryScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11535e = context;
        this.f11536f = attributeSet;
        m11912b();
        setHorizontalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(true);
    }

    /* renamed from: b */
    private void m11912b() {
        int i = this.f11535e.getResources().getDisplayMetrics().widthPixels;
        int o = Engine.getInstance().getWidgetManager().mo9648g().getKeyboard().mo9193o();
        TypedArray obtainStyledAttributes = this.f11535e.obtainStyledAttributes(this.f11536f, C3305b.C3322q.SoftKeyboard);
        this.f11531a = C2878v.m13321a(obtainStyledAttributes, 4, i, 0);
        this.f11532b = C2878v.m13321a(obtainStyledAttributes, 3, o, 0);
        setMinimumHeight(this.f11532b);
        setMinimumWidth(this.f11531a);
        obtainStyledAttributes.recycle();
    }

    public void setXmlLayout(int i) {
    }

    public void setCategories(C2008c[] cVarArr) {
        this.f11539i = cVarArr;
    }

    public void setSmileyListView(SmileyListView smileyListView) {
        this.f11540j = smileyListView;
    }

    private String getCurrentCategory() {
        return Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_CATEGORY, 22, SmileyListView.m9205b(Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_TAB)), (Config) null);
    }

    /* renamed from: a */
    public void mo8687a() {
        removeAllViews();
        LinearLayout linearLayout = new LinearLayout(this.f11535e);
        linearLayout.setOrientation(0);
        this.f11537g = 0;
        if (this.f11539i != null && this.f11539i.length > 0) {
            int length = this.f11531a / this.f11539i.length;
            String currentCategory = getCurrentCategory();
            int i = 0;
            for (C2008c cVar : this.f11539i) {
                RelativeLayout relativeLayout = new RelativeLayout(this.f11535e);
                relativeLayout.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.smiley_category_bg_ctrl));
                relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(length, -1));
                ImageView imageView = new ImageView(this.f11535e);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(13);
                imageView.setLayoutParams(layoutParams);
                imageView.setImageDrawable(cVar.mo7358a());
                relativeLayout.addView(imageView);
                String b = cVar.mo7359b();
                boolean equals = TextUtils.equals(b, currentCategory);
                relativeLayout.setSelected(equals);
                relativeLayout.setOnClickListener(new C2738bQ(this, b, linearLayout, relativeLayout));
                linearLayout.addView(relativeLayout);
                if (equals) {
                    this.f11537g = i;
                }
                i += length;
            }
        }
        addView(linearLayout);
        post(new C2739bR(this));
    }

    public int getDisplayHeight() {
        return (int) (Engine.getInstance().getWidgetManager().mo9630ad().mo9251i() * ((double) this.f11532b));
    }

    public int getDisplayWidth() {
        return (int) (Engine.getInstance().getWidgetManager().mo9630ad().mo9250h() * ((double) this.f11531a));
    }

    public void setScroll(SmileyCategoryKey smileyCategoryKey) {
        int measuredWidth = getMeasuredWidth();
        if (smileyCategoryKey.f12453x + smileyCategoryKey.width <= measuredWidth) {
            scrollTo(0, 0);
        } else {
            scrollTo((smileyCategoryKey.f12453x + smileyCategoryKey.width) - measuredWidth, 0);
        }
    }

    public void setViewAlpha(int i) {
        if (this.f11538h != null) {
            this.f11538h.setViewAlpha(i);
        }
    }
}
