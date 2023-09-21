package com.cootek.smartinput5.func;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C1422ad;

/* renamed from: com.cootek.smartinput5.func.ae */
/* compiled from: GoodsManager */
final class C1429ae extends Handler {
    C1429ae(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        C1422ad.C1428e eVar;
        if (C1368X.m6324d()) {
            switch (message.what) {
                case 10:
                    Bundle data = message.getData();
                    if (data != null) {
                        String string = data.getString(C1422ad.f4567m);
                        data.getString(C1422ad.f4568n);
                        C1422ad.C1428e eVar2 = (C1422ad.C1428e) data.getSerializable(C1422ad.f4569o);
                        if (eVar2 == null) {
                            eVar = C1422ad.C1428e.NotExist;
                        } else {
                            eVar = eVar2;
                        }
                        long j = data.getLong(C1422ad.f4571q, 0);
                        boolean z = data.getBoolean(C1422ad.f4572r, false);
                        if (!TextUtils.isEmpty(string)) {
                            C1368X.m6320c().mo5840m().mo6057a(string, eVar, j, z);
                            return;
                        }
                        return;
                    }
                    return;
                case 11:
                    C1368X.m6320c().mo5840m().m6687l();
                    return;
                default:
                    return;
            }
        }
    }
}
