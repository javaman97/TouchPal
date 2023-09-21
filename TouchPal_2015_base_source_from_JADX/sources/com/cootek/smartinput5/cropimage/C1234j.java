package com.cootek.smartinput5.cropimage;

/* renamed from: com.cootek.smartinput5.cropimage.j */
/* compiled from: ImageViewTouchBase */
class C1234j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1239m f3662a;

    /* renamed from: b */
    final /* synthetic */ boolean f3663b;

    /* renamed from: c */
    final /* synthetic */ ImageViewTouchBase f3664c;

    C1234j(ImageViewTouchBase imageViewTouchBase, C1239m mVar, boolean z) {
        this.f3664c = imageViewTouchBase;
        this.f3662a = mVar;
        this.f3663b = z;
    }

    public void run() {
        this.f3664c.mo4507a(this.f3662a, this.f3663b);
    }
}
