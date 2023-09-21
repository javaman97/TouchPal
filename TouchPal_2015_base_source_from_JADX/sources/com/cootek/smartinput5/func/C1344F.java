package com.cootek.smartinput5.func;

import com.cootek.smartinput5.func.C1337C;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.func.F */
/* compiled from: CurveManager */
class C1344F implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f4106a;

    /* renamed from: b */
    final /* synthetic */ String f4107b;

    /* renamed from: c */
    final /* synthetic */ String f4108c;

    /* renamed from: d */
    final /* synthetic */ C1337C f4109d;

    C1344F(C1337C c, int i, String str, String str2) {
        this.f4109d = c;
        this.f4106a = i;
        this.f4107b = str;
        this.f4108c = str2;
    }

    public void run() {
        C1337C.C1339a aVar = null;
        if (this.f4106a >= 1 && this.f4106a <= 3) {
            aVar = C1337C.C1339a.values()[this.f4106a - 1];
        }
        C2361q.m10797b().mo7998a(this.f4107b, aVar, this.f4108c);
        C1246d.m6010a(this.f4109d.f4096k).mo4594a(C1246d.f3716M, true, C1246d.f3730a);
    }
}
