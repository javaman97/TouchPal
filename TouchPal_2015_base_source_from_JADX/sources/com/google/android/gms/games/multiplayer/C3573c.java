package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.games.PlayerEntity;

/* renamed from: com.google.android.gms.games.multiplayer.c */
public class C3573c implements Parcelable.Creator<ParticipantEntity> {
    /* renamed from: a */
    static void m15556a(ParticipantEntity participantEntity, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15460a(parcel, 1, participantEntity.getParticipantId(), false);
        C3540b.m15470c(parcel, 1000, participantEntity.mo11281i());
        C3540b.m15460a(parcel, 2, participantEntity.getDisplayName(), false);
        C3540b.m15459a(parcel, 3, (Parcelable) participantEntity.getIconImageUri(), i, false);
        C3540b.m15459a(parcel, 4, (Parcelable) participantEntity.getHiResImageUri(), i, false);
        C3540b.m15470c(parcel, 5, participantEntity.getStatus());
        C3540b.m15460a(parcel, 6, participantEntity.mo11268aM(), false);
        C3540b.m15463a(parcel, 7, participantEntity.isConnectedToRoom());
        C3540b.m15459a(parcel, 8, (Parcelable) participantEntity.getPlayer(), i, false);
        C3540b.m15470c(parcel, 9, participantEntity.mo11269aN());
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: I */
    public ParticipantEntity[] newArray(int i) {
        return new ParticipantEntity[i];
    }

    /* renamed from: q */
    public ParticipantEntity createFromParcel(Parcel parcel) {
        int i = 0;
        PlayerEntity playerEntity = null;
        int c = C3538a.m15422c(parcel);
        boolean z = false;
        String str = null;
        int i2 = 0;
        Uri uri = null;
        Uri uri2 = null;
        String str2 = null;
        String str3 = null;
        int i3 = 0;
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
                    uri2 = (Uri) C3538a.m15416a(parcel, b, Uri.CREATOR);
                    break;
                case 4:
                    uri = (Uri) C3538a.m15416a(parcel, b, Uri.CREATOR);
                    break;
                case 5:
                    i2 = C3538a.m15427f(parcel, b);
                    break;
                case 6:
                    str = C3538a.m15433l(parcel, b);
                    break;
                case 7:
                    z = C3538a.m15424c(parcel, b);
                    break;
                case 8:
                    playerEntity = (PlayerEntity) C3538a.m15416a(parcel, b, PlayerEntity.CREATOR);
                    break;
                case 9:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 1000:
                    i3 = C3538a.m15427f(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new ParticipantEntity(i3, str3, str2, uri2, uri, i2, str, z, playerEntity, i);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }
}
