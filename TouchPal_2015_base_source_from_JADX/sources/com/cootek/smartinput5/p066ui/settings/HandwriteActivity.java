package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceGroup;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.resource.p055ui.C1977c;
import com.cootek.smartinput5.p046b.C1132b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.HandwriteActivity */
public class HandwriteActivity extends C1977c implements C1389aD.C1390a {

    /* renamed from: a */
    private static final String f13450a = "HandwriteActivity";

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1368X.m6317b((Context) this);
        m13776e();
        C1368X.m6320c().mo5842o().mo5929a((C1389aD.C1390a) this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C1368X.m6320c().mo5842o().mo5937b((C1389aD.C1390a) this);
        super.onDestroy();
        C1368X.m6325e();
        System.gc();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        m13776e();
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* renamed from: e */
    private void m13776e() {
        if (getPreferenceScreen() != null) {
            getPreferenceScreen().removeAll();
        }
        addPreferencesFromResource(R.layout.option_handwrite);
        setTitle(mo7241b((int) R.string.optpage_handwriting));
        C1132b.m5654a((Context) this).mo4405a((PreferenceGroup) getPreferenceScreen());
    }

    /* renamed from: f */
    public void mo4249f() {
        m13776e();
    }
}
