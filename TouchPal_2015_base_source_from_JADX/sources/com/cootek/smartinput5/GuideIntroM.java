package com.cootek.smartinput5;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1443as;
import com.cootek.smartinput5.func.C1601bg;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.paopaopanel.SlidePage;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2212ab;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.guideintro.C2922a;
import com.cootek.smartinput5.p066ui.guideintro.ImageSelector;
import com.cootek.smartinput5.p066ui.guideintro.InputStyleSelector;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

public class GuideIntroM extends C1976b {

    /* renamed from: a */
    public static final String f2779a = "GuideIntroM.EXTRA_SHOW_PAGE_MODE";

    /* renamed from: b */
    private static final String f2780b = "GuideIntroM";

    /* renamed from: d */
    private static final int f2781d = 4;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f2782c;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public InputStyleSelector[] f2783e;

    /* renamed from: f */
    private String f2784f;

    /* renamed from: g */
    private String f2785g;

    /* renamed from: h */
    private boolean f2786h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public View.OnClickListener f2787i = new C1020B(this);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public View.OnClickListener f2788j = new C1023E(this);

    /* renamed from: k */
    private LinearLayout f2789k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ViewFlipper f2790l;

    /* renamed from: m */
    private TextView f2791m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public SlidePage f2792n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public LinearLayout f2793o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public CheckBox f2794p;

    /* renamed from: q */
    private LinearLayout f2795q;

    /* renamed from: r */
    private ImageSelector f2796r;

    /* renamed from: s */
    private ImageSelector f2797s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C2212ab.C2213a f2798t = new C1024F(this);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        C1368X.m6317b((Context) this);
        this.f2782c = this;
        setContentView(R.layout.guide_intro_mainland);
        this.f2786h = getIntent().getBooleanExtra(f2779a, false);
        this.f2789k = (LinearLayout) findViewById(R.id.input_style_selector_view);
        this.f2790l = (ViewFlipper) findViewById(R.id.intro_view_flipper);
        this.f2791m = (TextView) findViewById(R.id.next_step_btn);
        this.f2783e = new InputStyleSelector[4];
        this.f2783e[0] = (InputStyleSelector) findViewById(R.id.input_style_selector_1);
        this.f2783e[1] = (InputStyleSelector) findViewById(R.id.input_style_selector_2);
        this.f2783e[2] = (InputStyleSelector) findViewById(R.id.input_style_selector_3);
        this.f2783e[3] = (InputStyleSelector) findViewById(R.id.input_style_selector_4);
        this.f2793o = (LinearLayout) findViewById(R.id.show_page_view);
        this.f2792n = (SlidePage) findViewById(R.id.show_slide_page);
        this.f2795q = (LinearLayout) findViewById(R.id.skin_selector_view);
        this.f2796r = (ImageSelector) findViewById(R.id.black_skin_selector);
        this.f2797s = (ImageSelector) findViewById(R.id.white_skin_selector);
        this.f2794p = (CheckBox) findViewById(R.id.download_million_dict_ckb);
        m5348a();
        m5353b();
        if (this.f2786h) {
            m5355c();
        } else {
            new Handler().post(new C1025G(this));
        }
        m5359e();
        m5364g();
        Settings.getInstance().setBoolSetting(Settings.HAS_SHOWN_GUIDE_INTRO_VIEW, true, false);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C1368X.m6325e();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (this.f2783e != null) {
            for (InputStyleSelector inputStyleSelector : this.f2783e) {
                if (inputStyleSelector.mo9692b()) {
                    inputStyleSelector.mo9693c();
                }
            }
        }
        super.onStop();
    }

    /* renamed from: a */
    private void m5348a() {
        this.f2791m.setOnClickListener(new C1029H(this));
    }

    /* renamed from: b */
    private void m5353b() {
        if (!this.f2786h) {
            int paddingLeft = (this.f2782c.getResources().getDisplayMetrics().widthPixels - ((this.f2783e[0].getPaddingLeft() + this.f2783e[0].getPaddingRight()) * 2)) / 2;
            for (int i = 0; i < this.f2783e.length; i++) {
                this.f2783e[i].setWidth(paddingLeft);
                if (i == this.f2783e.length - 1) {
                    this.f2783e[i].mo9690a(C2922a.f13254a, this.f2787i, this.f2788j, this.f2798t);
                } else {
                    this.f2783e[i].mo9690a(C2922a.f13255b[i], this.f2787i, (View.OnClickListener) null, this.f2798t);
                }
            }
        } else if (this.f2790l != null && this.f2789k != null) {
            this.f2789k.setVisibility(8);
            this.f2790l.removeView(this.f2789k);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m5355c() {
        if (!this.f2786h && C1358O.m6239b() != null) {
            m5351a(false);
            if (this.f2796r != null) {
                this.f2796r.setOnClickListener(new C1031J(this));
            }
            if (this.f2797s != null) {
                m5357d();
                this.f2797s.setOnClickListener(new C1032K(this));
            }
        } else if (this.f2790l != null && this.f2795q != null) {
            this.f2795q.setVisibility(8);
            this.f2790l.removeView(this.f2795q);
        }
    }

    /* renamed from: d */
    private void m5357d() {
        C1601bg l;
        C1443as asVar;
        int a;
        if (this.f2797s != null && this.f2797s.getDrawable() == null && (l = C1368X.m6320c().mo5841n().mo6284l((String) C1602bh.f5117f)) != null && (asVar = l.f5932a) != null && (a = C1368X.m6320c().mo5838k().mo6236a(asVar, (int) R.drawable.skin_preview)) > 0) {
            this.f2797s.setImageBitmap(BitmapFactory.decodeResource(asVar.getResources(), a));
        }
    }

    /* renamed from: e */
    private void m5359e() {
        if (this.f2792n != null) {
            this.f2792n.setPageListener(new C1033L(this));
        }
        if (this.f2794p != null) {
            if (!m5366h()) {
                this.f2794p.setVisibility(4);
            }
            this.f2794p.setOnClickListener(new C1034M(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m5361f() {
        if (this.f2790l != null && this.f2793o != null && this.f2792n != null) {
            int i = this.f2782c.getResources().getDisplayMetrics().widthPixels;
            int height = this.f2792n.getHeight();
            if (height == 0) {
                new Handler().postDelayed(new C1021C(this), 50);
                return;
            }
            this.f2792n.mo7094b();
            this.f2792n.mo7096c();
            LayoutInflater from = LayoutInflater.from(this.f2782c);
            LinearLayout linearLayout = (LinearLayout) from.inflate(R.layout.guide_intro_show_page, (ViewGroup) null);
            int dimensionPixelSize = height - C1368X.m6313b().getResources().getDimensionPixelSize(R.dimen.guide_intro_show_page_indentifier_height);
            linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(i, dimensionPixelSize));
            if (linearLayout != null) {
                ((ImageView) linearLayout.findViewById(R.id.page_image)).setImageResource(R.drawable.guide_intro_slide_million_dict);
                ((TextView) linearLayout.findViewById(R.id.page_title)).setText(getResString(R.string.guide_intro_show_page_million_dict_title));
                if (this.f2794p != null) {
                    this.f2794p.setChecked(C2188Q.m9853a().mo7685e());
                }
                this.f2792n.mo7092a((View) linearLayout);
            }
            int a = m5346a(C2922a.m13527a());
            int a2 = m5345a(a);
            if (a > 0 && a2 > 0) {
                LinearLayout linearLayout2 = (LinearLayout) from.inflate(R.layout.guide_intro_show_page, (ViewGroup) null);
                linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(i, dimensionPixelSize));
                ((ImageView) linearLayout2.findViewById(R.id.page_image)).setImageResource(a);
                ((TextView) linearLayout2.findViewById(R.id.page_title)).setText(getResString(a2));
                this.f2792n.mo7092a((View) linearLayout2);
            }
            this.f2792n.setIdentifierLayoutId(R.drawable.guide_intro_show_page_footer);
            this.f2792n.mo7090a();
        }
    }

    public void onBackPressed() {
        if (this.f2783e != null) {
            for (InputStyleSelector inputStyleSelector : this.f2783e) {
                if (inputStyleSelector.mo9692b()) {
                    inputStyleSelector.mo9694d();
                    return;
                }
            }
        }
        if (this.f2790l.getDisplayedChild() > 0) {
            this.f2790l.showPrevious();
            m5364g();
            return;
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m5364g() {
        if (this.f2795q != null && this.f2795q.isShown()) {
            m5357d();
            if (this.f2796r != null) {
                this.f2796r.mo9684a();
            }
            if (this.f2797s != null) {
                this.f2797s.mo9684a();
            }
        }
        if (this.f2793o != null && (this.f2793o.isShown() || this.f2786h)) {
            m5361f();
            if (this.f2794p != null) {
                if (m5366h()) {
                    this.f2794p.setVisibility(0);
                } else {
                    this.f2794p.setVisibility(4);
                }
            }
        } else if (this.f2794p != null) {
            this.f2794p.setVisibility(4);
        }
        m5368i();
    }

    /* renamed from: h */
    private boolean m5366h() {
        if (C1368X.m6320c().mo5846s().mo6315e(C1549b.f4831b) || C1358O.m6239b() == null || !C1549b.f4831b.equals(Settings.getInstance().getStringSetting(10))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m5368i() {
        if (this.f2793o == null || !this.f2793o.isShown() || this.f2792n == null || this.f2792n.getCurrentPageIndex() != this.f2792n.getTotalPageNumber() - 1) {
            if (this.f2791m != null) {
                this.f2791m.setText(getResString(R.string.initial_setting_next));
            }
        } else if (this.f2791m != null) {
            this.f2791m.setText(getResString(R.string.guide_done_button));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5351a(boolean z) {
        boolean z2;
        String packageName = z ? this.f2782c.getPackageName() : C1602bh.f5117f;
        Settings.getInstance().setStringSetting(80, packageName);
        C1368X.m6320c().mo5841n().mo6258a(packageName, false, true);
        if (this.f2796r != null) {
            this.f2796r.setSelected(z);
        }
        if (this.f2797s != null) {
            ImageSelector imageSelector = this.f2797s;
            if (!z) {
                z2 = true;
            } else {
                z2 = false;
            }
            imageSelector.setSelected(z2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m5370j() {
        C2894d.C2895a aVar = new C2894d.C2895a(this.f2782c);
        ArrayList arrayList = new ArrayList();
        int i = -1;
        String a = C2922a.m13527a();
        for (int i2 = 3; i2 < C2922a.f13255b.length; i2++) {
            String str = C2922a.f13255b[i2];
            arrayList.add(C2922a.m13528a(this.f2782c, str) + (C2922a.m13530b(str) ? "" : " (" + getResString(R.string.download) + ")"));
            if (str.equals(a)) {
                i = i2 - 3;
            }
        }
        String[] strArr = new String[arrayList.size()];
        try {
            arrayList.toArray(strArr);
            aVar.setSingleChoiceItems(strArr, i, new C1022D(this));
            aVar.show();
        } catch (ArrayStoreException e) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m5372k() {
        if (this.f2783e != null) {
            for (InputStyleSelector e : this.f2783e) {
                e.mo9695e();
            }
        }
    }

    /* renamed from: l */
    private void m5374l() {
        if (this.f2783e != null) {
            String str = null;
            InputStyleSelector[] inputStyleSelectorArr = this.f2783e;
            int length = inputStyleSelectorArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                InputStyleSelector inputStyleSelector = inputStyleSelectorArr[i];
                if (inputStyleSelector.mo9696f()) {
                    str = inputStyleSelector.getInputStyleKey();
                    break;
                }
                i++;
            }
            if (!TextUtils.isEmpty(str) && !C2922a.f13254a.equals(str) && !str.equals(this.f2785g)) {
                if (TextUtils.isEmpty(this.f2784f)) {
                    this.f2785g = str;
                    this.f2784f = str;
                }
                if (C2922a.m13530b(this.f2785g)) {
                    this.f2784f = this.f2785g;
                }
                this.f2785g = str;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m5375m() {
        m5372k();
        m5374l();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m5377n() {
        if (!TextUtils.isEmpty(this.f2784f)) {
            C2922a.m13531c(this.f2784f);
            m5372k();
            m5374l();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m5379o() {
        if (this.f2791m != null) {
            this.f2791m.setEnabled(false);
        }
        if (this.f2783e != null) {
            for (InputStyleSelector inputStyleSelector : this.f2783e) {
                if (!inputStyleSelector.mo9692b()) {
                    inputStyleSelector.mo9691a(true);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m5381p() {
        if (this.f2791m != null) {
            this.f2791m.setEnabled(true);
        }
        if (this.f2783e != null) {
            for (InputStyleSelector a : this.f2783e) {
                a.mo9691a(false);
            }
        }
    }

    /* renamed from: a */
    private int m5346a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        String e = C2922a.m13533e(str);
        if (C2922a.m13534f(str) != 2 || (!C1549b.f4831b.equals(e) && !C1549b.f4833d.equals(e))) {
            return R.drawable.guide_intro_slide_stroke_filter;
        }
        return R.drawable.guide_intro_slide_mistyping;
    }

    /* renamed from: a */
    private int m5345a(int i) {
        if (i == 0) {
            return 0;
        }
        switch (i) {
            case R.drawable.guide_intro_slide_mistyping /*2130837753*/:
                return R.string.guide_intro_show_page_mistyping_title;
            case R.drawable.guide_intro_slide_stroke_filter /*2130837754*/:
                return R.string.guide_intro_show_page_stroke_filter_title;
            default:
                return 0;
        }
    }
}
