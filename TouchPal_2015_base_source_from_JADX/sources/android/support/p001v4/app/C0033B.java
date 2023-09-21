package android.support.p001v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.app.B */
/* compiled from: Fragment */
final class C0033B implements Parcelable.Creator<FragmentState> {
    C0033B() {
    }

    /* renamed from: a */
    public FragmentState createFromParcel(Parcel parcel) {
        return new FragmentState(parcel);
    }

    /* renamed from: a */
    public FragmentState[] newArray(int i) {
        return new FragmentState[i];
    }
}
