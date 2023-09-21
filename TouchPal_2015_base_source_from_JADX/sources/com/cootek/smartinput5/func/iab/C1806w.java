package com.cootek.smartinput5.func.iab;

import android.content.DialogInterface;
import android.os.RemoteException;
import com.cootek.smartinput5.action.ActionDownloadApk;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.iab.w */
/* compiled from: IabErrorHandler */
class C1806w implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1805v f5927a;

    C1806w(C1805v vVar) {
        this.f5927a = vVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C1779g.m8175b(C1779g.f5853e, "CLICK");
        try {
            C1368X.m6320c().mo5839l().sendMessageForParcelableAction(new ActionDownloadApk(C1974m.m9063a(this.f5927a.f5925a, (int) R.string.app_id_inappbilling), C1974m.m9063a(this.f5927a.f5925a, (int) R.string.inappbilling_app_name), (String) null));
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
