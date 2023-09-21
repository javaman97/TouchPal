package com.cootek.presentation.sdk.utils;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.cootek.presentation.service.PresentationSystem;

public class NetworkUtil {

    public static class NetworkStatus {
        public final boolean mobileConnected;
        public final boolean wifiConnected;

        public NetworkStatus(boolean z, boolean z2) {
            this.wifiConnected = z;
            this.mobileConnected = z2;
        }
    }

    public static NetworkStatus getNetworkStatus() {
        ConnectivityManager connectivityManager;
        boolean z;
        NetworkInfo networkInfo = null;
        boolean z2 = true;
        boolean z3 = false;
        try {
            connectivityManager = (ConnectivityManager) PresentationSystem.getInstance().getContext().getSystemService("connectivity");
        } catch (Exception e) {
            connectivityManager = null;
        }
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException e2) {
                e2.printStackTrace();
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            z = false;
        } else {
            if (networkInfo.getType() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (networkInfo.getType() != 0) {
                z2 = false;
            }
            z3 = z2;
        }
        return new NetworkStatus(z, z3);
    }

    public static boolean meetNetwork(int i) {
        return meetNetwork(getNetworkStatus(), i);
    }

    public static boolean meetNetwork(NetworkStatus networkStatus, int i) {
        return meetNetwork(networkStatus.wifiConnected, networkStatus.mobileConnected, i);
    }

    public static boolean meetNetwork(boolean z, boolean z2, int i) {
        if (i == 4) {
            return true;
        }
        if (i == 3 && (z || z2)) {
            return true;
        }
        if (i == 1 && z) {
            return true;
        }
        if (i != 2 || !z2) {
            return false;
        }
        return true;
    }
}
