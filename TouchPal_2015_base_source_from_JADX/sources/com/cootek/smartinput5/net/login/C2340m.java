package com.cootek.smartinput5.net.login;

import android.view.View;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.net.login.m */
/* compiled from: TCloudShowActivity */
class C2340m implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TCloudShowActivity f10323a;

    C2340m(TCloudShowActivity tCloudShowActivity) {
        this.f10323a = tCloudShowActivity;
    }

    public void onClick(View view) {
        C1246d.m6010a(this.f10323a.f10225b).mo4591a("LOGIN/OPERATION", C1246d.f3775as, C1246d.f3933e);
        C1617br.m7367a().mo6333b(this.f10323a.f10225b);
        this.f10323a.finish();
    }
}
