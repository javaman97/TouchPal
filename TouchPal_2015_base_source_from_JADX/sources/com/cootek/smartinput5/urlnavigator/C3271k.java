package com.cootek.smartinput5.urlnavigator;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.urlnavigator.k */
/* compiled from: FavoritesView */
class C3271k implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int[] f14381a;

    /* renamed from: b */
    final /* synthetic */ int f14382b;

    /* renamed from: c */
    final /* synthetic */ C3267g f14383c;

    C3271k(C3267g gVar, int[] iArr, int i) {
        this.f14383c = gVar;
        this.f14381a = iArr;
        this.f14382b = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f14383c.mo10457a(this.f14381a[i], (Object) Integer.valueOf(this.f14382b));
    }
}
