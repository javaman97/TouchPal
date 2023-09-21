package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2361q;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.bk */
/* compiled from: LanguageListActivity */
class C3089bk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Preference f14071a;

    /* renamed from: b */
    final /* synthetic */ String f14072b;

    /* renamed from: c */
    final /* synthetic */ String f14073c;

    /* renamed from: d */
    final /* synthetic */ String f14074d;

    /* renamed from: e */
    final /* synthetic */ LanguageListActivity f14075e;

    C3089bk(LanguageListActivity languageListActivity, Preference preference, String str, String str2, String str3) {
        this.f14075e = languageListActivity;
        this.f14071a = preference;
        this.f14072b = str;
        this.f14073c = str2;
        this.f14074d = str3;
    }

    public void run() {
        if (this.f14071a != null) {
            this.f14071a.setSummary(this.f14075e.mo7241b((int) R.string.downloading));
        }
        if (C1368X.m6324d()) {
            C1368X c = C1368X.m6320c();
            if (!c.mo5842o().mo5942e(this.f14072b)) {
                c.mo5842o().mo5946h(this.f14072b);
                c.mo5842o().mo5943f(this.f14072b);
            } else {
                return;
            }
        }
        C2361q.m10797b().mo8009c(this.f14072b, this.f14073c, this.f14074d);
    }
}
