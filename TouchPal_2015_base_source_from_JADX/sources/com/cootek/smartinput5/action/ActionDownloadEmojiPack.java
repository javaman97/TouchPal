package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2361q;
import com.emoji.keyboard.touchpal.R;

public class ActionDownloadEmojiPack extends ParcelableAction {
    public static final Parcelable.Creator<ActionDownloadEmojiPack> CREATOR = new C1098f();

    /* renamed from: a */
    private String f3112a;

    public ActionDownloadEmojiPack(String str) {
        this.f3112a = str;
    }

    ActionDownloadEmojiPack(Parcel parcel) {
        this.f3112a = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3112a);
    }

    public void run() {
        if (!TextUtils.isEmpty(this.f3112a)) {
            String str = "";
            String str2 = "";
            if (C1368X.m6324d()) {
                str = C1974m.m9063a(C1368X.m6313b(), (int) R.string.full_emoji_download_btn_title);
                str2 = C1974m.m9063a(C1368X.m6313b(), (int) R.string.EMOJI_PLUGIN_TARGET_VERSION);
            }
            C2361q.m10797b().mo8005b(this.f3112a, str, str2);
        }
    }
}
