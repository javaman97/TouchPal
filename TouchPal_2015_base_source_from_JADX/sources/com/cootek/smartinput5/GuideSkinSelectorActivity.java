package com.cootek.smartinput5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
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
import com.cootek.smartinput5.func.C1601bg;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.C1624bv;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

public class GuideSkinSelectorActivity extends Activity {

    /* renamed from: a */
    private static final double f2828a = 0.15d;

    /* renamed from: b */
    private static final double f2829b = 0.2d;

    /* renamed from: c */
    private static final double f2830c = 1.25d;

    /* renamed from: d */
    private static final double f2831d = 0.35d;

    /* renamed from: e */
    private static final int f2832e = 4;

    /* renamed from: f */
    private static final int f2833f = 2;

    /* renamed from: g */
    private TextView f2834g;

    /* renamed from: h */
    private int f2835h;

    /* renamed from: i */
    private Typeface f2836i;

    /* renamed from: j */
    private C1602bh f2837j;

    /* renamed from: k */
    private int f2838k;

    /* renamed from: l */
    private int f2839l;

    /* renamed from: m */
    private int f2840m;

    /* renamed from: n */
    private Context f2841n;

    /* renamed from: o */
    private String[] f2842o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f2843p = 0;

    /* renamed from: q */
    private ArrayList<FrameLayout> f2844q = new ArrayList<>();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        C1368X.m6317b((Context) this);
        setContentView(R.layout.guide_skin_selector);
        boolean boolSetting = Settings.getInstance().getBoolSetting(Settings.BUILDIN_SKIN_UPDATE_CHECKED);
        this.f2841n = this;
        this.f2837j = C1368X.m6320c().mo5841n();
        this.f2842o = new String[]{this.f2841n.getPackageName(), C1602bh.f5117f, C1602bh.f5120i, C1602bh.f5119h};
        if (C1358O.m6239b() == null || boolSetting || !m5407c()) {
            mo4146a();
        }
        m5408d();
        m5409e();
        m5411g();
    }

    /* renamed from: c */
    private boolean m5407c() {
        if (this.f2837j == null || this.f2837j.mo6268d() == null || this.f2837j.mo6268d().size() < 4) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private Drawable m5404a(String str) {
        int a;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.equals(str, this.f2841n.getPackageName())) {
            return this.f2841n.getResources().getDrawable(R.drawable.skin_preview);
        }
        C1601bg l = this.f2837j.mo6284l(str);
        if (l == null || l.f5932a == null || (a = C1368X.m6320c().mo5838k().mo6236a(l.f5932a, (int) R.drawable.skin_preview)) <= 0) {
            return null;
        }
        try {
            return l.f5932a.getResources().getDrawable(a);
        } catch (Resources.NotFoundException | Exception e) {
            return null;
        }
    }

    /* renamed from: d */
    private void m5408d() {
        this.f2834g = (TextView) findViewById(R.id.select_skin_title);
        this.f2834g.setTypeface(m5412h());
        this.f2834g.setHeight((int) (((double) m5413i()) * f2828a));
    }

    /* renamed from: e */
    private void m5409e() {
        ((LinearLayout) findViewById(R.id.guide_next_panel)).setLayoutParams(new LinearLayout.LayoutParams(-1, (int) (((double) m5413i()) * f2829b)));
        Button button = (Button) findViewById(R.id.guide_next_btn);
        button.setTypeface(m5412h());
        button.setOnClickListener(new C1037P(this));
    }

    public void onBackPressed() {
        super.onBackPressed();
        m5410f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4146a() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClass(this, GuideNumLineSettingActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        try {
            startActivity(intent);
        } catch (Exception e) {
        }
        m5410f();
    }

    /* renamed from: f */
    private void m5410f() {
        if (!(this.f2837j == null || this.f2842o == null)) {
            this.f2837j.mo6258a(this.f2842o[this.f2843p], false, true);
            Settings.getInstance().setStringSetting(80, this.f2842o[this.f2843p]);
        }
        finish();
    }

    /* renamed from: g */
    private void m5411g() {
        this.f2840m = (int) (((double) m5413i()) * 0.6499999999999999d);
        ((LinearLayout) findViewById(R.id.guide_skin_selectors)).setLayoutParams(new LinearLayout.LayoutParams(-1, this.f2840m));
        LayoutInflater layoutInflater = (LayoutInflater) this.f2841n.getSystemService("layout_inflater");
        this.f2839l = (int) (((double) this.f2840m) * f2831d);
        this.f2838k = (int) (((double) this.f2839l) * f2830c);
        this.f2839l += this.f2837j.mo6265c((int) R.dimen.guide_skin_item_margin_bottom);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f2838k, this.f2839l);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.guide_skin_selector_row_one);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.guide_skin_selector_row_two);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, this.f2839l);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout2.setLayoutParams(layoutParams2);
        String stringSetting = Settings.getInstance().getStringSetting(80);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 4) {
                if (TextUtils.equals(this.f2842o[i2], stringSetting)) {
                    this.f2843p = i2;
                }
                FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.guide_skin_item, (ViewGroup) null);
                frameLayout.setLayoutParams(layoutParams);
                this.f2844q.add(frameLayout);
                ImageView imageView = (ImageView) this.f2844q.get(i2).findViewById(R.id.image_view);
                Drawable a = m5404a(this.f2842o[i2]);
                if (a != null) {
                    imageView.setBackgroundDrawable(a);
                }
                frameLayout.setOnClickListener(m5405a(i2));
                if (i2 < 2) {
                    linearLayout.addView(frameLayout);
                    if (i2 % 2 == 0) {
                        m5406a(linearLayout);
                    }
                } else {
                    linearLayout2.addView(frameLayout);
                    if (i2 % 2 == 0) {
                        m5406a(linearLayout2);
                    }
                }
                i = i2 + 1;
            } else {
                mo4147b();
                return;
            }
        }
    }

    /* renamed from: a */
    private void m5406a(LinearLayout linearLayout) {
        View view = new View(this.f2841n);
        view.setLayoutParams(new LinearLayout.LayoutParams(this.f2837j.mo6265c((int) R.dimen.guide_skin_item_gap), -2));
        linearLayout.addView(view);
    }

    /* renamed from: a */
    private View.OnClickListener m5405a(int i) {
        return new C1038Q(this, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4147b() {
        for (int i = 0; i < this.f2844q.size(); i++) {
            FrameLayout frameLayout = this.f2844q.get(i);
            ImageView imageView = (ImageView) frameLayout.findViewById(R.id.select_icon);
            if (i == this.f2843p) {
                imageView.setVisibility(0);
                frameLayout.setSelected(true);
            } else {
                imageView.setVisibility(4);
                frameLayout.setSelected(false);
            }
        }
    }

    /* renamed from: h */
    private Typeface m5412h() {
        if (this.f2836i == null) {
            this.f2836i = C1624bv.m7424d();
        }
        return this.f2836i;
    }

    /* renamed from: i */
    private int m5413i() {
        if (this.f2835h == 0) {
            this.f2835h = m5414j() - m5415k();
            if (C1584bI.m7139a()) {
                this.f2835h -= this.f2837j.mo6265c((int) R.dimen.guide_activity_smartbar_height);
            }
        }
        return this.f2835h;
    }

    /* renamed from: j */
    private int m5414j() {
        Rect rect = new Rect();
        ((ViewGroup) findViewById(16908290)).getChildAt(0).getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    /* renamed from: k */
    private int m5415k() {
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
