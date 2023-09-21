package com.facebook.ads.internal.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Settings;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.C3329E;
import com.facebook.ads.C3509x;
import com.facebook.ads.internal.p077h.C3445l;
import com.facebook.ads.internal.p077h.C3446m;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.internal.view.a */
public class C3472a extends C3489h implements C3446m {

    /* renamed from: a */
    private DisplayMetrics f15064a;

    /* renamed from: b */
    private C3509x f15065b;

    /* renamed from: c */
    private AdChoicesView f15066c;

    /* renamed from: d */
    private C3490i f15067d;

    /* renamed from: e */
    private C3473a f15068e;

    /* renamed from: f */
    private C3329E f15069f;

    /* renamed from: g */
    private TextView f15070g;

    /* renamed from: h */
    private LinearLayout f15071h;

    /* renamed from: i */
    private View f15072i;

    /* renamed from: com.facebook.ads.internal.view.a$a */
    public interface C3473a {
        /* renamed from: a */
        void mo10642a();
    }

    public C3472a(Context context, C3509x xVar, C3329E e, C3473a aVar) {
        super(context);
        this.f15064a = context.getResources().getDisplayMetrics();
        setMinWidth(Math.round(300.0f * this.f15064a.density));
        setMaxWidth(Math.round(360.0f * this.f15064a.density));
        this.f15069f = e;
        this.f15065b = xVar;
        this.f15068e = aVar;
        addView(m15175c());
        addView(m15176d());
        setLayoutParams(new RelativeLayout.LayoutParams(-1, Math.round(250.0f * this.f15064a.density)));
    }

    /* renamed from: a */
    private View m15174a(View view) {
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(3, view.getId());
        layoutParams.setMargins(Math.round(5.0f * this.f15064a.density), Math.round(this.f15064a.density * 10.0f), Math.round(0.0f), Math.round(this.f15064a.density * 10.0f));
        textView.setLayoutParams(layoutParams);
        textView.setText(this.f15065b.mo10870h());
        C3486e.m15203b(textView, this.f15069f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(3);
        textView.setGravity(16);
        return textView;
    }

    /* renamed from: c */
    private ViewGroup m15175c() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, Math.round(this.f15064a.density * 190.0f));
        layoutParams.addRule(10);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setBackgroundColor(this.f15069f.mo10530b());
        C3485d dVar = new C3485d(getContext());
        relativeLayout.addView(dVar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (this.f15064a.density * 190.0f));
        layoutParams2.addRule(13, -1);
        dVar.setLayoutParams(layoutParams2);
        new C3445l(dVar).mo10770a((C3446m) this).execute(new String[]{this.f15065b.mo10867e().mo10878a()});
        this.f15066c = new AdChoicesView(getContext(), this.f15065b);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f15066c.getLayoutParams();
        layoutParams3.addRule(10);
        layoutParams3.addRule(11);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1291845632);
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (float) Math.round(this.f15064a.density * 8.0f), (float) Math.round(this.f15064a.density * 8.0f)});
        setBackgroundDrawable(gradientDrawable);
        relativeLayout.addView(this.f15066c);
        return relativeLayout;
    }

    /* renamed from: d */
    private View m15176d() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, Math.round(60.0f * this.f15064a.density));
        layoutParams.addRule(12);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(m15177e());
        return relativeLayout;
    }

    /* renamed from: e */
    private View m15177e() {
        this.f15071h = new LinearLayout(getContext());
        this.f15071h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f15071h.setBackgroundColor(this.f15069f.mo10530b());
        this.f15071h.setOrientation(0);
        this.f15072i = m15178f();
        this.f15071h.addView(this.f15072i);
        this.f15071h.addView(m15179g());
        View j = m15182j();
        this.f15071h.addView(j);
        this.f15065b.mo10877o();
        this.f15065b.mo10861a((View) this, (List<View>) Arrays.asList(new View[]{this.f15072i, j}));
        return this.f15071h;
    }

    /* renamed from: f */
    private View m15178f() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Math.round(this.f15064a.density * 50.0f), Math.round(this.f15064a.density * 50.0f));
        layoutParams.setMargins(Math.round(this.f15064a.density * 5.0f), Math.round(this.f15064a.density * 5.0f), Math.round(this.f15064a.density * 5.0f), Math.round(this.f15064a.density * 5.0f));
        imageView.setLayoutParams(layoutParams);
        C3509x.m15264a(this.f15065b.mo10866d(), imageView);
        return imageView;
    }

    /* renamed from: g */
    private View m15179g() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        relativeLayout.setLayoutParams(layoutParams);
        View h = m15180h();
        relativeLayout.addView(h);
        View a = m15174a(h);
        relativeLayout.addView(a);
        this.f15067d = new C3490i(h, a).mo10832a(Math.round(60.0f * this.f15064a.density)).mo10831a();
        return relativeLayout;
    }

    /* renamed from: h */
    private View m15180h() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        layoutParams.setMargins(Math.round(5.0f * this.f15064a.density), Math.round(this.f15064a.density * 10.0f), Math.round(0.0f), Math.round(this.f15064a.density * 10.0f));
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.addView(m15181i());
        linearLayout.addView(C3486e.m15201a(getContext(), this.f15065b, this.f15069f));
        return linearLayout;
    }

    /* renamed from: i */
    private View m15181i() {
        this.f15070g = new TextView(getContext());
        this.f15070g.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        this.f15070g.setText(this.f15065b.mo10868f());
        C3486e.m15202a(this.f15070g, this.f15069f);
        this.f15070g.setEllipsize(TextUtils.TruncateAt.END);
        this.f15070g.setSingleLine(true);
        return this.f15070g;
    }

    /* renamed from: j */
    private View m15182j() {
        TextView textView = new TextView(getContext(), (AttributeSet) null, 16842903);
        textView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        int round = Math.round(9.0f * this.f15064a.density);
        int round2 = Math.round(6.0f * this.f15064a.density);
        textView.setPadding(round, round2, round, round2);
        textView.setText(this.f15065b.mo10871i().toUpperCase());
        textView.setTextColor(this.f15069f.mo10538f());
        textView.setTextSize(14.0f);
        textView.setIncludeFontPadding(false);
        textView.setTypeface(this.f15069f.mo10527a(), 1);
        textView.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.f15069f.mo10536e());
        gradientDrawable.setCornerRadius(3.0f * this.f15064a.density);
        gradientDrawable.setStroke(1, this.f15069f.mo10540g());
        textView.setBackgroundDrawable(gradientDrawable);
        RelativeLayout relativeLayout = new RelativeLayout(getContext(), (AttributeSet) null);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        relativeLayout.setPadding(Math.round(this.f15064a.density * 10.0f), 0, Math.round(this.f15064a.density * 10.0f), 0);
        relativeLayout.addView(textView);
        relativeLayout.setGravity(17);
        return relativeLayout;
    }

    /* renamed from: a */
    public void mo10551a() {
        if (this.f15068e != null) {
            this.f15068e.mo10642a();
        }
    }

    /* renamed from: b */
    public void mo10806b() {
        if (this.f15065b != null) {
            this.f15065b.mo10517b();
            this.f15065b = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f15070g != null && this.f15065b != null) {
            TextPaint paint = this.f15070g.getPaint();
            String f = this.f15065b.mo10868f();
            String substring = f.substring(0, Math.min(20, f.length()));
            if (f.length() > 20) {
                substring = substring + "…";
            }
            if (paint.measureText(substring) >= ((float) getMeasuredWidth()) - (((float) Settings.SMS_LEARN_RESULT) * this.f15064a.density)) {
                this.f15071h.removeView(this.f15072i);
                super.onMeasure(i, i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0 && this.f15067d != null) {
            this.f15067d.mo10831a();
        }
    }
}
