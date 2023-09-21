package p100m.framework.p103ui.widget.slidingmenu;

import android.view.View;

/* renamed from: m.framework.ui.widget.slidingmenu.c */
/* compiled from: SlidingMenu */
class C4318c implements View.OnClickListener {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public final /* synthetic */ SlidingMenu f17561a;

    C4318c(SlidingMenu slidingMenu) {
        this.f17561a = slidingMenu;
    }

    public void onClick(View view) {
        C4328m mVar = (C4328m) view.getTag();
        if (mVar != null && this.f17561a.f17537e != null && !this.f17561a.f17537e.mo16082b(mVar)) {
            this.f17561a.postDelayed(new C4319d(this), 500);
        }
    }
}
