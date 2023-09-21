package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.cootek.smartinput5.engine.Settings;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.by */
public class C3724by implements Parcelable.Creator<C3723bx> {
    /* renamed from: a */
    static void m16352a(C3723bx bxVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        Set<Integer> bH = bxVar.mo11870bH();
        if (bH.contains(1)) {
            C3540b.m15470c(parcel, 1, bxVar.mo11998i());
        }
        if (bH.contains(2)) {
            C3540b.m15459a(parcel, 2, (Parcelable) bxVar.mo11871bI(), i, true);
        }
        if (bH.contains(3)) {
            C3540b.m15461a(parcel, 3, bxVar.getAdditionalName(), true);
        }
        if (bH.contains(4)) {
            C3540b.m15459a(parcel, 4, (Parcelable) bxVar.mo11872bJ(), i, true);
        }
        if (bH.contains(5)) {
            C3540b.m15460a(parcel, 5, bxVar.getAddressCountry(), true);
        }
        if (bH.contains(6)) {
            C3540b.m15460a(parcel, 6, bxVar.getAddressLocality(), true);
        }
        if (bH.contains(7)) {
            C3540b.m15460a(parcel, 7, bxVar.getAddressRegion(), true);
        }
        if (bH.contains(8)) {
            C3540b.m15469b(parcel, 8, bxVar.mo11873bK(), true);
        }
        if (bH.contains(9)) {
            C3540b.m15470c(parcel, 9, bxVar.getAttendeeCount());
        }
        if (bH.contains(10)) {
            C3540b.m15469b(parcel, 10, bxVar.mo11874bL(), true);
        }
        if (bH.contains(11)) {
            C3540b.m15459a(parcel, 11, (Parcelable) bxVar.mo11875bM(), i, true);
        }
        if (bH.contains(12)) {
            C3540b.m15469b(parcel, 12, bxVar.mo11876bN(), true);
        }
        if (bH.contains(13)) {
            C3540b.m15460a(parcel, 13, bxVar.getBestRating(), true);
        }
        if (bH.contains(14)) {
            C3540b.m15460a(parcel, 14, bxVar.getBirthDate(), true);
        }
        if (bH.contains(15)) {
            C3540b.m15459a(parcel, 15, (Parcelable) bxVar.mo11877bO(), i, true);
        }
        if (bH.contains(17)) {
            C3540b.m15460a(parcel, 17, bxVar.getContentSize(), true);
        }
        if (bH.contains(16)) {
            C3540b.m15460a(parcel, 16, bxVar.getCaption(), true);
        }
        if (bH.contains(19)) {
            C3540b.m15469b(parcel, 19, bxVar.mo11878bP(), true);
        }
        if (bH.contains(18)) {
            C3540b.m15460a(parcel, 18, bxVar.getContentUrl(), true);
        }
        if (bH.contains(21)) {
            C3540b.m15460a(parcel, 21, bxVar.getDateModified(), true);
        }
        if (bH.contains(20)) {
            C3540b.m15460a(parcel, 20, bxVar.getDateCreated(), true);
        }
        if (bH.contains(23)) {
            C3540b.m15460a(parcel, 23, bxVar.getDescription(), true);
        }
        if (bH.contains(22)) {
            C3540b.m15460a(parcel, 22, bxVar.getDatePublished(), true);
        }
        if (bH.contains(25)) {
            C3540b.m15460a(parcel, 25, bxVar.getEmbedUrl(), true);
        }
        if (bH.contains(24)) {
            C3540b.m15460a(parcel, 24, bxVar.getDuration(), true);
        }
        if (bH.contains(27)) {
            C3540b.m15460a(parcel, 27, bxVar.getFamilyName(), true);
        }
        if (bH.contains(26)) {
            C3540b.m15460a(parcel, 26, bxVar.getEndDate(), true);
        }
        if (bH.contains(29)) {
            C3540b.m15459a(parcel, 29, (Parcelable) bxVar.mo11879bQ(), i, true);
        }
        if (bH.contains(28)) {
            C3540b.m15460a(parcel, 28, bxVar.getGender(), true);
        }
        if (bH.contains(31)) {
            C3540b.m15460a(parcel, 31, bxVar.getHeight(), true);
        }
        if (bH.contains(30)) {
            C3540b.m15460a(parcel, 30, bxVar.getGivenName(), true);
        }
        if (bH.contains(34)) {
            C3540b.m15459a(parcel, 34, (Parcelable) bxVar.mo11880bR(), i, true);
        }
        if (bH.contains(32)) {
            C3540b.m15460a(parcel, 32, bxVar.getId(), true);
        }
        if (bH.contains(33)) {
            C3540b.m15460a(parcel, 33, bxVar.getImage(), true);
        }
        if (bH.contains(38)) {
            C3540b.m15453a(parcel, 38, bxVar.getLongitude());
        }
        if (bH.contains(39)) {
            C3540b.m15460a(parcel, 39, bxVar.getName(), true);
        }
        if (bH.contains(36)) {
            C3540b.m15453a(parcel, 36, bxVar.getLatitude());
        }
        if (bH.contains(37)) {
            C3540b.m15459a(parcel, 37, (Parcelable) bxVar.mo11881bS(), i, true);
        }
        if (bH.contains(42)) {
            C3540b.m15460a(parcel, 42, bxVar.getPlayerType(), true);
        }
        if (bH.contains(43)) {
            C3540b.m15460a(parcel, 43, bxVar.getPostOfficeBoxNumber(), true);
        }
        if (bH.contains(40)) {
            C3540b.m15459a(parcel, 40, (Parcelable) bxVar.mo11882bT(), i, true);
        }
        if (bH.contains(41)) {
            C3540b.m15469b(parcel, 41, bxVar.mo11883bU(), true);
        }
        if (bH.contains(46)) {
            C3540b.m15459a(parcel, 46, (Parcelable) bxVar.mo11884bV(), i, true);
        }
        if (bH.contains(47)) {
            C3540b.m15460a(parcel, 47, bxVar.getStartDate(), true);
        }
        if (bH.contains(44)) {
            C3540b.m15460a(parcel, 44, bxVar.getPostalCode(), true);
        }
        if (bH.contains(45)) {
            C3540b.m15460a(parcel, 45, bxVar.getRatingValue(), true);
        }
        if (bH.contains(51)) {
            C3540b.m15460a(parcel, 51, bxVar.getThumbnailUrl(), true);
        }
        if (bH.contains(50)) {
            C3540b.m15459a(parcel, 50, (Parcelable) bxVar.mo11885bW(), i, true);
        }
        if (bH.contains(49)) {
            C3540b.m15460a(parcel, 49, bxVar.getText(), true);
        }
        if (bH.contains(48)) {
            C3540b.m15460a(parcel, 48, bxVar.getStreetAddress(), true);
        }
        if (bH.contains(55)) {
            C3540b.m15460a(parcel, 55, bxVar.getWidth(), true);
        }
        if (bH.contains(54)) {
            C3540b.m15460a(parcel, 54, bxVar.getUrl(), true);
        }
        if (bH.contains(53)) {
            C3540b.m15460a(parcel, 53, bxVar.getType(), true);
        }
        if (bH.contains(52)) {
            C3540b.m15460a(parcel, 52, bxVar.getTickerSymbol(), true);
        }
        if (bH.contains(56)) {
            C3540b.m15460a(parcel, 56, bxVar.getWorstRating(), true);
        }
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: W */
    public C3723bx[] newArray(int i) {
        return new C3723bx[i];
    }

    /* renamed from: w */
    public C3723bx createFromParcel(Parcel parcel) {
        int c = C3538a.m15422c(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        C3723bx bxVar = null;
        ArrayList<String> arrayList = null;
        C3723bx bxVar2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        int i2 = 0;
        ArrayList arrayList3 = null;
        C3723bx bxVar3 = null;
        ArrayList arrayList4 = null;
        String str4 = null;
        String str5 = null;
        C3723bx bxVar4 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        ArrayList arrayList5 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        C3723bx bxVar5 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        C3723bx bxVar6 = null;
        double d = 0.0d;
        C3723bx bxVar7 = null;
        double d2 = 0.0d;
        String str22 = null;
        C3723bx bxVar8 = null;
        ArrayList arrayList6 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        C3723bx bxVar9 = null;
        String str27 = null;
        String str28 = null;
        String str29 = null;
        C3723bx bxVar10 = null;
        String str30 = null;
        String str31 = null;
        String str32 = null;
        String str33 = null;
        String str34 = null;
        String str35 = null;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i = C3538a.m15427f(parcel, b);
                    hashSet.add(1);
                    break;
                case 2:
                    hashSet.add(2);
                    bxVar = (C3723bx) C3538a.m15416a(parcel, b, C3723bx.CREATOR);
                    break;
                case 3:
                    arrayList = C3538a.m15446x(parcel, b);
                    hashSet.add(3);
                    break;
                case 4:
                    hashSet.add(4);
                    bxVar2 = (C3723bx) C3538a.m15416a(parcel, b, C3723bx.CREATOR);
                    break;
                case 5:
                    str = C3538a.m15433l(parcel, b);
                    hashSet.add(5);
                    break;
                case 6:
                    str2 = C3538a.m15433l(parcel, b);
                    hashSet.add(6);
                    break;
                case 7:
                    str3 = C3538a.m15433l(parcel, b);
                    hashSet.add(7);
                    break;
                case 8:
                    arrayList2 = C3538a.m15423c(parcel, b, C3723bx.CREATOR);
                    hashSet.add(8);
                    break;
                case 9:
                    i2 = C3538a.m15427f(parcel, b);
                    hashSet.add(9);
                    break;
                case 10:
                    arrayList3 = C3538a.m15423c(parcel, b, C3723bx.CREATOR);
                    hashSet.add(10);
                    break;
                case 11:
                    hashSet.add(11);
                    bxVar3 = (C3723bx) C3538a.m15416a(parcel, b, C3723bx.CREATOR);
                    break;
                case 12:
                    arrayList4 = C3538a.m15423c(parcel, b, C3723bx.CREATOR);
                    hashSet.add(12);
                    break;
                case 13:
                    str4 = C3538a.m15433l(parcel, b);
                    hashSet.add(13);
                    break;
                case 14:
                    str5 = C3538a.m15433l(parcel, b);
                    hashSet.add(14);
                    break;
                case 15:
                    hashSet.add(15);
                    bxVar4 = (C3723bx) C3538a.m15416a(parcel, b, C3723bx.CREATOR);
                    break;
                case 16:
                    str6 = C3538a.m15433l(parcel, b);
                    hashSet.add(16);
                    break;
                case 17:
                    str7 = C3538a.m15433l(parcel, b);
                    hashSet.add(17);
                    break;
                case 18:
                    str8 = C3538a.m15433l(parcel, b);
                    hashSet.add(18);
                    break;
                case 19:
                    arrayList5 = C3538a.m15423c(parcel, b, C3723bx.CREATOR);
                    hashSet.add(19);
                    break;
                case 20:
                    str9 = C3538a.m15433l(parcel, b);
                    hashSet.add(20);
                    break;
                case 21:
                    str10 = C3538a.m15433l(parcel, b);
                    hashSet.add(21);
                    break;
                case 22:
                    str11 = C3538a.m15433l(parcel, b);
                    hashSet.add(22);
                    break;
                case 23:
                    str12 = C3538a.m15433l(parcel, b);
                    hashSet.add(23);
                    break;
                case 24:
                    str13 = C3538a.m15433l(parcel, b);
                    hashSet.add(24);
                    break;
                case 25:
                    str14 = C3538a.m15433l(parcel, b);
                    hashSet.add(25);
                    break;
                case 26:
                    str15 = C3538a.m15433l(parcel, b);
                    hashSet.add(26);
                    break;
                case 27:
                    str16 = C3538a.m15433l(parcel, b);
                    hashSet.add(27);
                    break;
                case 28:
                    str17 = C3538a.m15433l(parcel, b);
                    hashSet.add(28);
                    break;
                case 29:
                    hashSet.add(29);
                    bxVar5 = (C3723bx) C3538a.m15416a(parcel, b, C3723bx.CREATOR);
                    break;
                case 30:
                    str18 = C3538a.m15433l(parcel, b);
                    hashSet.add(30);
                    break;
                case 31:
                    str19 = C3538a.m15433l(parcel, b);
                    hashSet.add(31);
                    break;
                case 32:
                    str20 = C3538a.m15433l(parcel, b);
                    hashSet.add(32);
                    break;
                case 33:
                    str21 = C3538a.m15433l(parcel, b);
                    hashSet.add(33);
                    break;
                case Settings.STATISTIC_ENABLED:
                    hashSet.add(34);
                    bxVar6 = (C3723bx) C3538a.m15416a(parcel, b, C3723bx.CREATOR);
                    break;
                case Settings.SPACE_GET_NEXTWORD:
                    d = C3538a.m15431j(parcel, b);
                    hashSet.add(36);
                    break;
                case Settings.AUTOSPACE_ENABLE:
                    hashSet.add(37);
                    bxVar7 = (C3723bx) C3538a.m15416a(parcel, b, C3723bx.CREATOR);
                    break;
                case Settings.SYMBOL_LOCK:
                    d2 = C3538a.m15431j(parcel, b);
                    hashSet.add(38);
                    break;
                case Settings.TOUCH_CORRECT:
                    str22 = C3538a.m15433l(parcel, b);
                    hashSet.add(39);
                    break;
                case Settings.ENV_WORD:
                    hashSet.add(40);
                    bxVar8 = (C3723bx) C3538a.m15416a(parcel, b, C3723bx.CREATOR);
                    break;
                case Settings.WUBI_COMMITWHENUNIQUE:
                    arrayList6 = C3538a.m15423c(parcel, b, C3723bx.CREATOR);
                    hashSet.add(41);
                    break;
                case Settings.WUBI_DISPLAYCODE:
                    str23 = C3538a.m15433l(parcel, b);
                    hashSet.add(42);
                    break;
                case Settings.WUBI_BIGCHARSET:
                    str24 = C3538a.m15433l(parcel, b);
                    hashSet.add(43);
                    break;
                case Settings.MAX_CACHEINPUTSIZE:
                    str25 = C3538a.m15433l(parcel, b);
                    hashSet.add(44);
                    break;
                case Settings.EMOJI_ENABLED:
                    str26 = C3538a.m15433l(parcel, b);
                    hashSet.add(45);
                    break;
                case Settings.CLOUD_ENABLED:
                    hashSet.add(46);
                    bxVar9 = (C3723bx) C3538a.m15416a(parcel, b, C3723bx.CREATOR);
                    break;
                case Settings.AUTO_SAVE_USERWORD:
                    str27 = C3538a.m15433l(parcel, b);
                    hashSet.add(47);
                    break;
                case 48:
                    str28 = C3538a.m15433l(parcel, b);
                    hashSet.add(48);
                    break;
                case Settings.MIX_LANGUAGE:
                    str29 = C3538a.m15433l(parcel, b);
                    hashSet.add(49);
                    break;
                case Settings.WESTERN_SENTENCE_ENABLED:
                    hashSet.add(50);
                    bxVar10 = (C3723bx) C3538a.m15416a(parcel, b, C3723bx.CREATOR);
                    break;
                case Settings.SHUANGPIN_CONFIG:
                    str30 = C3538a.m15433l(parcel, b);
                    hashSet.add(51);
                    break;
                case Settings.AUTO_ADJUST_WORD_PRIORITY:
                    str31 = C3538a.m15433l(parcel, b);
                    hashSet.add(52);
                    break;
                case Settings.WAVE_ENABLE:
                    str32 = C3538a.m15433l(parcel, b);
                    hashSet.add(53);
                    break;
                case 54:
                    str33 = C3538a.m15433l(parcel, b);
                    hashSet.add(54);
                    break;
                case Settings.FORWARD_PREDICTION:
                    str34 = C3538a.m15433l(parcel, b);
                    hashSet.add(55);
                    break;
                case Settings.SMART_AUTOSPACE:
                    str35 = C3538a.m15433l(parcel, b);
                    hashSet.add(56);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3723bx(hashSet, i, bxVar, arrayList, bxVar2, str, str2, str3, arrayList2, i2, arrayList3, bxVar3, arrayList4, str4, str5, bxVar4, str6, str7, str8, arrayList5, str9, str10, str11, str12, str13, str14, str15, str16, str17, bxVar5, str18, str19, str20, str21, bxVar6, d, bxVar7, d2, str22, bxVar8, arrayList6, str23, str24, str25, str26, bxVar9, str27, str28, str29, bxVar10, str30, str31, str32, str33, str34, str35);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }
}
