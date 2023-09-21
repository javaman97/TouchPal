package com.cootek.smartinput5.func.p053c;

import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2361q;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.c.d */
/* compiled from: PaopaoManager */
class C1633d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1631b f5309a;

    /* renamed from: b */
    final /* synthetic */ C1632c f5310b;

    C1633d(C1632c cVar, C1631b bVar) {
        this.f5310b = cVar;
        this.f5309a = bVar;
    }

    public void run() {
        if (this.f5309a.f5289m != null) {
            String str = this.f5309a.f5290n;
            if (!str.endsWith(".apk")) {
                str = str + ".apk";
            }
            C2361q.m10797b().mo8000a(this.f5309a.f5289m, str, this.f5309a.f5287k);
        } else if (this.f5309a.f5292p != null) {
            C2361q.m10797b().mo8025k(this.f5309a.f5292p, this.f5309a.f5287k, (String) null);
        } else if (this.f5309a.f5290n.equals(C1974m.m9063a(this.f5310b.f5303g, (int) R.string.app_id_pinyin_bigram))) {
            C2361q.m10797b().mo8023i(this.f5309a.f5290n, this.f5309a.f5287k, (String) null);
        } else {
            C2361q.m10797b().mo8025k(this.f5309a.f5290n, this.f5309a.f5287k, (String) null);
        }
        C1368X.m6320c().mo5816B().mo6049a(this.f5309a.f5290n);
    }
}
