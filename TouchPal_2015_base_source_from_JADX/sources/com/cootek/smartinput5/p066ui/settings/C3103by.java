package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2361q;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.by */
/* compiled from: LanguageListActivityInte */
class C3103by implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Preference f14107a;

    /* renamed from: b */
    final /* synthetic */ String f14108b;

    /* renamed from: c */
    final /* synthetic */ String f14109c;

    /* renamed from: d */
    final /* synthetic */ String f14110d;

    /* renamed from: e */
    final /* synthetic */ LanguageListActivityInte f14111e;

    C3103by(LanguageListActivityInte languageListActivityInte, Preference preference, String str, String str2, String str3) {
        this.f14111e = languageListActivityInte;
        this.f14107a = preference;
        this.f14108b = str;
        this.f14109c = str2;
        this.f14110d = str3;
    }

    public void run() {
        if (this.f14107a != null) {
            this.f14107a.setSummary(this.f14111e.mo7241b((int) R.string.downloading));
        }
        if (C1368X.m6324d()) {
            C1368X c = C1368X.m6320c();
            if (!c.mo5842o().mo5942e(this.f14108b)) {
                c.mo5842o().mo5946h(this.f14108b);
                c.mo5842o().mo5943f(this.f14108b);
            } else {
                return;
            }
        }
        C2361q.m10797b().mo8009c(this.f14108b, this.f14109c, this.f14110d);
    }
}
