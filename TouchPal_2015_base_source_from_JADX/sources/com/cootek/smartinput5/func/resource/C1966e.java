package com.cootek.smartinput5.func.resource;

import android.preference.DialogPreference;
import android.preference.Preference;

/* 'enum' modifier removed */
/* renamed from: com.cootek.smartinput5.func.resource.e */
/* compiled from: PreferenceUpdater */
final class C1966e extends C1963b {
    C1966e(String str, int i, String str2) {
        super(str, i, str2, (C1964c) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7216a(Preference preference, Object obj) {
        if (preference instanceof DialogPreference) {
            ((DialogPreference) preference).setDialogTitle((String) obj);
        }
    }
}
