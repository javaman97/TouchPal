package com.cootek.smartinput5.func;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

public class ReferrerReceiver extends BroadcastReceiver {
    public static final String ACTION_INSTALL_REFERRER = "com.android.vending.INSTALL_REFERRER";
    public static final String TAG = "ReferrerReceiver";

    public void onReceive(Context context, Intent intent) {
        if (intent != null && ACTION_INSTALL_REFERRER.equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("referrer");
            String str = null;
            if (stringExtra != null) {
                str = Uri.decode(stringExtra);
            }
            if (str != null) {
                C1418aZ.m6658c(context, str);
            }
            notifyOtherReceivers(context, intent);
        }
    }

    private void notifyOtherReceivers(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(new Intent(ACTION_INSTALL_REFERRER), 0);
        if (queryBroadcastReceivers != null) {
            for (ResolveInfo notifyReceiver : queryBroadcastReceivers) {
                notifyReceiver(context, intent, notifyReceiver);
            }
        }
    }

    private void notifyReceiver(Context context, Intent intent, ResolveInfo resolveInfo) {
        BroadcastReceiver broadcastReceiver;
        if (context.getPackageName().equals(resolveInfo.activityInfo.packageName) && ACTION_INSTALL_REFERRER.equals(intent.getAction()) && !getClass().getName().equals(resolveInfo.activityInfo.name)) {
            try {
                broadcastReceiver = (BroadcastReceiver) Class.forName(resolveInfo.activityInfo.name).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
                broadcastReceiver = null;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                broadcastReceiver = null;
            } catch (ClassNotFoundException e3) {
                e3.printStackTrace();
                broadcastReceiver = null;
            }
            if (broadcastReceiver != null) {
                broadcastReceiver.onReceive(context, intent);
            }
        }
    }
}
