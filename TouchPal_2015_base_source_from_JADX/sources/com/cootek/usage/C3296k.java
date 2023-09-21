package com.cootek.usage;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: com.cootek.usage.k */
final class C3296k {
    C3296k() {
    }

    /* renamed from: a */
    static final boolean m14605a(Context context) {
        if (ConnectivityManager.isNetworkTypeValid(1)) {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1).isConnected();
        }
        return false;
    }
}
