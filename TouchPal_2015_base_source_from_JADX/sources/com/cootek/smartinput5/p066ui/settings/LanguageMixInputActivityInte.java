package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1405aP;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ui.settings.LanguageMixInputActivityInte */
public class LanguageMixInputActivityInte extends PreferenceActivity implements C1389aD.C1390a {

    /* renamed from: a */
    private Context f13542a;

    /* renamed from: b */
    private PreferenceScreen f13543b;

    /* renamed from: c */
    private ArrayList<Preference> f13544c;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1368X.m6317b((Context) this);
        this.f13542a = this;
        addPreferencesFromResource(R.layout.language_mix_list_inte);
        setTitle(C1974m.m9063a((Context) this, (int) R.string.optpage_mixedlang_inte));
        this.f13543b = (PreferenceScreen) findPreference("root");
        this.f13543b.setTitle(C1974m.m9063a((Context) this, (int) R.string.optpage_mixedlang_inte));
        this.f13543b.setSummary(C1974m.m9063a((Context) this, (int) R.string.optpage_mixedlang_summary));
        this.f13544c = new ArrayList<>();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C1368X.m6320c().mo5842o().mo5929a((C1389aD.C1390a) this);
        m13898b();
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C1368X.m6320c().mo5842o().mo5937b((C1389aD.C1390a) this);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C1368X.m6325e();
        m13897a();
        System.gc();
    }

    /* renamed from: f */
    public void mo4249f() {
        m13898b();
    }

    /* renamed from: a */
    private void m13897a() {
        if (this.f13543b != null) {
            this.f13543b.removeAll();
            this.f13543b = null;
        }
    }

    /* renamed from: b */
    private void m13898b() {
        if (this.f13543b != null) {
            this.f13543b.removeAll();
            this.f13544c.clear();
            C1389aD o = C1368X.m6320c().mo5842o();
            String[] h = o.mo5947h();
            for (String str : h) {
                if (o.mo5954l(str).mo6156f() && C1405aP.m6594a().mo6013a(str) != null) {
                    this.f13543b.addPreference(new LanguageMixInputListPreferenceInte(this.f13542a, str));
                }
            }
        }
    }
}
