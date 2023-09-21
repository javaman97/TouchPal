package com.cootek.smartinput5.func.mainentrance;

import android.content.Intent;
import android.view.View;
import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.func.mainentrance.c */
/* compiled from: MainEntranceActivity */
class C1848c implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ MainEntranceActivity f6154a;

    C1848c(MainEntranceActivity mainEntranceActivity) {
        this.f6154a = mainEntranceActivity;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.setClass(this.f6154a, TouchPalOption.class);
        this.f6154a.startActivity(intent);
    }
}
