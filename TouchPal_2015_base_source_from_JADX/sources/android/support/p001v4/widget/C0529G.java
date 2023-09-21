package android.support.p001v4.widget;

import android.support.p001v4.widget.SwipeRefreshLayout;
import android.view.animation.Animation;

/* renamed from: android.support.v4.widget.G */
/* compiled from: SwipeRefreshLayout */
class C0529G extends SwipeRefreshLayout.C0546a {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f1229a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0529G(SwipeRefreshLayout swipeRefreshLayout) {
        super(swipeRefreshLayout, (C0518D) null);
        this.f1229a = swipeRefreshLayout;
    }

    public void onAnimationEnd(Animation animation) {
        float unused = this.f1229a.f1337s = 0.0f;
    }
}
