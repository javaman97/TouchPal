package android.support.p001v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.app.FragmentManagerState */
/* compiled from: FragmentManager */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0182z();

    /* renamed from: a */
    FragmentState[] f40a;

    /* renamed from: b */
    int[] f41b;

    /* renamed from: c */
    BackStackState[] f42c;

    public FragmentManagerState() {
    }

    public FragmentManagerState(Parcel parcel) {
        this.f40a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f41b = parcel.createIntArray();
        this.f42c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f40a, i);
        parcel.writeIntArray(this.f41b);
        parcel.writeTypedArray(this.f42c, i);
    }
}
