package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.games.a */
public class C3559a implements Parcelable.Creator<GameEntity> {
    /* renamed from: a */
    static void m15510a(GameEntity gameEntity, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15460a(parcel, 1, gameEntity.getApplicationId(), false);
        C3540b.m15460a(parcel, 2, gameEntity.getDisplayName(), false);
        C3540b.m15460a(parcel, 3, gameEntity.getPrimaryCategory(), false);
        C3540b.m15460a(parcel, 4, gameEntity.getSecondaryCategory(), false);
        C3540b.m15460a(parcel, 5, gameEntity.getDescription(), false);
        C3540b.m15460a(parcel, 6, gameEntity.getDeveloperName(), false);
        C3540b.m15459a(parcel, 7, (Parcelable) gameEntity.getIconImageUri(), i, false);
        C3540b.m15459a(parcel, 8, (Parcelable) gameEntity.getHiResImageUri(), i, false);
        C3540b.m15459a(parcel, 9, (Parcelable) gameEntity.getFeaturedImageUri(), i, false);
        C3540b.m15463a(parcel, 10, gameEntity.isPlayEnabledGame());
        C3540b.m15463a(parcel, 11, gameEntity.isInstanceInstalled());
        C3540b.m15460a(parcel, 12, gameEntity.getInstancePackageName(), false);
        C3540b.m15470c(parcel, 13, gameEntity.getGameplayAclStatus());
        C3540b.m15470c(parcel, 14, gameEntity.getAchievementTotalCount());
        C3540b.m15470c(parcel, 15, gameEntity.getLeaderboardCount());
        C3540b.m15470c(parcel, 1000, gameEntity.mo11082i());
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: n */
    public GameEntity createFromParcel(Parcel parcel) {
        int c = C3538a.m15422c(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        boolean z = false;
        boolean z2 = false;
        String str7 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    str = C3538a.m15433l(parcel, b);
                    break;
                case 2:
                    str2 = C3538a.m15433l(parcel, b);
                    break;
                case 3:
                    str3 = C3538a.m15433l(parcel, b);
                    break;
                case 4:
                    str4 = C3538a.m15433l(parcel, b);
                    break;
                case 5:
                    str5 = C3538a.m15433l(parcel, b);
                    break;
                case 6:
                    str6 = C3538a.m15433l(parcel, b);
                    break;
                case 7:
                    uri = (Uri) C3538a.m15416a(parcel, b, Uri.CREATOR);
                    break;
                case 8:
                    uri2 = (Uri) C3538a.m15416a(parcel, b, Uri.CREATOR);
                    break;
                case 9:
                    uri3 = (Uri) C3538a.m15416a(parcel, b, Uri.CREATOR);
                    break;
                case 10:
                    z = C3538a.m15424c(parcel, b);
                    break;
                case 11:
                    z2 = C3538a.m15424c(parcel, b);
                    break;
                case 12:
                    str7 = C3538a.m15433l(parcel, b);
                    break;
                case 13:
                    i2 = C3538a.m15427f(parcel, b);
                    break;
                case 14:
                    i3 = C3538a.m15427f(parcel, b);
                    break;
                case 15:
                    i4 = C3538a.m15427f(parcel, b);
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
            return new GameEntity(i, str, str2, str3, str4, str5, str6, uri, uri2, uri3, z, z2, str7, i2, i3, i4);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: z */
    public GameEntity[] newArray(int i) {
        return new GameEntity[i];
    }
}
