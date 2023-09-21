package android.support.p001v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.app.z */
/* compiled from: FragmentManager */
final class C0182z implements Parcelable.Creator<FragmentManagerState> {
    C0182z() {
    }

    /* renamed from: a */
    public FragmentManagerState createFromParcel(Parcel parcel) {
        return new FragmentManagerState(parcel);
    }

    /* renamed from: a */
    public FragmentManagerState[] newArray(int i) {
        return new FragmentManagerState[i];
    }
}
