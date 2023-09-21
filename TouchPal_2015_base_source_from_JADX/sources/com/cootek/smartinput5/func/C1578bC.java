package com.cootek.smartinput5.func;

/* renamed from: com.cootek.smartinput5.func.bC */
/* compiled from: TypingSpeedManager */
class C1578bC implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f4975a;

    /* renamed from: b */
    final /* synthetic */ int f4976b;

    /* renamed from: c */
    final /* synthetic */ int f4977c;

    /* renamed from: d */
    final /* synthetic */ C1574bA f4978d;

    C1578bC(C1574bA bAVar, int i, int i2, int i3) {
        this.f4978d = bAVar;
        this.f4975a = i;
        this.f4976b = i2;
        this.f4977c = i3;
    }

    public void run() {
        if (this.f4978d.f4967o < this.f4975a) {
            C1574bA.m7066a(this.f4978d, this.f4976b);
            int unused = this.f4978d.f4967o = this.f4978d.f4967o < this.f4975a ? this.f4978d.f4967o : this.f4975a;
        } else {
            C1574bA.m7071c(this.f4978d, this.f4976b);
            int unused2 = this.f4978d.f4967o = this.f4978d.f4967o > this.f4975a ? this.f4978d.f4967o : this.f4975a;
        }
        if (this.f4978d.f4963k != null) {
            this.f4978d.f4963k.mo6207a(this.f4978d.f4967o);
        }
        if (this.f4978d.f4967o != this.f4975a) {
            this.f4978d.f4960h.postDelayed(this, (long) this.f4977c);
        }
    }
}
