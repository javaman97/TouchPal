package android.support.p001v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.app.C0159i;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.BackStackState */
/* compiled from: BackStackRecord */
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0161j();

    /* renamed from: a */
    final int[] f18a;

    /* renamed from: b */
    final int f19b;

    /* renamed from: c */
    final int f20c;

    /* renamed from: d */
    final String f21d;

    /* renamed from: e */
    final int f22e;

    /* renamed from: f */
    final int f23f;

    /* renamed from: g */
    final CharSequence f24g;

    /* renamed from: h */
    final int f25h;

    /* renamed from: i */
    final CharSequence f26i;

    public BackStackState(C0176t tVar, C0159i iVar) {
        int i = 0;
        for (C0159i.C0160a aVar = iVar.f396k; aVar != null; aVar = aVar.f412a) {
            if (aVar.f420i != null) {
                i += aVar.f420i.size();
            }
        }
        this.f18a = new int[(i + (iVar.f398m * 7))];
        if (!iVar.f405t) {
            throw new IllegalStateException("Not on back stack");
        }
        int i2 = 0;
        for (C0159i.C0160a aVar2 = iVar.f396k; aVar2 != null; aVar2 = aVar2.f412a) {
            int i3 = i2 + 1;
            this.f18a[i2] = aVar2.f414c;
            int i4 = i3 + 1;
            this.f18a[i3] = aVar2.f415d != null ? aVar2.f415d.mIndex : -1;
            int i5 = i4 + 1;
            this.f18a[i4] = aVar2.f416e;
            int i6 = i5 + 1;
            this.f18a[i5] = aVar2.f417f;
            int i7 = i6 + 1;
            this.f18a[i6] = aVar2.f418g;
            int i8 = i7 + 1;
            this.f18a[i7] = aVar2.f419h;
            if (aVar2.f420i != null) {
                int size = aVar2.f420i.size();
                int i9 = i8 + 1;
                this.f18a[i8] = size;
                int i10 = 0;
                while (i10 < size) {
                    this.f18a[i9] = aVar2.f420i.get(i10).mIndex;
                    i10++;
                    i9++;
                }
                i2 = i9;
            } else {
                i2 = i8 + 1;
                this.f18a[i8] = 0;
            }
        }
        this.f19b = iVar.f403r;
        this.f20c = iVar.f404s;
        this.f21d = iVar.f407v;
        this.f22e = iVar.f409x;
        this.f23f = iVar.f410y;
        this.f24g = iVar.f411z;
        this.f25h = iVar.f393A;
        this.f26i = iVar.f394B;
    }

    public BackStackState(Parcel parcel) {
        this.f18a = parcel.createIntArray();
        this.f19b = parcel.readInt();
        this.f20c = parcel.readInt();
        this.f21d = parcel.readString();
        this.f22e = parcel.readInt();
        this.f23f = parcel.readInt();
        this.f24g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f25h = parcel.readInt();
        this.f26i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    /* renamed from: a */
    public C0159i mo24a(C0176t tVar) {
        C0159i iVar = new C0159i(tVar);
        int i = 0;
        int i2 = 0;
        while (i2 < this.f18a.length) {
            C0159i.C0160a aVar = new C0159i.C0160a();
            int i3 = i2 + 1;
            aVar.f414c = this.f18a[i2];
            if (C0176t.f445b) {
                Log.v("FragmentManager", "Instantiate " + iVar + " op #" + i + " base fragment #" + this.f18a[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.f18a[i3];
            if (i5 >= 0) {
                aVar.f415d = tVar.f460l.get(i5);
            } else {
                aVar.f415d = null;
            }
            int i6 = i4 + 1;
            aVar.f416e = this.f18a[i4];
            int i7 = i6 + 1;
            aVar.f417f = this.f18a[i6];
            int i8 = i7 + 1;
            aVar.f418g = this.f18a[i7];
            int i9 = i8 + 1;
            aVar.f419h = this.f18a[i8];
            int i10 = i9 + 1;
            int i11 = this.f18a[i9];
            if (i11 > 0) {
                aVar.f420i = new ArrayList<>(i11);
                int i12 = 0;
                while (i12 < i11) {
                    if (C0176t.f445b) {
                        Log.v("FragmentManager", "Instantiate " + iVar + " set remove fragment #" + this.f18a[i10]);
                    }
                    aVar.f420i.add(tVar.f460l.get(this.f18a[i10]));
                    i12++;
                    i10++;
                }
            }
            iVar.mo468a(aVar);
            i++;
            i2 = i10;
        }
        iVar.f403r = this.f19b;
        iVar.f404s = this.f20c;
        iVar.f407v = this.f21d;
        iVar.f409x = this.f22e;
        iVar.f405t = true;
        iVar.f410y = this.f23f;
        iVar.f411z = this.f24g;
        iVar.f393A = this.f25h;
        iVar.f394B = this.f26i;
        iVar.mo476e(1);
        return iVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f18a);
        parcel.writeInt(this.f19b);
        parcel.writeInt(this.f20c);
        parcel.writeString(this.f21d);
        parcel.writeInt(this.f22e);
        parcel.writeInt(this.f23f);
        TextUtils.writeToParcel(this.f24g, parcel, 0);
        parcel.writeInt(this.f25h);
        TextUtils.writeToParcel(this.f26i, parcel, 0);
    }
}
