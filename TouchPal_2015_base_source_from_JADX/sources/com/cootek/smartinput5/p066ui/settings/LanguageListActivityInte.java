package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceGroup;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1396aI;
import com.cootek.smartinput5.func.C1405aP;
import com.cootek.smartinput5.func.C1422ad;
import com.cootek.smartinput5.func.C1443as;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.C1811k;
import com.cootek.smartinput5.func.asset.C1446c;
import com.cootek.smartinput5.func.asset.C1451h;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.resource.p055ui.C1977c;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.settings.LanguageListActivityInte */
public class LanguageListActivityInte extends C1977c implements C1389aD.C1390a, C1396aI.C1397a {

    /* renamed from: a */
    private static final String f13530a = "com.cootek.smartinputv5.language.action.HIDE_ICON";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f13531b;

    /* renamed from: c */
    private boolean f13532c = true;

    /* renamed from: d */
    private boolean f13533d = false;

    /* renamed from: e */
    private LanguageSwitchModeDialogPreference f13534e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public CustomCheckBoxPreference f13535f;

    /* renamed from: g */
    private PreferenceCategory f13536g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public PreferenceCategory f13537h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ArrayList<Preference> f13538i;

    /* renamed from: j */
    private CustomizableCheckBoxPreference f13539j = null;

    /* renamed from: k */
    private boolean f13540k = false;

    /* renamed from: l */
    private LanguageSharePreference f13541l;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            C1368X.m6317b((Context) this);
            C1368X.m6320c().mo5827M().mo5991a(true);
            this.f13531b = this;
            if (!C1132b.m5654a((Context) this).mo4392a(C1135d.ONLINE_SHOP, Boolean.valueOf(C1593bR.m7162a().f5075a)).booleanValue()) {
                this.f13532c = getIntent().getBooleanExtra("SHOW_ALL_LANGUAGE", true);
            }
            this.f13533d = getIntent().getBooleanExtra("HIDE_LANGUAGE_ICONS", false);
            addPreferencesFromResource(R.layout.language_list_inte);
            setTitle(mo7241b((int) R.string.optpage_language_inte));
            this.f13534e = (LanguageSwitchModeDialogPreference) findPreference(C1135d.option_enable_lang_key.toString());
            this.f13535f = (CustomCheckBoxPreference) findPreference(C1135d.option_mix_language.toString());
            this.f13536g = (PreferenceCategory) findPreference(C1135d.option_installed_language_list.toString());
            this.f13537h = (PreferenceCategory) findPreference(C1135d.option_available_language_list.toString());
            this.f13538i = new ArrayList<>();
            if (this.f13534e != null) {
                this.f13534e.updateSummary();
            }
            this.f13535f.setModelPreference(m13888l());
            this.f13535f.setChecked(Settings.getInstance().getBoolSetting(12));
            this.f13535f.setOnPreferenceClickListener(new C3099bu(this));
            this.f13535f.setCustomViewOnClickListener(new C3104bz(this));
            this.f13535f.setCustomViewEnable(this.f13535f.isChecked() && this.f13535f.isEnabled());
            C1132b.m5654a((Context) this).mo4405a((PreferenceGroup) getPreferenceScreen());
            if (this.f13533d) {
                this.f13531b.sendBroadcast(new Intent(f13530a));
            }
            Settings.getInstance().setBoolSetting(Settings.FIRST_SWITCH_LANGUAGE, false);
            if (Engine.isInitialized()) {
                Engine.getInstance().getWidgetManager().mo9608N();
            }
            C1056a.m5588a().mo4264a(C1056a.f2981l, this.f13531b);
        } catch (C1451h e) {
            e.printStackTrace();
            this.f13540k = true;
            C1446c.m6745a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!this.f13540k) {
            C1368X.m6320c().mo5827M().mo5998d(3);
            this.f13535f.setCustomViewEnable(this.f13535f.isChecked() && this.f13535f.isEnabled());
            C1368X.m6320c().mo5842o().mo5929a((C1389aD.C1390a) this);
            m13887i();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f13540k) {
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (!this.f13540k) {
            C1368X.m6320c().mo5842o().mo5937b((C1389aD.C1390a) this);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (!this.f13540k) {
            C1368X.m6320c().mo5827M().mo5998d(2);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (!this.f13540k) {
            C1368X.m6325e();
            m13885e();
            System.gc();
        }
    }

    /* renamed from: f */
    public void mo4249f() {
        m13887i();
    }

    /* renamed from: e */
    private void m13885e() {
        this.f13535f = null;
        if (this.f13536g != null) {
            this.f13536g.removeAll();
            this.f13536g = null;
        }
        if (this.f13537h != null) {
            this.f13537h.removeAll();
            this.f13537h = null;
        }
    }

    /* renamed from: i */
    private void m13887i() {
        C1498a aVar;
        boolean z;
        if (this.f13536g != null && this.f13537h != null) {
            this.f13536g.removeAll();
            this.f13537h.removeAll();
            this.f13538i.clear();
            C1389aD o = C1368X.m6320c().mo5842o();
            o.mo5977x();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            boolean m = m13889m();
            for (C1498a aVar2 : o.mo5953k()) {
                if (C1368X.m6320c().mo5840m().mo6064a(aVar2.f4727f, C1422ad.C1426c.TYPE_LANGUAGE, 0)) {
                    arrayList.add(aVar2);
                    if (m && o.mo5944g(aVar2.f4729h)) {
                        arrayList2.add(aVar2);
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            String[] h = o.mo5947h();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= h.length) {
                    break;
                }
                String str = h[i2];
                C1498a l = o.mo5954l(str);
                if (l.mo6156f()) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 >= arrayList.size()) {
                            break;
                        }
                        C1498a aVar3 = (C1498a) arrayList.get(i4);
                        if (str.equals(aVar3.f4727f)) {
                            arrayList.remove(i4);
                            arrayList2.remove(aVar3);
                            break;
                        }
                        i3 = i4 + 1;
                    }
                    if (C1389aD.m6423C(str)) {
                        arrayList4.add(l);
                    } else {
                        ArrayList<Integer> v = o.mo5973v(str);
                        if (v == null) {
                            z = false;
                        } else {
                            z = v.size() > 1;
                        }
                        boolean z2 = C1405aP.m6594a().mo6013a(str) != null;
                        CustomCheckBoxPreference customCheckBoxPreference = new CustomCheckBoxPreference(this);
                        customCheckBoxPreference.setModelPreference(m13888l());
                        customCheckBoxPreference.setCustomButtonVisible(false);
                        customCheckBoxPreference.setTitle(l.mo6153c());
                        customCheckBoxPreference.setTitleMaxLines(2);
                        customCheckBoxPreference.setKey(h[i2]);
                        customCheckBoxPreference.setChecked(l.mo6158h());
                        customCheckBoxPreference.setOnPreferenceClickListener(new C3044bA(this));
                        if (!l.f4730i && !z && !z2 && l.mo6155e()) {
                            customCheckBoxPreference.setCustomViewDrawable(R.drawable.key_btn_uninstall_ctrl);
                            customCheckBoxPreference.setCustomViewVisible(!l.mo6162l());
                            customCheckBoxPreference.setCustomViewOnClickListener(new C3045bB(this, l, o));
                        } else if (l.f4730i || z || z2) {
                            customCheckBoxPreference.setCustomViewDrawable(R.drawable.key_btn_edit_ctrl);
                            customCheckBoxPreference.setCustomViewVisible(true);
                            customCheckBoxPreference.setCustomViewOnClickListener(new C3047bD(this, str));
                        } else {
                            customCheckBoxPreference.setCustomViewVisible(false);
                        }
                        this.f13536g.addPreference(customCheckBoxPreference);
                    }
                }
                i = i2 + 1;
            }
            m13892p();
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                C1498a aVar4 = (C1498a) it.next();
                Preference preference = new Preference(this);
                preference.setTitle(aVar4.mo6153c());
                preference.setKey(aVar4.mo6160j());
                preference.setSummary(mo7241b(m13870a(aVar4.mo6154d(), (int) R.string.optpage_language_without_prediction)));
                preference.setOnPreferenceClickListener(new C3048bE(this, aVar4, preference));
                this.f13536g.addPreference(preference);
            }
            String b = mo7241b((int) R.string.CURRENT_LANGUAGE);
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 >= o.mo5939d()) {
                    break;
                }
                C1498a a = o.mo5927a(i6);
                if ((!a.mo6157g() || !a.mo6156f()) && !C1389aD.m6423C(a.f4727f)) {
                    int i7 = 0;
                    while (true) {
                        int i8 = i7;
                        if (i8 >= arrayList.size()) {
                            break;
                        }
                        C1498a aVar5 = (C1498a) arrayList.get(i8);
                        if (a.f4727f.equals(aVar5.f4727f)) {
                            arrayList.remove(i8);
                            arrayList2.remove(aVar5);
                            break;
                        }
                        i7 = i8 + 1;
                    }
                    arrayList3.add(a);
                }
                i5 = i6 + 1;
            }
            int i9 = 0;
            while (true) {
                int i10 = i9;
                if (i10 >= arrayList3.size()) {
                    break;
                } else if (((C1498a) arrayList3.get(i10)).f4727f.equalsIgnoreCase(b)) {
                    arrayList3.add(0, (C1498a) arrayList3.remove(i10));
                    break;
                } else {
                    i9 = i10 + 1;
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                m13875a((C1498a) it2.next());
            }
            int i11 = 0;
            while (true) {
                int i12 = i11;
                if (i12 >= arrayList.size()) {
                    break;
                }
                C1498a aVar6 = (C1498a) arrayList.get(i12);
                boolean z3 = false;
                HashSet<String> b2 = C1389aD.m6463b((Context) this, aVar6);
                if (b2 != null) {
                    Iterator<String> it3 = b2.iterator();
                    while (true) {
                        boolean z4 = z3;
                        if (!it3.hasNext()) {
                            z3 = z4;
                            break;
                        }
                        String next = it3.next();
                        if (!TextUtils.isEmpty(next) && C1584bI.m7123a((Context) this, next) != null) {
                            z4 = true;
                            Preference preference2 = new Preference(this);
                            preference2.setTitle(aVar6.mo6153c());
                            preference2.setKey(aVar6.mo6160j());
                            preference2.setSummary(mo7241b(m13870a(aVar6.f4729h, (int) R.string.optpage_language_need_upgrade)));
                            preference2.setOnPreferenceClickListener(new C3049bF(this, aVar6, preference2));
                            this.f13536g.addPreference(preference2);
                            arrayList.remove(i12);
                            arrayList2.remove(aVar6);
                        }
                        z3 = z4;
                        if (z3) {
                            break;
                        }
                    }
                }
                if (!z3) {
                    i11 = i12 + 1;
                } else {
                    i11 = i12;
                }
            }
            int i13 = 0;
            while (true) {
                int i14 = i13;
                if (i14 >= arrayList.size()) {
                    aVar = null;
                    break;
                } else if (((C1498a) arrayList.get(i14)).f4727f.equalsIgnoreCase(b)) {
                    aVar = (C1498a) arrayList.remove(i14);
                    break;
                } else {
                    i13 = i14 + 1;
                }
            }
            if (aVar != null) {
                arrayList2.remove(aVar);
                arrayList2.add(0, aVar);
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                C1498a aVar7 = (C1498a) it4.next();
                arrayList.remove(aVar7);
                Preference preference3 = new Preference(this);
                preference3.setTitle(aVar7.mo6153c());
                preference3.setSummary(mo7241b(m13870a(aVar7.f4729h, (int) R.string.optpage_language_not_installed)));
                preference3.setKey(aVar7.f4727f);
                preference3.setOnPreferenceClickListener(new C3050bG(this, aVar7, preference3));
                this.f13537h.addPreference(preference3);
            }
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                C1498a aVar8 = (C1498a) it5.next();
                Preference preference4 = new Preference(this);
                preference4.setTitle(aVar8.mo6153c());
                preference4.setSummary(mo7241b(m13870a(aVar8.f4729h, (int) R.string.optpage_language_not_installed)));
                preference4.setKey(aVar8.f4727f);
                preference4.setOnPreferenceClickListener(new C3051bH(this, aVar8, preference4));
                this.f13538i.add(preference4);
            }
            if (this.f13538i.isEmpty() || this.f13532c) {
                Iterator<Preference> it6 = this.f13538i.iterator();
                while (it6.hasNext()) {
                    this.f13537h.addPreference(it6.next());
                }
                m13890n();
                return;
            }
            Preference preference5 = new Preference(this);
            preference5.setTitle(mo7241b((int) R.string.optpage_language_more_language));
            preference5.setOnPreferenceClickListener(new C3100bv(this));
            this.f13537h.addPreference(preference5);
        }
    }

    /* renamed from: a */
    private void m13875a(C1498a aVar) {
        C1443as c = C1811k.m8322a().mo6824c(aVar.mo6160j());
        if (c != null) {
            Preference preference = new Preference(this);
            preference.setTitle(aVar.mo6153c());
            preference.setKey(aVar.mo6160j());
            if (c.mo6023b()) {
                preference.setSummary(mo7241b(m13870a(aVar.f4729h, (int) R.string.optpage_language_need_upgrade)));
                preference.setOnPreferenceClickListener(new C3101bw(this, aVar, preference));
            } else {
                preference.setSummary(mo7241b(m13870a(aVar.f4729h, (int) R.string.optpage_language_need_upgrade)));
                preference.setOnPreferenceClickListener(new C3102bx(this, aVar, preference));
            }
            this.f13536g.addPreference(preference);
        }
    }

    /* renamed from: l */
    private CustomizableCheckBoxPreference m13888l() {
        if (this.f13539j == null) {
            this.f13539j = new CustomizableCheckBoxPreference(getApplicationContext());
        }
        return this.f13539j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13874a(C1443as asVar) {
        if (asVar != null) {
            C1368X.m6320c().mo5842o().mo5940d(asVar.getPackageName());
            asVar.mo6025d();
        }
    }

    /* renamed from: a */
    private int m13870a(String str, int i) {
        if (!C1368X.m6324d() || !C1368X.m6320c().mo5842o().mo5942e(str)) {
            return i;
        }
        return R.string.downloading;
    }

    /* renamed from: m */
    private boolean m13889m() {
        return C1368X.m6320c().mo5827M().mo5992a();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m13890n() {
        CustomizablePreference o = m13891o();
        if (o != null && this.f13537h != null) {
            this.f13537h.addPreference(o);
        }
    }

    /* renamed from: o */
    private CustomizablePreference m13891o() {
        if (!C1132b.m5654a((Context) this).mo4392a(C1135d.option_more_lng_coming, (Boolean) false).booleanValue()) {
            return null;
        }
        CustomizablePreference customizablePreference = new CustomizablePreference(this.f13531b);
        customizablePreference.setTitleMaxLines(2);
        customizablePreference.setEnabled(false);
        customizablePreference.setTitleTextSize(1, 16.0f);
        customizablePreference.setTitle(mo7241b((int) R.string.optpage_language_more_coming));
        return customizablePreference;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13878a(String str, String str2, String str3, Preference preference) {
        if (!TextUtils.isEmpty(str)) {
            C1584bI.m7145b(this, new C3103by(this, preference, str, str2, str3), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m13892p() {
        CustomCheckBoxPreference customCheckBoxPreference;
        boolean z = true;
        String[] g = C1368X.m6320c().mo5842o().mo5945g();
        String[] J = C1368X.m6320c().mo5842o().mo5922J();
        for (int i = 0; i < this.f13536g.getPreferenceCount(); i++) {
            this.f13536g.getPreference(i).setEnabled(true);
        }
        this.f13534e.updateSummary();
        if (g.length == 1 && (customCheckBoxPreference = (CustomCheckBoxPreference) this.f13536g.findPreference(g[0])) != null) {
            customCheckBoxPreference.setChecked(true);
            customCheckBoxPreference.setEnabled(false);
        }
        if (this.f13534e != null) {
            this.f13534e.setEnabled(J.length > 1);
        }
        if (this.f13535f != null) {
            boolean z2 = false;
            for (String str : g) {
                int length = g.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (C1405aP.m6594a().mo6014a(str, g[i2])) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
                if (z2) {
                    break;
                }
            }
            this.f13535f.setEnabled(z2);
            CustomCheckBoxPreference customCheckBoxPreference2 = this.f13535f;
            if (!this.f13535f.isChecked() || !this.f13535f.isEnabled()) {
                z = false;
            }
            customCheckBoxPreference2.setCustomViewEnable(z);
        }
    }

    /* renamed from: a */
    public void mo4239a(int i) {
        if (this.f13541l != null) {
            this.f13541l.updateLimitTitle();
        }
    }

    /* renamed from: g */
    public int mo4250g() {
        return 0;
    }

    /* renamed from: h */
    public void mo4251h() {
        m13887i();
    }
}
