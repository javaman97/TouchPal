package com.cootek.smartinput5.urlnavigator;

import android.view.View;

/* renamed from: com.cootek.smartinput5.urlnavigator.j */
/* compiled from: FavoritesView */
class C3270j implements View.OnLongClickListener {

    /* renamed from: a */
    final /* synthetic */ Object f14379a;

    /* renamed from: b */
    final /* synthetic */ C3268h f14380b;

    C3270j(C3268h hVar, Object obj) {
        this.f14380b = hVar;
        this.f14379a = obj;
    }

    public boolean onLongClick(View view) {
        if (this.f14379a instanceof Integer) {
            return this.f14380b.f14376a.m14515b(view, ((Integer) this.f14379a).intValue());
        }
        return false;
    }
}
