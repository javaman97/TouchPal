package com.cootek.smartinput5.net;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: com.cootek.smartinput5.net.v */
/* compiled from: GeoLocation */
class C2371v implements LocationListener {

    /* renamed from: a */
    final /* synthetic */ C2366t f10440a;

    C2371v(C2366t tVar) {
        this.f10440a = tVar;
    }

    public void onLocationChanged(Location location) {
        this.f10440a.mo8040b(location);
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        switch (i) {
            case 0:
                this.f10440a.mo8042c();
                return;
            case 1:
                this.f10440a.mo8042c();
                return;
            default:
                return;
        }
    }
}
