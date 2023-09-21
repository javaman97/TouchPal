package android.support.p001v4.view;

import android.view.View;

/* renamed from: android.support.v4.view.y */
/* compiled from: PagerTabStrip */
class C0511y implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ PagerTabStrip f1139a;

    C0511y(PagerTabStrip pagerTabStrip) {
        this.f1139a = pagerTabStrip;
    }

    public void onClick(View view) {
        this.f1139a.f879a.setCurrentItem(this.f1139a.f879a.getCurrentItem() - 1);
    }
}
