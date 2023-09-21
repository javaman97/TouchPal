package com.cootek.smartinput5;

import android.content.DialogInterface;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.bc */
/* compiled from: TouchPalOptionInte */
class C1150bc implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3500a;

    C1150bc(TouchPalOptionInte touchPalOptionInte) {
        this.f3500a = touchPalOptionInte;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Engine.showWaveGuide(this.f3500a.f2890D);
    }
}
