package com.cootek.smartinput5.func;

import android.content.Context;
import com.cootek.smartinput5.engine.Settings;

/* 'enum' modifier removed */
/* renamed from: com.cootek.smartinput5.func.ba */
/* compiled from: ReferrerHandler */
final class C1595ba extends C1418aZ {
    C1595ba(String str, int i) {
        super(str, i, (C1595ba) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6052a(Context context, String str) {
        if (str != null && m7178a(str)) {
            Settings.getInstance().setStringSetting(80, str);
            C1368X.m6320c().mo5841n().mo6283k(str);
        }
    }

    /* renamed from: a */
    private boolean m7178a(String str) {
        return str.startsWith(C1811k.f5994l);
    }
}
