package android.support.p001v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.widget.SlidingPaneLayout;

/* renamed from: android.support.v4.widget.B */
/* compiled from: SlidingPaneLayout */
final class C0516B implements Parcelable.Creator<SlidingPaneLayout.SavedState> {
    C0516B() {
    }

    /* renamed from: a */
    public SlidingPaneLayout.SavedState createFromParcel(Parcel parcel) {
        return new SlidingPaneLayout.SavedState(parcel);
    }

    /* renamed from: a */
    public SlidingPaneLayout.SavedState[] newArray(int i) {
        return new SlidingPaneLayout.SavedState[i];
    }
}
