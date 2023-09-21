package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

public class TileCreator implements Parcelable.Creator<Tile> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m16845a(Tile tile, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, tile.mo13064i());
        C3540b.m15470c(parcel, 2, tile.width);
        C3540b.m15470c(parcel, 3, tile.height);
        C3540b.m15464a(parcel, 4, tile.data, false);
        C3540b.m15451C(parcel, d);
    }

    public Tile createFromParcel(Parcel parcel) {
        int i = 0;
        int c = C3538a.m15422c(parcel);
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i3 = C3538a.m15427f(parcel, b);
                    break;
                case 2:
                    i2 = C3538a.m15427f(parcel, b);
                    break;
                case 3:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 4:
                    bArr = C3538a.m15437o(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new Tile(i3, i2, i, bArr);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    public Tile[] newArray(int i) {
        return new Tile[i];
    }
}
