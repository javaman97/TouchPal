package com.cootek.smartinput5.func.resource;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: com.cootek.smartinput5.func.resource.j */
/* compiled from: TextUpdater */
public enum C1971j implements C1962a {
    HINT(C1970i.f6730h);
    

    /* renamed from: c */
    private final String f6734c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo7218a(TextView textView, Object obj);

    private C1971j(String str) {
        this.f6734c = str;
    }

    /* renamed from: b */
    public String mo7219b() {
        return this.f6734c;
    }

    /* renamed from: a */
    public void mo7214a(Object obj, Object obj2) {
        if (obj instanceof TextView) {
            mo7218a((TextView) obj, obj2);
        }
    }

    /* renamed from: a */
    public boolean mo7215a() {
        return false;
    }

    /* renamed from: a */
    public static void m9054a(Context context, TextView textView, AttributeSet attributeSet) {
        for (C1971j jVar : values()) {
            C1974m.m9066a(context, textView, jVar, attributeSet, C1970i.f6723a, jVar.mo7219b(), jVar.mo7215a());
        }
    }
}
