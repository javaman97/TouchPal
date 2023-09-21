package com.cootek.smartinput5;

/* renamed from: com.cootek.smartinput5.i */
/* compiled from: Guide */
class C2161i extends Thread {

    /* renamed from: a */
    final /* synthetic */ Guide f9161a;

    C2161i(Guide guide) {
        this.f9161a = guide;
    }

    public void run() {
        while (!this.f9161a.f2732C.mo4129b(this.f9161a.f2741N)) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            if (this.f9161a.f2743P) {
                Guide.m5276d(this.f9161a);
                this.f9161a.f2740M.sendEmptyMessage(this.f9161a.f2741N);
            }
        }
    }
}
