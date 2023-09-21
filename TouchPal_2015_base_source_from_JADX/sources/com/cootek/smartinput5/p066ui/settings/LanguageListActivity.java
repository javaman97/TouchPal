package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceGroup;
import android.text.TextUtils;
import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1337C;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1396aI;
import com.cootek.smartinput5.func.C1443as;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1811k;
import com.cootek.smartinput5.func.asset.C1446c;
import com.cootek.smartinput5.func.asset.C1451h;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.p055ui.C1977c;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.settings.LanguageListActivity */
public class LanguageListActivity extends C1977c implements C1337C.C1340b, C1389aD.C1390a, C1396aI.C1397a {

    /* renamed from: a */
    private static final String f13519a = "com.cootek.smartinputv5.language.action.HIDE_ICON";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f13520b;

    /* renamed from: c */
    private boolean f13521c = true;

    /* renamed from: d */
    private boolean f13522d = false;

    /* renamed from: e */
    private LanguageSwitchModeDialogPreference f13523e;

    /* renamed from: f */
    private CheckBoxPreference f13524f;

    /* renamed from: g */
    private CheckBoxPreference f13525g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public PreferenceCategory f13526h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ArrayList<Preference> f13527i;

    /* renamed from: j */
    private LanguageSharePreference f13528j;

    /* renamed from: k */
    private boolean f13529k = false;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            C1368X.m6317b((Context) this);
            C1368X.m6320c().mo5827M().mo5991a(true);
            setTitle(mo7241b((int) R.string.optpage_language_inte));
            this.f13520b = this;
            this.f13521c = getIntent().getBooleanExtra("SHOW_ALL_LANGUAGE", true);
            this.f13522d = getIntent().getBooleanExtra("HIDE_LANGUAGE_ICONS", false);
            addPreferencesFromResource(R.layout.language_list);
            this.f13523e = (LanguageSwitchModeDialogPreference) findPreference(C1135d.option_enable_lang_key.toString());
            this.f13524f = (CheckBoxPreference) findPreference(C1135d.option_mix_language.toString());
            this.f13525g = (CheckBoxPreference) findPreference(C1135d.option_curve.toString());
            this.f13526h = (PreferenceCategory) findPreference(C1135d.option_language_list.toString());
            this.f13527i = new ArrayList<>();
            if (this.f13523e != null) {
                this.f13523e.updateSummary();
            }
            TouchPalOption.m5428a(this.f13524f, 12);
            TouchPalOption.m5428a(this.f13525g, (int) Settings.CURVE_ENABLED_UI);
            C1132b.m5654a((Context) this).mo4405a((PreferenceGroup) getPreferenceScreen());
            if (this.f13522d) {
                this.f13520b.sendBroadcast(new Intent(f13519a));
            }
        } catch (C1451h e) {
            this.f13529k = true;
            e.printStackTrace();
            C1446c.m6745a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!this.f13529k) {
            C1368X.m6320c().mo5827M().mo5998d(3);
            C1368X.m6320c().mo5842o().mo5929a((C1389aD.C1390a) this);
            C1368X.m6320c().mo5815A().mo5565a((C1337C.C1340b) this);
            m13862i();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (!this.f13529k) {
            C1368X.m6320c().mo5842o().mo5937b((C1389aD.C1390a) this);
            C1368X.m6320c().mo5815A().mo5570b((C1337C.C1340b) this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (!this.f13529k) {
            C1368X.m6325e();
            m13861e();
            System.gc();
        }
    }

    /* renamed from: f */
    public void mo4249f() {
        m13862i();
    }

    /* renamed from: t_ */
    public void mo5579t_() {
        this.f13525g.setEnabled(C1368X.m6320c().mo5815A().mo5574c());
    }

    /* renamed from: e */
    private void m13861e() {
        this.f13524f = null;
        if (this.f13526h != null) {
            this.f13526h.removeAll();
            this.f13526h = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13850a(C1443as asVar) {
        if (asVar != null) {
            C1368X.m6320c().mo5842o().mo5940d(asVar.getPackageName());
            asVar.mo6025d();
        }
    }

    /* renamed from: i */
    private void m13862i() {
        C1498a aVar;
        if (this.f13526h != null) {
            this.f13526h.removeAll();
            this.f13527i.clear();
            C1389aD o = C1368X.m6320c().mo5842o();
            o.mo5977x();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            boolean l = m13863l();
            for (C1498a aVar2 : o.mo5953k()) {
                arrayList.add(aVar2);
                if (l && o.mo5944g(aVar2.f4729h)) {
                    arrayList2.add(aVar2);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            String[] h = o.mo5947h();
            for (int i = 0; i < h.length; i++) {
                String str = h[i];
                C1498a l2 = o.mo5954l(str);
                if (l2.mo6156f()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            break;
                        }
                        C1498a aVar3 = (C1498a) arrayList.get(i2);
                        if (str.equals(aVar3.f4727f)) {
                            arrayList.remove(i2);
                            arrayList2.remove(aVar3);
                            break;
                        }
                        i2++;
                    }
                    if (C1389aD.m6423C(str)) {
                        arrayList4.add(l2);
                    } else {
                        CustomCheckBoxPreference customCheckBoxPreference = new CustomCheckBoxPreference(this);
                        customCheckBoxPreference.setTitle(l2.mo6153c());
                        customCheckBoxPreference.setKey(h[i]);
                        customCheckBoxPreference.setChecked(l2.mo6158h());
                        customCheckBoxPreference.setOnPreferenceClickListener(new C3088bj(this));
                        customCheckBoxPreference.setCustomButtonVisible(l2.f4730i);
                        customCheckBoxPreference.setCustomButtonBgDrawable(R.drawable.curve_flag);
                        customCheckBoxPreference.setCustomViewEnable(l2.mo6155e());
                        customCheckBoxPreference.setCustomViewDrawable(R.drawable.key_btn_uninstall_ctrl);
                        customCheckBoxPreference.setCustomButtonOnClickListener(new C3090bl(this, str));
                        customCheckBoxPreference.setCustomViewOnClickListener(new C3091bm(this, l2, o));
                        this.f13526h.addPreference(customCheckBoxPreference);
                    }
                }
            }
            m13864m();
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                C1498a aVar4 = (C1498a) it.next();
                Preference preference = new Preference(this);
                preference.setTitle(aVar4.mo6153c());
                preference.setKey(aVar4.mo6160j());
                preference.setSummary(mo7241b(m13847a(aVar4.f4729h, (int) R.string.optpage_language_without_prediction)));
                preference.setOnPreferenceClickListener(new C3093bo(this, aVar4, preference));
                this.f13526h.addPreference(preference);
            }
            String b = mo7241b((int) R.string.CURRENT_LANGUAGE);
            for (int i3 = 0; i3 < o.mo5939d(); i3++) {
                C1498a a = o.mo5927a(i3);
                if ((!a.mo6157g() || !a.mo6156f()) && !C1389aD.m6423C(a.f4727f)) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList.size()) {
                            break;
                        }
                        C1498a aVar5 = (C1498a) arrayList.get(i4);
                        if (a.f4727f.equals(aVar5.f4727f)) {
                            arrayList.remove(i4);
                            arrayList2.remove(aVar5);
                            break;
                        }
                        i4++;
                    }
                    arrayList3.add(a);
                }
            }
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList3.size()) {
                    break;
                } else if (((C1498a) arrayList3.get(i5)).f4727f.equalsIgnoreCase(b)) {
                    arrayList3.add(0, (C1498a) arrayList3.remove(i5));
                    break;
                } else {
                    i5++;
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                m13851a((C1498a) it2.next());
            }
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    aVar = null;
                    break;
                } else if (((C1498a) arrayList.get(i6)).f4727f.equalsIgnoreCase(b)) {
                    aVar = (C1498a) arrayList.remove(i6);
                    break;
                } else {
                    i6++;
                }
            }
            if (aVar != null) {
                arrayList2.remove(aVar);
                arrayList2.add(0, aVar);
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C1498a aVar6 = (C1498a) it3.next();
                arrayList.remove(aVar6);
                Preference preference2 = new Preference(this);
                preference2.setTitle(aVar6.mo6153c());
                preference2.setSummary(mo7241b(m13847a(aVar6.f4729h, (int) R.string.optpage_language_not_installed)));
                preference2.setKey(aVar6.f4727f);
                preference2.setOnPreferenceClickListener(new C3094bp(this, aVar6, preference2));
                this.f13526h.addPreference(preference2);
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C1498a aVar7 = (C1498a) it4.next();
                Preference preference3 = new Preference(this);
                preference3.setTitle(aVar7.mo6153c());
                preference3.setSummary(mo7241b(m13847a(aVar7.f4729h, (int) R.string.optpage_language_not_installed)));
                preference3.setKey(aVar7.f4727f);
                preference3.setOnPreferenceClickListener(new C3095bq(this, aVar7, preference3));
                this.f13527i.add(preference3);
            }
            if (this.f13527i.isEmpty() || this.f13521c) {
                Iterator<Preference> it5 = this.f13527i.iterator();
                while (it5.hasNext()) {
                    this.f13526h.addPreference(it5.next());
                }
            } else {
                Preference preference4 = new Preference(this);
                preference4.setTitle(mo7241b((int) R.string.optpage_language_more_language));
                preference4.setOnPreferenceClickListener(new C3096br(this));
                this.f13526h.addPreference(preference4);
            }
            this.f13525g.setChecked(Settings.getInstance().getBoolSetting(Settings.CURVE_ENABLED_UI));
            this.f13525g.setEnabled(C1368X.m6320c().mo5815A().mo5574c());
        }
    }

    /* renamed from: a */
    private void m13851a(C1498a aVar) {
        C1443as c = C1811k.m8322a().mo6824c(aVar.mo6160j());
        if (c != null) {
            Preference preference = new Preference(this);
            preference.setTitle(aVar.mo6153c());
            preference.setKey(aVar.mo6160j());
            if (c.mo6023b()) {
                preference.setSummary(mo7241b(m13847a(aVar.f4729h, (int) R.string.optpage_language_need_upgrade)));
                preference.setOnPreferenceClickListener(new C3097bs(this, aVar, preference));
            } else {
                preference.setSummary(mo7241b(m13847a(aVar.f4729h, (int) R.string.optpage_language_need_upgrade)));
                preference.setOnPreferenceClickListener(new C3098bt(this, aVar, preference));
            }
            this.f13526h.addPreference(preference);
        }
    }

    /* renamed from: l */
    private boolean m13863l() {
        return C1368X.m6320c().mo5827M().mo5992a();
    }

    /* renamed from: a */
    private int m13847a(String str, int i) {
        if (!C1368X.m6324d() || !C1368X.m6320c().mo5842o().mo5942e(str)) {
            return i;
        }
        return R.string.downloading;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (!this.f13529k) {
            C1368X.m6320c().mo5827M().mo5998d(2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13855a(String str, String str2, String str3, Preference preference) {
        if (!TextUtils.isEmpty(str)) {
            C1584bI.m7145b(this, new C3089bk(this, preference, str, str2, str3), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m13864m() {
        CustomCheckBoxPreference customCheckBoxPreference;
        boolean z = true;
        String[] g = C1368X.m6320c().mo5842o().mo5945g();
        String[] J = C1368X.m6320c().mo5842o().mo5922J();
        for (int i = 0; i < this.f13526h.getPreferenceCount(); i++) {
            this.f13526h.getPreference(i).setEnabled(true);
        }
        if (g.length == 1 && (customCheckBoxPreference = (CustomCheckBoxPreference) this.f13526h.findPreference(g[0])) != null) {
            customCheckBoxPreference.setChecked(true);
            customCheckBoxPreference.setEnabled(false);
        }
        if (this.f13523e != null) {
            this.f13523e.setEnabled(J.length > 1);
        }
        if (this.f13524f != null) {
            boolean z2 = false;
            boolean z3 = false;
            for (String str : g) {
                if (str.equals(C1549b.f4791a)) {
                    z3 = true;
                } else if (str.equals(C1549b.f4831b)) {
                    z2 = true;
                }
            }
            CheckBoxPreference checkBoxPreference = this.f13524f;
            if (!z3 || !z2) {
                z = false;
            }
            checkBoxPreference.setEnabled(z);
        }
    }

    /* renamed from: a */
    public void mo4239a(int i) {
        if (this.f13528j != null) {
            this.f13528j.updateLimitTitle();
        }
    }

    /* renamed from: g */
    public int mo4250g() {
        return 0;
    }

    /* renamed from: h */
    public void mo4251h() {
        m13862i();
    }
}
