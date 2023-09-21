package p100m.framework.p103ui.widget.slidingmenu;

import android.view.ViewTreeObserver;

/* renamed from: m.framework.ui.widget.slidingmenu.f */
/* compiled from: SlidingMenu */
class C4321f implements ViewTreeObserver.OnGlobalLayoutListener {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public final /* synthetic */ SlidingMenu f17564a;

    C4321f(SlidingMenu slidingMenu) {
        this.f17564a = slidingMenu;
    }

    public void onGlobalLayout() {
        this.f17564a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.f17564a.post(new C4322g(this));
    }
}
