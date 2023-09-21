package com.cootek.smartinput5.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p048d.C1246d;

public class ActionCollectData extends ParcelableAction {
    public static final Parcelable.Creator<ActionCollectData> CREATOR = new C1095c();

    /* renamed from: a */
    public static final int f3098a = 0;

    /* renamed from: b */
    public static final int f3099b = 1;

    /* renamed from: c */
    public static final int f3100c = 2;

    /* renamed from: f */
    private String f3101f;

    /* renamed from: g */
    private String f3102g;

    /* renamed from: h */
    private String f3103h;

    /* renamed from: i */
    private long f3104i;

    /* renamed from: j */
    private int f3105j;

    public ActionCollectData(String str, String str2, String str3, int i) {
        this(str, str2, str3, -1, i);
    }

    public ActionCollectData(String str, String str2, String str3, long j, int i) {
        this.f3101f = str;
        this.f3102g = str2;
        this.f3103h = str3;
        this.f3104i = j;
        this.f3105j = i;
    }

    ActionCollectData(Parcel parcel) {
        this.f3101f = parcel.readString();
        this.f3102g = parcel.readString();
        this.f3103h = parcel.readString();
        this.f3104i = parcel.readLong();
        this.f3105j = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3101f);
        parcel.writeString(this.f3102g);
        parcel.writeString(this.f3103h);
        parcel.writeLong(this.f3104i);
        parcel.writeInt(this.f3105j);
    }

    public void run() {
        Context b;
        if (!TextUtils.isEmpty(this.f3101f) && !TextUtils.isEmpty(this.f3102g) && !TextUtils.isEmpty(this.f3103h)) {
            if ((this.f3105j == 1 || this.f3105j == 2) && (b = C1368X.m6313b()) != null) {
                C1246d.m6010a(b).mo4591a(this.f3101f, this.f3103h, this.f3102g);
            }
        }
    }
}
