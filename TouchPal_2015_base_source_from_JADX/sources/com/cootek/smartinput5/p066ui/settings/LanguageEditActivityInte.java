package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.PreferenceGroup;
import android.text.TextUtils;
import android.widget.Toast;
import com.cootek.smartinput5.func.C1337C;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1405aP;
import com.cootek.smartinput5.func.C1443as;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.resource.p055ui.C1977c;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.LanguageEditActivityInte */
public class LanguageEditActivityInte extends C1977c implements C1337C.C1340b, C1389aD.C1390a {

    /* renamed from: a */
    public static String f13510a = "LanguageID";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f13511b;

    /* renamed from: c */
    private String f13512c;

    /* renamed from: d */
    private LanguageLayoutListPreferenceInte f13513d;

    /* renamed from: e */
    private CustomButtonPreference f13514e;

    /* renamed from: f */
    private CustomizablePreference f13515f;

    /* renamed from: g */
    private LanguageMixInputListPreferenceInte f13516g;

    /* renamed from: h */
    private CustomizablePreference f13517h;

    /* renamed from: i */
    private int f13518i;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13511b = this;
        C1368X.m6317b(this.f13511b);
        addPreferencesFromResource(R.layout.language_edit_inte);
        this.f13512c = getIntent().getStringExtra(f13510a);
        if (TextUtils.isEmpty(this.f13512c)) {
            finish();
            return;
        }
        this.f13513d = (LanguageLayoutListPreferenceInte) findPreference(C1135d.option_lng_edit_layout_list.toString());
        this.f13514e = (CustomButtonPreference) findPreference(C1135d.option_lng_curve_packs.toString());
        this.f13515f = (CustomizablePreference) findPreference(C1135d.option_lng_wave_support.toString());
        this.f13516g = (LanguageMixInputListPreferenceInte) findPreference(C1135d.option_lng_edit_mix_input.toString());
        this.f13517h = (CustomizablePreference) findPreference(C1135d.option_lng_uninstall_language.toString());
        this.f13518i = this.f13513d.getLayoutResource();
        if (!m13840e()) {
            finish();
        } else {
            C1132b.m5654a((Context) this).mo4405a((PreferenceGroup) getPreferenceScreen());
        }
    }

    /* renamed from: e */
    private boolean m13840e() {
        C1389aD o = C1368X.m6320c().mo5842o();
        C1498a l = o.mo5954l(this.f13512c);
        if (l == null) {
            return false;
        }
        setTitle(l.f4728g);
        this.f13513d.setLanguageId(this.f13512c);
        this.f13513d.addOnLayoutChangeListener(new C3082bd(this));
        if (C1405aP.m6594a().mo6013a(this.f13512c) == null) {
            getPreferenceScreen().removePreference(this.f13516g);
        } else {
            this.f13516g.setLanguageId(this.f13512c);
        }
        m13832a(l);
        if (C1389aD.m6424E(this.f13512c)) {
            this.f13515f.setTitle(mo7237a((int) R.string.optpage_lng_wave_support_title, l.f4728g));
            this.f13515f.setModelPreference(this.f13513d);
            this.f13515f.setLayoutResource(this.f13518i);
        } else {
            getPreferenceScreen().removePreference(this.f13515f);
        }
        if (!l.mo6155e() || l.mo6162l()) {
            getPreferenceScreen().removePreference(this.f13517h);
        } else {
            this.f13517h.setModelPreference(this.f13513d);
            this.f13517h.setLayoutResource(this.f13518i);
            this.f13517h.setOnPreferenceClickListener(new C3083be(this, l, o));
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m13843g() {
        C1498a l = C1368X.m6320c().mo5842o().mo5954l(this.f13512c);
        if (l != null) {
            m13832a(l);
        }
    }

    /* renamed from: a */
    private void m13832a(C1498a aVar) {
        boolean z;
        String str = aVar.f4727f;
        this.f13514e.setTitle(mo7237a((int) R.string.curve_data_title, aVar.f4728g));
        this.f13514e.setModelPreference(this.f13513d);
        this.f13514e.setLayoutResource(this.f13518i);
        boolean a = C1368X.m6320c().mo5815A().mo5567a(aVar);
        if (aVar.f4730i && !a) {
            if (C1358O.m6234a(C1358O.f4194e) == null) {
                Toast.makeText(this.f13511b, mo7241b((int) R.string.sdcard_not_ready_message), 1).show();
                z = false;
            } else {
                z = true;
            }
            this.f13514e.setEnabled(z);
            C1337C A = C1368X.m6320c().mo5815A();
            if (A.mo5575d(C1337C.m6136a(str, 0))) {
                this.f13514e.setSummary(mo7241b((int) R.string.optpage_curve_img_installed_summary));
                this.f13514e.setCustomViewDrawable(R.drawable.key_btn_uninstall_ctrl);
                this.f13514e.setCustomViewVisible(true);
                this.f13514e.setCustomViewEnable(true);
                this.f13514e.setOnCustomButtonClickListener(new C3085bg(this, aVar, A, str));
                return;
            }
            this.f13514e.setSummary(mo7241b((int) R.string.optpage_curve_img_notinstall_summary));
            this.f13514e.setCustomViewVisible(false);
            this.f13514e.setCustomViewEnable(false);
            this.f13514e.setOnPreferenceClickListener(new C3087bi(this, str, A));
        } else if (a) {
            this.f13514e.setEnabled(false);
            this.f13514e.setCustomViewVisible(false);
            this.f13514e.setSummary(mo7241b((int) R.string.optpage_curve_img_default_summary));
        } else {
            getPreferenceScreen().removePreference(this.f13514e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13831a(C1443as asVar) {
        if (asVar != null) {
            C1368X.m6320c().mo5842o().mo5940d(asVar.getPackageName());
            asVar.mo6025d();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C1368X.m6320c().mo5842o().mo5937b((C1389aD.C1390a) this);
        C1368X.m6320c().mo5815A().mo5570b((C1337C.C1340b) this);
        C1368X.m6325e();
        System.gc();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C1368X.m6320c().mo5842o().mo5929a((C1389aD.C1390a) this);
        C1368X.m6320c().mo5815A().mo5565a((C1337C.C1340b) this);
        super.onResume();
    }

    /* renamed from: f */
    public void mo4249f() {
        finish();
    }

    /* renamed from: t_ */
    public void mo5579t_() {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public PackageInfo m13828a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return this.f13511b.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
