package com.yahoo.p092a.p093a;

import android.content.Context;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.yahoo.p092a.p093a.C4064a;
import com.yahoo.p092a.p093a.C4070e;
import java.util.ArrayList;
import java.util.Date;

/* renamed from: com.yahoo.a.a.b */
final class C4067b implements C4070e.C4071a {

    /* renamed from: a */
    final /* synthetic */ Context f16550a;

    /* renamed from: b */
    final /* synthetic */ C4064a.C4066b f16551b;

    C4067b(Context context, C4064a.C4066b bVar) {
        this.f16550a = context;
        this.f16551b = bVar;
    }

    /* renamed from: a */
    public final void mo15044a(String str) {
        String a;
        C4064a.C4065a a2;
        String d;
        ArrayList arrayList = new ArrayList();
        String b = C4068c.m17307b(this.f16550a);
        String str2 = "";
        if (!C4069d.m17315b(str)) {
            str2 = C4069d.m17313a(str);
        }
        String a3 = C4068c.m17304a(this.f16550a);
        boolean b2 = C4069d.m17315b(str2);
        boolean b3 = C4069d.m17315b(b);
        if (str2.equals(b) && !b2 && !C4069d.m17315b(a3)) {
            arrayList.add(C4064a.m17301b(C1712h.f5592n, a3, new Date(2127585600000L)));
            String b4 = C4064a.m17302c();
            if (!C4069d.m17315b(b4)) {
                arrayList.add(C4064a.m17301b("AO", b4, new Date(2127585600000L)));
            }
            if (this.f16551b != null) {
                this.f16551b.onCompleted(arrayList, str, C4064a.C4065a.ADVERTISERID);
            }
        } else if (!b2 || !b3 || C4069d.m17315b(a3)) {
            if (b2 || "no_sha_1".equals(str2)) {
                a = C4069d.m17312a(this.f16550a);
                a2 = C4069d.m17311a();
                d = C4069d.m17317d(C4069d.m17313a(a));
            } else {
                C4064a.C4065a aVar = C4064a.C4065a.ADVERTISERID;
                d = C4069d.m17317d(str2);
                a2 = aVar;
                a = str;
            }
            arrayList.add(C4064a.m17301b(C1712h.f5592n, d, new Date(2127585600000L)));
            String b5 = C4064a.m17302c();
            if (!C4069d.m17315b(b5)) {
                arrayList.add(C4064a.m17301b("AO", b5, new Date(2127585600000L)));
            }
            if (this.f16551b != null) {
                this.f16551b.onCompleted(arrayList, a, a2);
            }
            if (C4069d.m17316c(d)) {
                C4068c.m17306a(str, d, this.f16550a);
            }
        } else {
            String a4 = C4069d.m17312a(this.f16550a);
            arrayList.add(C4064a.m17301b(C1712h.f5592n, a3, new Date(2127585600000L)));
            String b6 = C4064a.m17302c();
            if (!C4069d.m17315b(b6)) {
                arrayList.add(C4064a.m17301b("AO", b6, new Date(2127585600000L)));
            }
            if (this.f16551b != null) {
                this.f16551b.onCompleted(arrayList, a4, C4069d.m17311a());
            }
        }
    }
}
