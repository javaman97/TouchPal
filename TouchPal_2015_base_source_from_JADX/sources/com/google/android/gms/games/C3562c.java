package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.games.c */
public class C3562c implements Parcelable.Creator<PlayerEntity> {
    /* renamed from: a */
    static void m15513a(PlayerEntity playerEntity, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15460a(parcel, 1, playerEntity.getPlayerId(), false);
        C3540b.m15470c(parcel, 1000, playerEntity.mo11161i());
        C3540b.m15460a(parcel, 2, playerEntity.getDisplayName(), false);
        C3540b.m15459a(parcel, 3, (Parcelable) playerEntity.getIconImageUri(), i, false);
        C3540b.m15459a(parcel, 4, (Parcelable) playerEntity.getHiResImageUri(), i, false);
        C3540b.m15455a(parcel, 5, playerEntity.getRetrievedTimestamp());
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: A */
    public PlayerEntity[] newArray(int i) {
        return new PlayerEntity[i];
    }

    /* renamed from: o */
    public PlayerEntity createFromParcel(Parcel parcel) {
        Uri uri = null;
        int c = C3538a.m15422c(parcel);
        int i = 0;
        long j = 0;
        Uri uri2 = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    str2 = C3538a.m15433l(parcel, b);
                    break;
                case 2:
                    str = C3538a.m15433l(parcel, b);
                    break;
                case 3:
                    uri2 = (Uri) C3538a.m15416a(parcel, b, Uri.CREATOR);
                    break;
                case 4:
                    uri = (Uri) C3538a.m15416a(parcel, b, Uri.CREATOR);
                    break;
                case 5:
                    j = C3538a.m15428g(parcel, b);
                    break;
                case 1000:
                    i = C3538a.m15427f(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new PlayerEntity(i, str2, str, uri2, uri, j);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }
}
