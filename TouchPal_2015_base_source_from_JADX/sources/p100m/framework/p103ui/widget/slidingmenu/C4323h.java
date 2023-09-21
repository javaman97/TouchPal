package p100m.framework.p103ui.widget.slidingmenu;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: m.framework.ui.widget.slidingmenu.h */
/* compiled from: SlidingMenu */
class C4323h extends FrameLayout {

    /* renamed from: a */
    final /* synthetic */ SlidingMenu f17566a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4323h(SlidingMenu slidingMenu, Context context) {
        super(context);
        this.f17566a = slidingMenu;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f17566a.f17541i) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
