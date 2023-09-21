package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.net.C2361q;

public class ActionDownloadLanguagePack extends ParcelableAction {
    public static final Parcelable.Creator<ActionDownloadLanguagePack> CREATOR = new C1099g();

    /* renamed from: a */
    private String f3113a;

    public ActionDownloadLanguagePack(String str) {
        this.f3113a = str;
    }

    ActionDownloadLanguagePack(Parcel parcel) {
        this.f3113a = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3113a);
    }

    public void run() {
        C1498a aVar;
        if (!TextUtils.isEmpty(this.f3113a) && C1368X.m6324d()) {
            C1498a[] k = C1368X.m6320c().mo5842o().mo5953k();
            int length = k.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar = null;
                    break;
                }
                aVar = k[i];
                if ((!aVar.mo6157g() || !aVar.mo6156f()) && this.f3113a.equals(aVar.f4727f)) {
                    break;
                }
                i++;
            }
            if (aVar != null) {
                C2361q.m10797b().mo8009c(aVar.mo6154d(), aVar.mo6153c(), aVar.mo6159i());
            }
        }
    }
}
