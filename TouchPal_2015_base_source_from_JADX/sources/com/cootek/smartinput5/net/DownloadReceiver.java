package com.cootek.smartinput5.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2364s;

public class DownloadReceiver extends BroadcastReceiver {
    private static final String ACTION_SKINDOWNLOAD = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.skindownload";
    private static final String TAG = "SkinDownloadReceiver";

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals(ACTION_SKINDOWNLOAD)) {
            String stringExtra = intent.getStringExtra("URL");
            String stringExtra2 = intent.getStringExtra("FILE_PATH");
            String stringExtra3 = intent.getStringExtra("DISPLAY_NAME");
            initFuncManager(context);
            C2361q.m10797b().mo8018f(stringExtra, stringExtra2, stringExtra3);
        }
        if (action.equals(C2364s.C2365a.f10414a[0])) {
            int intExtra = intent.getIntExtra("TYPE", 0);
            int intExtra2 = intent.getIntExtra("STATUS", 0);
            String stringExtra4 = intent.getStringExtra("APPID");
            initFuncManager(context);
            C2361q.m10797b().mo7996a(intExtra, 0, intExtra2, stringExtra4);
        } else if (action.equals(C2364s.C2365a.f10414a[1])) {
            int intExtra3 = intent.getIntExtra("TYPE", 0);
            int intExtra4 = intent.getIntExtra("STATUS", 0);
            String stringExtra5 = intent.getStringExtra("APPID");
            initFuncManager(context);
            C2361q.m10797b().mo7996a(intExtra3, 1, intExtra4, stringExtra5);
        }
    }

    private void initFuncManager(Context context) {
        if (!C1368X.m6324d()) {
            C1368X.m6291a(context, false);
        }
    }
}
