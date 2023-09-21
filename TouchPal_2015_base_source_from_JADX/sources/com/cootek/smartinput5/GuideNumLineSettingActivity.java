package com.cootek.smartinput5;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1624bv;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.emoji.keyboard.touchpal.R;

public class GuideNumLineSettingActivity extends C1976b implements View.OnClickListener {

    /* renamed from: a */
    private static final double f2815a = 0.15d;

    /* renamed from: b */
    private static final double f2816b = 0.2d;

    /* renamed from: c */
    private static final double f2817c = 0.6d;

    /* renamed from: d */
    private static final double f2818d = 0.9d;

    /* renamed from: e */
    private Context f2819e;

    /* renamed from: f */
    private TextView f2820f;

    /* renamed from: g */
    private LinearLayout f2821g;

    /* renamed from: h */
    private LinearLayout f2822h;

    /* renamed from: i */
    private Button f2823i;

    /* renamed from: j */
    private ImageView f2824j;

    /* renamed from: k */
    private int f2825k;

    /* renamed from: l */
    private Typeface f2826l;

    /* renamed from: m */
    private Settings f2827m;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        C1368X.m6317b((Context) this);
        setContentView(R.layout.guide_num_line_setting);
        this.f2819e = this;
        this.f2827m = Settings.getInstance();
        m5393a();
        m5395b();
        m5396c();
    }

    /* renamed from: a */
    private void m5393a() {
        this.f2820f = (TextView) findViewById(R.id.guide_num_line_title);
        this.f2820f.setTypeface(m5400g());
        this.f2820f.setHeight((int) (((double) m5401h()) * f2815a));
    }

    /* renamed from: b */
    private void m5395b() {
        int h = (int) (((double) m5401h()) * 0.65d);
        this.f2821g = (LinearLayout) findViewById(R.id.guide_num_line_content_layout);
        this.f2821g.setLayoutParams(new LinearLayout.LayoutParams(-1, h));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) (((double) h) * f2817c));
        layoutParams.gravity = 8;
        ((ImageView) findViewById(R.id.guide_num_line_content_icon)).setLayoutParams(layoutParams);
        int i = (int) (((double) h) * f2817c * f2818d);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
        layoutParams2.gravity = 53;
        layoutParams2.setMargins(0, 0, C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.guide_num_line_ring_icon_right_margin), 0);
        ((ImageView) findViewById(R.id.guide_num_line_ring_image)).setLayoutParams(layoutParams2);
        this.f2824j = (ImageView) findViewById(R.id.guide_num_line_setting_icon);
        this.f2824j.setOnClickListener(this);
        m5399f();
    }

    /* renamed from: c */
    private void m5396c() {
        int h = (int) (((double) m5401h()) * f2816b);
        this.f2822h = (LinearLayout) findViewById(R.id.guide_num_line_next_layout);
        this.f2822h.setLayoutParams(new LinearLayout.LayoutParams(-1, h));
        this.f2823i = (Button) findViewById(R.id.guide_num_line_next_btn);
        this.f2823i.setTypeface(m5400g());
        this.f2823i.setOnClickListener(new C1036O(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m5397d() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClass(this, GuideFinishedActivity.class);
        try {
            startActivity(intent);
        } catch (Exception e) {
        }
        finish();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.guide_num_line_setting_icon /*2131820778*/:
                this.f2827m.setBoolSetting(Settings.KEYBOARD_NUMBER_ROW_STYLE, !this.f2827m.getBoolSetting(Settings.KEYBOARD_NUMBER_ROW_STYLE));
                m5399f();
                return;
            default:
                return;
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        boolean boolSetting = Settings.getInstance().getBoolSetting(Settings.BUILDIN_SKIN_UPDATE_CHECKED);
        if (C1358O.m6239b() != null || boolSetting) {
            m5398e();
        }
        finish();
    }

    /* renamed from: e */
    private void m5398e() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClass(this, GuideSkinSelectorActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        startActivity(intent);
    }

    /* renamed from: f */
    private void m5399f() {
        if (this.f2827m.getBoolSetting(Settings.KEYBOARD_NUMBER_ROW_STYLE)) {
            this.f2824j.setImageResource(R.drawable.guide_num_line_open_icon);
        } else {
            this.f2824j.setImageResource(R.drawable.guide_num_line_close_icon);
        }
    }

    /* renamed from: g */
    private Typeface m5400g() {
        if (this.f2826l == null) {
            this.f2826l = C1624bv.m7424d();
        }
        return this.f2826l;
    }

    /* renamed from: h */
    private int m5401h() {
        if (this.f2825k == 0) {
            Rect rect = new Rect();
            ((ViewGroup) findViewById(16908290)).getChildAt(0).getWindowVisibleDisplayFrame(rect);
            this.f2825k = rect.height() - m5402i();
            if (C1584bI.m7139a()) {
                this.f2825k -= C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.guide_activity_smartbar_height);
            }
        }
        return this.f2825k;
    }

    /* renamed from: i */
    private int m5402i() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C1368X.m6325e();
    }
}
