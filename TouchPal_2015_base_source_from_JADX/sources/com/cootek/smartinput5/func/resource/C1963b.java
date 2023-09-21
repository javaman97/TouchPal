package com.cootek.smartinput5.func.resource;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;

/* renamed from: com.cootek.smartinput5.func.resource.b */
/* compiled from: PreferenceUpdater */
public enum C1963b implements C1962a {
    TITLE("title"),
    SUMMARY(C1970i.f6725c),
    DIALOG_TITLE(C1970i.f6726d),
    DIALOG_MESSAGE(C1970i.f6727e),
    ENTRIES(C1970i.f6728f);
    

    /* renamed from: f */
    private final String f6722f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo7216a(Preference preference, Object obj);

    private C1963b(String str) {
        this.f6722f = str;
    }

    /* renamed from: b */
    public String mo7217b() {
        return this.f6722f;
    }

    /* renamed from: a */
    public void mo7214a(Object obj, Object obj2) {
        if (obj instanceof Preference) {
            mo7216a((Preference) obj, obj2);
        }
    }

    /* renamed from: a */
    public boolean mo7215a() {
        return false;
    }

    /* renamed from: a */
    public static void m9042a(Context context, Preference preference, AttributeSet attributeSet) {
        if (preference != null && attributeSet != null) {
            for (C1963b bVar : values()) {
                C1974m.m9066a(context, preference, bVar, attributeSet, C1970i.f6723a, bVar.mo7217b(), bVar.mo7215a());
            }
        }
    }
}
