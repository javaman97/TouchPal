package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1600bf;

public class ActionStopShareSDK extends ParcelableAction {
    public static final Parcelable.Creator<ActionStopShareSDK> CREATOR = new C1106n();

    public ActionStopShareSDK() {
    }

    ActionStopShareSDK(Parcel parcel) {
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public void run() {
        C1600bf.m7225b(C1368X.m6313b());
    }
}
