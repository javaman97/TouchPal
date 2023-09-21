package com.cootek.smartinput5.func.skin;

import android.content.Context;
import android.view.View;
import com.cootek.smartinput5.func.nativeads.C1888m;

/* renamed from: com.cootek.smartinput5.func.skin.b */
/* compiled from: FacebookAdsActivity */
class C1988b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1888m f6829a;

    /* renamed from: b */
    final /* synthetic */ FacebookAdsActivity f6830b;

    C1988b(FacebookAdsActivity facebookAdsActivity, C1888m mVar) {
        this.f6830b = facebookAdsActivity;
        this.f6829a = mVar;
    }

    public void onClick(View view) {
        this.f6830b.finish();
        this.f6829a.mo7001c((Context) this.f6830b);
        C1997k.m9167a().mo7299a(this.f6829a);
    }
}
