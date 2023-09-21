package com.cootek.smartinput5.func.iab;

import android.os.RemoteException;
import com.cootek.smartinput5.action.ActionCollectData;
import com.cootek.smartinput5.engine.Storage;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.iab.g */
/* compiled from: IabDataCollector */
public class C1779g {

    /* renamed from: a */
    public static String f5849a = "DownloadPlugin";

    /* renamed from: b */
    public static String f5850b = "Login";

    /* renamed from: c */
    public static String f5851c = "UpdateRetry";

    /* renamed from: d */
    public static String f5852d = "UpgradeMain";

    /* renamed from: e */
    public static String f5853e = "UpgradePlugin";

    /* renamed from: f */
    private static String f5854f = C1246d.f3829bt;

    /* renamed from: g */
    private static String f5855g = (f5854f + C1246d.f3830bu);

    /* renamed from: h */
    private static String f5856h = "IAB/GOOGLE/";

    /* renamed from: i */
    private static String f5857i = (f5856h + C1246d.f3831bv);

    /* renamed from: j */
    private static String f5858j = (f5856h + C1246d.f3834by);

    /* renamed from: k */
    private static String f5859k = (f5856h + C1246d.f3832bw);

    /* renamed from: l */
    private static String f5860l = (f5856h + C1246d.f3833bx);

    /* renamed from: m */
    private static String f5861m = (f5856h + C1246d.f3941m + "/");

    /* renamed from: a */
    public static void m8170a(String str, String str2) {
        m8171a(f5855g + "START", str2 + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + str, C1246d.f3933e);
    }

    /* renamed from: a */
    public static void m8165a(int i, String str) {
        m8171a(f5855g + "START", str + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + i, C1246d.f3933e);
    }

    /* renamed from: a */
    public static void m8164a(int i, int i2, long j) {
        m8171a(f5855g + "FINISH", i + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + i2 + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + (System.currentTimeMillis() - j), C1246d.f3933e);
    }

    /* renamed from: a */
    public static void m8168a(String str) {
        m8171a(f5855g + C1246d.f3941m, str, C1246d.f3933e);
    }

    /* renamed from: a */
    public static void m8172a(boolean z, int i) {
        m8171a(f5857i + "START", (z ? "Trans" : "Direct") + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + i, C1246d.f3933e);
    }

    /* renamed from: a */
    public static void m8163a(int i, int i2) {
        m8169a(f5857i + C1246d.f3947s, i2, C1246d.f3933e);
    }

    /* renamed from: a */
    public static void m8162a(int i) {
        m8169a(f5857i + C1246d.f3946r, i, C1246d.f3933e);
    }

    /* renamed from: a */
    public static void m8167a(C2259P p, boolean z) {
        m8171a(f5858j + (z ? C1246d.f3941m : "FINISH"), m8176c(p), C1246d.f3933e);
    }

    /* renamed from: a */
    public static void m8166a(C2259P p) {
        m8171a(f5859k, m8176c(p), C1246d.f3933e);
    }

    /* renamed from: b */
    public static void m8175b(String str, String str2) {
        m8171a(f5860l + str, str2, C1246d.f3933e);
    }

    /* renamed from: b */
    public static void m8173b(int i) {
        m8169a(f5861m + "START", i, C1246d.f3933e);
    }

    /* renamed from: b */
    public static void m8174b(C2259P p) {
        m8171a(f5861m + "FINISH", m8176c(p), C1246d.f3933e);
    }

    /* renamed from: a */
    private static void m8169a(String str, int i, String str2) {
        m8171a(str, String.valueOf(i), str2);
    }

    /* renamed from: a */
    private static void m8171a(String str, String str2, String str3) {
        if (C1368X.m6324d()) {
            try {
                C1368X.m6320c().mo5839l().sendMessageForParcelableAction(new ActionCollectData(str, str3, str2 + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + C1368X.m6313b().getResources().getInteger(R.integer.ime_version_code), 1));
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: c */
    private static String m8176c(C2259P p) {
        int i;
        int i2 = 0;
        long j = 0;
        if (p != null) {
            i = p.f9746O;
            i2 = p.f9748Q;
            j = p.mo7834s();
        } else {
            i = 0;
        }
        return i + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + i2 + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + j;
    }
}
