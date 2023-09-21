package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.multiplayer.a */
public class C3571a implements Parcelable.Creator<InvitationEntity> {
    /* renamed from: a */
    static void m15552a(InvitationEntity invitationEntity, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15459a(parcel, 1, (Parcelable) invitationEntity.getGame(), i, false);
        C3540b.m15470c(parcel, 1000, invitationEntity.mo11261i());
        C3540b.m15460a(parcel, 2, invitationEntity.getInvitationId(), false);
        C3540b.m15455a(parcel, 3, invitationEntity.getCreationTimestamp());
        C3540b.m15470c(parcel, 4, invitationEntity.mo11250aL());
        C3540b.m15459a(parcel, 5, (Parcelable) invitationEntity.getInviter(), i, false);
        C3540b.m15469b(parcel, 6, invitationEntity.getParticipants(), false);
        C3540b.m15470c(parcel, 7, invitationEntity.getVariant());
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: H */
    public InvitationEntity[] newArray(int i) {
        return new InvitationEntity[i];
    }

    /* renamed from: p */
    public InvitationEntity createFromParcel(Parcel parcel) {
        int i = 0;
        ArrayList<ParticipantEntity> arrayList = null;
        int c = C3538a.m15422c(parcel);
        long j = 0;
        ParticipantEntity participantEntity = null;
        int i2 = 0;
        String str = null;
        GameEntity gameEntity = null;
        int i3 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    gameEntity = (GameEntity) C3538a.m15416a(parcel, b, GameEntity.CREATOR);
                    break;
                case 2:
                    str = C3538a.m15433l(parcel, b);
                    break;
                case 3:
                    j = C3538a.m15428g(parcel, b);
                    break;
                case 4:
                    i2 = C3538a.m15427f(parcel, b);
                    break;
                case 5:
                    participantEntity = (ParticipantEntity) C3538a.m15416a(parcel, b, ParticipantEntity.CREATOR);
                    break;
                case 6:
                    arrayList = C3538a.m15423c(parcel, b, ParticipantEntity.CREATOR);
                    break;
                case 7:
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
            return new InvitationEntity(i3, gameEntity, str, j, i2, participantEntity, arrayList, i);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }
}
