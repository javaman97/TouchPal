package android.support.p001v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.app.Fragment;

/* renamed from: android.support.v4.app.n */
/* compiled from: Fragment */
final class C0166n implements Parcelable.Creator<Fragment.SavedState> {
    C0166n() {
    }

    /* renamed from: a */
    public Fragment.SavedState createFromParcel(Parcel parcel) {
        return new Fragment.SavedState(parcel, (ClassLoader) null);
    }

    /* renamed from: a */
    public Fragment.SavedState[] newArray(int i) {
        return new Fragment.SavedState[i];
    }
}
