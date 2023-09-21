package p100m.framework.p103ui.widget.slidingmenu;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* renamed from: m.framework.ui.widget.slidingmenu.i */
/* compiled from: SlidingMenu */
class C4324i extends LinearLayout {

    /* renamed from: a */
    final /* synthetic */ SlidingMenu f17567a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4324i(SlidingMenu slidingMenu, Context context) {
        super(context);
        this.f17567a = slidingMenu;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
