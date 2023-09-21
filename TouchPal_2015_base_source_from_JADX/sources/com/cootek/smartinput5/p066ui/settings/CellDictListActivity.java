package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1920p;
import com.cootek.smartinput5.func.C1960r;
import com.cootek.smartinput5.func.C2065u;
import com.cootek.smartinput5.func.HandWriteManager;
import com.cootek.smartinput5.func.asset.C1446c;
import com.cootek.smartinput5.func.asset.C1451h;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.p055ui.C1977c;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.HandWriteMask;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.settings.CellDictListActivity */
public class CellDictListActivity extends C1977c implements HandWriteManager.C1349a, C1920p.C1921a, C1960r.C1961a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f13394a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public PreferenceScreen f13395b;

    /* renamed from: c */
    private boolean f13396c;

    /* renamed from: d */
    private boolean f13397d;

    /* renamed from: e */
    private boolean f13398e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<Preference> f13399f;

    /* renamed from: g */
    private boolean f13400g = false;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            C1368X.m6317b((Context) this);
            this.f13394a = this;
            addPreferencesFromResource(R.layout.cell_dict_list_layout);
            C1132b.m5654a((Context) this).mo4405a((PreferenceGroup) getPreferenceScreen());
            this.f13395b = (PreferenceScreen) findPreference(C1135d.option_cell_dict.toString());
            this.f13396c = false;
            this.f13399f = new ArrayList<>();
            setTitle(mo7241b((int) R.string.optpage_cell_dictionary_screen_title));
        } catch (C1451h e) {
            e.printStackTrace();
            C1446c.m6745a(this);
            this.f13400g = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (!this.f13400g) {
            C1368X.m6325e();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!this.f13400g) {
            C1368X.m6320c().mo5847t().mo7075a((C1920p.C1921a) this);
            C1368X.m6320c().mo5845r().mo7194a((C1960r.C1961a) this);
            C1368X.m6320c().mo5848u().mo5596a((HandWriteManager.C1349a) this);
            m13729g();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (!this.f13400g) {
            C1368X.m6320c().mo5847t().mo7076b((C1920p.C1921a) this);
            C1368X.m6320c().mo5845r().mo7196b((C1960r.C1961a) this);
            C1368X.m6320c().mo5848u().mo5598b((HandWriteManager.C1349a) this);
        }
    }

    /* renamed from: r_ */
    public void mo7213r_() {
        m13729g();
    }

    /* renamed from: e */
    public void mo4248e() {
        m13729g();
    }

    /* renamed from: s_ */
    public boolean mo7081s_() {
        m13729g();
        return true;
    }

    /* renamed from: f */
    private void m13727f() {
        C1389aD o = C1368X.m6320c().mo5842o();
        String[] h = o.mo5947h();
        for (String str : h) {
            C1498a l = o.mo5954l(str);
            if (l != null && l.mo6156f()) {
                if (C1389aD.m6470y(str)) {
                    this.f13397d = true;
                }
                if (C1549b.f4831b.equals(str)) {
                    this.f13398e = true;
                }
                if (this.f13397d && this.f13398e) {
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private void m13729g() {
        CustomizablePreference i;
        if (this.f13395b != null) {
            m13727f();
            this.f13395b.removeAll();
            this.f13399f.clear();
            C1960r r = C1368X.m6320c().mo5845r();
            C2065u[] g = r.mo7203g();
            for (C2065u uVar : g) {
                if (m13719a(uVar)) {
                    CustomCheckBoxPreference customCheckBoxPreference = new CustomCheckBoxPreference(this);
                    customCheckBoxPreference.setTitle(uVar.f8871w);
                    customCheckBoxPreference.setKey(uVar.f8870v);
                    customCheckBoxPreference.setChecked(r.mo7208k(uVar.f8870v));
                    customCheckBoxPreference.setOnPreferenceClickListener(new C2956F(this, r, uVar));
                    if (r.mo7211o(uVar.f8870v)) {
                        customCheckBoxPreference.setCustomViewEnable(false);
                        customCheckBoxPreference.setCustomViewVisible(false);
                        customCheckBoxPreference.setEnabled(false);
                    } else {
                        customCheckBoxPreference.setCustomViewEnable(true);
                        customCheckBoxPreference.setCustomViewVisible(true);
                        customCheckBoxPreference.setEnabled(true);
                        customCheckBoxPreference.setCustomViewDrawable(R.drawable.key_btn_uninstall_ctrl);
                        customCheckBoxPreference.setCustomViewOnClickListener(new C2962J(this, uVar));
                    }
                    this.f13395b.addPreference(customCheckBoxPreference);
                }
                Preference h = m13730h();
                if (h != null) {
                    this.f13395b.addPreference(h);
                }
            }
            if (this.f13397d && (i = m13732i()) != null) {
                this.f13395b.addPreference(i);
            }
            for (C2065u uVar2 : r.mo7205h()) {
                if (m13719a(uVar2)) {
                    CustomizablePreference customizablePreference = new CustomizablePreference(this);
                    customizablePreference.setTitle(uVar2.f8871w);
                    customizablePreference.setSummary(mo7241b((int) R.string.optpage_cell_dict_need_upgrade));
                    customizablePreference.setKey(uVar2.f8870v);
                    customizablePreference.setOnPreferenceClickListener(new C2963K(this, uVar2));
                    this.f13395b.addPreference(customizablePreference);
                }
            }
            for (C2065u uVar3 : r.mo7206i()) {
                if (m13719a(uVar3)) {
                    CustomizablePreference customizablePreference2 = new CustomizablePreference(this);
                    if (uVar3 != null) {
                        customizablePreference2.setTitle(uVar3.f8871w);
                        customizablePreference2.setSummary(mo7241b((int) R.string.optpage_cell_dict_need_uninstall));
                        customizablePreference2.setKey(uVar3.f8870v);
                        customizablePreference2.setOnPreferenceClickListener(new C2964L(this, uVar3));
                        this.f13399f.add(customizablePreference2);
                    }
                }
            }
            if (!this.f13396c) {
                CustomizablePreference customizablePreference3 = new CustomizablePreference(this);
                customizablePreference3.setTitle(mo7241b((int) R.string.optpage_language_more_cell));
                customizablePreference3.setOnPreferenceClickListener(new C2965M(this));
                this.f13395b.addPreference(customizablePreference3);
                return;
            }
            Iterator<Preference> it = this.f13399f.iterator();
            while (it.hasNext()) {
                this.f13395b.addPreference(it.next());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13717a(String str, C2065u uVar) {
        if (uVar.f8869D) {
            uVar.mo7439f();
            return;
        }
        C2065u d = C1368X.m6320c().mo5845r().mo7198d(str);
        C2894d.C2895a aVar = new C2894d.C2895a(this.f13394a);
        aVar.setMessage(mo7237a((int) R.string.delete_cell, uVar.f8871w));
        aVar.setPositiveButton(mo7241b(17039379), new C2967O(this, d));
        aVar.setNegativeButton(mo7241b(17039369), (DialogInterface.OnClickListener) null);
        aVar.create().show();
    }

    /* renamed from: h */
    private Preference m13730h() {
        C1920p t = C1368X.m6320c().mo5847t();
        if (t.mo7078c() || !this.f13398e) {
            return null;
        }
        if (!t.mo7077b()) {
            CustomizablePreference customizablePreference = new CustomizablePreference(this);
            customizablePreference.setTitle(mo7241b((int) R.string.paopao_pinyin_bigram_title));
            customizablePreference.setSummary(mo7241b((int) R.string.optpage_cell_dict_not_installed));
            customizablePreference.setOnPreferenceClickListener(new C2968P(this, (String) customizablePreference.getTitle()));
            return customizablePreference;
        }
        CustomCheckBoxPreference customCheckBoxPreference = new CustomCheckBoxPreference(this);
        customCheckBoxPreference.setTitle(mo7241b((int) R.string.paopao_pinyin_bigram_title));
        customCheckBoxPreference.setCheckBoxVisibility(8);
        customCheckBoxPreference.setCustomViewDrawable(R.drawable.key_btn_uninstall_ctrl);
        customCheckBoxPreference.setCustomViewOnClickListener(new C2971R(this, t));
        return customCheckBoxPreference;
    }

    /* renamed from: i */
    private CustomizablePreference m13732i() {
        if (!C1132b.m5654a((Context) this).mo4395a(C1135d.option_cell_list_handwrite.toString(), (Boolean) true).booleanValue()) {
            return null;
        }
        HandWriteManager u = C1368X.m6320c().mo5848u();
        if (u.hasNativeData()) {
            return null;
        }
        if (!u.mo5599c()) {
            CustomizablePreference customizablePreference = new CustomizablePreference(this);
            customizablePreference.setTitle(mo7241b((int) R.string.paopao_handwrite_data_title));
            String str = (String) customizablePreference.getTitle();
            switch (HandWriteMask.f11330g) {
                case 2:
                    customizablePreference.setSummary(mo7241b((int) R.string.downloading));
                    break;
                default:
                    customizablePreference.setSummary(mo7241b((int) R.string.optpage_cell_dict_not_installed));
                    break;
            }
            customizablePreference.setOnPreferenceClickListener(new C2977T(this, u, str));
            return customizablePreference;
        }
        CustomCheckBoxPreference customCheckBoxPreference = new CustomCheckBoxPreference(this);
        customCheckBoxPreference.setTitle(mo7241b((int) R.string.paopao_handwrite_data_title));
        customCheckBoxPreference.setCheckBoxVisibility(8);
        customCheckBoxPreference.setCustomViewDrawable(R.drawable.key_btn_uninstall_ctrl);
        customCheckBoxPreference.setCustomViewOnClickListener(new C2959G(this, u));
        return customCheckBoxPreference;
    }

    /* renamed from: a */
    private boolean m13719a(C2065u uVar) {
        return !uVar.f8867B && (!C2065u.f8851g.equals(uVar.f8872x) || this.f13398e);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13718a(String str, String str2, String str3) {
        C1584bI.m7145b(this.f13394a, new C2961I(this, str, str2, str3), false);
    }
}
