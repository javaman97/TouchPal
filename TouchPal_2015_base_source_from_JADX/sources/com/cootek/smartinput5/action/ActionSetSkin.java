package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1601bg;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.control.C2849W;
import com.emoji.keyboard.touchpal.R;

public class ActionSetSkin extends ParcelableAction {
    public static final Parcelable.Creator<ActionSetSkin> CREATOR = new C1103k();

    /* renamed from: a */
    private String f3122a;

    public ActionSetSkin(String str) {
        this.f3122a = str;
    }

    ActionSetSkin(Parcel parcel) {
        this.f3122a = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3122a);
    }

    public void run() {
        C1601bg l;
        String a;
        if (!TextUtils.isEmpty(this.f3122a) && (l = C1368X.m6320c().mo5841n().mo6284l(this.f3122a)) != null) {
            if (!Engine.isInitialized() || !Engine.getInstance().getIms().isInputViewShown()) {
                Settings.getInstance().setStringSetting(80, this.f3122a);
                C1368X.m6320c().mo5841n().mo6258a(this.f3122a, false, true);
                a = C1974m.m9063a(C1368X.m6313b(), (int) R.string.download_dialog_msg_actived);
            } else {
                a = C1974m.m9063a(C1368X.m6313b(), (int) R.string.download_dialog_msg_downloaded);
            }
            C2849W.m13205a().mo9478a(String.format(a, new Object[]{l.f5100d}), false);
        }
    }
}
