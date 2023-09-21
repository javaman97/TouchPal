package com.cootek.smartinput5.func.component;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2188Q;

public class AutoUpdateReceiver extends BroadcastReceiver {
    private static final String TAG = "AutoUpdateReceiver";
    private static final String connectivityChangeAction = "android.net.conn.CONNECTIVITY_CHANGE";
    private static final String updateAction = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.auto_update";

    public void onReceive(Context context, Intent intent) {
        if (C1368X.m6324d()) {
            long longSetting = Settings.getInstance().getLongSetting(Settings.LAST_AUTO_UPDATE_TIMESTAMP);
            long currentTimeMillis = System.currentTimeMillis();
            String action = intent.getAction();
            if (connectivityChangeAction.equals(action)) {
                C2188Q.m9853a().mo7684d();
                if (C2188Q.m9853a().mo7685e()) {
                    autoUpdate(currentTimeMillis, longSetting);
                }
                C2188Q.m9853a().mo7681b();
                if (currentTimeMillis - longSetting > 43200000) {
                    C1368X.m6320c().mo5833f();
                }
            } else if (updateAction.equals(action)) {
                autoUpdate(currentTimeMillis, longSetting);
            }
        }
    }

    private void autoUpdate(long j, long j2) {
        if (j - j2 > 1800000) {
            Settings.getInstance().setLongSetting(Settings.LAST_AUTO_UPDATE_TIMESTAMP, j);
            Settings.getInstance().writeBack();
            C1669d.m7669a();
        }
    }
}
