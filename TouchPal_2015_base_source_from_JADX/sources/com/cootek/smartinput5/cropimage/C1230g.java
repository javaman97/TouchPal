package com.cootek.smartinput5.cropimage;

/* renamed from: com.cootek.smartinput5.cropimage.g */
/* compiled from: CropImageActivity */
class C1230g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1229f f3632a;

    C1230g(C1229f fVar) {
        this.f3632a = fVar;
    }

    public void run() {
        if (this.f3632a.f3631c.f3591r != null) {
            this.f3632a.m5943a();
            this.f3632a.f3631c.f3590q.invalidate();
            if (this.f3632a.f3631c.f3590q.f3597a.size() == 1) {
                this.f3632a.f3631c.f3579b = this.f3632a.f3631c.f3590q.f3597a.get(0);
                this.f3632a.f3631c.f3579b.mo4534a(true);
            }
        }
    }
}
