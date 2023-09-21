package p100m.framework.p103ui.widget.slidingmenu;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: m.framework.ui.widget.slidingmenu.e */
/* compiled from: SlidingMenu */
class C4320e implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ SlidingMenu f17563a;

    C4320e(SlidingMenu slidingMenu) {
        this.f17563a = slidingMenu;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                view.setBackgroundResource(this.f17563a.f17533a.f17549a);
                return false;
            case 1:
            case 3:
                view.setBackgroundResource(this.f17563a.f17533a.f17550b);
                return false;
            default:
                return false;
        }
    }
}
