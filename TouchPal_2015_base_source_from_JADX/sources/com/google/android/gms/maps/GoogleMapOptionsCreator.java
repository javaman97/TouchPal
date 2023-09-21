package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.maps.model.CameraPosition;

public class GoogleMapOptionsCreator implements Parcelable.Creator<GoogleMapOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m16738a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, googleMapOptions.mo12607i());
        C3540b.m15452a(parcel, 2, googleMapOptions.mo12586aZ());
        C3540b.m15452a(parcel, 3, googleMapOptions.mo12587ba());
        C3540b.m15470c(parcel, 4, googleMapOptions.getMapType());
        C3540b.m15459a(parcel, 5, (Parcelable) googleMapOptions.getCamera(), i, false);
        C3540b.m15452a(parcel, 6, googleMapOptions.mo12588bb());
        C3540b.m15452a(parcel, 7, googleMapOptions.mo12589bc());
        C3540b.m15452a(parcel, 8, googleMapOptions.mo12590bd());
        C3540b.m15452a(parcel, 9, googleMapOptions.mo12591be());
        C3540b.m15452a(parcel, 10, googleMapOptions.mo12592bf());
        C3540b.m15452a(parcel, 11, googleMapOptions.mo12593bg());
        C3540b.m15451C(parcel, d);
    }

    public GoogleMapOptions createFromParcel(Parcel parcel) {
        byte b = 0;
        int c = C3538a.m15422c(parcel);
        CameraPosition cameraPosition = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        int i = 0;
        byte b7 = 0;
        byte b8 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < c) {
            int b9 = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b9)) {
                case 1:
                    i2 = C3538a.m15427f(parcel, b9);
                    break;
                case 2:
                    b8 = C3538a.m15425d(parcel, b9);
                    break;
                case 3:
                    b7 = C3538a.m15425d(parcel, b9);
                    break;
                case 4:
                    i = C3538a.m15427f(parcel, b9);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) C3538a.m15416a(parcel, b9, CameraPosition.CREATOR);
                    break;
                case 6:
                    b6 = C3538a.m15425d(parcel, b9);
                    break;
                case 7:
                    b5 = C3538a.m15425d(parcel, b9);
                    break;
                case 8:
                    b4 = C3538a.m15425d(parcel, b9);
                    break;
                case 9:
                    b3 = C3538a.m15425d(parcel, b9);
                    break;
                case 10:
                    b2 = C3538a.m15425d(parcel, b9);
                    break;
                case 11:
                    b = C3538a.m15425d(parcel, b9);
                    break;
                default:
                    C3538a.m15420b(parcel, b9);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new GoogleMapOptions(i2, b8, b7, i, cameraPosition, b6, b5, b4, b3, b2, b);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    public GoogleMapOptions[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
