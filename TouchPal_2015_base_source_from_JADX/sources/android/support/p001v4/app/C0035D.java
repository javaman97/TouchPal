package android.support.p001v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.app.FragmentTabHost;

/* renamed from: android.support.v4.app.D */
/* compiled from: FragmentTabHost */
final class C0035D implements Parcelable.Creator<FragmentTabHost.SavedState> {
    C0035D() {
    }

    /* renamed from: a */
    public FragmentTabHost.SavedState createFromParcel(Parcel parcel) {
        return new FragmentTabHost.SavedState(parcel);
    }

    /* renamed from: a */
    public FragmentTabHost.SavedState[] newArray(int i) {
        return new FragmentTabHost.SavedState[i];
    }
}
