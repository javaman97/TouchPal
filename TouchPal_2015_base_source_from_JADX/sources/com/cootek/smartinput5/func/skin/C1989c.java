package com.cootek.smartinput5.func.skin;

import android.graphics.Bitmap;
import android.view.ViewGroup;

/* renamed from: com.cootek.smartinput5.func.skin.c */
/* compiled from: FacebookAdsActivity */
class C1989c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bitmap f6831a;

    /* renamed from: b */
    final /* synthetic */ FacebookAdsActivity f6832b;

    C1989c(FacebookAdsActivity facebookAdsActivity, Bitmap bitmap) {
        this.f6832b = facebookAdsActivity;
        this.f6831a = bitmap;
    }

    public void run() {
        ViewGroup.LayoutParams layoutParams = this.f6832b.f6804h.getLayoutParams();
        layoutParams.width = this.f6832b.f6806j;
        layoutParams.height = (int) (((float) this.f6832b.f6806j) * (((float) this.f6831a.getHeight()) / ((float) this.f6831a.getWidth())));
        this.f6832b.f6804h.setLayoutParams(layoutParams);
        this.f6832b.f6804h.setImageBitmap(this.f6831a);
    }
}
