package com.cootek.smartinput5.cropimage;

import com.cootek.smartinput5.cropimage.CropImageActivity;

/* renamed from: com.cootek.smartinput5.cropimage.h */
/* compiled from: CropImageActivity */
class C1231h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CropImageActivity.C1222a f3633a;

    C1231h(CropImageActivity.C1222a aVar) {
        this.f3633a = aVar;
    }

    public void run() {
        this.f3633a.f3592a.mo4544b(this.f3633a);
        if (this.f3633a.f3593b.getWindow() != null) {
            this.f3633a.f3593b.dismiss();
        }
    }
}
