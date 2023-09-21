package com.cootek.smartinput.utilities;

import android.os.RemoteException;
import com.cootek.smartinput5.action.ActionCollectData;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput.utilities.c */
/* compiled from: DownloadDataCollector */
public class C0994c {

    /* renamed from: com.cootek.smartinput.utilities.c$a */
    /* compiled from: DownloadDataCollector */
    public enum C0995a {
        START,
        SUCCESS,
        INSTALLED,
        CONFIRM_CANCEL,
        NO_SDCARD
    }

    /* renamed from: a */
    public static void m5165a(String str, C0995a aVar) {
        m5166a(C1246d.f3785bB + aVar.toString(), str, C1246d.f3933e);
    }

    /* renamed from: a */
    private static void m5166a(String str, String str2, String str3) {
        if (C1368X.m6324d()) {
            try {
                C1368X.m6320c().mo5839l().sendMessageForParcelableAction(new ActionCollectData(str, str3, str2, 1));
            } catch (RemoteException e) {
            }
        }
    }
}
