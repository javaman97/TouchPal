package com.cootek.smartinput5.cropimage;

/* renamed from: com.cootek.smartinput5.cropimage.k */
/* compiled from: ImageViewTouchBase */
class C1235k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ float f3665a;

    /* renamed from: b */
    final /* synthetic */ long f3666b;

    /* renamed from: c */
    final /* synthetic */ float f3667c;

    /* renamed from: d */
    final /* synthetic */ float f3668d;

    /* renamed from: e */
    final /* synthetic */ float f3669e;

    /* renamed from: f */
    final /* synthetic */ float f3670f;

    /* renamed from: g */
    final /* synthetic */ ImageViewTouchBase f3671g;

    C1235k(ImageViewTouchBase imageViewTouchBase, float f, long j, float f2, float f3, float f4, float f5) {
        this.f3671g = imageViewTouchBase;
        this.f3665a = f;
        this.f3666b = j;
        this.f3667c = f2;
        this.f3668d = f3;
        this.f3669e = f4;
        this.f3670f = f5;
    }

    public void run() {
        float min = Math.min(this.f3665a, (float) (System.currentTimeMillis() - this.f3666b));
        this.f3671g.mo4495a(this.f3667c + (this.f3668d * min), this.f3669e, this.f3670f);
        if (min < this.f3665a) {
            this.f3671g.f3615m.post(this);
        }
    }
}
