package com.cootek.smartinput5.func;

import android.content.Context;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2302w;

/* renamed from: com.cootek.smartinput5.func.H */
/* compiled from: DomainLookupManager */
public class C1348H {

    /* renamed from: a */
    private static final String f4129a = "DomainLookupManager";

    /* renamed from: b */
    private static C1348H f4130b = new C1348H();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f4131c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f4132d = false;

    private C1348H() {
    }

    /* renamed from: a */
    public static C1348H m6160a() {
        return f4130b;
    }

    /* renamed from: a */
    public void mo5593a(Context context) {
        if (!this.f4132d) {
            this.f4132d = true;
            C2302w wVar = new C2302w();
            wVar.f10127a = C2225al.m10069f(context);
            wVar.f10128b = C2225al.m10051a(context);
            new C2373x(wVar).mo8060a((C2373x.C2376b) new C1350I(this));
        }
    }

    /* renamed from: b */
    public String mo5594b(Context context) {
        if (this.f4131c == null) {
            mo5593a(context);
        }
        return this.f4131c;
    }
}
