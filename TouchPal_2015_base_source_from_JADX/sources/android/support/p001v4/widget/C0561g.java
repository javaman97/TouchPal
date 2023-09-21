package android.support.p001v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.widget.DrawerLayout;

/* renamed from: android.support.v4.widget.g */
/* compiled from: DrawerLayout */
final class C0561g implements Parcelable.Creator<DrawerLayout.SavedState> {
    C0561g() {
    }

    /* renamed from: a */
    public DrawerLayout.SavedState createFromParcel(Parcel parcel) {
        return new DrawerLayout.SavedState(parcel);
    }

    /* renamed from: a */
    public DrawerLayout.SavedState[] newArray(int i) {
        return new DrawerLayout.SavedState[i];
    }
}
