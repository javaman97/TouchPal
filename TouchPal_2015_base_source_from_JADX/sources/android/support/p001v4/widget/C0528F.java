package android.support.p001v4.widget;

import android.support.p001v4.widget.SwipeRefreshLayout;
import android.view.animation.Animation;

/* renamed from: android.support.v4.widget.F */
/* compiled from: SwipeRefreshLayout */
class C0528F extends SwipeRefreshLayout.C0546a {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f1228a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0528F(SwipeRefreshLayout swipeRefreshLayout) {
        super(swipeRefreshLayout, (C0518D) null);
        this.f1228a = swipeRefreshLayout;
    }

    public void onAnimationEnd(Animation animation) {
        int unused = this.f1228a.f1339u = 0;
    }
}
