package com.cootek.smartinput5.func;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

public class SuperDictDownloadReceiver extends BroadcastReceiver {
    public static final String ACTION_SUPER_DICT_DOWNLOAD = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.superdict_download";

    public void onReceive(Context context, Intent intent) {
        if (C1368X.m6324d() && TextUtils.equals(intent.getAction(), ACTION_SUPER_DICT_DOWNLOAD)) {
            C1368X.m6320c().mo5846s().mo6309a(context, C1549b.f4831b, C1974m.m9063a(context, (int) R.string.SUPER_DICT_TARGET_VERSION), false);
        }
    }
}
