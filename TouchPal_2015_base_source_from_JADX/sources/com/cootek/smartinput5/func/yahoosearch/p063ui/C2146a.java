package com.cootek.smartinput5.func.yahoosearch.p063ui;

import android.view.View;
import com.cootek.smartinput5.p048d.C1246d;
import com.yahoo.mobile.client.share.search.interfaces.ISearchVertical;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.ui.a */
/* compiled from: FooterViewHolder */
class C2146a implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f9125a;

    /* renamed from: b */
    final /* synthetic */ FooterViewHolder f9126b;

    C2146a(FooterViewHolder footerViewHolder, int i) {
        this.f9126b = footerViewHolder;
        this.f9125a = i;
    }

    public void onClick(View view) {
        this.f9126b.f9108k.changeTab(this.f9125a);
        C1246d.m6010a(this.f9126b.f9102e).mo4591a(C1246d.f3927du, ((ISearchVertical) this.f9126b.f9106i.get(this.f9125a)).getVerticalId(), C1246d.f3923dq);
    }
}
