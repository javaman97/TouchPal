package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.internal.C3802s;
import com.google.android.gms.maps.internal.C3851c;
import com.google.android.gms.maps.internal.C3888p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class MapsInitializer {
    private MapsInitializer() {
    }

    public static void initialize(Context context) throws GooglePlayServicesNotAvailableException {
        C3802s.m16678d(context);
        C3851c i = C3888p.m16809i(context);
        try {
            CameraUpdateFactory.m16718a(i.mo12775bk());
            BitmapDescriptorFactory.m16815a(i.mo12776bl());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
