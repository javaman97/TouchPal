package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.C3802s;
import com.google.android.gms.maps.model.internal.C3909c;

public final class GroundOverlay {

    /* renamed from: hd */
    private final C3909c f16039hd;

    public GroundOverlay(C3909c cVar) {
        this.f16039hd = (C3909c) C3802s.m16678d(cVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GroundOverlay)) {
            return false;
        }
        try {
            return this.f16039hd.mo13148a(((GroundOverlay) obj).f16039hd);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public float getBearing() {
        try {
            return this.f16039hd.getBearing();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public LatLngBounds getBounds() {
        try {
            return this.f16039hd.getBounds();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public float getHeight() {
        try {
            return this.f16039hd.getHeight();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public String getId() {
        try {
            return this.f16039hd.getId();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public LatLng getPosition() {
        try {
            return this.f16039hd.getPosition();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public float getTransparency() {
        try {
            return this.f16039hd.getTransparency();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public float getWidth() {
        try {
            return this.f16039hd.getWidth();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public float getZIndex() {
        try {
            return this.f16039hd.getZIndex();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f16039hd.hashCodeRemote();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isVisible() {
        try {
            return this.f16039hd.isVisible();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void remove() {
        try {
            this.f16039hd.remove();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setBearing(float f) {
        try {
            this.f16039hd.setBearing(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setDimensions(float f) {
        try {
            this.f16039hd.setDimensions(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setDimensions(float f, float f2) {
        try {
            this.f16039hd.mo13147a(f, f2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPosition(LatLng latLng) {
        try {
            this.f16039hd.setPosition(latLng);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPositionFromBounds(LatLngBounds latLngBounds) {
        try {
            this.f16039hd.setPositionFromBounds(latLngBounds);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setTransparency(float f) {
        try {
            this.f16039hd.setTransparency(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setVisible(boolean z) {
        try {
            this.f16039hd.setVisible(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setZIndex(float f) {
        try {
            this.f16039hd.setZIndex(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
