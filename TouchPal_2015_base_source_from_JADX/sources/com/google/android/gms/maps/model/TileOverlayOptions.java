package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C3889q;
import com.google.android.gms.maps.model.internal.C3921g;

public final class TileOverlayOptions implements SafeParcelable {
    public static final TileOverlayOptionsCreator CREATOR = new TileOverlayOptionsCreator();

    /* renamed from: ab */
    private final int f16092ab;
    /* access modifiers changed from: private */

    /* renamed from: hG */
    public C3921g f16093hG;

    /* renamed from: hH */
    private TileProvider f16094hH;

    /* renamed from: hb */
    private float f16095hb;

    /* renamed from: hc */
    private boolean f16096hc;

    public TileOverlayOptions() {
        this.f16096hc = true;
        this.f16092ab = 1;
    }

    TileOverlayOptions(int i, IBinder iBinder, boolean z, float f) {
        this.f16096hc = true;
        this.f16092ab = i;
        this.f16093hG = C3921g.C3922a.m16898U(iBinder);
        this.f16094hH = this.f16093hG == null ? null : new TileProvider() {

            /* renamed from: hI */
            private final C3921g f16097hI = TileOverlayOptions.this.f16093hG;

            public Tile getTile(int i, int i2, int i3) {
                try {
                    return this.f16097hI.getTile(i, i2, i3);
                } catch (RemoteException e) {
                    return null;
                }
            }
        };
        this.f16096hc = z;
        this.f16095hb = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bs */
    public IBinder mo13077bs() {
        return this.f16093hG.asBinder();
    }

    public int describeContents() {
        return 0;
    }

    public TileProvider getTileProvider() {
        return this.f16094hH;
    }

    public float getZIndex() {
        return this.f16095hb;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo13081i() {
        return this.f16092ab;
    }

    public boolean isVisible() {
        return this.f16096hc;
    }

    public TileOverlayOptions tileProvider(final TileProvider tileProvider) {
        this.f16094hH = tileProvider;
        this.f16093hG = this.f16094hH == null ? null : new C3921g.C3922a() {
            public Tile getTile(int i, int i2, int i3) {
                return tileProvider.getTile(i, i2, i3);
            }
        };
        return this;
    }

    public TileOverlayOptions visible(boolean z) {
        this.f16096hc = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C3889q.m16813bn()) {
            C3924j.m16899a(this, parcel, i);
        } else {
            TileOverlayOptionsCreator.m16849a(this, parcel, i);
        }
    }

    public TileOverlayOptions zIndex(float f) {
        this.f16095hb = f;
        return this;
    }
}
