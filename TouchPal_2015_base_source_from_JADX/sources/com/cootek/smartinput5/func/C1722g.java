package com.cootek.smartinput5.func;

import android.view.View;
import android.view.animation.Animation;
import com.cootek.smartinput5.func.C1716f;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.func.g */
/* compiled from: AnimationView */
public class C1722g extends C1716f.C1719b {

    /* renamed from: b */
    public int f5628b;

    /* renamed from: c */
    public String f5629c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public View f5630d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1716f f5631e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<Animation> f5632f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f5633g;

    /* renamed from: com.cootek.smartinput5.func.g$a */
    /* compiled from: AnimationView */
    public interface C1723a {
        /* renamed from: a */
        void mo6649a();

        /* renamed from: b */
        void mo6650b();

        /* renamed from: c */
        void mo6651c();
    }

    /* renamed from: a */
    static /* synthetic */ int m7924a(C1722g gVar) {
        int i = gVar.f5633g;
        gVar.f5633g = i + 1;
        return i;
    }

    public C1722g(View view, C1716f fVar, int i, boolean z, boolean z2) {
        int i2 = 0;
        this.f5633g = 0;
        this.f5630d = view;
        this.f5630d.setVisibility(z ? 4 : i2);
        this.f5631e = fVar;
        this.f5631e.mo6634a((C1716f.C1719b) this, z2);
        this.f5632f = new ArrayList<>();
        this.f5628b = i;
    }

    public C1722g(View view, C1716f fVar, int i, boolean z) {
        this(view, fVar, i, z, true);
    }

    public C1722g(View view, C1716f fVar, int i) {
        this(view, fVar, i, true, true);
    }

    /* renamed from: a */
    private Animation.AnimationListener m7925a(C1723a aVar) {
        return new C1724h(this, aVar);
    }

    /* renamed from: a */
    public void mo6646a(View view) {
        this.f5630d = view;
    }

    /* renamed from: b */
    public View mo6648b() {
        return this.f5630d;
    }

    /* renamed from: a */
    public void mo6647a(Animation animation, C1723a aVar, String str) {
        if (animation != null) {
            animation.setFillAfter(true);
            animation.setAnimationListener(m7925a(aVar));
            this.f5632f.add(animation);
            this.f5629c = str;
        }
    }

    /* renamed from: a */
    public void mo6641a() {
        if (this.f5632f.size() == 0) {
            this.f5631e.mo6633a((C1716f.C1719b) this);
            return;
        }
        this.f5630d.setVisibility(0);
        this.f5630d.startAnimation(this.f5632f.get(this.f5633g));
    }
}
