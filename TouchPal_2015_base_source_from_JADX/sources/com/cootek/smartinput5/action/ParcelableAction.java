package com.cootek.smartinput5.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class ParcelableAction implements Parcelable, Runnable {

    /* renamed from: d */
    public static final String f3123d = (ParcelableAction.class.getPackage().getName() + ".parcelableaction");

    /* renamed from: e */
    protected Bundle f3124e;

    public abstract void run();

    public ParcelableAction() {
    }

    public ParcelableAction(Parcel parcel) {
        this.f3124e = parcel.readBundle();
    }

    public ParcelableAction(Bundle bundle) {
        this.f3124e = bundle;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f3124e);
    }
}
