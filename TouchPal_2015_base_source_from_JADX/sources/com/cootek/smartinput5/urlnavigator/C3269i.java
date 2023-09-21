package com.cootek.smartinput5.urlnavigator;

import android.view.View;

/* renamed from: com.cootek.smartinput5.urlnavigator.i */
/* compiled from: FavoritesView */
class C3269i implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Object f14377a;

    /* renamed from: b */
    final /* synthetic */ C3268h f14378b;

    C3269i(C3268h hVar, Object obj) {
        this.f14378b = hVar;
        this.f14377a = obj;
    }

    public void onClick(View view) {
        if (this.f14377a instanceof Integer) {
            this.f14378b.f14376a.m14513a(view, ((Integer) this.f14377a).intValue());
        }
    }
}
