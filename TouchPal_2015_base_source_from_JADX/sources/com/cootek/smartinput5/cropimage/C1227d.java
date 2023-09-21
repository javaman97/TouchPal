package com.cootek.smartinput5.cropimage;

import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.cootek.smartinput5.cropimage.d */
/* compiled from: CropImageActivity */
class C1227d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bitmap f3621a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f3622b;

    /* renamed from: c */
    final /* synthetic */ C1226c f3623c;

    C1227d(C1226c cVar, Bitmap bitmap, CountDownLatch countDownLatch) {
        this.f3623c = cVar;
        this.f3621a = bitmap;
        this.f3622b = countDownLatch;
    }

    public void run() {
        if (!(this.f3621a == this.f3623c.f3620a.f3591r || this.f3621a == null)) {
            this.f3623c.f3620a.f3590q.mo4505a(this.f3621a, true);
            if (this.f3623c.f3620a.f3591r != null) {
                this.f3623c.f3620a.f3591r.recycle();
            }
            Bitmap unused = this.f3623c.f3620a.f3591r = this.f3621a;
        }
        if (this.f3623c.f3620a.f3590q.mo4514d() == 1.0f) {
            this.f3623c.f3620a.f3590q.mo4508a(true, true);
        }
        this.f3622b.countDown();
    }
}
