package com.yahoo.mobile.client.share.search.data;

import android.os.Parcel;
import android.os.Parcelable;

public class MetaData implements Parcelable {
    public static final Parcelable.Creator<MetaData> CREATOR = new Parcelable.Creator<MetaData>() {
        public final MetaData createFromParcel(Parcel parcel) {
            return new MetaData(parcel, (byte) 0);
        }

        public final MetaData[] newArray(int i) {
            return new MetaData[i];
        }
    };

    /* renamed from: a */
    private int f16645a;

    /* renamed from: b */
    private int f16646b;

    /* renamed from: c */
    private int f16647c;

    /* renamed from: d */
    private int f16648d;

    /* renamed from: e */
    private String f16649e;

    /* renamed from: f */
    private String f16650f;

    /* synthetic */ MetaData(Parcel parcel, byte b) {
        this(parcel);
    }

    public MetaData(int i, int i2, int i3, int i4, String str, String str2) {
        this.f16645a = i;
        this.f16646b = i2;
        this.f16647c = i3;
        this.f16648d = i4;
        this.f16649e = str;
        this.f16650f = str2;
    }

    public String getPartnerStatus() {
        return this.f16650f;
    }

    public int getFirst() {
        return this.f16645a;
    }

    public void setFirst(int i) {
        this.f16645a = i;
    }

    public int getLast() {
        return this.f16646b;
    }

    public void setLast(int i) {
        this.f16646b = i;
    }

    public int getCount() {
        return this.f16647c;
    }

    public void setCount(int i) {
        this.f16647c = i;
    }

    public int getTotal() {
        return this.f16648d;
    }

    public void setTotal(int i) {
        this.f16648d = i;
    }

    public String getErr() {
        return this.f16649e;
    }

    public void setErr(String str) {
        this.f16649e = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f16645a);
        parcel.writeInt(this.f16646b);
        parcel.writeInt(this.f16647c);
        parcel.writeInt(this.f16648d);
        parcel.writeString(this.f16649e);
    }

    private MetaData(Parcel parcel) {
        this.f16645a = parcel.readInt();
        this.f16646b = parcel.readInt();
        this.f16647c = parcel.readInt();
        this.f16648d = parcel.readInt();
        this.f16649e = parcel.readString();
    }
}
