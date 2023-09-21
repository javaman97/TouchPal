package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.C3329E;
import com.facebook.ads.C3509x;
import com.facebook.ads.internal.view.C3486e;
import com.facebook.ads.internal.view.C3488g;

/* renamed from: com.facebook.ads.internal.view.component.b */
public class C3482b extends LinearLayout {

    /* renamed from: a */
    private ImageView f15083a;

    /* renamed from: b */
    private C3481a f15084b;

    /* renamed from: c */
    private TextView f15085c;

    /* renamed from: d */
    private LinearLayout f15086d = new LinearLayout(getContext());

    /* renamed from: e */
    private DisplayMetrics f15087e;

    public C3482b(Context context, C3509x xVar, C3329E e, boolean z, int i) {
        super(context);
        this.f15087e = context.getResources().getDisplayMetrics();
        setVerticalGravity(16);
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(Math.round(15.0f * this.f15087e.density), Math.round(15.0f * this.f15087e.density), Math.round(15.0f * this.f15087e.density), Math.round(15.0f * this.f15087e.density));
        linearLayout.setLayoutParams(layoutParams);
        addView(linearLayout);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        this.f15086d.setOrientation(0);
        this.f15086d.setGravity(16);
        layoutParams2.weight = 3.0f;
        this.f15086d.setLayoutParams(layoutParams2);
        linearLayout.addView(this.f15086d);
        this.f15083a = new C3483c(getContext());
        int a = m15196a(z, i);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(Math.round(((float) a) * this.f15087e.density), Math.round(((float) a) * this.f15087e.density));
        layoutParams3.setMargins(0, 0, Math.round(15.0f * this.f15087e.density), 0);
        this.f15083a.setLayoutParams(layoutParams3);
        C3509x.m15264a(xVar.mo10866d(), this.f15083a);
        this.f15086d.addView(this.f15083a);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        this.f15086d.addView(linearLayout2);
        this.f15084b = new C3481a(getContext(), xVar, e);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams4.setMargins(0, 0, Math.round(15.0f * this.f15087e.density), 0);
        layoutParams4.weight = 0.5f;
        this.f15084b.setLayoutParams(layoutParams4);
        linearLayout2.addView(this.f15084b);
        this.f15085c = new TextView(getContext());
        this.f15085c.setPadding(Math.round(6.0f * this.f15087e.density), Math.round(6.0f * this.f15087e.density), Math.round(6.0f * this.f15087e.density), Math.round(6.0f * this.f15087e.density));
        this.f15085c.setText(xVar.mo10871i());
        this.f15085c.setTextColor(e.mo10538f());
        this.f15085c.setTextSize(14.0f);
        this.f15085c.setTypeface(e.mo10527a(), 1);
        this.f15085c.setMaxLines(2);
        this.f15085c.setEllipsize(TextUtils.TruncateAt.END);
        this.f15085c.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(e.mo10536e());
        gradientDrawable.setCornerRadius(5.0f * this.f15087e.density);
        gradientDrawable.setStroke(1, e.mo10540g());
        this.f15085c.setBackgroundDrawable(gradientDrawable);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.weight = 0.25f;
        this.f15085c.setLayoutParams(layoutParams5);
        linearLayout2.addView(this.f15085c);
        if (z) {
            C3488g gVar = new C3488g(getContext());
            gVar.setText(xVar.mo10870h());
            C3486e.m15203b(gVar, e);
            gVar.setMinTextSize((float) (e.mo10542i() - 1));
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, 0);
            layoutParams6.weight = 1.0f;
            gVar.setLayoutParams(layoutParams6);
            gVar.setGravity(80);
            linearLayout.addView(gVar);
        }
    }

    /* renamed from: a */
    private int m15196a(boolean z, int i) {
        return (int) (((double) (i - 30)) * (3.0d / ((double) ((z ? 1 : 0) + 3))));
    }

    public TextView getCallToActionView() {
        return this.f15085c;
    }

    public ImageView getIconView() {
        return this.f15083a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        TextView titleTextView = this.f15084b.getTitleTextView();
        if (titleTextView.getLayout().getLineEnd(titleTextView.getLineCount() - 1) < this.f15084b.getMinVisibleTitleCharacters()) {
            this.f15086d.removeView(this.f15083a);
            super.onMeasure(i, i2);
        }
    }
}
