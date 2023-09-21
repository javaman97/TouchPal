package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceGroup;
import android.widget.Toast;
import com.cootek.smartinput5.func.C1337C;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.resource.p055ui.C1977c;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.CurveDictActivity */
public class CurveDictActivity extends C1977c implements C1337C.C1340b {

    /* renamed from: a */
    public static String f13405a = "LanguageID";

    /* renamed from: b */
    private Context f13406b;

    /* renamed from: c */
    private String f13407c = null;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1368X.m6317b((Context) this);
        this.f13406b = this;
        addPreferencesFromResource(R.layout.curve_list);
        this.f13407c = getIntent().getStringExtra(f13405a);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C1368X.m6325e();
        super.onDestroy();
        m13748e();
        System.gc();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C1368X.m6320c().mo5815A().mo5565a((C1337C.C1340b) this);
        m13750f();
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C1368X.m6320c().mo5815A().mo5570b((C1337C.C1340b) this);
        super.onPause();
    }

    /* renamed from: t_ */
    public void mo5579t_() {
        m13750f();
    }

    /* renamed from: e */
    private void m13748e() {
        PreferenceGroup preferenceGroup = (PreferenceGroup) findPreference("curve_packs");
        if (preferenceGroup != null) {
            preferenceGroup.removeAll();
        }
    }

    /* renamed from: f */
    private void m13750f() {
        boolean z;
        boolean z2;
        if (C1358O.m6234a(C1358O.f4194e) == null) {
            Toast.makeText(this, mo7241b((int) R.string.sdcard_not_ready_message), 1).show();
            z = false;
        } else {
            z = true;
        }
        PreferenceGroup preferenceGroup = (PreferenceGroup) findPreference("curve_packs");
        preferenceGroup.removeAll();
        C1498a l = C1368X.m6320c().mo5842o().mo5954l(this.f13407c);
        if (C1368X.m6320c().mo5815A().mo5567a(l)) {
            CustomButtonPreference customButtonPreference = new CustomButtonPreference(this);
            customButtonPreference.setTitle(mo7237a((int) R.string.curve_data_title, l.f4728g));
            customButtonPreference.setSummary(mo7241b((int) R.string.optpage_curve_img_default_summary));
            customButtonPreference.setCustomViewVisible(false);
            customButtonPreference.setEnabled(false);
            preferenceGroup.addPreference(customButtonPreference);
            return;
        }
        int i = 0;
        boolean z3 = false;
        while (i < C1337C.C1339a.values().length) {
            C1337C.C1339a aVar = C1337C.C1339a.values()[i];
            CustomButtonPreference customButtonPreference2 = new CustomButtonPreference(this);
            customButtonPreference2.setEnabled(z);
            if (!C1593bR.m7162a().f5075a) {
                customButtonPreference2.setTitle(mo7237a((int) R.string.curve_data_title, l.mo6153c()));
                if (aVar == C1337C.C1339a.qw) {
                    z2 = true;
                } else {
                    return;
                }
            } else {
                customButtonPreference2.setTitle(l.mo6153c() + " " + aVar);
                z2 = z3;
            }
            customButtonPreference2.setCustomViewDrawable(R.drawable.key_btn_uninstall_ctrl);
            customButtonPreference2.setKey(C1337C.m6136a(l.f4727f, C1337C.m6133a(aVar)));
            StringBuilder sb = new StringBuilder();
            C1337C A = C1368X.m6320c().mo5815A();
            if (A.mo5575d(customButtonPreference2.getKey())) {
                customButtonPreference2.setCustomViewVisible(true);
                customButtonPreference2.setCustomViewEnable(true);
                sb.append(mo7241b((int) R.string.optpage_curve_img_installed_summary));
                customButtonPreference2.setOnCustomButtonClickListener(new C3018ad(this, A, customButtonPreference2));
            } else {
                customButtonPreference2.setCustomViewVisible(false);
                customButtonPreference2.setCustomViewEnable(false);
                sb.append(mo7241b((int) R.string.optpage_curve_img_notinstall_summary));
                customButtonPreference2.setOnPreferenceClickListener(new C3020af(this, A, aVar, l, customButtonPreference2));
            }
            customButtonPreference2.setSummary(sb);
            preferenceGroup.addPreference(customButtonPreference2);
            if (!z2) {
                i++;
                z3 = z2;
            } else {
                return;
            }
        }
    }
}
