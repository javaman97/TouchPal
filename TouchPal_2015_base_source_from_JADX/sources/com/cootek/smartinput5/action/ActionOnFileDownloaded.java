package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C1337C;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.C1920p;
import com.cootek.smartinput5.func.C1960r;
import com.cootek.smartinput5.func.HandWriteManager;
import com.cootek.smartinput5.net.C2183M;
import java.io.File;

public class ActionOnFileDownloaded extends ParcelableAction {
    public static final Parcelable.Creator<ActionOnFileDownloaded> CREATOR = new C1101i();

    /* renamed from: a */
    private String f3117a;

    /* renamed from: b */
    private String f3118b;

    /* renamed from: c */
    private String f3119c;

    public ActionOnFileDownloaded(String str, String str2, String str3) {
        this.f3117a = str;
        this.f3118b = str2;
        this.f3119c = str3;
    }

    ActionOnFileDownloaded(Parcel parcel) {
        this.f3117a = parcel.readString();
        this.f3118b = parcel.readString();
        this.f3119c = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3117a);
        parcel.writeString(this.f3118b);
        parcel.writeString(this.f3119c);
    }

    public void run() {
        if (C1368X.m6324d() && !TextUtils.isEmpty(this.f3117a)) {
            File file = new File(this.f3119c);
            if (file.exists()) {
                String str = this.f3118b;
                C2183M.C2184a aVar = null;
                if (this.f3117a.equals(C1389aD.class.getName())) {
                    aVar = C1368X.m6320c().mo5842o();
                } else if (this.f3117a.equals(C1602bh.class.getName())) {
                    aVar = C1368X.m6320c().mo5841n();
                } else if (this.f3117a.equals(C1960r.class.getName())) {
                    aVar = C1368X.m6320c().mo5845r();
                } else if (this.f3117a.equals(C1920p.class.getName())) {
                    aVar = C1368X.m6320c().mo5847t();
                } else if (this.f3117a.equals(C1337C.class.getName())) {
                    aVar = C1368X.m6320c().mo5815A();
                } else if (this.f3117a.equals(HandWriteManager.class.getName())) {
                    aVar = C1368X.m6320c().mo5848u();
                }
                if (aVar != null) {
                    aVar.mo5566a(str, file);
                }
            }
        }
    }
}
