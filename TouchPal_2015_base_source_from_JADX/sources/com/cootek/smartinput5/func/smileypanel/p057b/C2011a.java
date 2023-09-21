package com.cootek.smartinput5.func.smileypanel.p057b;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1624bv;
import com.cootek.smartinput5.func.smileypanel.C2051e;
import com.cootek.smartinput5.p066ui.C2919e;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.smileypanel.b.a */
/* compiled from: DisplayItem */
public class C2011a {

    /* renamed from: a */
    public C2051e f6994a;

    /* renamed from: b */
    private int f6995b;

    /* renamed from: c */
    private int f6996c;

    /* renamed from: d */
    private int f6997d = Integer.MAX_VALUE;

    /* renamed from: e */
    private int f6998e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f6999f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2919e f7000g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public View f7001h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ImageView f7002i;

    /* renamed from: j */
    private View.OnClickListener f7003j = new C2021b(this);

    /* renamed from: k */
    private int f7004k;

    public C2011a(C2051e eVar, int i, int i2, int i3, int i4) {
        this.f6994a = eVar;
        this.f6995b = i;
        this.f6996c = i2;
        this.f6998e = i3;
        this.f6999f = i4;
    }

    /* renamed from: a */
    public int mo7362a() {
        return this.f6994a.mo7369a();
    }

    /* renamed from: b */
    public int mo7365b() {
        return this.f6997d;
    }

    /* renamed from: a */
    public void mo7364a(int i) {
        this.f6997d = i;
    }

    /* renamed from: b */
    public void mo7366b(int i) {
        this.f7004k = i;
    }

    /* renamed from: c */
    private int m9308c() {
        int a;
        if (this.f6994a == null || !this.f6994a.mo7374e() || (a = mo7362a()) > 1) {
            return this.f7004k;
        }
        return a * this.f6995b;
    }

    /* renamed from: d */
    private int m9310d() {
        return this.f6996c;
    }

    /* renamed from: a */
    public View mo7363a(Context context, View view, int i) {
        RelativeLayout relativeLayout;
        if (view == null) {
            relativeLayout = m9302a(context);
        } else {
            relativeLayout = (RelativeLayout) view;
        }
        m9305a(relativeLayout, i);
        this.f7001h = relativeLayout;
        return relativeLayout;
    }

    /* renamed from: a */
    private void m9305a(RelativeLayout relativeLayout, int i) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = new LinearLayout.LayoutParams(0, 0);
        } else {
            layoutParams = layoutParams2;
        }
        layoutParams.width = m9308c();
        layoutParams.height = m9310d();
        relativeLayout.setLayoutParams(layoutParams);
        TextView textView = (TextView) relativeLayout.findViewWithTag("text");
        textView.setTextSize(0, (float) this.f6999f);
        ImageView imageView = (ImageView) relativeLayout.findViewWithTag("image");
        this.f7002i = imageView;
        if (!this.f6994a.mo7374e()) {
            imageView.setVisibility(8);
            textView.setVisibility(0);
            textView.setText(this.f6994a.mo7371b());
            textView.setGravity(17);
            textView.measure(0, 0);
            float measuredWidth = ((float) layoutParams.width) / ((float) textView.getMeasuredWidth());
            if (measuredWidth < 1.0f) {
                textView.setTextSize(0, (float) ((int) (measuredWidth * ((float) this.f6999f))));
            }
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(layoutParams.width, -1);
            layoutParams3.addRule(13);
            textView.setLayoutParams(layoutParams3);
        } else if (C1351J.m6188a().mo5650i()) {
            textView.setVisibility(0);
            textView.setText(this.f6994a.mo7372c());
        } else {
            textView.setVisibility(8);
            imageView.setVisibility(0);
            imageView.setImageDrawable((Drawable) C1351J.m6188a().mo5642b(this.f6994a.mo7373d()));
        }
        relativeLayout.getBackground().setAlpha(i);
        imageView.setAlpha(i);
        int color = textView.getPaint().getColor();
        textView.setTextColor(Color.argb(i, Color.red(color), Color.green(color), Color.blue(color)));
        relativeLayout.setOnClickListener(this.f7003j);
    }

    /* renamed from: a */
    private RelativeLayout m9302a(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.smiley_list_item_bg_ctrl));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        ImageView imageView = new ImageView(context);
        imageView.setTag("image");
        int i = (int) (((float) this.f6995b) * 0.25f);
        imageView.setPadding(i, i, i, i);
        relativeLayout.addView(imageView, layoutParams);
        TextView textView = new TextView(context);
        textView.setTag("text");
        textView.setGravity(17);
        m9306a(textView);
        relativeLayout.addView(textView, layoutParams);
        return relativeLayout;
    }

    /* renamed from: a */
    private void m9306a(TextView textView) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        textView.setSingleLine(true);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setTextColor(this.f6998e);
        textView.setTypeface(C1624bv.m7418a());
        textView.setSoundEffectsEnabled(false);
    }
}
