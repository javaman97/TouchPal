package p100m.framework.p103ui.widget.slidingmenu;

import android.view.ViewTreeObserver;

/* renamed from: m.framework.ui.widget.slidingmenu.j */
/* compiled from: SlidingMenu */
class C4325j implements ViewTreeObserver.OnGlobalLayoutListener {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public final /* synthetic */ SlidingMenu f17568a;

    C4325j(SlidingMenu slidingMenu) {
        this.f17568a = slidingMenu;
    }

    public void onGlobalLayout() {
        this.f17568a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.f17568a.post(new C4326k(this));
    }
}
