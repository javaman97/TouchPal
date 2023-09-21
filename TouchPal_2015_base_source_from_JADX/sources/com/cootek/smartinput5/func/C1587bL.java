package com.cootek.smartinput5.func;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.func.bL */
/* compiled from: Utils */
final class C1587bL implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Context f5022a;

    C1587bL(Context context) {
        this.f5022a = context;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = "android.settings.WIRELESS_SETTINGS";
        try {
            if (Build.VERSION.SDK_INT > 10) {
                str = "android.settings.SETTINGS";
            }
            Intent intent = new Intent(str);
            intent.addFlags(Engine.EXCEPTION_ERROR);
            this.f5022a.startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }
}
