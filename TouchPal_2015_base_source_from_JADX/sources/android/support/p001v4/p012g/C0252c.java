package android.support.p001v4.p012g;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: android.support.v4.g.c */
/* compiled from: ConnectivityManagerCompatHoneycombMR2 */
class C0252c {
    C0252c() {
    }

    /* renamed from: a */
    public static boolean m1012a(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        switch (activeNetworkInfo.getType()) {
            case 1:
            case 7:
            case 9:
                return false;
            default:
                return true;
        }
    }
}
