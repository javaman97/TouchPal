package com.cootek.smartinput5.func.resource;

import android.preference.ListPreference;
import android.preference.Preference;

/* 'enum' modifier removed */
/* renamed from: com.cootek.smartinput5.func.resource.g */
/* compiled from: PreferenceUpdater */
final class C1968g extends C1963b {
    C1968g(String str, int i, String str2) {
        super(str, i, str2, (C1964c) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7216a(Preference preference, Object obj) {
        if (preference instanceof ListPreference) {
            ((ListPreference) preference).setEntries((String[]) obj);
        }
    }

    /* renamed from: a */
    public boolean mo7215a() {
        return true;
    }
}
