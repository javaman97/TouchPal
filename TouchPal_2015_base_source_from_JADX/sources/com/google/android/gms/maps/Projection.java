package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C3552c;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;

public final class Projection {

    /* renamed from: gJ */
    private final IProjectionDelegate f15991gJ;

    Projection(IProjectionDelegate iProjectionDelegate) {
        this.f15991gJ = iProjectionDelegate;
    }

    public LatLng fromScreenLocation(Point point) {
        try {
            return this.f15991gJ.fromScreenLocation(C3552c.m15490f(point));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public VisibleRegion getVisibleRegion() {
        try {
            return this.f15991gJ.getVisibleRegion();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public Point toScreenLocation(LatLng latLng) {
        try {
            return (Point) C3552c.m15489a(this.f15991gJ.toScreenLocation(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
