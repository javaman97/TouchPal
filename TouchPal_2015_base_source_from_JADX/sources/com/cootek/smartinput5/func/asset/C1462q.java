package com.cootek.smartinput5.func.asset;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.asset.q */
/* compiled from: UpdatePinyinActivity */
class C1462q implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ UpdatePinyinActivity f4683a;

    C1462q(UpdatePinyinActivity updatePinyinActivity) {
        this.f4683a = updatePinyinActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4683a.finish();
        this.f4683a.overridePendingTransition(-1, -1);
    }
}
