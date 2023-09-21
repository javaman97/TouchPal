package com.cootek.smartinput5.cropimage;

import android.view.View;

/* renamed from: com.cootek.smartinput5.cropimage.a */
/* compiled from: CropImageActivity */
class C1224a implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CropImageActivity f3618a;

    C1224a(CropImageActivity cropImageActivity) {
        this.f3618a = cropImageActivity;
    }

    public void onClick(View view) {
        this.f3618a.setResult(0);
        this.f3618a.finish();
    }
}
