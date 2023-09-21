package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C3802s;

public final class RealTimeMessage implements Parcelable {
    public static final Parcelable.Creator<RealTimeMessage> CREATOR = new Parcelable.Creator<RealTimeMessage>() {
        /* renamed from: J */
        public RealTimeMessage[] newArray(int i) {
            return new RealTimeMessage[i];
        }

        /* renamed from: r */
        public RealTimeMessage createFromParcel(Parcel parcel) {
            return new RealTimeMessage(parcel);
        }
    };
    public static final int RELIABLE = 1;
    public static final int UNRELIABLE = 0;

    /* renamed from: eT */
    private final String f15407eT;

    /* renamed from: eU */
    private final byte[] f15408eU;

    /* renamed from: eV */
    private final int f15409eV;

    private RealTimeMessage(Parcel parcel) {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    public RealTimeMessage(String str, byte[] bArr, int i) {
        this.f15407eT = (String) C3802s.m16678d(str);
        this.f15408eU = (byte[]) ((byte[]) C3802s.m16678d(bArr)).clone();
        this.f15409eV = i;
    }

    public int describeContents() {
        return 0;
    }

    public byte[] getMessageData() {
        return this.f15408eU;
    }

    public String getSenderParticipantId() {
        return this.f15407eT;
    }

    public boolean isReliable() {
        return this.f15409eV == 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15407eT);
        parcel.writeByteArray(this.f15408eU);
        parcel.writeInt(this.f15409eV);
    }
}
