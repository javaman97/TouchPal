package com.cootek.smartinput5;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.C1624bv;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.emoji.keyboard.touchpal.R;

public class GuideFinishedActivity extends C1976b {

    /* renamed from: a */
    private static final int f2764a = 0;

    /* renamed from: b */
    private static final int f2765b = 1;

    /* renamed from: c */
    private static final int f2766c = 2;

    /* renamed from: d */
    private static final double f2767d = 0.15d;

    /* renamed from: e */
    private static final double f2768e = 0.2d;

    /* renamed from: f */
    private static final double f2769f = 0.2d;

    /* renamed from: g */
    private static final double f2770g = 0.3d;

    /* renamed from: h */
    private final int[] f2771h = {R.string.guide_language_title, R.string.guide_theme_title};

    /* renamed from: i */
    private final int[] f2772i = {R.string.guide_language_sub_title, R.string.guide_theme_sub_title};

    /* renamed from: j */
    private final int[] f2773j = {R.drawable.guide_icon_language, R.drawable.guide_icon_skin};

    /* renamed from: k */
    private ScrollView f2774k;

    /* renamed from: l */
    private LinearLayout f2775l;

    /* renamed from: m */
    private TextView f2776m;

    /* renamed from: n */
    private int f2777n;

    /* renamed from: o */
    private Typeface f2778o;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        C1368X.m6317b((Context) this);
        setContentView(R.layout.guide_finished);
        m5333b();
        m5334c();
        m5337f();
        m5338g();
        Settings.getInstance().setBoolSetting(Settings.GUIDE_FINISH_PAGE_SHOWED, true);
    }

    public void onWindowFocusChanged(boolean z) {
        int i;
        int i2;
        super.onWindowFocusChanged(z);
        View findViewById = findViewById(R.id.finish_btn_frame);
        View findViewById2 = findViewById(R.id.guide_finish_btn);
        int measuredHeight = findViewById.getMeasuredHeight();
        if (measuredHeight == 0) {
            findViewById.measure(0, 0);
            i = findViewById.getMeasuredHeight();
        } else {
            i = measuredHeight;
        }
        int measuredHeight2 = findViewById2.getMeasuredHeight();
        if (measuredHeight2 == 0) {
            findViewById2.measure(0, 0);
            i2 = findViewById2.getMeasuredHeight();
        } else {
            i2 = measuredHeight2;
        }
        ((LinearLayout) findViewById(R.id.data_usage_switch)).setPadding(0, (int) (((double) ((i - i2) / 2)) * 0.2d), 0, 0);
    }

    /* renamed from: b */
    private void m5333b() {
        this.f2776m = (TextView) findViewById(R.id.finished_text);
        this.f2776m.setTypeface(m5340i());
        this.f2776m.setHeight((int) (((double) m5341j()) * f2767d));
    }

    /* renamed from: c */
    private void m5334c() {
        this.f2774k = (ScrollView) findViewById(R.id.guide_finish_button_group);
        int j = (int) (((double) m5341j()) * 0.65d);
        this.f2774k.setLayoutParams(new LinearLayout.LayoutParams(-1, j));
        this.f2775l = (LinearLayout) findViewById(R.id.guide_buttons);
        this.f2775l.removeAllViews();
        C1602bh n = C1368X.m6320c().mo5841n();
        LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
        for (int i = 0; i < 2; i++) {
            LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.guide_finined_item, (ViewGroup) null);
            ImageView imageView = (ImageView) linearLayout.findViewById(R.id.option_icon);
            int c = (int) ((((double) j) * f2770g) - ((double) (n.mo6265c((int) R.dimen.guide_finished_image_view_margin_top) * 2)));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c, c);
            int c2 = n.mo6265c((int) R.dimen.guide_finished_image_view_margin_left);
            layoutParams.setMargins(c2, 0, c2, 0);
            imageView.setLayoutParams(layoutParams);
            imageView.setBackgroundResource(this.f2773j[i]);
            TextView textView = (TextView) linearLayout.findViewById(R.id.button_main_title);
            TextView textView2 = (TextView) linearLayout.findViewById(R.id.button_sub_title);
            textView.setTypeface(m5340i());
            textView2.setTypeface(m5340i());
            textView.setText(getResString(this.f2771h[i]));
            textView2.setText(m5332b(i));
            linearLayout.setOnClickListener(m5331a(i));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) (((double) j) * f2770g));
            layoutParams2.setMargins(0, n.mo6265c((int) R.dimen.guide_finished_view_item_margin), 0, 0);
            this.f2775l.addView(linearLayout, i, layoutParams2);
        }
    }

    /* renamed from: a */
    private View.OnClickListener m5331a(int i) {
        if (i == 0) {
            return m5336e();
        }
        if (i == 1) {
            return m5335d();
        }
        return null;
    }

    /* renamed from: d */
    private View.OnClickListener m5335d() {
        return new C3281v(this);
    }

    /* renamed from: e */
    private View.OnClickListener m5336e() {
        return new C3282w(this);
    }

    /* renamed from: b */
    private String m5332b(int i) {
        if (i != 0) {
            return getResString(this.f2772i[i]);
        }
        C1389aD o = C1368X.m6320c().mo5842o();
        String[] g = o.mo5945g();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < g.length; i2++) {
            stringBuffer.append(o.mo5954l(g[i2]).mo6153c());
            if (i2 < g.length - 1) {
                stringBuffer.append(" / ");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: f */
    private void m5337f() {
        ((RelativeLayout) findViewById(R.id.finish_btn_frame)).setLayoutParams(new LinearLayout.LayoutParams(-1, (int) (((double) m5341j()) * 0.2d)));
        Button button = (Button) findViewById(R.id.guide_finish_btn);
        button.setTypeface(m5340i());
        button.setOnClickListener(new C3283x(this));
    }

    /* renamed from: g */
    private void m5338g() {
        ImageView imageView = (ImageView) findViewById(R.id.data_usage_checkbox);
        imageView.setSelected(Settings.getInstance().getBoolSetting(Settings.USERDATA_COLLECT_ENABLE));
        ((LinearLayout) findViewById(R.id.data_usage_switch)).setOnClickListener(new C3284y(this, imageView));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4130a() {
        finish();
    }

    public void onBackPressed() {
        super.onBackPressed();
        m5339h();
        mo4130a();
    }

    /* renamed from: h */
    private void m5339h() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClass(this, GuideNumLineSettingActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        startActivity(intent);
    }

    /* renamed from: i */
    private Typeface m5340i() {
        if (this.f2778o == null) {
            this.f2778o = C1624bv.m7424d();
        }
        return this.f2778o;
    }

    /* renamed from: j */
    private int m5341j() {
        if (this.f2777n == 0) {
            this.f2777n = m5342k() - m5343l();
            if (C1584bI.m7139a()) {
                this.f2777n -= C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.guide_activity_smartbar_height);
            }
        }
        return this.f2777n;
    }

    /* renamed from: k */
    private int m5342k() {
        Rect rect = new Rect();
        ((ViewGroup) findViewById(16908290)).getChildAt(0).getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    /* renamed from: l */
    private int m5343l() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m5334c();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C1368X.m6325e();
    }
}
