package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.cootek.smartinput5.net.C2361q;

public class ActionStopBatchDownloadMode extends ParcelableAction {
    public static final Parcelable.Creator<ActionStopBatchDownloadMode> CREATOR = new C1105m();

    public ActionStopBatchDownloadMode() {
    }

    ActionStopBatchDownloadMode(Parcel parcel) {
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public void run() {
        C2361q.m10797b().mo8019g();
    }
}
