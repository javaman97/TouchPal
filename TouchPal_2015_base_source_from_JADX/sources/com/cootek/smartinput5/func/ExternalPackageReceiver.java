package com.cootek.smartinput5.func;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ExternalPackageReceiver extends BroadcastReceiver {
    public static final String TAG = "ExternalPackageReceiver";

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            String str = null;
            if (!(intent.getData() == null || intent.getData().getEncodedSchemeSpecificPart() == null)) {
                str = intent.getData().getEncodedSchemeSpecificPart();
            }
            if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                C1356N.m6227a().mo5756a(str);
            } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                C1356N.m6227a().mo5758b(str);
            }
        }
    }
}
