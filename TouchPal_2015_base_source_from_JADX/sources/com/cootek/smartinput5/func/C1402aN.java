package com.cootek.smartinput5.func;

import android.content.Context;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.p045a.C1056a;

/* renamed from: com.cootek.smartinput5.func.aN */
/* compiled from: LocaleLanguageDownloadReceiver */
class C1402aN implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f4437a;

    /* renamed from: b */
    final /* synthetic */ String f4438b;

    /* renamed from: c */
    final /* synthetic */ String f4439c;

    /* renamed from: d */
    final /* synthetic */ Context f4440d;

    /* renamed from: e */
    final /* synthetic */ LocaleLanguageDownloadReceiver f4441e;

    C1402aN(LocaleLanguageDownloadReceiver localeLanguageDownloadReceiver, String str, String str2, String str3, Context context) {
        this.f4441e = localeLanguageDownloadReceiver;
        this.f4437a = str;
        this.f4438b = str2;
        this.f4439c = str3;
        this.f4440d = context;
    }

    public void run() {
        if (C1368X.m6324d()) {
            C1368X c = C1368X.m6320c();
            if (!c.mo5842o().mo5942e(this.f4437a)) {
                c.mo5842o().mo5946h(this.f4437a);
                c.mo5842o().mo5943f(this.f4437a);
            } else {
                return;
            }
        }
        C2361q.m10797b().mo8009c(this.f4437a, this.f4438b, this.f4439c);
        C1056a.m5588a().mo4264a("SETTING_LOCALE_LANGUAGE_DOWNLOAD", this.f4440d);
    }
}
