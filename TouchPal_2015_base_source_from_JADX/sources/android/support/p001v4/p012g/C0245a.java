package android.support.p001v4.p012g;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;

/* renamed from: android.support.v4.g.a */
/* compiled from: ConnectivityManagerCompat */
public class C0245a {

    /* renamed from: a */
    private static final C0247b f643a;

    /* renamed from: android.support.v4.g.a$b */
    /* compiled from: ConnectivityManagerCompat */
    interface C0247b {
        /* renamed from: a */
        boolean mo785a(ConnectivityManager connectivityManager);
    }

    /* renamed from: android.support.v4.g.a$a */
    /* compiled from: ConnectivityManagerCompat */
    static class C0246a implements C0247b {
        C0246a() {
        }

        /* renamed from: a */
        public boolean mo785a(ConnectivityManager connectivityManager) {
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

    /* renamed from: android.support.v4.g.a$c */
    /* compiled from: ConnectivityManagerCompat */
    static class C0248c implements C0247b {
        C0248c() {
        }

        /* renamed from: a */
        public boolean mo785a(ConnectivityManager connectivityManager) {
            return C0251b.m1011a(connectivityManager);
        }
    }

    /* renamed from: android.support.v4.g.a$d */
    /* compiled from: ConnectivityManagerCompat */
    static class C0249d implements C0247b {
        C0249d() {
        }

        /* renamed from: a */
        public boolean mo785a(ConnectivityManager connectivityManager) {
            return C0252c.m1012a(connectivityManager);
        }
    }

    /* renamed from: android.support.v4.g.a$e */
    /* compiled from: ConnectivityManagerCompat */
    static class C0250e implements C0247b {
        C0250e() {
        }

        /* renamed from: a */
        public boolean mo785a(ConnectivityManager connectivityManager) {
            return C0253d.m1013a(connectivityManager);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f643a = new C0250e();
        } else if (Build.VERSION.SDK_INT >= 13) {
            f643a = new C0249d();
        } else if (Build.VERSION.SDK_INT >= 8) {
            f643a = new C0248c();
        } else {
            f643a = new C0246a();
        }
    }

    /* renamed from: a */
    public static boolean m1005a(ConnectivityManager connectivityManager) {
        return f643a.mo785a(connectivityManager);
    }

    /* renamed from: a */
    public static NetworkInfo m1004a(ConnectivityManager connectivityManager, Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }
}
