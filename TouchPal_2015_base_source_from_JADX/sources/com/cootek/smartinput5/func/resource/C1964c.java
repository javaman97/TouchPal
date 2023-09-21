package com.cootek.smartinput5.func.resource;

import android.preference.DialogPreference;
import android.preference.Preference;

/* 'enum' modifier removed */
/* renamed from: com.cootek.smartinput5.func.resource.c */
/* compiled from: PreferenceUpdater */
final class C1964c extends C1963b {
    C1964c(String str, int i, String str2) {
        super(str, i, str2, (C1964c) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7216a(Preference preference, Object obj) {
        preference.setTitle((String) obj);
        if (preference instanceof DialogPreference) {
            ((DialogPreference) preference).setDialogTitle((String) obj);
        }
    }
}
