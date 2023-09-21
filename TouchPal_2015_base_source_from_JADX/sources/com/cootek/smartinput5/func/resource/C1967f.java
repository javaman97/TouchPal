package com.cootek.smartinput5.func.resource;

import android.preference.DialogPreference;
import android.preference.Preference;

/* 'enum' modifier removed */
/* renamed from: com.cootek.smartinput5.func.resource.f */
/* compiled from: PreferenceUpdater */
final class C1967f extends C1963b {
    C1967f(String str, int i, String str2) {
        super(str, i, str2, (C1964c) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7216a(Preference preference, Object obj) {
        if (preference instanceof DialogPreference) {
            ((DialogPreference) preference).setDialogMessage((String) obj);
        }
    }
}
