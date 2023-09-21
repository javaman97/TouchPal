package android.support.p001v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.app.j */
/* compiled from: BackStackRecord */
final class C0161j implements Parcelable.Creator<BackStackState> {
    C0161j() {
    }

    /* renamed from: a */
    public BackStackState createFromParcel(Parcel parcel) {
        return new BackStackState(parcel);
    }

    /* renamed from: a */
    public BackStackState[] newArray(int i) {
        return new BackStackState[i];
    }
}
