package com.cootek.smartinput5.cropimage;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.cootek.smartinput5.cropimage.c */
/* compiled from: CropImageActivity */
class C1226c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CropImageActivity f3620a;

    C1226c(CropImageActivity cropImageActivity) {
        this.f3620a = cropImageActivity;
    }

    public void run() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f3620a.f3583j.post(new C1227d(this, this.f3620a.f3591r, countDownLatch));
        try {
            countDownLatch.await();
            this.f3620a.f3580c.run();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
