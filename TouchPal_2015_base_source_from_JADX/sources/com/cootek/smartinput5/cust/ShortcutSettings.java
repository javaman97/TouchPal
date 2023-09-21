package com.cootek.smartinput5.cust;

import android.content.Context;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.settings.EditShortcutPreference;
import com.emoji.keyboard.touchpal.R;

public class ShortcutSettings extends PreferenceActivity {

    /* renamed from: a */
    PreferenceCategory f3676a;

    /* renamed from: b */
    String[] f3677b;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.layout.shortcut_input);
        m5981b();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: b */
    private void m5981b() {
        if (C1368X.m6324d()) {
            this.f3677b = C1368X.m6320c().mo5835h().getShortcutList();
            this.f3676a = (PreferenceCategory) findPreference("ShortcutList");
            for (int i = 0; i < this.f3677b.length; i += 2) {
                this.f3676a.addPreference(new EditShortcutPreference(this.f3677b[i], this.f3677b[i + 1], this));
            }
            m5982c();
        }
    }

    /* renamed from: c */
    private void m5982c() {
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("shortcut_input");
        Preference findPreference = findPreference("AddShortcut");
        Preference findPreference2 = findPreference("AddShortcutWubi");
        if (C1368X.m6320c().mo5842o().mo5960o(C1549b.f4833d)) {
            if (preferenceScreen != null && findPreference != null) {
                preferenceScreen.removePreference(findPreference);
            }
        } else if (preferenceScreen != null && findPreference2 != null) {
            preferenceScreen.removePreference(findPreference2);
        }
    }

    /* renamed from: a */
    public void mo4561a(String str, String str2) {
        if (this.f3676a != null) {
            this.f3676a.addPreference(new EditShortcutPreference(str, str2, this));
            this.f3677b = C1368X.m6320c().mo5835h().getShortcutList();
            Context b = C1368X.m6313b();
            if (b != null) {
                C1246d.m6010a(b).mo4588a(C1246d.f3713J, this.f3677b.length, C1246d.f3730a);
            }
        }
    }

    /* renamed from: a */
    public void mo4560a(EditShortcutPreference editShortcutPreference) {
        this.f3676a.removePreference(editShortcutPreference);
        this.f3677b = C1368X.m6320c().mo5835h().getShortcutList();
        Context b = C1368X.m6313b();
        if (b != null) {
            C1246d.m6010a(b).mo4588a(C1246d.f3713J, this.f3677b.length, C1246d.f3730a);
        }
    }

    /* renamed from: a */
    public void mo4559a() {
        this.f3677b = C1368X.m6320c().mo5835h().getShortcutList();
        Context b = C1368X.m6313b();
        if (b != null) {
            C1246d.m6010a(b).mo4588a(C1246d.f3713J, this.f3677b.length, C1246d.f3730a);
        }
    }

    /* renamed from: a */
    public boolean mo4562a(String str) {
        this.f3677b = C1368X.m6320c().mo5835h().getShortcutList();
        for (int i = 0; i < this.f3677b.length; i += 2) {
            if (str.equals(this.f3677b[i])) {
                return true;
            }
        }
        return false;
    }
}
