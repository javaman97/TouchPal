package com.cootek.usage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class UsageAlarmReceiver extends BroadcastReceiver {
    public static final String USAGE_ALARM = "com.cootek.usage.alarm_operation";

    public void onReceive(Context context, Intent intent) {
        if (UsageRecorder.m14563a()) {
            if (UsageRecorder.m14564b()) {
                Log.i("Usage/AlarmReceiver", "assist: " + UsageRecorder.f14422a);
                Log.i("Usage/AlarmReceiver", "broadcast received.");
            }
            if (USAGE_ALARM.equals(intent.getAction())) {
                UsageRecorder.send();
            }
        }
    }
}
