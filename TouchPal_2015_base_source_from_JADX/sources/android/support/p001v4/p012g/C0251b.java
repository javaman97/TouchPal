package android.support.p001v4.p012g;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: android.support.v4.g.b */
/* compiled from: ConnectivityManagerCompatGingerbread */
class C0251b {
    C0251b() {
    }

    /* renamed from: a */
    public static boolean m1011a(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        switch (activeNetworkInfo.getType()) {
            case 1:
                return false;
            default:
                return true;
        }
    }
}
