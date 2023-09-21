package com.cootek.smartinput5.func.nativeads;

import android.content.Context;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.paopaopanel.C1937f;

/* renamed from: com.cootek.smartinput5.func.nativeads.n */
/* compiled from: NativeAds */
class C1890n implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Context f6331a;

    /* renamed from: b */
    final /* synthetic */ C1888m f6332b;

    C1890n(C1888m mVar, Context context) {
        this.f6332b = mVar;
        this.f6331a = context;
    }

    public void onClick(View view) {
        C1937f W = Engine.getInstance().getWidgetManager().mo9617W();
        if (W != null && !W.mo7134i()) {
            this.f6332b.mo7001c(this.f6331a);
            W.mo7132g();
        }
    }
}
