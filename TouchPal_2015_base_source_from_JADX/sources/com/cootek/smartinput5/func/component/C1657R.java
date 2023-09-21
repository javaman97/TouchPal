package com.cootek.smartinput5.func.component;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.mainentrance.MainEntranceActivity;

/* renamed from: com.cootek.smartinput5.func.component.R */
/* compiled from: HotWordUpdater */
class C1657R implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ boolean f5382a;

    /* renamed from: b */
    final /* synthetic */ Context f5383b;

    /* renamed from: c */
    final /* synthetic */ C1654O f5384c;

    C1657R(C1654O o, boolean z, Context context) {
        this.f5384c = o;
        this.f5382a = z;
        this.f5383b = context;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f5382a) {
            Intent intent = new Intent();
            intent.putExtra("tabNumber", 1);
            intent.setClass(this.f5383b, MainEntranceActivity.class);
            intent.setFlags(Engine.EXCEPTION_ERROR);
            this.f5383b.startActivity(intent);
        }
        Activity unused = this.f5384c.f5378b = null;
    }
}
