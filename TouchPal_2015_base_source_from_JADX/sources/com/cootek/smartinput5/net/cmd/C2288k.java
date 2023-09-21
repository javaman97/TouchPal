package com.cootek.smartinput5.net.cmd;

import android.os.Parcel;
import android.os.Parcelable;
import com.cootek.smartinput5.net.cmd.CmdCheckCallLog;

/* renamed from: com.cootek.smartinput5.net.cmd.k */
/* compiled from: CmdCheckCallLog */
final class C2288k implements Parcelable.Creator<CmdCheckCallLog.CheckResult> {
    C2288k() {
    }

    /* renamed from: a */
    public CmdCheckCallLog.CheckResult createFromParcel(Parcel parcel) {
        return new CmdCheckCallLog.CheckResult(parcel);
    }

    /* renamed from: a */
    public CmdCheckCallLog.CheckResult[] newArray(int i) {
        return new CmdCheckCallLog.CheckResult[i];
    }
}
