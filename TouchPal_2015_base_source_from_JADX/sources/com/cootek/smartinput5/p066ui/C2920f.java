package com.cootek.smartinput5.p066ui;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.f */
/* compiled from: AnimTextPopup */
class C2920f extends Handler {

    /* renamed from: a */
    final /* synthetic */ C2919e f13218a;

    C2920f(C2919e eVar) {
        this.f13218a = eVar;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f13218a.f13215h.iterator();
                while (it.hasNext()) {
                    C2921g gVar = (C2921g) it.next();
                    if (gVar.f13219a == message.arg1) {
                        gVar.dismiss();
                        arrayList.add(gVar);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C2921g gVar2 = (C2921g) it2.next();
                    this.f13218a.f13216i.offer(gVar2);
                    this.f13218a.f13215h.remove(gVar2);
                }
                arrayList.clear();
                return;
            case 1:
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = this.f13218a.f13215h.iterator();
                while (it3.hasNext()) {
                    C2921g gVar3 = (C2921g) it3.next();
                    if (gVar3.f13219a < message.arg1) {
                        gVar3.dismiss();
                        arrayList2.add(gVar3);
                    }
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    C2921g gVar4 = (C2921g) it4.next();
                    this.f13218a.f13216i.offer(gVar4);
                    this.f13218a.f13215h.remove(gVar4);
                }
                arrayList2.clear();
                return;
            default:
                return;
        }
    }
}
