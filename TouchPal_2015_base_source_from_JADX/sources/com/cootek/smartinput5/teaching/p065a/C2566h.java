package com.cootek.smartinput5.teaching.p065a;

/* renamed from: com.cootek.smartinput5.teaching.a.h */
/* compiled from: TeachingMissionManager */
class C2566h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2564f f11044a;

    C2566h(C2564f fVar) {
        this.f11044a = fVar;
    }

    public void run() {
        if (this.f11044a.f11037o != null) {
            if (this.f11044a.m11481j()) {
                this.f11044a.m11480i();
                this.f11044a.f11041t.add(this.f11044a.f11037o);
                this.f11044a.f11037o.mo8394a();
            } else if (this.f11044a.f11038q >= 10) {
                this.f11044a.mo8421a(false);
            } else {
                this.f11044a.m11480i();
                C2564f.f11034p.postDelayed(this, 200);
                C2564f.m11477g(this.f11044a);
            }
        }
    }
}
