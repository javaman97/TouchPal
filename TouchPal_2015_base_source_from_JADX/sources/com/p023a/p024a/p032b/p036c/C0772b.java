package com.p023a.p024a.p032b.p036c;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import com.p023a.p024a.p032b.p033a.C0758f;
import com.p023a.p024a.p032b.p038e.C0790a;

/* renamed from: com.a.a.b.c.b */
/* compiled from: FadeInBitmapDisplayer */
public class C0772b implements C0771a {

    /* renamed from: a */
    private final int f1948a;

    /* renamed from: b */
    private final boolean f1949b;

    /* renamed from: c */
    private final boolean f1950c;

    /* renamed from: d */
    private final boolean f1951d;

    public C0772b(int i) {
        this(i, true, true, true);
    }

    public C0772b(int i, boolean z, boolean z2, boolean z3) {
        this.f1948a = i;
        this.f1949b = z;
        this.f1950c = z2;
        this.f1951d = z3;
    }

    /* renamed from: a */
    public void mo2892a(Bitmap bitmap, C0790a aVar, C0758f fVar) {
        aVar.mo2974a(bitmap);
        if ((this.f1949b && fVar == C0758f.NETWORK) || ((this.f1950c && fVar == C0758f.DISC_CACHE) || (this.f1951d && fVar == C0758f.MEMORY_CACHE))) {
            m4409a(aVar.mo2978d(), this.f1948a);
        }
    }

    /* renamed from: a */
    public static void m4409a(View view, int i) {
        if (view != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration((long) i);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            view.startAnimation(alphaAnimation);
        }
    }
}
