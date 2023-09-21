package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.p001v4.app.C0032A;
import android.support.p001v4.app.C0167o;
import android.support.p001v4.app.C0173s;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.view.ViewPager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.asset.C1446c;
import com.cootek.smartinput5.func.asset.C1451h;
import com.cootek.smartinput5.func.iab.C1730E;
import com.cootek.smartinput5.func.mainentrance.C1859m;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.TTextView;
import com.cootek.smartinput5.func.skin.SponsorThemeActivity;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p045a.C1060e;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.settings.C3041b;
import com.cootek.smartinput5.p066ui.settings.SkinPreviewMask;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.cootek.smartinput5.ui.settings.SkinActivity */
public class SkinActivity extends C0167o implements TextWatcher, C1730E.C1731a, SkinPreviewMask.C2976a {

    /* renamed from: a */
    public static final String f13621a = "SkinActivity.EXTRA_UPGRADING_SKIN";

    /* renamed from: b */
    public static final int f13622b = 0;

    /* renamed from: d */
    private static final String f13623d = "SkinActivity";

    /* renamed from: e */
    private static final String f13624e = "CURRENT_SKIN";

    /* renamed from: f */
    private static final int f13625f = 0;

    /* renamed from: g */
    private static final int f13626g = 2;

    /* renamed from: h */
    private static final int f13627h = 1;

    /* renamed from: i */
    private static final int f13628i = 0;

    /* renamed from: j */
    private static final String f13629j = "android:support:fragments";

    /* renamed from: A */
    private Messenger f13630A = null;

    /* renamed from: B */
    private boolean f13631B = false;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public int f13632C = 0;

    /* renamed from: D */
    private boolean f13633D = false;

    /* renamed from: E */
    private C3041b.C3042a f13634E = new C3150co(this);

    /* renamed from: F */
    private final View.OnClickListener f13635F = new C3154cs(this);

    /* renamed from: G */
    private final View.OnClickListener f13636G = new C3155ct(this);

    /* renamed from: c */
    C2995aJ f13637c;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f13638k = 0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public List<C3041b> f13639l = new ArrayList();

    /* renamed from: m */
    private List<TTextView> f13640m = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public View f13641n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f13642o;

    /* renamed from: p */
    private int f13643p = 0;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C1859m f13644q;

    /* renamed from: r */
    private View f13645r;

    /* renamed from: s */
    private View f13646s;

    /* renamed from: t */
    private View f13647t;

    /* renamed from: u */
    private EditText f13648u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public ImageView f13649v;

    /* renamed from: w */
    private C3121cP f13650w;

    /* renamed from: x */
    private Toast f13651x;

    /* renamed from: y */
    private boolean f13652y = false;

    /* renamed from: z */
    private Handler f13653z = null;

    /* renamed from: com.cootek.smartinput5.ui.settings.SkinActivity$a */
    public interface C2973a {
        /* renamed from: b */
        void mo9982b();
    }

    public void onCreate(Bundle bundle) {
        if (bundle != null && bundle.containsKey(f13629j)) {
            bundle.remove(f13629j);
        }
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.skin_tab);
        try {
            C1368X.m6317b((Context) this);
            this.f13653z = new C3159cx(this);
            this.f13630A = new Messenger(this.f13653z);
            Message obtain = Message.obtain((Handler) null, 1);
            obtain.replyTo = this.f13630A;
            try {
                C1368X.m6320c().mo5839l().sendMessage(obtain);
            } catch (RemoteException e) {
            }
            m13967a(getIntent());
            m13973b(getIntent());
            this.f13644q = new C1859m(this);
            this.f13644q.mo6950a(getIntent().getStringArrayListExtra(f13621a));
            m13986k();
            m13985j();
            this.f13649v = (ImageView) findViewById(R.id.skin_tab_more_btn);
            m13977c(0);
        } catch (C1451h e2) {
            e2.printStackTrace();
            this.f13633D = true;
            C1446c.m6746a(this, new C3157cv(this), new C3158cw(this));
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (!this.f13633D) {
            setIntent(intent);
            m13967a(intent);
            if (C1368X.m6324d()) {
                C1368X.m6320c().mo5841n().mo6277h();
                C1368X.m6320c().mo5841n().mo6268d();
            }
            m13973b(intent);
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.f13633D) {
            mo9976f();
            if (this.f13637c != null) {
                this.f13637c.mo10075a(this.f13644q);
            }
            this.f13644q.mo6951a(this.f13631B);
            if (!this.f13631B) {
                this.f13631B = true;
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!this.f13633D) {
            View findViewById = findViewById(16908290);
            Rect rect = new Rect();
            findViewById.getDrawingRect(rect);
            if (this.f13643p <= 0) {
                this.f13643p = rect.height();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (!this.f13633D) {
            mo9976f();
            mo9978h();
        }
    }

    public void onStop() {
        super.onStop();
        if (!this.f13633D) {
            mo9976f();
            mo9978h();
            if (this.f13652y) {
                finish();
            }
        }
    }

    /* renamed from: b */
    public C1859m mo9971b() {
        return this.f13644q;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13965a(int i) {
        int abs = (int) (((float) Math.abs(i - (this.f13642o / 2))) * (255.0f / ((float) (this.f13642o / 2))));
        if (i <= this.f13642o / 2) {
            m13966a(0, (int) R.drawable.skin_page_shop_icon, abs, this.f13636G);
        } else if (this.f13644q.mo6959i()) {
            m13966a(0, (int) R.drawable.skin_page_custom_icon, abs, this.f13635F);
        } else if (this.f13649v != null) {
            this.f13649v.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m13966a(int i, int i2, int i3, View.OnClickListener onClickListener) {
        if (this.f13649v != null) {
            this.f13649v.setVisibility(i);
            this.f13649v.setImageResource(i2);
            if (this.f13649v.getBackground() != null) {
                this.f13649v.getBackground().setAlpha(i3);
            }
            if (this.f13649v.getDrawable() != null) {
                this.f13649v.getDrawable().setAlpha(i3);
            }
            this.f13649v.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: j */
    private void m13985j() {
        C3039ay ayVar = new C3039ay();
        ayVar.mo10150a(this.f13634E);
        C2995aJ aJVar = new C2995aJ();
        aJVar.mo10075a(this.f13644q);
        this.f13637c = aJVar;
        aJVar.mo10150a(this.f13634E);
        this.f13639l.add(ayVar);
        this.f13639l.add(aJVar);
        TTextView tTextView = (TTextView) findViewById(R.id.tab_installed);
        tTextView.setOnClickListener(new C3160cy(this));
        TTextView tTextView2 = (TTextView) findViewById(R.id.tab_suggested);
        tTextView2.setOnClickListener(new C3161cz(this));
        this.f13640m.add(tTextView2);
        this.f13640m.add(tTextView);
        this.f13641n = findViewById(R.id.tab_cursor);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f13642o = displayMetrics.widthPixels / 2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.width = this.f13642o;
        layoutParams.height = getResources().getDimensionPixelSize(R.dimen.skin_tab_cursor_height);
        layoutParams.addRule(8, R.id.skin_tab_frame);
        this.f13641n.setLayoutParams(layoutParams);
        ViewPager viewPager = (ViewPager) findViewById(R.id.skin_tab_view_pager);
        viewPager.setAdapter(new C2975c(getSupportFragmentManager()));
        viewPager.setOnPageChangeListener(new C2974b(this, (C3150co) null));
        m13972b(this.f13638k);
    }

    /* renamed from: k */
    private void m13986k() {
        this.f13645r = findViewById(R.id.skin_preview);
        this.f13646s = findViewById(R.id.preview_title_icon);
        this.f13646s.setOnClickListener(new C3106cA(this));
        this.f13647t = findViewById(R.id.skin_preview_edit_text_container);
        this.f13648u = (EditText) findViewById(R.id.skin_preview_edit_text);
        this.f13648u.addTextChangedListener(this);
        SkinPreviewMask skinPreviewMask = (SkinPreviewMask) findViewById(R.id.skin_preview_mask);
        if (skinPreviewMask != null) {
            skinPreviewMask.setPreviewStateListener(this);
        }
        View findViewById = findViewById(R.id.skin_share_btn);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C3151cp(this));
        }
    }

    /* renamed from: a */
    private void m13967a(Intent intent) {
        String dataString = intent.getDataString();
        if (dataString != null) {
            try {
                File file = new File(new URI(dataString));
                C0997e.m5173a(file, new File(C1358O.m6234a("skin"), file.getName()));
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private void m13973b(Intent intent) {
        if (intent != null && intent.getExtras() != null) {
            String string = intent.getExtras().getString(f13624e);
            if (!TextUtils.isEmpty(string)) {
                this.f13638k = 1;
                if (C1368X.m6320c().mo5841n().mo6284l(string) != null) {
                    Intent intent2 = new Intent(this, SponsorThemeActivity.class);
                    intent2.addFlags(Engine.EXCEPTION_ERROR);
                    intent2.putExtra(SponsorThemeActivity.f6812a, string);
                    startActivity(intent2);
                    return;
                }
                return;
            }
            this.f13638k = 0;
        }
    }

    /* renamed from: c */
    public void mo9973c() {
        if (m13988m() && m13987l() && this.f13645r != null) {
            if (this.f13651x == null) {
                this.f13651x = Toast.makeText(this, C1974m.m9063a((Context) this, (int) R.string.paopao_changing_skin), 1);
            }
            this.f13651x.show();
            this.f13645r.setVisibility(0);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.skin_page_more_btn_margin);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.skin_page_more_btn_height);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f13649v.getWidth(), dimensionPixelSize2);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.rightMargin = dimensionPixelSize;
            layoutParams.topMargin = (this.f13643p - dimensionPixelSize2) - dimensionPixelSize;
            this.f13649v.setLayoutParams(layoutParams);
            this.f13648u.postDelayed(new C3152cq(this), 200);
        }
    }

    /* renamed from: d */
    public void mo9974d() {
        if (this.f13645r != null) {
            this.f13652y = false;
            this.f13645r.setVisibility(8);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.skin_page_more_btn_margin);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f13649v.getWidth(), getResources().getDimensionPixelSize(R.dimen.skin_page_more_btn_height));
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            layoutParams.rightMargin = dimensionPixelSize;
            layoutParams.bottomMargin = dimensionPixelSize;
            this.f13649v.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: e */
    public void mo9975e() {
        this.f13648u.setFocusable(true);
        this.f13648u.setFocusableInTouchMode(true);
        this.f13648u.requestFocus();
        ((InputMethodManager) getSystemService("input_method")).toggleSoftInput(2, 2);
    }

    /* renamed from: f */
    public void mo9976f() {
        if (this.f13648u != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f13648u.getWindowToken(), 0);
        }
    }

    public void onDestroy() {
        C1056a.m5588a().mo4266b();
        C1060e.m5598b().mo4276c();
        super.onDestroy();
        if (this.f13644q != null) {
            this.f13644q.mo6958h();
        }
        C1368X.m6325e();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if ((i != 4 && i != 3) || this.f13645r == null || this.f13645r.getVisibility() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo9976f();
        mo9974d();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m13972b(int i) {
        ViewPager viewPager = (ViewPager) findViewById(R.id.skin_tab_view_pager);
        if (viewPager != null) {
            viewPager.setCurrentItem(i);
            if (i != this.f13638k) {
                this.f13638k = i;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m13977c(int i) {
        if (i >= 0 && i < this.f13640m.size()) {
            for (int i2 = 0; i2 < this.f13640m.size(); i2++) {
                this.f13640m.get(i2).setSelected(false);
            }
            this.f13640m.get(i).setSelected(true);
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.settings.SkinActivity$c */
    private class C2975c extends C0032A {
        public C2975c(C0173s sVar) {
            super(sVar);
        }

        /* renamed from: a */
        public Fragment mo10a(int i) {
            if (SkinActivity.this.f13639l == null || SkinActivity.this.f13639l.size() == 0) {
                return null;
            }
            return (C3041b) SkinActivity.this.f13639l.get(i);
        }

        public int getCount() {
            if (SkinActivity.this.f13639l == null) {
                return 0;
            }
            return SkinActivity.this.f13639l.size();
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.settings.SkinActivity$b */
    private class C2974b implements ViewPager.C0382e {
        private C2974b() {
        }

        /* synthetic */ C2974b(SkinActivity skinActivity, C3150co coVar) {
            this();
        }

        public void onPageScrollStateChanged(int i) {
            if (i == 1) {
                ((C3039ay) SkinActivity.this.f13639l.get(0)).mo10146d();
            }
            SkinActivity.this.mo9974d();
            SkinActivity.this.f13644q.mo6962l();
        }

        public void onPageScrolled(int i, float f, int i2) {
            int f2 = (int) (((float) (SkinActivity.this.f13642o * i)) + (((float) SkinActivity.this.f13642o) * f));
            int unused = SkinActivity.this.f13632C = f2;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) SkinActivity.this.f13641n.getLayoutParams();
            layoutParams.leftMargin = f2;
            SkinActivity.this.f13641n.setLayoutParams(layoutParams);
            SkinActivity.this.m13965a(f2);
            if (f == 0.0f || f == 1.0f) {
                m14000a(i);
            }
        }

        public void onPageSelected(int i) {
            SkinActivity.this.m13977c(i);
            if (i != SkinActivity.this.f13638k) {
                int unused = SkinActivity.this.f13638k = i;
            }
            switch (i) {
                case 0:
                    C1246d.m6010a((Context) SkinActivity.this).mo4591a(C1246d.f3843cG, C1246d.f3855cS, C1246d.f3842cF);
                    C1056a.m5588a().mo4264a(C1056a.f2985p, SkinActivity.this);
                    return;
                case 1:
                    C1246d.m6010a((Context) SkinActivity.this).mo4591a(C1246d.f3843cG, C1246d.f3854cR, C1246d.f3842cF);
                    C1056a.m5588a().mo4264a(C1056a.f2986q, SkinActivity.this);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: a */
        private void m14000a(int i) {
            C2973a aVar;
            if (SkinActivity.this.f13639l != null && i > -1 && i < SkinActivity.this.f13639l.size() && (aVar = (C2973a) SkinActivity.this.f13639l.get(i)) != null) {
                aVar.mo9982b();
            }
        }
    }

    /* renamed from: g */
    public void mo9977g() {
        if (this.f13645r != null && this.f13645r.getVisibility() == 0 && this.f13652y) {
            mo9974d();
        }
    }

    /* renamed from: h */
    public void mo9978h() {
        if (this.f13652y) {
            mo9976f();
            return;
        }
        mo9976f();
        mo9974d();
    }

    /* renamed from: l */
    private boolean m13987l() {
        String string = Settings.Secure.getString(getContentResolver(), "default_input_method");
        return string != null && string.equalsIgnoreCase(new StringBuilder().append(getPackageName()).append("/").append(TouchPalIME.class.getName()).toString());
    }

    /* renamed from: m */
    private boolean m13988m() {
        List<InputMethodInfo> enabledInputMethodList = ((InputMethodManager) getApplicationContext().getSystemService("input_method")).getEnabledInputMethodList();
        for (int i = 0; i < enabledInputMethodList.size(); i++) {
            if (enabledInputMethodList.get(i).getPackageName().equalsIgnoreCase(getPackageName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void mo9979i() {
        if (this.f13651x != null) {
            this.f13651x.cancel();
        }
        this.f13652y = true;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 0:
                if (!(i2 != -1 || intent == null || this.f13644q == null)) {
                    this.f13644q.mo6948a(intent.getIntExtra(SkinCustomizeActivity.f13657a, 0), intent.getBooleanExtra(SkinCustomizeActivity.f13665i, false));
                    break;
                }
            default:
                C1368X.m6320c().mo5825K().onActivityResult(i, i2, intent);
                break;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* renamed from: a */
    public int mo6691a() {
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13970a(String str, String str2, String str3) {
        if (this.f13650w == null || !this.f13650w.mo10240a()) {
            if (this.f13650w == null) {
                this.f13650w = new C3121cP(this);
            }
            this.f13650w.mo10238a(C1974m.m9063a((Context) this, (int) R.string.download_skin_query));
            this.f13650w.mo10239a(C1974m.m9063a((Context) this, (int) R.string.download), new C3153cr(this, str, str2, str3));
            this.f13650w.mo10241b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m13989n() {
        C2188Q.m9853a().mo7684d();
        if (!C1584bI.m7141a((Context) this, (Runnable) null, false)) {
            C1602bh.m7241a((Context) this, (String) null, OnlineShopActivity.f13563j);
        }
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f13647t.setBackgroundResource(R.drawable.skin_preview_edit_text_bg);
        } else {
            this.f13647t.setBackgroundResource(R.drawable.skin_preview_edit_text_bg_h);
        }
    }
}
