package com.cootek.smartinput5.func.component;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.func.component.i */
/* compiled from: CloudBackupSync */
class C1676i implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1671f f5483a;

    C1676i(C1671f fVar) {
        this.f5483a = fVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = "android.settings.WIRELESS_SETTINGS";
        try {
            if (Build.VERSION.SDK_INT > 10) {
                str = "android.settings.SETTINGS";
            }
            Intent intent = new Intent(str);
            intent.addFlags(Engine.EXCEPTION_ERROR);
            this.f5483a.f5469l.startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }
}
