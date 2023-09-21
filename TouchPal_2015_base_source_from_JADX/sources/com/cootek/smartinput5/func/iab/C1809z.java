package com.cootek.smartinput5.func.iab;

import android.content.DialogInterface;
import android.os.RemoteException;
import com.cootek.smartinput5.action.ActionDownloadApk;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.resource.C1974m;

/* renamed from: com.cootek.smartinput5.func.iab.z */
/* compiled from: IabErrorHandler */
class C1809z implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1808y f5931a;

    C1809z(C1808y yVar) {
        this.f5931a = yVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C1779g.m8175b(C1779g.f5852d, "CLICK");
        try {
            C1368X.m6320c().mo5839l().sendMessageForParcelableAction(new ActionDownloadApk(C1974m.m9063a(this.f5931a.f5929a, C1593bR.m7162a().mo6232a(0)), C1974m.m9063a(this.f5931a.f5929a, C1593bR.m7162a().mo6232a(16)), (String) null));
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
