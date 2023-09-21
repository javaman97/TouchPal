package com.cootek.smartinput5.func.skin;

import android.graphics.Bitmap;

/* renamed from: com.cootek.smartinput5.func.skin.d */
/* compiled from: FacebookAdsActivity */
class C1990d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bitmap f6833a;

    /* renamed from: b */
    final /* synthetic */ FacebookAdsActivity f6834b;

    C1990d(FacebookAdsActivity facebookAdsActivity, Bitmap bitmap) {
        this.f6834b = facebookAdsActivity;
        this.f6833a = bitmap;
    }

    public void run() {
        this.f6834b.f6805i.setImageBitmap(this.f6833a);
    }
}
