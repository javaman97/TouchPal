package com.cootek.smartinput5.func.mainentrance;

import android.os.RemoteException;
import com.cootek.smartinput5.action.ActionDownloadSkinPack;
import com.cootek.smartinput5.func.C1601bg;

/* renamed from: com.cootek.smartinput5.func.mainentrance.r */
/* compiled from: SkinProvider */
class C1866r implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1601bg f6237a;

    /* renamed from: b */
    final /* synthetic */ C1865q f6238b;

    C1866r(C1865q qVar, C1601bg bgVar) {
        this.f6238b = qVar;
        this.f6237a = bgVar;
    }

    public void run() {
        try {
            this.f6238b.f6236a.f6218g.sendMessageForParcelableAction(new ActionDownloadSkinPack(this.f6237a.mo6810a(), this.f6237a.f5100d));
        } catch (RemoteException e) {
        }
    }
}
