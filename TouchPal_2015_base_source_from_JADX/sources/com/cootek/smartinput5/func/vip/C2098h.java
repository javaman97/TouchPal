package com.cootek.smartinput5.func.vip;

import android.content.DialogInterface;
import android.content.Intent;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.func.vip.h */
/* compiled from: PurchaseVipActivity */
class C2098h implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2097g f8968a;

    C2098h(C2097g gVar) {
        this.f8968a = gVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.WIFI_SETTINGS");
        intent.setFlags(Engine.EXCEPTION_ERROR);
        try {
            this.f8968a.f8967a.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
