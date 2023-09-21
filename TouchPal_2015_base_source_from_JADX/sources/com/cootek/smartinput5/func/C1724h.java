package com.cootek.smartinput5.func;

import android.view.animation.Animation;
import com.cootek.smartinput5.func.C1716f;
import com.cootek.smartinput5.func.C1722g;

/* renamed from: com.cootek.smartinput5.func.h */
/* compiled from: AnimationView */
class C1724h implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C1722g.C1723a f5634a;

    /* renamed from: b */
    final /* synthetic */ C1722g f5635b;

    C1724h(C1722g gVar, C1722g.C1723a aVar) {
        this.f5635b = gVar;
        this.f5634a = aVar;
    }

    public void onAnimationStart(Animation animation) {
        if (this.f5634a != null) {
            this.f5634a.mo6649a();
        }
    }

    public void onAnimationEnd(Animation animation) {
        if (this.f5634a != null) {
            this.f5634a.mo6651c();
        }
        C1722g.m7924a(this.f5635b);
        if (this.f5635b.f5633g >= this.f5635b.f5632f.size()) {
            this.f5635b.f5631e.mo6633a((C1716f.C1719b) this.f5635b);
        } else {
            this.f5635b.f5630d.startAnimation((Animation) this.f5635b.f5632f.get(this.f5635b.f5633g));
        }
    }

    public void onAnimationRepeat(Animation animation) {
        if (this.f5634a != null) {
            this.f5634a.mo6650b();
        }
    }
}
