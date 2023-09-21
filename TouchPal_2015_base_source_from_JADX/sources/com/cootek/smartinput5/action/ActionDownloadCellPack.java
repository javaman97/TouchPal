package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1960r;
import com.cootek.smartinput5.func.C2065u;
import com.cootek.smartinput5.net.C2361q;

public class ActionDownloadCellPack extends ParcelableAction {
    public static final Parcelable.Creator<ActionDownloadCellPack> CREATOR = new C1097e();

    /* renamed from: a */
    private String f3109a;

    /* renamed from: b */
    private String f3110b;

    /* renamed from: c */
    private String f3111c;

    public ActionDownloadCellPack(String str, String str2, String str3) {
        this.f3109a = C1960r.m8999e(str);
        this.f3110b = str2;
        this.f3111c = str3;
    }

    ActionDownloadCellPack(Parcel parcel) {
        this.f3109a = parcel.readString();
        this.f3110b = parcel.readString();
        this.f3111c = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3109a);
        parcel.writeString(this.f3110b);
        parcel.writeString(this.f3111c);
    }

    public void run() {
        C2065u uVar;
        if (C1368X.m6324d() && this.f3109a != null) {
            C2065u[] h = C1368X.m6320c().mo5845r().mo7205h();
            int length = h.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    uVar = null;
                    break;
                }
                uVar = h[i];
                if (this.f3109a.equalsIgnoreCase(uVar.mo7438e())) {
                    break;
                }
                i++;
            }
            if (uVar != null) {
                C2361q.m10797b().mo8020g(uVar.mo7438e(), uVar.f8871w, uVar.f8873y);
            } else {
                C2361q.m10797b().mo8020g(this.f3109a, this.f3110b, this.f3111c);
            }
        }
    }
}
