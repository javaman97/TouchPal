package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C3889q;

public final class Tile implements SafeParcelable {
    public static final TileCreator CREATOR = new TileCreator();

    /* renamed from: ab */
    private final int f16090ab;
    public final byte[] data;
    public final int height;
    public final int width;

    Tile(int i, int i2, int i3, byte[] bArr) {
        this.f16090ab = i;
        this.width = i2;
        this.height = i3;
        this.data = bArr;
    }

    public Tile(int i, int i2, byte[] bArr) {
        this(1, i, i2, bArr);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo13064i() {
        return this.f16090ab;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C3889q.m16813bn()) {
            C3900i.m16862a(this, parcel, i);
        } else {
            TileCreator.m16845a(this, parcel, i);
        }
    }
}
