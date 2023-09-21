package com.cootek.smartinput5.func;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2183M;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;

public class OemSkinDownloadReceiver extends BroadcastReceiver {
    public static final String ACTION_OEM_SKIN_DOWNLOAD = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.download_oem_skin";
    public static final String TARGET_FILE = "target_file";
    public static final String URL = "url";
    public static final C2183M.C2184a skinDownloadCallback = new C1408aS();

    public void onReceive(Context context, Intent intent) {
        if (C1368X.m6324d() && TextUtils.equals(intent.getAction(), ACTION_OEM_SKIN_DOWNLOAD)) {
            Bundle extras = intent.getExtras();
            C2361q.m10797b().mo8001a(extras.getString("url"), extras.getString(TARGET_FILE), C1974m.m9063a(C1368X.m6313b(), (int) R.string.default_theme_title), skinDownloadCallback);
        }
        C1246d.m6010a(context).mo4591a("OEM_SKIN_SKIN_UPDATENOTIFICATION", "CLICK", C1246d.f3836c);
    }
}
