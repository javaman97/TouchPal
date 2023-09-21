package com.cootek.smartinput5.func.asset;

import android.content.DialogInterface;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.net.C2361q;

/* renamed from: com.cootek.smartinput5.func.asset.r */
/* compiled from: UpdatePinyinActivity */
class C1463r implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1389aD f4684a;

    /* renamed from: b */
    final /* synthetic */ UpdatePinyinActivity f4685b;

    C1463r(UpdatePinyinActivity updatePinyinActivity, C1389aD aDVar) {
        this.f4685b = updatePinyinActivity;
        this.f4684a = aDVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C2361q.m10797b().mo8009c(this.f4684a.mo5954l(C1549b.f4831b).mo6154d(), this.f4684a.mo5954l(C1549b.f4831b).mo6153c(), this.f4684a.mo5954l(C1549b.f4831b).mo6159i());
        this.f4685b.finish();
        this.f4685b.overridePendingTransition(-1, -1);
    }
}
