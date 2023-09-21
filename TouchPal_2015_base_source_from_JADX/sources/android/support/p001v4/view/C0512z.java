package android.support.p001v4.view;

import android.view.View;

/* renamed from: android.support.v4.view.z */
/* compiled from: PagerTabStrip */
class C0512z implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ PagerTabStrip f1140a;

    C0512z(PagerTabStrip pagerTabStrip) {
        this.f1140a = pagerTabStrip;
    }

    public void onClick(View view) {
        this.f1140a.f879a.setCurrentItem(this.f1140a.f879a.getCurrentItem() + 1);
    }
}
