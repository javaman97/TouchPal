package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.cootek.smartinput5.func.ReferrerReceiver;

public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Log.i(AppsFlyerLib.LOG_TAG, "MultipleInstallBroadcastReceiver called");
        for (ResolveInfo next : context.getPackageManager().queryBroadcastReceivers(new Intent(ReferrerReceiver.ACTION_INSTALL_REFERRER), 0)) {
            String action = intent.getAction();
            if (next.activityInfo.packageName.equals(context.getPackageName()) && ReferrerReceiver.ACTION_INSTALL_REFERRER.equals(action) && !getClass().getName().equals(next.activityInfo.name)) {
                Log.i(AppsFlyerLib.LOG_TAG, "trigger onReceive: class: " + next.activityInfo.name);
                try {
                    ((BroadcastReceiver) Class.forName(next.activityInfo.name).newInstance()).onReceive(context, intent);
                } catch (Throwable th) {
                    Log.e(AppsFlyerLib.LOG_TAG, "error in BroadcastReceiver " + next.activityInfo.name, th);
                }
            }
        }
        new AppsFlyerLib().onReceive(context, intent);
    }
}
