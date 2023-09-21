package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.multiplayer.realtime.b */
public class C3579b implements Parcelable.Creator<RoomEntity> {
    /* renamed from: a */
    static void m15573a(RoomEntity roomEntity, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15460a(parcel, 1, roomEntity.getRoomId(), false);
        C3540b.m15470c(parcel, 1000, roomEntity.mo11339i());
        C3540b.m15460a(parcel, 2, roomEntity.getCreatorId(), false);
        C3540b.m15455a(parcel, 3, roomEntity.getCreationTimestamp());
        C3540b.m15470c(parcel, 4, roomEntity.getStatus());
        C3540b.m15460a(parcel, 5, roomEntity.getDescription(), false);
        C3540b.m15470c(parcel, 6, roomEntity.getVariant());
        C3540b.m15456a(parcel, 7, roomEntity.getAutoMatchCriteria(), false);
        C3540b.m15469b(parcel, 8, roomEntity.getParticipants(), false);
        C3540b.m15470c(parcel, 9, roomEntity.getAutoMatchWaitEstimateSeconds());
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: K */
    public RoomEntity[] newArray(int i) {
        return new RoomEntity[i];
    }

    /* renamed from: s */
    public RoomEntity createFromParcel(Parcel parcel) {
        int i = 0;
        ArrayList<ParticipantEntity> arrayList = null;
        int c = C3538a.m15422c(parcel);
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        String str2 = null;
        String str3 = null;
        int i4 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    str3 = C3538a.m15433l(parcel, b);
                    break;
                case 2:
                    str2 = C3538a.m15433l(parcel, b);
                    break;
                case 3:
                    j = C3538a.m15428g(parcel, b);
                    break;
                case 4:
                    i3 = C3538a.m15427f(parcel, b);
                    break;
                case 5:
                    str = C3538a.m15433l(parcel, b);
                    break;
                case 6:
                    i2 = C3538a.m15427f(parcel, b);
                    break;
                case 7:
                    bundle = C3538a.m15436n(parcel, b);
                    break;
                case 8:
                    arrayList = C3538a.m15423c(parcel, b, ParticipantEntity.CREATOR);
                    break;
                case 9:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 1000:
                    i4 = C3538a.m15427f(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new RoomEntity(i4, str3, str2, j, i3, str, i2, bundle, arrayList, i);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }
}
